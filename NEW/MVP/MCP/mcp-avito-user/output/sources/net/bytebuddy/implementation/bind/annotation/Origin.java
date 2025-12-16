package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import net.bytebuddy.implementation.bytecode.constant.MethodConstant;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaType;

/* JADX WARN: Method from annotation default annotation not found: cache */
/* JADX WARN: Method from annotation default annotation not found: privileged */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Origin {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<Origin> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417724b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417725c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417726d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417727e;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417724b = binder;
            f417727e = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Origin.class).q();
            f417725c = (a.d) bVarQ.P1(C44411u.x("cache")).M2();
            f417726d = (a.d) bVarQ.P1(C44411u.x("privileged")).M2();
        }

        public Binder() {
            throw null;
        }

        public static StackManipulation c(AnnotationDescription.g<Origin> gVar, a.d dVar) {
            MethodConstant.c cVarQ = ((Boolean) gVar.d(f417726d).b(Boolean.class)).booleanValue() ? MethodConstant.q(dVar) : MethodConstant.p(dVar);
            return ((Boolean) gVar.d(f417725c).b(Boolean.class)).booleanValue() ? cVarQ.f() : cVarQ;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417727e.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeDescription typeDescriptionF5 = cVar.getType().f5();
            if (typeDescriptionF5.Q2(Class.class)) {
                return new MethodDelegationBinder.ParameterBinding.a(ClassConstant.c(target.f().f5()));
            }
            boolean zQ2 = typeDescriptionF5.Q2(Method.class);
            MethodDelegationBinder.ParameterBinding.Illegal illegal = MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            if (zQ2) {
                return aVar.C() ? new MethodDelegationBinder.ParameterBinding.a(c(gVar, aVar.i())) : illegal;
            }
            if (typeDescriptionF5.Q2(Constructor.class)) {
                return aVar.v0() ? new MethodDelegationBinder.ParameterBinding.a(c(gVar, aVar.i())) : illegal;
            }
            if (JavaType.f418906j.f418912b.equals(typeDescriptionF5)) {
                return new MethodDelegationBinder.ParameterBinding.a(c(gVar, aVar.i()));
            }
            if (typeDescriptionF5.Q2(String.class)) {
                return new MethodDelegationBinder.ParameterBinding.a(new net.bytebuddy.implementation.bytecode.constant.c(aVar.toString()));
            }
            if (typeDescriptionF5.Q2(Integer.TYPE)) {
                return new MethodDelegationBinder.ParameterBinding.a(IntegerConstant.c(aVar.getModifiers()));
            }
            if (typeDescriptionF5.equals(JavaType.f418902f.f418912b)) {
                a.d dVarI = aVar.i();
                if (!dVarI.d0()) {
                    return new MethodDelegationBinder.ParameterBinding.a(new JavaConstantValue(new JavaConstant.MethodHandle(dVarI.b() ? JavaConstant.MethodHandle.HandleType.f418876e : dVarI.v0() ? JavaConstant.MethodHandle.HandleType.f418879h : dVarI.O() ? JavaConstant.MethodHandle.HandleType.f418877f : dVarI.n().E() ? JavaConstant.MethodHandle.HandleType.f418878g : JavaConstant.MethodHandle.HandleType.f418875d, dVarI.n().f5(), dVarI.V(), dVarI.getReturnType().f5(), dVarI.getParameters().p2().f1())));
                }
                throw new IllegalArgumentException("Cannot create handle of type initializer " + dVarI);
            }
            if (typeDescriptionF5.equals(JavaType.f418903g.f418912b)) {
                a.d dVarI2 = aVar.i();
                return new MethodDelegationBinder.ParameterBinding.a(new JavaConstantValue(new JavaConstant.c(dVarI2.getReturnType().f5(), dVarI2.getParameters().p2().f1())));
            }
            throw new IllegalStateException("The " + cVar + " method's " + cVar.getIndex() + " parameter is annotated with a Origin annotation with an argument not representing a Class, Method, Constructor, String, int, MethodType or MethodHandle type");
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Origin> b() {
            return Origin.class;
        }
    }
}
