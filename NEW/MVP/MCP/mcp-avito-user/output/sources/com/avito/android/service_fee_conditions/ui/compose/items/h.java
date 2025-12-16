package com.avito.android.service_fee_conditions.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qu0.c;

/* compiled from: ServiceFeeConditionsFooter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-fee-conditions_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* compiled from: ServiceFeeConditionsFooter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.e f278530l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f278531m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f278532n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c.e eVar, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar) {
            super(0);
            this.f278530l = eVar;
            this.f278531m = aVar;
            this.f278532n = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            G0 g02;
            DeepLink deepLink;
            c.e eVar = this.f278530l;
            if (eVar == null || (deepLink = eVar.f429498b) == null) {
                g02 = null;
            } else {
                this.f278532n.invoke(deepLink);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                this.f278531m.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceFeeConditionsFooter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.C12344c f278533l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f278534m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f278535n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c.C12344c c12344c, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar) {
            super(0);
            this.f278533l = c12344c;
            this.f278534m = aVar;
            this.f278535n = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            G0 g02;
            DeepLink deepLink;
            c.C12344c c12344c = this.f278533l;
            if (c12344c == null || (deepLink = c12344c.f429496b) == null) {
                g02 = null;
            } else {
                this.f278535n.invoke(deepLink);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                this.f278534m.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceFeeConditionsFooter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c.C12344c f278536l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c.e f278537m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f278538n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f278539o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c.C12344c c12344c, c.e eVar, Y41.l<? super DeepLink, G0> lVar, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f278536l = c12344c;
            this.f278537m = eVar;
            this.f278538n = lVar;
            this.f278539o = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            h.a(this.f278536l, this.f278537m, this.f278538n, this.f278539o, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l qu0.c.C12344c r18, @Y61.l qu0.c.e r19, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r20, @Y61.k Y41.a<kotlin.G0> r21, @Y61.l androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_fee_conditions.ui.compose.items.h.a(qu0.c$c, qu0.c$e, Y41.l, Y41.a, androidx.compose.runtime.A, int):void");
    }
}
