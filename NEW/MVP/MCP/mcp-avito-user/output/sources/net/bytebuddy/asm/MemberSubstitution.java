package net.bytebuddy.asm;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.jar.asm.s;
import net.bytebuddy.pool.TypePool;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class MemberSubstitution implements AsmVisitorWrapper.d.c {

    public interface Replacement {

        public interface Binding {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Unresolved implements Binding {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Unresolved[] f415901b = {new Unresolved("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                Unresolved EF5;

                public Unresolved() {
                    throw null;
                }

                public static Unresolved valueOf(String str) {
                    return (Unresolved) Enum.valueOf(Unresolved.class, str);
                }

                public static Unresolved[] values() {
                    return (Unresolved[]) f415901b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements Binding {
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class InvocationType {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ InvocationType[] f415902b = {new InvocationType("VIRTUAL", 0), new InvocationType("SUPER", 1), new InvocationType("OTHER", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            InvocationType EF5;

            public InvocationType() {
                throw null;
            }

            public static InvocationType valueOf(String str) {
                return (InvocationType) Enum.valueOf(InvocationType.class, str);
            }

            public static InvocationType[] values() {
                return (InvocationType[]) f415902b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Replacement, a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f415903b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f415903b.clone();
            }
        }

        public interface a {

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.asm.MemberSubstitution$Replacement$a$a, reason: collision with other inner class name */
            public static class C11938a implements a {
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

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Replacement {

            @HashCodeAndEqualsPlugin.Enhance
            public static class a implements a {
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

            public b() {
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
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements Replacement {
            public c() {
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
        }
    }

    public interface Substitution {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Stubbing implements Substitution, b {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Stubbing[] f415904b = {new Stubbing("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            Stubbing EF5;

            public Stubbing() {
                throw null;
            }

            public static Stubbing valueOf(String str) {
                return (Stubbing) Enum.valueOf(Stubbing.class, str);
            }

            public static Stubbing[] values() {
                return (Stubbing[]) f415904b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Substitution {

            /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$a$a, reason: collision with other inner class name */
            public static class C11939a implements b {
            }

            public interface b {

                /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$a$b$a, reason: collision with other inner class name */
                public interface InterfaceC11940a {
                }

                /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$a$b$b, reason: collision with other inner class name */
                public interface InterfaceC11941b {
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class c implements b, InterfaceC11941b, InterfaceC11940a {
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

            public a() {
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
        }

        public interface b {
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class c implements Substitution {

            public interface a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$c$a$a, reason: collision with other inner class name */
                public static class C11942a implements a {
                    public C11942a() {
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
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements a {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements b {
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

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$c$c, reason: collision with other inner class name */
            public static class C11943c implements b {
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

        @HashCodeAndEqualsPlugin.Enhance
        public static class d implements Substitution {

            public interface a {

                @HashCodeAndEqualsPlugin.Enhance
                /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$d$a$a, reason: collision with other inner class name */
                public static class C11944a implements a {
                    public C11944a() {
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
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class b implements a {
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

            @HashCodeAndEqualsPlugin.Enhance
            public static class b implements b {
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

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class c implements b {

                /* renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ c[] f415905b = {new c("INSTANCE", 0)};

                /* JADX INFO: Fake field, exist only in values array */
                c EF5;

                public c() {
                    throw null;
                }

                public static c valueOf(String str) {
                    return (c) Enum.valueOf(c.class, str);
                }

                public static c[] values() {
                    return (c[]) f415905b.clone();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            /* renamed from: net.bytebuddy.asm.MemberSubstitution$Substitution$d$d, reason: collision with other inner class name */
            public static class C11945d implements b {
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

    public interface TypePoolResolver {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class OfImplicitPool implements TypePoolResolver {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ OfImplicitPool[] f415906b = {new OfImplicitPool("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            OfImplicitPool EF5;

            public OfImplicitPool() {
                throw null;
            }

            public static OfImplicitPool valueOf(String str) {
                return (OfImplicitPool) Enum.valueOf(OfImplicitPool.class, str);
            }

            public static OfImplicitPool[] values() {
                return (OfImplicitPool[]) f415906b.clone();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements TypePoolResolver {
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

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements TypePoolResolver {
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

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f415907a;

        static {
            int[] iArr = new int[Replacement.InvocationType.values().length];
            f415907a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f415907a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b extends net.bytebuddy.utility.visitor.c {

        /* renamed from: e, reason: collision with root package name */
        public int f415908e;

        public class a extends s {
            public a(s sVar, a aVar) {
                super(net.bytebuddy.utility.e.f418981b, sVar);
            }

            @Override // net.bytebuddy.jar.asm.s
            @SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
            public final void J(int i12, int i13) {
                b bVar = b.this;
                switch (i12) {
                    case 54:
                    case 56:
                    case 58:
                        bVar.f415908e = Math.max(bVar.f415908e, i13 + 1);
                        break;
                    case 55:
                    case 57:
                        bVar.f415908e = Math.max(bVar.f415908e, i13 + 2);
                        break;
                }
                super.J(i12, i13);
            }
        }

        @Override // net.bytebuddy.jar.asm.s
        public final void A(String str, String str2, String str3, int i12, boolean z12) {
            str.replace('/', '.');
            throw null;
        }

        @Override // net.bytebuddy.jar.asm.s
        public final void j(int i12, String str, String str2, String str3) {
            str.replace('/', '.');
            throw null;
        }

        @Override // net.bytebuddy.jar.asm.s
        public final void y(int i12, int i13) {
            super.y(i12 + 0, Math.max(this.f415908e, i13));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class c {

        @HashCodeAndEqualsPlugin.Enhance
        public static class a extends c {
            @Override // net.bytebuddy.asm.MemberSubstitution.c
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

            @Override // net.bytebuddy.asm.MemberSubstitution.c
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b extends c {
            @Override // net.bytebuddy.asm.MemberSubstitution.c
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

            @Override // net.bytebuddy.asm.MemberSubstitution.c
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        /* renamed from: net.bytebuddy.asm.MemberSubstitution$c$c, reason: collision with other inner class name */
        public static class C11946c extends c {
            @Override // net.bytebuddy.asm.MemberSubstitution.c
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

            @Override // net.bytebuddy.asm.MemberSubstitution.c
            public final int hashCode() {
                super.hashCode();
                throw null;
            }
        }

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            getClass().hashCode();
            throw null;
        }
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper.d.c
    public final s a(TypeDescription typeDescription, net.bytebuddy.description.method.a aVar, s sVar, Implementation.Context context, TypePool typePool, int i12, int i13) {
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
}
