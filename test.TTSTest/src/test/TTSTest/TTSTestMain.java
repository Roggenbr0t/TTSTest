package test.TTSTest;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTSTestMain
{

	public static void main( String[] args )
	{
		VoiceManager vm = VoiceManager.getInstance();
		Voice voice = vm.getVoice( "kevin16" );

		voice.allocate();
		voice.speak( "Test" );
		voice.deallocate();
	}

}
