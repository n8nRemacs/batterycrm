package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.c;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: MethodParameterTypeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class H<T extends net.bytebuddy.description.method.c> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final C44413w f418371b;

    public H(C44413w c44413w) {
        this.f418371b = c44413w;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418371b.b(((net.bytebuddy.description.method.c) obj).getType());
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
            return this.f418371b.equals(((H) obj).f418371b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418371b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "hasType(" + this.f418371b + ")";
    }
}
