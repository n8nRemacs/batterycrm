package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.matcher.InterfaceC44410t;

/* compiled from: NullMatcher.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class N<T> extends InterfaceC44410t.a.AbstractC12113a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final N<?> f418408b = new N<>();

    @Override // net.bytebuddy.matcher.InterfaceC44410t
    public final boolean b(@net.bytebuddy.utility.nullability.b T t12) {
        return t12 == null;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "isNull()";
    }
}
