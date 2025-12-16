package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class wk8 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ sa9 a;

    public wk8(sa9 sa9Var) {
        this.a = sa9Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((uy0) this.a.b).getClass();
        return bundle;
    }
}
