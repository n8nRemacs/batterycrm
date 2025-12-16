package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.lib.design.list_item.ListItemRadio;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRadioListComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemRadio;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<ListItemRadio, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f102231l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar) {
        super(1);
        this.f102231l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemRadio listItemRadio) {
        ListItemRadio listItemRadio2 = listItemRadio;
        listItemRadio2.setChecked(L.f(listItemRadio2.getTag().toString(), this.f102231l.f102221i.getSelectedId()));
        return G0.f406611a;
    }
}
