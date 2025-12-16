package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k51.InterfaceC42516a;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;

/* compiled from: ReflectJavaClassifierType.kt */
@s0
/* loaded from: classes8.dex */
public final class v extends H implements k51.j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f407873b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f407874c;

    public v(@Y61.k Type type) {
        x tVar;
        this.f407873b = type;
        if (type instanceof Class) {
            tVar = new t((Class) type);
        } else if (type instanceof TypeVariable) {
            tVar = new I((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            tVar = new t((Class) ((ParameterizedType) type).getRawType());
        }
        this.f407874c = tVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H, k51.InterfaceC42519d
    @Y61.l
    public final InterfaceC42516a F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return null;
    }

    @Override // k51.j
    @Y61.k
    public final ArrayList J() {
        List<Type> listC = C42892d.c(this.f407873b);
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (Type type : listC) {
            H.f407827a.getClass();
            arrayList.add(H.a.a(type));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k51.i, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x] */
    @Override // k51.j
    @Y61.k
    public final k51.i K() {
        return this.f407874c;
    }

    @Override // k51.j
    @Y61.k
    public final String Q() {
        return this.f407873b.toString();
    }

    @Override // k51.j
    @Y61.k
    public final String R() {
        throw new UnsupportedOperationException("Type not found: " + this.f407873b);
    }

    @Override // k51.j
    public final boolean S() {
        Type type = this.f407873b;
        if (type instanceof Class) {
            return !(((Class) type).getTypeParameters().length == 0);
        }
        return false;
    }

    @Override // k51.InterfaceC42519d
    @Y61.k
    public final Collection<InterfaceC42516a> getAnnotations() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H
    @Y61.k
    public final Type p() {
        return this.f407873b;
    }
}
