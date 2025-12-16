package com.avito.android.safedeal.universal_delivery_type.courier;

import Qn0.InterfaceC14913a;
import Qn0.c;
import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.safedeal.universal_delivery_type.courier.BeduinUniversalDeliveryTypeCourierFragment;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class d extends H implements l<Qn0.c, G0> {
    @Override // Y41.l
    public final G0 invoke(Qn0.c cVar) {
        Qn0.c cVar2 = cVar;
        final BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment = (BeduinUniversalDeliveryTypeCourierFragment) this.receiver;
        BeduinUniversalDeliveryTypeCourierFragment.a aVar = BeduinUniversalDeliveryTypeCourierFragment.f256442D0;
        beduinUniversalDeliveryTypeCourierFragment.getClass();
        if (cVar2 instanceof c.b) {
            beduinUniversalDeliveryTypeCourierFragment.r5(false);
        } else if (cVar2 instanceof c.a) {
            c.a aVar2 = (c.a) cVar2;
            beduinUniversalDeliveryTypeCourierFragment.f256445B0 = aVar2.f14000b;
            beduinUniversalDeliveryTypeCourierFragment.f256446C0 = aVar2.f14002d;
            AbstractC25658a<? extends RecyclerView.C> abstractC25658a = beduinUniversalDeliveryTypeCourierFragment.f256457x0;
            if (abstractC25658a == null) {
                abstractC25658a = null;
            }
            abstractC25658a.m(aVar2.f14001c);
            AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = beduinUniversalDeliveryTypeCourierFragment.f256458y0;
            (abstractC25658a2 != null ? abstractC25658a2 : null).l(aVar2.f14003e, new Runnable() { // from class: com.avito.android.safedeal.universal_delivery_type.courier.a
                @Override // java.lang.Runnable
                public final void run() {
                    BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment2 = beduinUniversalDeliveryTypeCourierFragment;
                    RecyclerView recyclerView = beduinUniversalDeliveryTypeCourierFragment2.f256456w0;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    D6.l(true, recyclerView, new b(beduinUniversalDeliveryTypeCourierFragment2));
                }
            });
            beduinUniversalDeliveryTypeCourierFragment.q5().accept(InterfaceC14913a.C0926a.f13997a);
            beduinUniversalDeliveryTypeCourierFragment.q5().accept(InterfaceC14913a.b.f13998a);
            if (aVar2.f14004f) {
                beduinUniversalDeliveryTypeCourierFragment.r5(false);
            } else {
                beduinUniversalDeliveryTypeCourierFragment.r5(true);
            }
        }
        return G0.f406611a;
    }
}
