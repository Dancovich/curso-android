package net.silvacarvalho.marlon.exemplo.navegacao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SegundaActivity extends Activity {
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Desta forma, voc� coloca uma nova Activity na pilha!
//				Intent intent = new Intent(SegundaActivity.this,
//						MainActivity.class);
//				startActivity(intent);
				
				// O ideal � fechar esta.
				SegundaActivity.this.finish();
			}

		});
	}

}
