package net.bytebuddy.matcher;

import java.lang.annotation.ElementType;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: AnnotationTargetMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44393b<T extends AnnotationDescription> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final ElementType f418420b;

    public C44393b(ElementType elementType) {
        this.f418420b = elementType;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return ((AnnotationDescription) obj).b(this.f418420b);
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
            return this.f418420b.equals(((C44393b) obj).f418420b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418420b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "targetsElement(" + this.f418420b + ")";
    }
}
