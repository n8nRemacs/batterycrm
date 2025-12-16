package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: AnnotationTypeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44394c<T extends AnnotationDescription> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.AbstractC12113a f418421b;

    public C44394c(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
        this.f418421b = abstractC12113a;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418421b.b(((AnnotationDescription) obj).a());
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
            return this.f418421b.equals(((C44394c) obj).f418421b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418421b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "ofAnnotationType(" + this.f418421b + ')';
    }
}
