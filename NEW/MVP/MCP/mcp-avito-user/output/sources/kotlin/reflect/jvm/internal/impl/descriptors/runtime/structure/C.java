package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import k51.InterfaceC42513B;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC42894f;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;

/* compiled from: ReflectJavaMethod.kt */
@s0
/* loaded from: classes8.dex */
public final class C extends B implements k51.r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Method f407822a;

    public C(@Y61.k Method method) {
        this.f407822a = method;
    }

    @Override // k51.r
    @Y61.k
    public final List<InterfaceC42513B> g() {
        Method method = this.f407822a;
        return q(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
    }

    @Override // k51.z
    @Y61.k
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f407822a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new I(typeVariable));
        }
        return arrayList;
    }

    @Override // k51.r
    public final H m() {
        H.a aVar = H.f407827a;
        Type genericReturnType = this.f407822a.getGenericReturnType();
        aVar.getClass();
        return H.a.a(genericReturnType);
    }

    @Override // k51.r
    public final boolean o() {
        Object defaultValue = this.f407822a.getDefaultValue();
        AbstractC42894f abstractC42894fA = null;
        if (defaultValue != null) {
            AbstractC42894f.f407856b.getClass();
            abstractC42894fA = AbstractC42894f.a.a(defaultValue, null);
        }
        return abstractC42894fA != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.B
    public final Member p() {
        return this.f407822a;
    }
}
