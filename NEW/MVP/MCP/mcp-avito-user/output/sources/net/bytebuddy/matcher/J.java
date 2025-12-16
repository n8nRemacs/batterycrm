package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: MethodParametersMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class J<T extends net.bytebuddy.description.method.a> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.AbstractC12113a f418373b;

    public J(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
        this.f418373b = abstractC12113a;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418373b.b(((net.bytebuddy.description.method.a) obj).getParameters());
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
            return this.f418373b.equals(((J) obj).f418373b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418373b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasParameter(" + this.f418373b + ")";
    }
}
