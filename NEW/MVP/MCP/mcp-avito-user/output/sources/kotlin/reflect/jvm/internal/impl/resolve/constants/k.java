package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: constantValues.kt */
@s0
/* loaded from: classes8.dex */
public final class k extends g<Q<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f409589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f409590c;

    public k(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(new Q(bVar, fVar));
        this.f409589b = bVar;
        this.f409590c = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final O a(@Y61.k E e12) {
        kotlin.reflect.jvm.internal.impl.name.b bVar = this.f409589b;
        InterfaceC42851d interfaceC42851dA = C42904w.a(e12, bVar);
        Y yQ2 = null;
        if (interfaceC42851dA != null) {
            int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
            if (!kotlin.reflect.jvm.internal.impl.resolve.j.n(interfaceC42851dA, ClassKind.f407415d)) {
                interfaceC42851dA = null;
            }
            if (interfaceC42851dA != null) {
                yQ2 = interfaceC42851dA.q();
            }
        }
        return yQ2 == null ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410145B, bVar.toString(), this.f409590c.f409252b) : yQ2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f409589b.i());
        sb2.append('.');
        sb2.append(this.f409590c);
        return sb2.toString();
    }
}
