package net.bytebuddy.matcher;

import java.lang.ClassLoader;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: ClassLoaderParentMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* renamed from: net.bytebuddy.matcher.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44399h<T extends ClassLoader> extends InterfaceC44410t.a.AbstractC12113a<T> {
    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b Object obj) {
        ClassLoader classLoader = (ClassLoader) obj;
        for (ClassLoader parent = null; parent != null; parent = parent.getParent()) {
            if (parent == classLoader) {
                return true;
            }
        }
        return classLoader == null;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode() * 31;
    }

    public final String toString() {
        return "isParentOf(null)";
    }
}
