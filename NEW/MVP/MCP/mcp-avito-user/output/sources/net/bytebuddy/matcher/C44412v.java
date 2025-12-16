package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: EqualityMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44412v<T> extends InterfaceC44410t.a.AbstractC12113a<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f418438b;

    public C44412v(Object obj) {
        this.f418438b = obj;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        return this.f418438b.equals(t12);
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418438b.equals(((C44412v) obj).f418438b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418438b.hashCode() + (getClass().hashCode() * 31);
    }

    public final String toString() {
        return androidx.appcompat.app.r.o(this.f418438b, ")", new StringBuilder("is("));
    }
}
