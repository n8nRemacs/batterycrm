package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: fallbackToDefault */
/* JADX WARN: Method from annotation default annotation not found: nullIfImpossible */
/* JADX WARN: Method from annotation default annotation not found: serializableProxy */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface SuperCall {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<SuperCall> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417753b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417754c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417755d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417756e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417757f;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417753b = binder;
            f417757f = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(SuperCall.class).q();
            f417754c = (a.d) bVarQ.P1(C44411u.x("serializableProxy")).M2();
            f417755d = (a.d) bVarQ.P1(C44411u.x("fallbackToDefault")).M2();
            f417756e = (a.d) bVarQ.P1(C44411u.x("nullIfImpossible")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417757f.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeDescription typeDescriptionF5 = cVar.getType().f5();
            if (!typeDescriptionF5.Q2(Runnable.class) && !typeDescriptionF5.Q2(Callable.class) && !typeDescriptionF5.Q2(Object.class)) {
                throw new IllegalStateException("A super method call proxy can only be assigned to Runnable or Callable types: " + cVar);
            }
            boolean zV02 = aVar.v0();
            MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            StackManipulation bVar2 = NullConstant.f418029b;
            a.d dVar = f417756e;
            if (zV02) {
                return ((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.a(bVar2) : illegal;
            }
            Implementation.SpecialMethodInvocation specialMethodInvocationE = (((Boolean) gVar.d(f417755d).b(Boolean.class)).booleanValue() ? target.e(aVar.e()) : target.c(aVar.e())).e(aVar.f0());
            if (specialMethodInvocationE.isValid()) {
                bVar2 = new MethodCallProxy.b(specialMethodInvocationE, ((Boolean) gVar.d(f417754c).b(Boolean.class)).booleanValue());
            } else if (!((Boolean) gVar.d(dVar).b(Boolean.class)).booleanValue()) {
                return illegal;
            }
            return new MethodDelegationBinder.ParameterBinding.a(bVar2);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<SuperCall> b() {
            return SuperCall.class;
        }
    }
}
