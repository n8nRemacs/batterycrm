package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: FailSafeMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44414x<T> extends InterfaceC44410t.a.AbstractC12113a<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        try {
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        getClass().hashCode();
        throw null;
    }

    public final String toString() {
        return "failSafe(try(" + ((Object) null) + ") or false)";
    }
}
