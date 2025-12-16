package com.avito.beduin.v2.avito.component.map.state;

import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import kotlin.Metadata;

/* compiled from: AvitoMapStateFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "index", "Lcom/avito/beduin/v2/avito/component/map/state/Pin;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lcom/avito/beduin/v2/avito/component/map/state/Pin;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.avito.component.map.state.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36221e extends kotlin.jvm.internal.N implements Y41.p<InterfaceC36241a, Integer, Pin> {

    /* renamed from: l, reason: collision with root package name */
    public static final C36221e f334693l = new C36221e();

    public C36221e() {
        super(2);
    }

    @Override // Y41.p
    public final Pin invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (Pin) interfaceC36241a.m(iIntValue, C36218b.f334689l, String.valueOf(iIntValue));
    }
}
