package com.avito.android.services_transportation_widget.item;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/ServiceTransportationWidgetItem;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/services_transportation_widget/item/ServiceTransportationWidgetItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<ServiceTransportationWidgetItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f280625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f280626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceTransportationWidgetItem f280627n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i12, ServiceTransportationWidgetItem serviceTransportationWidgetItem) {
        super(1);
        this.f280625l = hVar;
        this.f280626m = i12;
        this.f280627n = serviceTransportationWidgetItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem r13) {
        /*
            r12 = this;
            com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem r13 = (com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem) r13
            com.avito.android.services_transportation_widget.item.h r0 = r12.f280625l
            if (r13 == 0) goto L9
            com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget$AnalyticParams r1 = r13.f280536j
            goto La
        L9:
            r1 = 0
        La:
            if (r13 == 0) goto L10
            java.util.List<com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem> r2 = r13.f280533g
            if (r2 != 0) goto L12
        L10:
            kotlin.collections.z0 r2 = kotlin.collections.C42784z0.f406748b
        L12:
            yv0.a r3 = r0.f280630d
            r3.b(r1, r2)
            int r1 = r12.f280626m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem r1 = r12.f280627n
            com.avito.android.remote.model.widget_analytics.Analytics r10 = r1.f280540n
            r7 = 0
            r11 = 124(0x7c, float:1.74E-43)
            com.avito.android.serp.analytics.widgets_tracker.g r2 = r0.f280633g
            java.lang.String r4 = "transportationFormWidget"
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            js0.d.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L6d
            Dv0.a r1 = r0.f280634h
            r1.getClass()
            r1 = 0
            java.util.List<com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem> r2 = r13.f280533g
            if (r2 == 0) goto L63
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L4b
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4b
            goto L63
        L4b:
            java.util.Iterator r2 = r2.iterator()
        L4f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r2.next()
            com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem r3 = (com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem) r3
            boolean r3 = r3.hasError()
            if (r3 == 0) goto L4f
            r2 = 1
            goto L64
        L63:
            r2 = r1
        L64:
            r0.f280637k = r13
            com.avito.android.services_transportation_widget.item.j r0 = r0.f280638l
            if (r0 == 0) goto L6d
            r0.ip(r13, r1, r2)
        L6d:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_transportation_widget.item.g.invoke(java.lang.Object):java.lang.Object");
    }
}
