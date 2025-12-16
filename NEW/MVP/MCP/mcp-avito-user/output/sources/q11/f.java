package q11;

import Y61.k;
import Y61.l;
import android.opengl.EGLSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: egl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq11/f;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final EGLSurface f428976a;

    public f(@l EGLSurface eGLSurface) {
        this.f428976a = eGLSurface;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f428976a, ((f) obj).f428976a);
    }

    public final int hashCode() {
        EGLSurface eGLSurface = this.f428976a;
        if (eGLSurface == null) {
            return 0;
        }
        return eGLSurface.hashCode();
    }

    @k
    public final String toString() {
        return "EglSurface(native=" + this.f428976a + ')';
    }
}
