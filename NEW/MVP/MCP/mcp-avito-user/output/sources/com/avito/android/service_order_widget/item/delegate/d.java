package com.avito.android.service_order_widget.item.delegate;

import Cu0.InterfaceC13358f;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.serp.r;
import com.avito.android.service_order_widget.item.delegate.a;
import com.avito.android.service_order_widget.item.delegate.b;
import com.avito.android.service_order_widget.item.delegate.c;
import javax.inject.Inject;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rn0.InterfaceC47691c;

/* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/d;", "Lcom/avito/android/service_order_widget/item/delegate/b;", "IV", "Lcom/avito/android/service_order_widget/item/delegate/a;", "I", "Lcom/avito/android/service_order_widget/item/delegate/c;", "Lcom/avito/android/service_order_widget/item/delegate/c$a;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d<IV extends b<I>, I extends com.avito.android.service_order_widget.item.delegate.a> implements c<IV, I>, c.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47691c> f278863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final wu0.d f278864c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC13358f f278865d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final r f278866e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g f278867f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Integer f278868g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ServiceOrderWidget.AnalyticsParams f278869h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Object f278870i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f278871j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Analytics f278872k;

    /* compiled from: ServiceOrderWidgetPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/d$a;", "", "<init>", "()V", "", "SERVICE_ORDER_REQUEST_FEEDBACK_CAMPAIGN_KEY", "Ljava/lang/String;", "SERVICE_ORDER_WIDGET_REQ", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k h31.e<InterfaceC47691c> eVar, @k wu0.d dVar, @k InterfaceC13358f interfaceC13358f, @k r rVar, @k g gVar) {
        this.f278863b = eVar;
        this.f278864c = dVar;
        this.f278865d = interfaceC13358f;
        this.f278866e = rVar;
        this.f278867f = gVar;
        this.f278871j = !interfaceC13358f.b();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [com.avito.android.service_order_widget.item.delegate.c$b, java.lang.Object] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLinkM0;
        com.avito.android.service_order_widget.item.delegate.a aVar2 = (com.avito.android.service_order_widget.item.delegate.a) aVar;
        this.f278868g = Integer.valueOf(i12);
        this.f278869h = aVar2.getF278895j();
        this.f278872k = aVar2.getF278896k();
        ((b) eVar).Pn(aVar2, this);
        boolean z12 = this.f278871j;
        h31.e<InterfaceC47691c> eVar2 = this.f278863b;
        if (z12 && aVar2.getF278894i() != null) {
            DeepLink f278894i = aVar2.getF278894i();
            if (f278894i != null) {
                InterfaceC47691c.a.a(eVar2.get(), f278894i, null, 4);
                this.f278865d.a();
                this.f278871j = false;
            }
        } else if (aVar2.M0() != null && (deepLinkM0 = aVar2.M0()) != null) {
            InterfaceC47691c.a.a(eVar2.get(), deepLinkM0, null, 14);
        }
        ?? r32 = this.f278870i;
        if (r32 != 0) {
            r32.k(aVar2, new e(this));
        }
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c
    public final void b4(@l c.b<I> bVar) {
        this.f278870i = bVar;
    }

    @Override // com.avito.android.service_order_widget.item.delegate.c.a
    public final void k(@k DeepLink deepLink, @k String str) {
        InterfaceC47691c.a.a(this.f278863b.get(), deepLink, null, 4);
        ServiceOrderWidget.AnalyticsParams analyticsParams = this.f278869h;
        Integer num = this.f278868g;
        this.f278866e.getClass();
        this.f278864c.a(analyticsParams, str, num, null);
        d.a.a(this.f278867f, this.f278868g, "serviceOrderWidget", null, null, null, null, null, this.f278872k, 124);
    }
}
