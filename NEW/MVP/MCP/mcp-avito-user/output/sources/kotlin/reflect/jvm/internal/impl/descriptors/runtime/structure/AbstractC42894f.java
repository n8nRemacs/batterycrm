package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import k51.InterfaceC42517b;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42894f implements InterfaceC42517b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f407856b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.f f407857a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static AbstractC42894f a(@Y61.k Object obj, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            Class<?> cls = obj.getClass();
            List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
            return Enum.class.isAssignableFrom(cls) ? new y(fVar, (Enum) obj) : obj instanceof Annotation ? new C42895g(fVar, (Annotation) obj) : obj instanceof Object[] ? new C42898j(fVar, (Object[]) obj) : obj instanceof Class ? new u(fVar, (Class) obj) : new A(obj, fVar);
        }

        public a() {
        }
    }

    public AbstractC42894f(kotlin.reflect.jvm.internal.impl.name.f fVar, C42822w c42822w) {
        this.f407857a = fVar;
    }

    @Override // k51.InterfaceC42517b
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f407857a;
    }
}
