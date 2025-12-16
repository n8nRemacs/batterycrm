package net.bytebuddy.implementation.bind.annotation;

import com.yandex.div2.D8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.ArgumentTypeResolver;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: bindingMechanic */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Argument {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<Argument> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417659b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417660c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417661d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417662e;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417659b = binder;
            f417662e = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(Argument.class).q();
            f417660c = (a.d) bVarQ.P1(C44411u.x("value")).M2();
            f417661d = (a.d) bVarQ.P1(C44411u.x("bindingMechanic")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417662e.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            a.d dVar = f417660c;
            if (((Integer) gVar.d(dVar).b(Integer.class)).intValue() >= 0) {
                return aVar.getParameters().size() <= ((Integer) gVar.d(dVar).b(Integer.class)).intValue() ? MethodDelegationBinder.ParameterBinding.Illegal.f417632b : ((BindingMechanic) D8.l(Argument.class, gVar.d(f417661d), BindingMechanic.class)).a(((net.bytebuddy.description.method.c) aVar.getParameters().get(((Integer) gVar.d(dVar).b(Integer.class)).intValue())).getType(), cVar.getType(), ((Integer) gVar.d(dVar).b(Integer.class)).intValue(), bVar, typing, ((net.bytebuddy.description.method.c) aVar.getParameters().get(((Integer) gVar.d(dVar).b(Integer.class)).intValue())).getOffset());
            }
            throw new IllegalArgumentException("@Argument annotation on " + cVar + " specifies negative index");
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Argument> b() {
            return Argument.class;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class BindingMechanic {

        /* renamed from: b, reason: collision with root package name */
        public static final BindingMechanic f417663b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ BindingMechanic[] f417664c;

        public enum a extends BindingMechanic {
            @Override // net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            public final MethodDelegationBinder.ParameterBinding a(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i12, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, int i13) {
                return new MethodDelegationBinder.ParameterBinding.b(new StackManipulation.b(MethodVariableAccess.d(generic).new b(i13), bVar.a(generic, generic2, typing)), new ArgumentTypeResolver.a(i12));
            }
        }

        public enum b extends BindingMechanic {
            @Override // net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            public final MethodDelegationBinder.ParameterBinding a(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i12, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, int i13) {
                return new MethodDelegationBinder.ParameterBinding.a(new StackManipulation.b(MethodVariableAccess.d(generic).new b(i13), bVar.a(generic, generic2, typing)));
            }
        }

        static {
            a aVar = new a("UNIQUE", 0, null);
            f417663b = aVar;
            f417664c = new BindingMechanic[]{aVar, new b("ANONYMOUS", 1, null)};
        }

        public BindingMechanic() {
            throw null;
        }

        public BindingMechanic(String str, int i12, a aVar) {
        }

        public static BindingMechanic valueOf(String str) {
            return (BindingMechanic) Enum.valueOf(BindingMechanic.class, str);
        }

        public static BindingMechanic[] values() {
            return (BindingMechanic[]) f417664c.clone();
        }

        public abstract MethodDelegationBinder.ParameterBinding a(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i12, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing, int i13);
    }

    int value();
}
