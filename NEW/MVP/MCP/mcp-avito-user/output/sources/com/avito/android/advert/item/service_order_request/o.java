package com.avito.android.advert.item.service_order_request;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.service_order_request.q;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.CreateChannelWithAvitoLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.service_order.ServiceOrder;
import com.avito.android.remote.model.service_order.ServiceOrderAction;
import com.avito.android.service_order_widget.link.o;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kv.C43501a;
import l41.r;

/* compiled from: ServiceOrderRequestPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/o;", "Lcom/avito/android/advert/item/service_order_request/n;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements n {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f79920l = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f79921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f79922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f79923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f79924d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f79925e = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<q> f79926f = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f79927g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f79928h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79929i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public W0 f79930j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f79931k;

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/service_order_request/o$a;", "", "<init>", "()V", "", "SERVICE_ORDER_FEEDBACK_DELAY", "J", "", "SERVICE_ORDER_REQUEST_BUTTONS_SOURCE", "Ljava/lang/String;", "SERVICE_ORDER_REQUEST_REQ", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f79932b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof com.avito.android.service_order_widget.link.o;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            q.a aVar = q.a.f79945a;
            int i12 = o.f79920l;
            o.this.d(aVar);
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C43501a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            q cVar;
            Object obj = c43501a.f413261b;
            Object obj2 = obj instanceof com.avito.android.service_order_widget.link.o ? (com.avito.android.service_order_widget.link.o) obj : null;
            if (obj2 != null) {
                int i12 = o.f79920l;
                o oVar = o.this;
                oVar.getClass();
                if (obj2 instanceof o.a) {
                    cVar = q.a.f79945a;
                } else {
                    if (!(obj2 instanceof o.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new q.c(((o.b) obj2).getF279047c());
                }
                oVar.d(cVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f79935b = new e<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "service_order_request_req");
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements r {
        public f() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            if (!(interfaceC14249c instanceof CreateChannelWithAvitoLink.c.e) && !(interfaceC14249c instanceof AbstractC14250d) && !(interfaceC14249c instanceof BeduinUniversalPageLink.b) && !(interfaceC14249c instanceof com.avito.android.beduin.v2.page.m)) {
                return false;
            }
            o.this.f79929i = true;
            return true;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f79937l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C43501a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            Bundle bundle;
            String string;
            o oVar = o.this;
            oVar.f79929i = false;
            G0 g02 = G0.f406611a;
            oVar.f79927g.accept(g02);
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            if ((interfaceC14249c instanceof m.c) && (bundle = ((m.c) interfaceC14249c).f105170b) != null && (string = bundle.getString("uxFeedbackCampaign")) != null) {
                oVar.f79925e.b(AbstractC41768a.y(1000L, TimeUnit.MILLISECONDS, oVar.f79921a.e()).v(new GL.a(2, oVar, new UxFeedbackStartCampaignLink(string, true, P0.c(), null)), io.reactivex.rxjava3.internal.functions.a.f401996f));
            }
            return g02;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final i<T> f79939b = new i<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((ContactBar.Button.Target) obj).f125081i == ContactBar.Button.Target.Type.f125087d;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j extends H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceOrderRequestPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<ContactBar.Button.Target, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContactBar.Button.Target target) {
            ServiceOrder serviceOrderButton;
            ServiceOrderAction primaryAction;
            ContactBar.Button.Target target2 = target;
            o oVar = o.this;
            AdvertDetails advertDetails = oVar.f79931k;
            if (!((advertDetails == null || (serviceOrderButton = advertDetails.getServiceOrderButton()) == null || (primaryAction = serviceOrderButton.getPrimaryAction()) == null) ? false : L.f(primaryAction.getIsLoading(), Boolean.TRUE))) {
                oVar.a(target2.f125076d, target2.f125074b);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28280j interfaceC28280j, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k InterfaceC28265d interfaceC28265d) {
        this.f79921a = interfaceC35745a5;
        this.f79922b = interfaceC28280j;
        this.f79923c = aVar;
        this.f79924d = interfaceC28265d;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f79927g = cVar;
        this.f79928h = new C41981q0(cVar);
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final C41981q0 getF79928h() {
        return this.f79928h;
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void N(@Y61.l W0 w02) {
        this.f79930j = w02;
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void a(@Y61.k DeepLink deepLink, @Y61.k String str) {
        if (deepLink instanceof com.avito.android.service_order_widget.link.a) {
            d(q.b.f79946a);
        }
        AdvertDetails advertDetails = this.f79931k;
        this.f79923c.y0(advertDetails != null ? advertDetails.getId() : null, str);
        W0 w02 = this.f79930j;
        if (w02 != null) {
            w02.s(deepLink);
        }
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void b(@Y61.k DeepLink deepLink) {
        W0 w02 = this.f79930j;
        if (w02 != null) {
            w02.s(deepLink);
        }
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    @Y61.k
    public final C41981q0 c() {
        com.jakewharton.rxrelay3.c<q> cVar = this.f79926f;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    public final void d(q qVar) {
        ServiceOrder serviceOrderButton;
        ServiceOrderAction primaryAction;
        AdvertDetails advertDetails = this.f79931k;
        if (advertDetails != null && (serviceOrderButton = advertDetails.getServiceOrderButton()) != null && (primaryAction = serviceOrderButton.getPrimaryAction()) != null) {
            primaryAction.setLoading(Boolean.valueOf(L.f(qVar, q.b.f79946a)));
            if (qVar instanceof q.c) {
                q.c cVar = (q.c) qVar;
                primaryAction.setTitle(cVar.f79947a.f278838a);
                primaryAction.setUri(cVar.f79947a.f278840c);
            }
        }
        this.f79926f.accept(qVar);
        this.f79922b.K();
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void e0() {
        this.f79925e.e();
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void i() {
        this.f79925e.b(A1.h(this.f79924d.getF83157A().N(i.f79939b), new j(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new k(), 2));
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void p(@Y61.l AdvertDetails advertDetails) {
        this.f79931k = advertDetails;
    }

    @Override // com.avito.android.advert.item.service_order_request.n
    public final void w(@Y61.k z<C43501a> zVar) {
        if (this.f79929i) {
            this.f79929i = false;
            this.f79927g.accept(G0.f406611a);
        }
        W wN2 = zVar.N(b.f79932b);
        InterfaceC35745a5 interfaceC35745a5 = this.f79921a;
        y yVarH = A1.h(wN2.j0(interfaceC35745a5.e()), new c(), new d(), 2);
        io.reactivex.rxjava3.disposables.c cVar = this.f79925e;
        cVar.b(yVarH);
        cVar.b(A1.h(zVar.N(e.f79935b).N(new f()).j0(interfaceC35745a5.e()), g.f79937l, new h(), 2));
    }
}
