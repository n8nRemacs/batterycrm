package defpackage;

import android.content.LocusId;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class il {
    public static LocusId a(String str) {
        return new LocusId(str);
    }

    public static AudioRecordingConfiguration b(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean c(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static boolean d() {
        return Trace.isEnabled();
    }

    public static void e(AudioRecord audioRecord, qee qeeVar, c60 c60Var) {
        audioRecord.registerAudioRecordingCallback(qeeVar, c60Var);
    }

    public static void f(int i, String str) {
        Trace.setCounter(str, i);
    }

    public static void g(AudioRecord audioRecord, c60 c60Var) {
        audioRecord.unregisterAudioRecordingCallback(c60Var);
    }
}
