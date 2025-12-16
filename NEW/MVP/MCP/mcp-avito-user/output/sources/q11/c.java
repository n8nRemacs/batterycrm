package q11;

import Y61.k;
import Y61.l;
import android.opengl.EGLContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: egl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq11/c;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final EGLContext f428958a;

    public c(@l EGLContext eGLContext) {
        this.f428958a = eGLContext;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f428958a, ((c) obj).f428958a);
    }

    public final int hashCode() {
        EGLContext eGLContext = this.f428958a;
        if (eGLContext == null) {
            return 0;
        }
        return eGLContext.hashCode();
    }

    @k
    public final String toString() {
        return "EglContext(native=" + this.f428958a + ')';
    }
}
