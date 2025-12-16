package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group;

import JO.m;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import j.D;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/radio_group/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/radio_group/g;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f256225c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RadioGroup f256226b;

    public i(@k RadioGroup radioGroup) {
        super(radioGroup);
        this.f256226b = radioGroup;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.g
    public final void JL(@D int i12) {
        this.f256226b.a(i12);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.g
    public final void Sb(@k final List<m> list, @l m mVar, @k final p<? super m, ? super Boolean, G0> pVar) {
        RadioGroup radioGroup = this.f256226b;
        radioGroup.b();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            m mVar2 = (m) obj;
            ListItemRadio listItemRadio = new ListItemRadio(radioGroup.getContext(), null);
            listItemRadio.setTag(mVar2.f8961b);
            listItemRadio.setId(i12);
            listItemRadio.setTitle(mVar2.f8962c);
            listItemRadio.setClickable(true);
            radioGroup.addView(listItemRadio);
            if (L.f(mVar2.f8961b, mVar != null ? mVar.f8961b : null)) {
                radioGroup.a(listItemRadio.getId());
            }
            i12 = i13;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.e() { // from class: com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group.h
            @Override // com.avito.android.lib.design.radio.RadioGroup.e
            public final void a(ListItemRadio listItemRadio2) {
                Object next;
                int i14 = i.f256225c;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (L.f(((m) next).f8961b, listItemRadio2.getTag())) {
                            break;
                        }
                    }
                }
                m mVar3 = (m) next;
                if (mVar3 == null) {
                    return;
                }
                ((d) pVar).invoke(mVar3, Boolean.TRUE);
            }
        });
    }
}
