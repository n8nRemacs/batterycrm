package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.c;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface Empty {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Binder implements c.b<Empty> {

        /* renamed from: b, reason: collision with root package name */
        public static final Binder f417695b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Binder[] f417696c;

        static {
            Binder binder = new Binder("INSTANCE", 0);
            f417695b = binder;
            f417696c = new Binder[]{binder};
        }

        public Binder() {
            throw null;
        }

        public static Binder valueOf(String str) {
            return (Binder) Enum.valueOf(Binder.class, str);
        }

        public static Binder[] values() {
            return (Binder[]) f417696c.clone();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final MethodDelegationBinder.ParameterBinding a(AnnotationDescription.g gVar, net.bytebuddy.description.method.a aVar, net.bytebuddy.description.method.c cVar, Implementation.Target target, net.bytebuddy.implementation.bytecode.assign.primitive.b bVar, Assigner.Typing typing) {
            return new MethodDelegationBinder.ParameterBinding.a(DefaultValue.c(cVar.getType().f5()));
        }

        @Override // net.bytebuddy.implementation.bind.annotation.c.b
        public final Class<Empty> b() {
            return Empty.class;
        }
    }
}
