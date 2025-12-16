package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: BooleanMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44396e<T> extends InterfaceC44410t.a.AbstractC12113a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final C44396e<?> f418422c = new C44396e<>(true);

    /* renamed from: d, reason: collision with root package name */
    public static final C44396e<?> f418423d = new C44396e<>(false);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f418424b;

    public C44396e(boolean z12) {
        this.f418424b = z12;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        return this.f418424b;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418424b == ((C44396e) obj).f418424b;
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().hashCode() * 31) + (this.f418424b ? 1 : 0);
    }

    public final String toString() {
        return Boolean.toString(this.f418424b);
    }
}
