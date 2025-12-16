package com.avito.android.publish.slots.delivery_summary;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.f;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.CommissionInfoSeenEvent;
import com.avito.android.publish.slots.delivery_summary.item.y;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.CncData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.CptEstimateResultV2;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DbsData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliveryData;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.FeeBlock;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import dl0.InterfaceC39749a;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummarySlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/l;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/DeliverySummarySlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.android.category_parameters.k<DeliverySummarySlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliverySummarySlot f243661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H0 f243663d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f243664e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f243665f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f243666g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q1 f243667h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f243668i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f243669j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final c f243670k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public CptEstimateResultV2 f243671l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f243672m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f243673n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f243674o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.slots.delivery_summary_edit.item.o f243675p;

    /* compiled from: DeliverySummarySlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/CptEstimateResultV2;", "it", "Lcom/avito/android/util/P2;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f243676b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b(G0.f406611a);
        }
    }

    @i31.c
    public l(@InterfaceC41220a @Y61.k DeliverySummarySlot deliverySummarySlot, @Y61.k com.avito.android.details.a aVar, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC39749a interfaceC39749a, @Y61.k Q1 q12) {
        this.f243661b = deliverySummarySlot;
        this.f243662c = aVar;
        this.f243663d = h02;
        this.f243664e = interfaceC35745a5;
        this.f243665f = interfaceC33535v;
        this.f243666g = interfaceC39749a;
        this.f243667h = q12;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243668i = cVar;
        this.f243669j = cVar;
        this.f243670k = new c(deliverySummarySlot, categoryParametersConverter, interfaceC34155z, aVar, attributesTreeConverter);
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f243669j;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f243674o;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        com.avito.android.publish.slots.delivery_summary.item.z zVar;
        CategoryParameters categoryParametersC0;
        Object next;
        Object next2;
        if ((aVar instanceof y) && (zVar = ((y) aVar).f243651p) != null && (categoryParametersC0 = this.f243662c.C0()) != null) {
            PriceParameter priceParameter = (PriceParameter) ((CategoryParameter) categoryParametersC0.getFirstParameterOfType(PriceParameter.class));
            DeliverySummarySlot deliverySummarySlot = this.f243661b;
            Iterator<T> it = deliverySummarySlot.getParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), DeliverySummarySlotKt.ORIGINAL_PRICE)) {
                    break;
                }
            }
            CharParameter charParameter = next instanceof CharParameter ? (CharParameter) next : null;
            if (charParameter == null) {
                return f.c.f117644b;
            }
            Iterator<T> it2 = deliverySummarySlot.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), DeliverySummarySlotKt.PRICE_WITH_FEE)) {
                    break;
                }
            }
            CharParameter charParameter2 = next2 instanceof CharParameter ? (CharParameter) next2 : null;
            if (charParameter2 == null) {
                return f.c.f117644b;
            }
            if (zVar.f243658e) {
                String strValueOf = String.valueOf(zVar.f243657d);
                charParameter.set_value(priceParameter != null ? priceParameter.get_value() : null);
                if (priceParameter != null) {
                    priceParameter.set_value(strValueOf);
                }
                charParameter2.set_value(strValueOf);
            } else {
                if (priceParameter != null) {
                    priceParameter.set_value(charParameter.getValue());
                }
                charParameter2.set_value((String) null);
                charParameter.set_value((String) null);
            }
            this.f243665f.a0(zVar.f243658e);
            this.f243668i.accept(new f.b(SlotType.DELIVERY_SUMMARY, null));
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243661b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f243672m = true;
        return l().r(a.f243676b).u(new C32102w0(16)).F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0856  */
    /* JADX WARN: Type inference failed for: r19v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58, types: [T] */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [T] */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 2173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_summary.l.j():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.single.C42022u l() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_summary.l.l():io.reactivex.rxjava3.internal.operators.single.u");
    }

    public final void m() {
        Float fValueOf;
        CncData cncData;
        FeeBlock fee;
        DbsData dbsData;
        FeeBlock fee2;
        DeliveryData deliveryData;
        FeeBlock fee3;
        CptEstimateResultV2 cptEstimateResultV2 = this.f243671l;
        if (cptEstimateResultV2 == null || (deliveryData = cptEstimateResultV2.getDeliveryData()) == null || (fee3 = deliveryData.getFee()) == null) {
            CptEstimateResultV2 cptEstimateResultV22 = this.f243671l;
            if (cptEstimateResultV22 == null || (dbsData = cptEstimateResultV22.getDbsData()) == null || (fee2 = dbsData.getFee()) == null) {
                CptEstimateResultV2 cptEstimateResultV23 = this.f243671l;
                fValueOf = (cptEstimateResultV23 == null || (cncData = cptEstimateResultV23.getCncData()) == null || (fee = cncData.getFee()) == null) ? null : Float.valueOf(fee.getAmountPenny());
            } else {
                fValueOf = Float.valueOf(fee2.getAmountPenny());
            }
        } else {
            fValueOf = Float.valueOf(fee3.getAmountPenny());
        }
        if (fValueOf != null) {
            this.f243665f.G(fValueOf.floatValue(), CommissionInfoSeenEvent.Source.f232221c);
        }
    }
}
