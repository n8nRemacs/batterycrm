package net.bytebuddy.utility.privilege;

import java.security.PrivilegedAction;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: GetSystemPropertyAction.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class b implements PrivilegedAction<String> {

    /* renamed from: b, reason: collision with root package name */
    public final String f418992b;

    public b(String str) {
        this.f418992b = str;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f418992b.equals(((b) obj).f418992b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f418992b.hashCode() + (getClass().hashCode() * 31);
    }

    @Override // java.security.PrivilegedAction
    public final String run() {
        return System.getProperty(this.f418992b);
    }
}
