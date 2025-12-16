package net.bytebuddy.implementation.auxiliary;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.modifier.SyntheticState;
import net.bytebuddy.description.modifier.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.a;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.utility.g;

/* compiled from: AuxiliaryType.java */
/* loaded from: classes7.dex */
public interface a {

    /* renamed from: J2, reason: collision with root package name */
    @SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"MS_MUTABLE_ARRAY", "MS_OOI_PKGPROTECT"})
    public static final a.d[] f417587J2 = {SyntheticState.SYNTHETIC};

    /* compiled from: AuxiliaryType.java */
    /* renamed from: net.bytebuddy.implementation.auxiliary.a$a, reason: collision with other inner class name */
    public interface InterfaceC12088a {

        /* compiled from: AuxiliaryType.java */
        /* renamed from: net.bytebuddy.implementation.auxiliary.a$a$a, reason: collision with other inner class name */
        public static class C12089a implements InterfaceC12088a {
            @Override // net.bytebuddy.implementation.auxiliary.a.InterfaceC12088a
            public final String a(TypeDescription typeDescription, a aVar) {
                int iHashCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typeDescription.getName());
                sb2.append("$null$");
                if (aVar == null) {
                    iHashCode = 0;
                } else {
                    char[] cArr = g.f418986c;
                    iHashCode = aVar.getClass().hashCode() ^ System.identityHashCode(aVar);
                }
                sb2.append(g.a(iHashCode));
                return sb2.toString();
            }
        }

        /* compiled from: AuxiliaryType.java */
        /* renamed from: net.bytebuddy.implementation.auxiliary.a$a$b */
        public static class b implements InterfaceC12088a {
            @Override // net.bytebuddy.implementation.auxiliary.a.InterfaceC12088a
            public final String a(TypeDescription typeDescription, a aVar) {
                return typeDescription.getName() + "$auxiliary$" + aVar.c();
            }
        }

        /* compiled from: AuxiliaryType.java */
        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.implementation.auxiliary.a$a$c */
        public static class c implements InterfaceC12088a {

            /* renamed from: a, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            public final g f417588a = new g();

            @Override // net.bytebuddy.implementation.auxiliary.a.InterfaceC12088a
            public final String a(TypeDescription typeDescription, a aVar) {
                return typeDescription.getName() + "$auxiliary$" + this.f417588a.c();
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
                return (getClass().hashCode() * 31) + 756240582;
            }
        }

        String a(TypeDescription typeDescription, a aVar);
    }

    /* compiled from: AuxiliaryType.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    String c();

    a.d d(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory);
}
