package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: SignatureTokenMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class Q<T extends net.bytebuddy.description.method.a> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a.AbstractC12113a f418409b;

    public Q(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
        this.f418409b = abstractC12113a;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418409b.b(((net.bytebuddy.description.method.a) obj).e());
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
            return this.f418409b.equals(((Q) obj).f418409b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418409b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "signature(" + this.f418409b + ")";
    }
}
