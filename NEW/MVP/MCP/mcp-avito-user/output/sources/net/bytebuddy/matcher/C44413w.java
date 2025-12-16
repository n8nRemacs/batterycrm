package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: ErasureMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44413w<T extends TypeDefinition> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC44410t.a f418439b;

    public C44413w(InterfaceC44410t.a aVar) {
        this.f418439b = aVar;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418439b.b(((TypeDefinition) obj).f5());
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
            return this.f418439b.equals(((C44413w) obj).f418439b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418439b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "erasure(" + this.f418439b + ")";
    }
}
