package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.a;
import net.bytebuddy.description.a.b;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: DefinedShapeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class r<T extends a.b<S, ?>, S extends a.b<?, ?>> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.AbstractC12113a f418434b;

    public r(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
        this.f418434b = abstractC12113a;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418434b.b(((a.b) obj).i());
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
            return this.f418434b.equals(((r) obj).f418434b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418434b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "isDefinedAs(" + this.f418434b + ')';
    }
}
