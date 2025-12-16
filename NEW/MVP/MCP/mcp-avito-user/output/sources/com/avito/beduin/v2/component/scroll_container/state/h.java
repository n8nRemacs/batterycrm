package com.avito.beduin.v2.component.scroll_container.state;

import com.avito.beduin.v2.component.scroll_container.state.d;
import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScrollContainerState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "index", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.p<InterfaceC36241a, Integer, d.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f336213l = new h();

    public h() {
        super(2);
    }

    @Override // Y41.p
    public final d.a invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (d.a) interfaceC36241a.j(iIntValue, String.valueOf(iIntValue), g.f336212l);
    }
}
