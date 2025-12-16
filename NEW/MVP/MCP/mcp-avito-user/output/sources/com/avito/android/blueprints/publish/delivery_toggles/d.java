package com.avito.android.blueprints.publish.delivery_toggles;

import Y41.p;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliveryTogglesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/d;", "LHj/c;", "Lcom/avito/android/blueprints/publish/delivery_toggles/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends Hj.c implements c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f106184o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106185m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Object f106186n;

    public d(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.delivery_toggles_slot_publish_content, aVar);
        this.f106185m = aVar;
        this.f106186n = P0.g(new Q(DeliveryToggleType.f106168b, (ListItemSwitcher) this.f7656e.findViewById(R.id.delivery_toggles_pvz)), new Q(DeliveryToggleType.f106169c, (ListItemSwitcher) this.f7656e.findViewById(R.id.delivery_toggles_courier)), new Q(DeliveryToggleType.f106170d, (ListItemSwitcher) this.f7656e.findViewById(R.id.delivery_toggles_postamat)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.blueprints.publish.delivery_toggles.c
    public final void IH(@l DeliveryToggle deliveryToggle) {
        ListItemSwitcher listItemSwitcher;
        if (deliveryToggle == null || (listItemSwitcher = (ListItemSwitcher) this.f106186n.get(deliveryToggle.f106164c)) == null) {
            return;
        }
        listItemSwitcher.setChecked(deliveryToggle.f106167f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Iterator it = this.f106186n.entrySet().iterator();
        while (it.hasNext()) {
            ((ListItemSwitcher) ((Map.Entry) it.next()).getValue()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.blueprints.publish.delivery_toggles.c
    public final void yU(@k p<? super DeliveryToggleType, ? super Boolean, G0> pVar) {
        for (Map.Entry entry : this.f106186n.entrySet()) {
            DeliveryToggleType deliveryToggleType = (DeliveryToggleType) entry.getKey();
            ListItemSwitcher listItemSwitcher = (ListItemSwitcher) entry.getValue();
            listItemSwitcher.i();
            listItemSwitcher.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(3, pVar, deliveryToggleType));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.blueprints.publish.delivery_toggles.c
    public final void zs(@k List<DeliveryToggle> list) {
        Object next;
        for (Map.Entry entry : this.f106186n.entrySet()) {
            DeliveryToggleType deliveryToggleType = (DeliveryToggleType) entry.getKey();
            ListItemSwitcher listItemSwitcher = (ListItemSwitcher) entry.getValue();
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((DeliveryToggle) next).f106164c == deliveryToggleType) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DeliveryToggle deliveryToggle = (DeliveryToggle) next;
            D6.G(listItemSwitcher, deliveryToggle != null);
            if (deliveryToggle != null) {
                listItemSwitcher.setTitle(deliveryToggle.f106165d);
                listItemSwitcher.setLink(this.f106185m.c(listItemSwitcher.getContext(), deliveryToggle.f106166e));
                listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
                listItemSwitcher.setChecked(deliveryToggle.f106167f);
            }
        }
    }
}
