package com.avito.beduin.v2.avito.component.chips.state;

import com.avito.beduin.v2.avito.component.chips.state.a;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoChipsStateFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "it", "Lcom/avito/beduin/v2/avito/component/chips/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lcom/avito/beduin/v2/avito/component/chips/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.p<InterfaceC36241a, Integer, a.C10371a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334069l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC36250j.b bVar) {
        super(2);
        this.f334069l = bVar;
    }

    @Override // Y41.p
    public final a.C10371a invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (a.C10371a) interfaceC36241a.m(iIntValue, new d(this.f334069l), String.valueOf(iIntValue));
    }
}
