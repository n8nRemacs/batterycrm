package com.avito.beduin.v2.avito.component.description_list.state;

import com.avito.beduin.v2.avito.component.description_list.state.a;
import com.avito.beduin.v2.engine.component.InterfaceC36241a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoDescriptionListStateFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/beduin/v2/engine/component/a;", "", "it", "Lcom/avito/beduin/v2/avito/component/description_list/state/a$a;", "invoke", "(Lcom/avito/beduin/v2/engine/component/a;I)Lcom/avito/beduin/v2/avito/component/description_list/state/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.p<InterfaceC36241a, Integer, a.C10373a> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f334244l = new f();

    public f() {
        super(2);
    }

    @Override // Y41.p
    public final a.C10373a invoke(InterfaceC36241a interfaceC36241a, Integer num) {
        int iIntValue = num.intValue();
        return (a.C10373a) interfaceC36241a.m(iIntValue, e.f334243l, String.valueOf(iIntValue));
    }
}
