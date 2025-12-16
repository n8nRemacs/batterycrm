package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.d;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: NameMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class L<T extends net.bytebuddy.description.d> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final StringMatcher f418375b;

    public L(StringMatcher stringMatcher) {
        this.f418375b = stringMatcher;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418375b.b(((net.bytebuddy.description.d) obj).R());
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
            return this.f418375b.equals(((L) obj).f418375b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418375b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "name(" + this.f418375b + ")";
    }
}
