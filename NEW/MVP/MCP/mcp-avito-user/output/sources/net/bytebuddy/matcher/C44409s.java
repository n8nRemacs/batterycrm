package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.d;
import net.bytebuddy.description.d.a;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: DescriptorMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44409s<T extends d.a> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final StringMatcher f418435b;

    public C44409s(StringMatcher stringMatcher) {
        this.f418435b = stringMatcher;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418435b.b(((d.a) obj).getDescriptor());
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
            return this.f418435b.equals(((C44409s) obj).f418435b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418435b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasDescriptor(" + this.f418435b + ")";
    }
}
