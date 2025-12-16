package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: descriptorUtil.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42888q {
    @Y61.l
    public static final InterfaceC42853f a(@Y61.k InterfaceC42882k interfaceC42882k) {
        InterfaceC42882k interfaceC42882kF = interfaceC42882k.f();
        if (interfaceC42882kF == null || (interfaceC42882k instanceof K)) {
            return null;
        }
        if (!(interfaceC42882kF.f() instanceof K)) {
            return a(interfaceC42882kF);
        }
        if (interfaceC42882kF instanceof InterfaceC42853f) {
            return (InterfaceC42853f) interfaceC42882kF;
        }
        return null;
    }

    @Y61.l
    public static final InterfaceC42851d b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.G g12, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarF0;
        NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
        if (cVar.d()) {
            return null;
        }
        InterfaceC42853f interfaceC42853fG = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.a) g12.i0(cVar.e()).n()).g(cVar.f(), noLookupLocation);
        InterfaceC42851d interfaceC42851d = interfaceC42853fG instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fG : null;
        if (interfaceC42851d != null) {
            return interfaceC42851d;
        }
        InterfaceC42851d interfaceC42851dB = b(g12, cVar.e());
        InterfaceC42853f interfaceC42853fG2 = (interfaceC42851dB == null || (jVarF0 = interfaceC42851dB.f0()) == null) ? null : jVarF0.g(cVar.f(), noLookupLocation);
        if (interfaceC42853fG2 instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fG2;
        }
        return null;
    }
}
