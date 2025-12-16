package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: NegatingMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class M<T> extends InterfaceC44410t.a.AbstractC12113a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t<? super T> f418384b;

    public M(InterfaceC44410t<? super T> interfaceC44410t) {
        this.f418384b = interfaceC44410t;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        return !this.f418384b.b(t12);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418384b.equals(((M) obj).f418384b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418384b.hashCode() + (getClass().hashCode() * 31);
    }

    public final String toString() {
        return "not(" + this.f418384b + ')';
    }
}
