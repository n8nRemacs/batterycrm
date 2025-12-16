package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.b;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: DeclaringTypeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44408q<T extends net.bytebuddy.description.b> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final C44413w f418433b;

    public C44408q(C44413w c44413w) {
        this.f418433b = c44413w;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        TypeDefinition typeDefinitionN = ((net.bytebuddy.description.b) obj).n();
        return typeDefinitionN != null && this.f418433b.b(typeDefinitionN.P0());
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
            return this.f418433b.equals(((C44408q) obj).f418433b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418433b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "declaredBy(" + this.f418433b + ")";
    }
}
