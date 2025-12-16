package net.bytebuddy.implementation.bind.annotation;

import com.yandex.div2.D8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory.a;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.b;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: includeSelf */
/* JADX WARN: Method from annotation default annotation not found: nullIfEmpty */
/* JADX WARN: Method from annotation default annotation not found: value */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface AllArguments {

    public enum Assignment {
        STRICT(true),
        /* JADX INFO: Fake field, exist only in values array */
        SLACK(false);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f417653b;

        Assignment(boolean z12) {
            this.f417653b = z12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<AllArguments> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417654b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417655c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f417656d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.d f417657e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417658f;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417654b = binder;
            f417658f = new Binder[]{binder};
            net.bytebuddy.description.method.b<a.d> bVarQ = TypeDescription.d.A0(AllArguments.class).q();
            f417655c = (a.d) bVarQ.P1(C44411u.x("value")).M2();
            f417656d = (a.d) bVarQ.P1(C44411u.x("includeSelf")).M2();
            f417657e = (a.d) bVarQ.P1(C44411u.x("nullIfEmpty")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417658f.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            TypeDescription.Generic genericM;
            if (cVar.getType().Q2(Object.class)) {
                genericM = TypeDescription.Generic.f416323x2;
            } else {
                if (!cVar.getType().w2()) {
                    throw new IllegalStateException(D8.m("Expected an array type for all argument annotation on ", aVar));
                }
                genericM = cVar.getType().m();
            }
            int i12 = (aVar.b() || !((Boolean) gVar.d(f417656d).b(Boolean.class)).booleanValue()) ? 0 : 1;
            if (i12 == 0 && aVar.getParameters().isEmpty() && ((Boolean) gVar.d(f417657e).b(Boolean.class)).booleanValue()) {
                return new MethodDelegationBinder.ParameterBinding.a(NullConstant.f418029b);
            }
            ArrayList arrayList = new ArrayList(aVar.getParameters().size() + i12);
            int i13 = (aVar.b() || i12 != 0) ? 0 : 1;
            for (TypeDescription.Generic generic : i12 != 0 ? net.bytebuddy.utility.a.c(target.a().P0(), aVar.getParameters().p2()) : aVar.getParameters().p2()) {
                StackManipulation.b bVar2 = new StackManipulation.b(MethodVariableAccess.d(generic).new b(i13), bVar.a(generic, genericM, typing));
                if (bVar2.isValid()) {
                    arrayList.add(bVar2);
                } else if (((Assignment) D8.l(AllArguments.class, gVar.d(f417655c), Assignment.class)).f417653b) {
                    return MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
                }
                i13 += generic.p().f417839b;
            }
            return new MethodDelegationBinder.ParameterBinding.a(ArrayFactory.a(genericM).new a(arrayList));
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<AllArguments> b() {
            return AllArguments.class;
        }
    }
}
