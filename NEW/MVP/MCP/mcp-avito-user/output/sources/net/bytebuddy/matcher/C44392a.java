package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.a;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: AccessibilityMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44392a<T extends net.bytebuddy.description.a> extends InterfaceC44410t.a.d<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return ((net.bytebuddy.description.a) obj).P(null);
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        super.hashCode();
        throw null;
    }

    public final String toString() {
        return "isAccessibleTo(null)";
    }
}
