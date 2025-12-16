package com.avito.android.hotel_booking.konveyor.radiogroup;

import RI.b;
import com.avito.android.hotel_booking.konveyor.radiogroup.d;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormRadioOptionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/radiogroup/h;", "LTV0/f;", "Lcom/avito/android/hotel_booking/konveyor/radiogroup/j;", "Lcom/avito/android/hotel_booking/konveyor/radiogroup/c;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements TV0.f<j, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<RI.b, G0> f163742b;

    /* compiled from: BookingFormRadioOptionPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f163744m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(0);
            this.f163744m = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.l<RI.b, G0> lVar = h.this.f163742b;
            c cVar = this.f163744m;
            lVar.invoke(new b.m(cVar.f163728b, cVar.f163729c));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super RI.b, G0> lVar) {
        this.f163742b = lVar;
    }

    public final void O(AttributedText attributedText, final c cVar) {
        List<Attribute> attributes = attributedText.getAttributes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attributes) {
            if (!(((Attribute) obj) instanceof DeepLinkAttribute)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            attributedText.setOnClickListener(((Attribute) it.next()).getName(), new OnClickListener() { // from class: com.avito.android.hotel_booking.konveyor.radiogroup.g
                @Override // com.avito.android.remote.model.text.OnClickListener
                public final void onClick() {
                    c cVar2 = cVar;
                    this.f163740a.f163742b.invoke(new b.m(cVar2.f163728b, cVar2.f163729c));
                }
            });
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        k(jVar, cVar);
        jVar.Un(cVar.f163730d, cVar.f163732f);
        jVar.q(cVar.f163731e);
        jVar.DL(cVar.f163733g);
        jVar.setSelected(cVar.f163734h);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<d> list2 = (List) (obj instanceof List ? obj : null);
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            k(jVar, cVar);
            jVar.Un(cVar.f163730d, cVar.f163732f);
            jVar.q(cVar.f163731e);
            jVar.DL(cVar.f163733g);
            jVar.setSelected(cVar.f163734h);
            return;
        }
        k(jVar, cVar);
        for (d dVar : list2) {
            if (dVar instanceof d.C4797d) {
                d.C4797d c4797d = (d.C4797d) dVar;
                jVar.Un(c4797d.f163738a, c4797d.f163739b);
            } else if (dVar instanceof d.a) {
                jVar.q(((d.a) dVar).f163735a);
            } else if (dVar instanceof d.b) {
                jVar.DL(((d.b) dVar).f163736a);
            } else if (dVar instanceof d.c) {
                jVar.setSelected(((d.c) dVar).f163737a);
            }
        }
    }

    public final void k(j jVar, c cVar) {
        com.avito.android.cpt.pre_activation.ui.c cVar2 = new com.avito.android.cpt.pre_activation.ui.c(this, 14);
        AttributedText attributedText = cVar.f163730d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(cVar2);
        }
        AttributedText attributedText2 = cVar.f163731e;
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(cVar2);
        }
        AttributedText attributedText3 = cVar.f163730d;
        if (attributedText3 != null) {
            O(attributedText3, cVar);
        }
        if (attributedText2 != null) {
            O(attributedText2, cVar);
        }
        jVar.aI(new a(cVar));
    }
}
