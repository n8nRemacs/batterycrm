package net.bytebuddy.implementation;

import com.yandex.div2.D8;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SuperMethodCall implements Implementation.b {

    /* renamed from: b, reason: collision with root package name */
    public static final SuperMethodCall f417447b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SuperMethodCall[] f417448c;

    @HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final Implementation.Target f417449b;

        /* renamed from: c, reason: collision with root package name */
        public final TerminationHandler f417450c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static abstract class TerminationHandler {

            /* renamed from: b, reason: collision with root package name */
            public static final TerminationHandler f417451b;

            /* renamed from: c, reason: collision with root package name */
            public static final TerminationHandler f417452c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ TerminationHandler[] f417453d;

            public enum a extends TerminationHandler {
                @Override // net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    return MethodReturn.c(aVar.getReturnType());
                }
            }

            public enum b extends TerminationHandler {
                @Override // net.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                public final StackManipulation a(net.bytebuddy.description.method.a aVar) {
                    return Removal.c(aVar.getReturnType());
                }
            }

            static {
                a aVar = new a("RETURNING", 0, null);
                f417451b = aVar;
                b bVar = new b("DROPPING", 1, null);
                f417452c = bVar;
                f417453d = new TerminationHandler[]{aVar, bVar};
            }

            public TerminationHandler() {
                throw null;
            }

            public TerminationHandler(String str, int i12, a aVar) {
            }

            public static TerminationHandler valueOf(String str) {
                return (TerminationHandler) Enum.valueOf(TerminationHandler.class, str);
            }

            public static TerminationHandler[] values() {
                return (TerminationHandler[]) f417453d.clone();
            }

            public abstract StackManipulation a(net.bytebuddy.description.method.a aVar);
        }

        public Appender(Implementation.Target target, TerminationHandler terminationHandler) {
            this.f417449b = target;
            this.f417450c = terminationHandler;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.f417450c.equals(appender.f417450c) && this.f417449b.equals(appender.f417449b);
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            Implementation.SpecialMethodInvocation specialMethodInvocationE = this.f417449b.e(aVar.e()).e(aVar.f0());
            if (!specialMethodInvocationE.isValid()) {
                throw new IllegalStateException(D8.m("Cannot call super (or default) method for ", aVar));
            }
            return new a.c(new StackManipulation.b(MethodVariableAccess.a(aVar).g(), specialMethodInvocationE, this.f417450c.a(aVar)).n(sVar, context).f417834b, aVar.p());
        }

        public final int hashCode() {
            return this.f417450c.hashCode() + ((this.f417449b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }
    }

    static {
        SuperMethodCall superMethodCall = new SuperMethodCall("INSTANCE", 0);
        f417447b = superMethodCall;
        f417448c = new SuperMethodCall[]{superMethodCall};
    }

    public SuperMethodCall() {
        throw null;
    }

    public static SuperMethodCall valueOf(String str) {
        return (SuperMethodCall) Enum.valueOf(SuperMethodCall.class, str);
    }

    public static SuperMethodCall[] values() {
        return (SuperMethodCall[]) f417448c.clone();
    }

    @Override // net.bytebuddy.implementation.Implementation.b
    public final Implementation.b c(Implementation.b bVar) {
        return new Implementation.c.a(WithoutReturn.f417454b, bVar);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return new Appender(target, Appender.TerminationHandler.f417451b);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WithoutReturn implements Implementation {

        /* renamed from: b, reason: collision with root package name */
        public static final WithoutReturn f417454b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ WithoutReturn[] f417455c;

        static {
            WithoutReturn withoutReturn = new WithoutReturn("INSTANCE", 0);
            f417454b = withoutReturn;
            f417455c = new WithoutReturn[]{withoutReturn};
        }

        public WithoutReturn() {
            throw null;
        }

        public static WithoutReturn valueOf(String str) {
            return (WithoutReturn) Enum.valueOf(WithoutReturn.class, str);
        }

        public static WithoutReturn[] values() {
            return (WithoutReturn[]) f417455c.clone();
        }

        @Override // net.bytebuddy.implementation.Implementation
        public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
            return new Appender(target, Appender.TerminationHandler.f417452c);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public final InstrumentedType e(InstrumentedType instrumentedType) {
            return instrumentedType;
        }
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }
}
