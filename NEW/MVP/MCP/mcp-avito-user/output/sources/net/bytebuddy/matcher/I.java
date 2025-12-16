package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.d;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: MethodParameterTypesMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class I<T extends net.bytebuddy.description.method.d<?>> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.d f418372b;

    public I(InterfaceC44410t.a.d dVar) {
        this.f418372b = dVar;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418372b.b(((net.bytebuddy.description.method.d) obj).p2());
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
            return this.f418372b.equals(((I) obj).f418372b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418372b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasTypes(" + this.f418372b + ")";
    }
}
