package net.bytebuddy.utility.privilege;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: SetAccessibleAction.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class c<T extends AccessibleObject> implements PrivilegedAction<T> {

    /* renamed from: b, reason: collision with root package name */
    public final T f418993b;

    public c(T t12) {
        this.f418993b = t12;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418993b.equals(((c) obj).f418993b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418993b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        T t12 = this.f418993b;
        t12.setAccessible(true);
        return t12;
    }
}
