package net.silvacarvalho.marlon.ciclodevida;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Exemplo que apresenta um Log para cada fase do ciclo de vida de uma aplica��o
 * Android.
 * 
 * @author Marlon Silva Carvalho
 */
public class CicloDeVidaApplication extends Application {
	// Estender esta classe � opcional.
	// Uma vez criada, lembre de declarar ela no AndroidManifest.xml

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// Aconteceu alguma mudan�a na configura��o do dispositivo!
		// Pode ter ocorrido uma mudan�a de orienta��o, Locale e qualquer outra configura��o.
		
		super.onConfigurationChanged(newConfig);
		Log.d("CicloDeVida", "onConfigurationChanged");
	}

	@Override
	public void onCreate() {
		// Sempre chamado quando a aplica��o � criada.
		
		super.onCreate();
		Log.d("CicloDeVida", "onCreate");
	}

	@Override
	public void onLowMemory() {
		// O sistema (Android) em geral est� sem mem�ria e est� pedindo para os aplicativos liberarem mem�ria.
		// Aqui voc� libera recursos (mem�ria) e o Android, logo ap�s chamar este m�todo, faz um Garbage Collection.
		
		super.onLowMemory();
		Log.d("CicloDeVida", "onLowMemory");
	}

	@Override
	public void onTerminate() {
		// � apenas para ambientes emulados.
		
		super.onTerminate();
		Log.d("CicloDeVida", "onTerminate");
	}

	@Override
	public void onTrimMemory(int level) {
		// � chamado quando o Android acredita que � uma boa hora para o aplicativo liberar recursos.
		// Por exemplo, quando seu aplicativo vai para background e talvez n�o tenha mem�ria suficiente para manter ele
		// neste estado.

		// Voc� pode checar o LEVEL para ver em que n�vel est� o uso da mem�ria.
		
		Log.d("CicloDeVida", "onTrimMemory");
	}

}
