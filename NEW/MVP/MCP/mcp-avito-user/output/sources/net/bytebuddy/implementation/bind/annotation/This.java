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
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.matcher.C44411u;

/* JADX WARN: Method from annotation default annotation not found: optional */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface This {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<This> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417767b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417768c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417769d;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417767b = binder;
            f417769d = new Binder[]{binder};
            f417768c = (a.d) TypeDescription.d.A0(This.class).q().P1(C44411u.x("optional")).M2();
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417769d.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            if (cVar.getType().w5()) {
                throw new IllegalStateException(cVar + " uses a primitive type with a @This annotation");
            }
            if (cVar.getType().w2()) {
                throw new IllegalStateException(cVar + " uses an array type with a @This annotation");
            }
            if (!aVar.b() || ((Boolean) gVar.d(f417768c).b(Boolean.class)).booleanValue()) {
                return new MethodDelegationBinder.ParameterBinding.a(aVar.b() ? NullConstant.f418029b : new StackManipulation.b(MethodVariableAccess.c(), bVar.a(target.a().P0(), cVar.getType(), typing)));
            }
            return MethodDelegationBinder.ParameterBinding.Illegal.f417632b;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<This> b() {
            return This.class;
        }
    }
}
