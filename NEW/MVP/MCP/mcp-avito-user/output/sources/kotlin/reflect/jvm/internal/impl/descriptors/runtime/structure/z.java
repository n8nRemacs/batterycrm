package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;

/* compiled from: ReflectJavaField.kt */
/* loaded from: classes8.dex */
public final class z extends B implements k51.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Field f407877a;

    public z(@Y61.k Field field) {
        this.f407877a = field;
    }

    @Override // k51.n
    public final k51.x getType() {
        H.a aVar = H.f407827a;
        Type genericType = this.f407877a.getGenericType();
        aVar.getClass();
        return H.a.a(genericType);
    }

    @Override // k51.n
    public final boolean n() {
        return this.f407877a.isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.B
    public final Member p() {
        return this.f407877a;
    }
}
