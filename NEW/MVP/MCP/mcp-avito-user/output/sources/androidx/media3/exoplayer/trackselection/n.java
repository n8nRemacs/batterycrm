package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.util.J;
import androidx.media3.exoplayer.trackselection.k;
import java.util.Random;

/* compiled from: RandomTrackSelection.java */
@J
/* loaded from: classes.dex */
public final class n extends b {

    /* compiled from: RandomTrackSelection.java */
    public static final class a implements k.b {
        public a() {
            new Random();
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.k
    public final int a() {
        return 0;
    }
}
