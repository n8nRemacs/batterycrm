package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.b;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: declaringType */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface FieldValue {

    public enum Binder implements c.b<FieldValue> {
        f417709c;


        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417710d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417711e;

        /* renamed from: b, reason: collision with root package name */
        public final a f417713b;

        public static class a extends c.b.a<FieldValue> {
            @Override // net.bytebuddy.implementation.bind.annotation.c.b
            public final Class<FieldValue> b() {
                return FieldValue.class;
            }

            @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
            public final MethodDelegationBinder.ParameterBinding c(net.bytebuddy.description.field.a aVar, net.bytebuddy.description.method.c cVar, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar) {
                StackManipulation.b bVar2 = new StackManipulation.b(aVar.b() ? StackManipulation.Trivial.f417829b : MethodVariableAccess.c(), FieldAccess.c(aVar).read(), bVar.a(aVar.getType(), cVar.getType(), b.a.a(cVar)));
                return bVar2.isValid() ? new MethodDelegationBinder.ParameterBinding.a(bVar2) : MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
            }

            @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
            public final TypeDescription d(AnnotationDescription.g<FieldValue> gVar) {
                return (TypeDescription) gVar.d(Binder.f417710d).b(TypeDescription.class);
            }

            @Override // net.bytebuddy.implementation.bind.annotation.c.b.a
            public final String e(AnnotationDescription.g<FieldValue> gVar) {
                return (String) gVar.d(Binder.f417711e).b(String.class);
            }
        }

        static {
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(FieldValue.class).q();
            f417710d = (a.d) bVarQ.P1(C44411u.x("declaringType")).M2();
            f417711e = (a.d) bVarQ.P1(C44411u.x("value")).M2();
        }

        Binder(a aVar) {
            this.f417713b = aVar;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            return this.f417713b.a(gVar, aVar, cVar, target, bVar, typing);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<FieldValue> b() {
            return FieldValue.class;
        }
    }
}
