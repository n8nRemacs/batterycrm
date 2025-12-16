package net.bytebuddy.dynamic.loading;

import java.security.AllPermission;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.util.Collections;
import java.util.Enumeration;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

/* loaded from: classes8.dex */
public interface ClassFilePostProcessor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoOp implements ClassFilePostProcessor {

        /* renamed from: b, reason: collision with root package name */
        public static final NoOp f416699b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NoOp[] f416700c;

        static {
            NoOp noOp = new NoOp("INSTANCE", 0);
            f416699b = noOp;
            f416700c = new NoOp[]{noOp};
        }

        public NoOp() {
            throw null;
        }

        public static NoOp valueOf(String str) {
            return (NoOp) Enum.valueOf(NoOp.class, str);
        }

        public static NoOp[] values() {
            return (NoOp[]) f416700c.clone();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements ClassFilePostProcessor {

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.dynamic.loading.ClassFilePostProcessor$a$a, reason: collision with other inner class name */
        public static class C12045a extends PermissionCollection {
            private static final long serialVersionUID = 1;

            @Override // java.security.PermissionCollection
            public final void add(Permission permission) {
                throw new UnsupportedOperationException("add");
            }

            @Override // java.security.PermissionCollection
            public final Enumeration<Permission> elements() {
                return Collections.enumeration(Collections.singleton(new AllPermission()));
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

            @Override // java.security.PermissionCollection
            public final boolean implies(Permission permission) {
                return true;
            }
        }

        static {
            new ProtectionDomain(null, new C12045a());
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
    }
}
