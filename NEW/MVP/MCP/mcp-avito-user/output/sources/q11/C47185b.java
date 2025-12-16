package q11;

import Y61.k;
import Y61.l;
import android.opengl.EGLConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: egl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq11/b;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: q11.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C47185b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final EGLConfig f428957a;

    public C47185b(@k EGLConfig eGLConfig) {
        this.f428957a = eGLConfig;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47185b) && L.f(this.f428957a, ((C47185b) obj).f428957a);
    }

    public final int hashCode() {
        return this.f428957a.hashCode();
    }

    @k
    public final String toString() {
        return "EglConfig(native=" + this.f428957a + ')';
    }
}
