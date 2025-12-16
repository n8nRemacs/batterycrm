package net.bytebuddy.matcher;

import java.lang.ClassLoader;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: ClassLoaderHierarchyMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44398g<T extends ClassLoader> extends InterfaceC44410t.a.AbstractC12113a<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b Object obj) {
        ((ClassLoader) obj).getClass();
        throw null;
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
        return "hasChild(null)";
    }
}
