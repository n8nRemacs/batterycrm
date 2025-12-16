package defpackage;

import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c60 extends AudioManager.AudioRecordingCallback {
    public final /* synthetic */ d60 a;

    public c60(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // android.media.AudioManager.AudioRecordingCallback
    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            d60 d60Var = this.a;
            if (clientAudioSessionId == d60Var.a.getAudioSessionId()) {
                d60Var.c(il.c(audioRecordingConfiguration));
                return;
            }
        }
    }
}
