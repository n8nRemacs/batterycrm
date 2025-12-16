package p51;

import Y61.k;
import Y61.l;
import k51.InterfaceC42522g;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.i;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.o;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;

/* compiled from: JavaDescriptorResolver.kt */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f428197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f428198b;

    public c(@k g gVar, @k i iVar) {
        this.f428197a = gVar;
        this.f428198b = iVar;
    }

    @l
    public final InterfaceC42851d a(@k InterfaceC42522g interfaceC42522g) {
        kotlin.reflect.jvm.internal.impl.name.c cVarD = interfaceC42522g.d();
        LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.f408302b;
        t tVarM = interfaceC42522g.M();
        if (tVarM != null) {
            InterfaceC42851d interfaceC42851dA = a(tVarM);
            j jVarF0 = interfaceC42851dA != null ? interfaceC42851dA.f0() : null;
            InterfaceC42853f interfaceC42853fG = jVarF0 != null ? jVarF0.g(interfaceC42522g.getName(), NoLookupLocation.f407891i) : null;
            if (interfaceC42853fG instanceof InterfaceC42851d) {
                return (InterfaceC42851d) interfaceC42853fG;
            }
            return null;
        }
        n nVar = (n) C42745f0.G(this.f428197a.a(cVarD.e()));
        if (nVar == null) {
            return null;
        }
        o oVar = nVar.f408179l.f408114d;
        oVar.getClass();
        return oVar.v(interfaceC42522g.getName(), interfaceC42522g);
    }
}
