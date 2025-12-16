package com.avito.android.short_term_rent.bookingform.items.refund_toggle;

import com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem;
import com.avito.android.short_term_rent.bookingform.items.refund_toggle.c;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: RefundTogglePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/h;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/j;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.f<j, RefundToggleItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> f281610b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super com.avito.android.short_term_rent.bookingform.mvi.entity.a, G0> lVar) {
        this.f281610b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        RefundToggleItem refundToggleItem = (RefundToggleItem) aVar;
        RefundToggleItem.RefundToggleButton refundToggleButton = refundToggleItem.f281581d;
        RefundToggleItem.RefundToggleButton refundToggleButton2 = refundToggleItem.f281582e;
        jVar.rn(refundToggleButton, refundToggleButton2);
        f fVar = new f(this, refundToggleItem);
        RefundToggleItem.RefundToggleButton refundToggleButton3 = refundToggleItem.f281581d;
        jVar.gg(fVar, refundToggleButton3, refundToggleButton2);
        jVar.xr(new g(this), refundToggleButton3, refundToggleButton2);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        RefundToggleItem refundToggleItem = (RefundToggleItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<c> list2 = (List) obj;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            RefundToggleItem.RefundToggleButton refundToggleButton = refundToggleItem.f281581d;
            RefundToggleItem.RefundToggleButton refundToggleButton2 = refundToggleItem.f281582e;
            jVar.rn(refundToggleButton, refundToggleButton2);
            f fVar = new f(this, refundToggleItem);
            RefundToggleItem.RefundToggleButton refundToggleButton3 = refundToggleItem.f281581d;
            jVar.gg(fVar, refundToggleButton3, refundToggleButton2);
            jVar.xr(new g(this), refundToggleButton3, refundToggleButton2);
            return;
        }
        for (c cVar : list2) {
            if (cVar instanceof c.a) {
                ((c.a) cVar).getClass();
                jVar.rn(null, refundToggleItem.f281582e);
            } else if (cVar instanceof c.b) {
                ((c.b) cVar).getClass();
                jVar.rn(refundToggleItem.f281581d, null);
            }
        }
        f fVar2 = new f(this, refundToggleItem);
        RefundToggleItem.RefundToggleButton refundToggleButton4 = refundToggleItem.f281581d;
        RefundToggleItem.RefundToggleButton refundToggleButton5 = refundToggleItem.f281582e;
        jVar.gg(fVar2, refundToggleButton4, refundToggleButton5);
        jVar.xr(new g(this), refundToggleItem.f281581d, refundToggleButton5);
    }
}
