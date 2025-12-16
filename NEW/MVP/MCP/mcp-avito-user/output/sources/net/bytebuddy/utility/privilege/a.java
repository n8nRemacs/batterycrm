package net.bytebuddy.utility.privilege;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.Arrays;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* compiled from: GetMethodAction.java */
@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class a implements PrivilegedAction<Method> {

    /* renamed from: b, reason: collision with root package name */
    public final Class<?>[] f418991b;

    public a(Class... clsArr) {
        this.f418991b = clsArr;
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f418991b, ((a) obj).f418991b);
    }

    public final int hashCode() {
        return (((((getClass().hashCode() * 31) + 496472185) * 31) + 686218487) * 31) + Arrays.hashCode(this.f418991b);
    }

    @Override // java.security.PrivilegedAction
    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    @net.bytebuddy.utility.nullability.b
    public final Method run() {
        try {
            return Class.forName("java.lang.SecurityManager").getMethod("checkPermission", this.f418991b);
        } catch (Exception unused) {
            return null;
        }
    }
}
