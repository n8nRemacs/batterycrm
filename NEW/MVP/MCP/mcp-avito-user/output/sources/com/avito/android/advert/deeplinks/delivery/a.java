package com.avito.android.advert.deeplinks.delivery;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.RequestDeliveryLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RequestDeliveryDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/RequestDeliveryLink;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC40161a<RequestDeliveryLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f68905f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f68906g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f68907h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.d f68908i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f68909j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.g f68910k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final o f68911l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f68912m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f68913n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f68914o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C25719a f68915p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Z3.a f68916q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C29640d f68917r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f68918s = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: RequestDeliveryDeeplinkHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/a$a;", "", "<init>", "()V", "a", "b", "c", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.deeplinks.delivery.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2160a {

        /* compiled from: RequestDeliveryDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/a$a$a;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.delivery.a$a$a, reason: collision with other inner class name */
        public static final class C2161a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C2161a f68919b = new C2161a();
        }

        /* compiled from: RequestDeliveryDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/a$a$b;", "LJu/c$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.delivery.a$a$b */
        public static final class b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f68920b = new b();
        }

        /* compiled from: RequestDeliveryDeeplinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery/a$a$c;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.delivery.a$a$c */
        public static final class c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f68921b = new c();
        }

        public /* synthetic */ AbstractC2160a(C42822w c42822w) {
            this();
        }

        public AbstractC2160a() {
        }
    }

    /* compiled from: RequestDeliveryDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.b;
            a aVar = a.this;
            if (z12) {
                DeepLink deepLink = (DeepLink) ((P2.b) p22).f318720a;
                aVar.f68910k.g(aVar.d(), false);
                aVar.i(AbstractC2160a.b.f68920b, aVar.f68907h, deepLink);
                return;
            }
            if (p22 instanceof P2.c) {
                aVar.f68910k.g(aVar.d(), true);
            } else if (p22 instanceof P2.a) {
                a.k(aVar, ((P2.a) p22).f318719a);
            }
        }
    }

    /* compiled from: RequestDeliveryDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            a.k(aVar, aVar.f68913n.a((Throwable) obj));
        }
    }

    @Inject
    public a(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k a.i iVar, @Y61.k a.g gVar, @Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k C25719a c25719a, @Y61.k Z3.a aVar2, @Y61.k C29640d c29640d) {
        this.f68905f = interfaceC28373a;
        this.f68906g = e12;
        this.f68907h = aVar;
        this.f68908i = dVar;
        this.f68909j = iVar;
        this.f68910k = gVar;
        this.f68911l = oVar;
        this.f68912m = interfaceC35745a5;
        this.f68913n = fVar;
        this.f68914o = interfaceC35741a1;
        this.f68915p = c25719a;
        this.f68916q = aVar2;
        this.f68917r = c29640d;
    }

    public static final void k(a aVar, ApiError apiError) {
        aVar.f68910k.g(aVar.d(), false);
        a.i.C4057a.d(aVar.f68909j, InterfaceC35741a1.a.a(aVar.f68914o, new ApiException(apiError, null, 2, null), null, null, 6), null, null, new f.c(apiError), 0, null, null, null, 2030);
        aVar.j(AbstractC2160a.c.f68921b);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RequestDeliveryLink requestDeliveryLink = (RequestDeliveryLink) deepLink;
        this.f68915p.b(requestDeliveryLink, this, null, new com.avito.android.advert.deeplinks.delivery.b(this, requestDeliveryLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f68918s.e();
    }

    public final void l(RequestDeliveryLink requestDeliveryLink) {
        C29640d c29640d = this.f68917r;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[37];
        boolean zBooleanValue = ((Boolean) c29640d.f132186K.a().invoke()).booleanValue();
        o oVar = this.f68911l;
        z<P2<DeepLink>> zVarB = zBooleanValue ? oVar.b(requestDeliveryLink.f133634b, requestDeliveryLink.f133635c) : oVar.a(requestDeliveryLink.f133634b, requestDeliveryLink.f133635c);
        InterfaceC35745a5 interfaceC35745a5 = this.f68912m;
        this.f68918s.b(zVarB.x0(interfaceC35745a5.a()).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
