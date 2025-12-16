package retrofit2;

import com.akita.compose.theme.re23.style.C0;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes9.dex */
final class C implements B {

    /* renamed from: A, reason: collision with root package name */
    public static final B f429944A = new C();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return B.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof B;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return C0.f(B.class, new StringBuilder("@"), "()");
    }
}
