package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface StubValue {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<StubValue> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417737b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417738c;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417737b = binder;
            f417738c = new Binder[]{binder};
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417738c.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            if (cVar.getType().Q2(Object.class)) {
                return new MethodDelegationBinder.ParameterBinding.a(aVar.getReturnType().Q2(Void.TYPE) ? NullConstant.f418029b : new StackManipulation.b(DefaultValue.c(aVar.getReturnType().f5()), bVar.a(aVar.getReturnType(), TypeDescription.Generic.f416323x2, typing)));
            }
            throw new IllegalStateException(cVar + " uses StubValue annotation on non-Object type");
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<StubValue> b() {
            return StubValue.class;
        }
    }
}
