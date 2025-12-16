package com.avito.android.beduin.common.component.radio_group;

import com.avito.android.lib.design.list_item.ListItemRadio;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinRadioListComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio;", "radioListItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemRadio;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.l<ListItemRadio, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f102233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j jVar) {
        super(1);
        this.f102233l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemRadio listItemRadio) {
        Object next;
        boolean zBooleanValue;
        ListItemRadio listItemRadio2 = listItemRadio;
        j jVar = this.f102233l;
        Iterator<T> it = jVar.f102221i.getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Option) next).getId(), listItemRadio2.getTag())) {
                break;
            }
        }
        Option option = (Option) next;
        Boolean boolIsEnabled = jVar.f102221i.isEnabled();
        if (boolIsEnabled != null) {
            zBooleanValue = boolIsEnabled.booleanValue();
        } else {
            Boolean boolIsEnabled2 = option != null ? option.isEnabled() : null;
            zBooleanValue = boolIsEnabled2 != null ? boolIsEnabled2.booleanValue() : true;
        }
        listItemRadio2.setEnabled(zBooleanValue);
        return G0.f406611a;
    }
}
