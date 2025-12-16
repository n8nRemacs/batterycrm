package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: VisibilityMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class W<T extends net.bytebuddy.description.a> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final TypeDescription f418419b;

    public W(TypeDescription typeDescription) {
        this.f418419b = typeDescription;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return ((net.bytebuddy.description.a) obj).o0(this.f418419b);
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
            return this.f418419b.equals(((W) obj).f418419b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418419b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "isVisibleTo(" + this.f418419b + ")";
    }
}
