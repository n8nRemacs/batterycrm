package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: DeclaringMethodMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44407p<T extends TypeDefinition> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final C44402k f418432b;

    public C44407p(C44402k c44402k) {
        this.f418432b = c44402k;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418432b.b(((TypeDefinition) obj).q());
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
            return this.f418432b.equals(((C44407p) obj).f418432b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418432b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return "declaresMethods(" + this.f418432b + ")";
    }
}
