package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C23108t;
import androidx.media3.common.Q;
import androidx.media3.common.util.J;

/* compiled from: ExoTrackSelection.java */
@J
/* loaded from: classes.dex */
public interface k extends o {

    /* compiled from: ExoTrackSelection.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Q f50026a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f50027b;

        public a(int i12, Q q12, int[] iArr) {
            if (iArr.length == 0) {
                androidx.media3.common.util.s.d("Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f50026a = q12;
            this.f50027b = iArr;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    public interface b {
    }

    void N();

    int a();

    C23108t c();

    void e(float f12);

    void j();

    default void g() {
    }

    default void k() {
    }

    default void f(boolean z12) {
    }
}
