package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import u51.InterfaceC48806h;

/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes8.dex */
final /* synthetic */ class h extends G implements Y41.l<InterfaceC48806h, J0> {
    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final kotlin.reflect.h getOwner() {
        return m0.f406844a.b(g.class);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @Y61.k
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // Y41.l
    public final J0 invoke(InterfaceC48806h interfaceC48806h) {
        return ((g) this.receiver).a(interfaceC48806h);
    }
}
