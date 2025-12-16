package q11;

import Y61.k;
import Y61.l;
import android.opengl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: egl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq11/d;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final EGLDisplay f428959a;

    public d(@l EGLDisplay eGLDisplay) {
        this.f428959a = eGLDisplay;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f428959a, ((d) obj).f428959a);
    }

    public final int hashCode() {
        EGLDisplay eGLDisplay = this.f428959a;
        if (eGLDisplay == null) {
            return 0;
        }
        return eGLDisplay.hashCode();
    }

    @k
    public final String toString() {
        return "EglDisplay(native=" + this.f428959a + ')';
    }
}
