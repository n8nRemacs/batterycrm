package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: DeclaringAnnotationMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44405n<T extends AnnotationSource> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final C44402k f418431b;

    public C44405n(C44402k c44402k) {
        this.f418431b = c44402k;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418431b.b(((AnnotationSource) obj).getDeclaredAnnotations());
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418431b.equals(((C44405n) obj).f418431b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418431b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "declaresAnnotations(" + this.f418431b + ")";
    }
}
