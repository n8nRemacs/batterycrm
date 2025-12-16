package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.lib.design.list_item.ListItemRadio;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRadioListComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio;", "radioListItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemRadio;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.l<ListItemRadio, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f102232l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar) {
        super(1);
        this.f102232l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemRadio listItemRadio) {
        ListItemRadio listItemRadio2 = listItemRadio;
        j jVar = this.f102232l;
        o oVar = new o(jVar);
        int i12 = j.f102217n;
        jVar.getClass();
        listItemRadio2.i();
        oVar.invoke(listItemRadio2);
        listItemRadio2.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(2, listItemRadio2, jVar));
        return G0.f406611a;
    }
}
