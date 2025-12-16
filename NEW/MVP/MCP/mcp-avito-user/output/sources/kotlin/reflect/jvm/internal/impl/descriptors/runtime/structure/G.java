package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaRecordComponent.kt */
@s0
/* loaded from: classes8.dex */
public final class G extends B implements k51.w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f407826a;

    public G(@Y61.k Object obj) {
        this.f407826a = obj;
    }

    @Override // k51.w
    @Y61.k
    public final k51.x getType() {
        C42889a.f407835a.getClass();
        Object obj = this.f407826a;
        Method method = C42889a.a(obj).f407837a;
        Class cls = method == null ? null : (Class) method.invoke(obj, new Object[0]);
        if (cls != null) {
            return new v(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.B
    @Y61.k
    public final Member p() {
        C42889a.f407835a.getClass();
        Object obj = this.f407826a;
        Method method = C42889a.a(obj).f407838b;
        Method method2 = method == null ? null : (Method) method.invoke(obj, new Object[0]);
        if (method2 != null) {
            return method2;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }
}
