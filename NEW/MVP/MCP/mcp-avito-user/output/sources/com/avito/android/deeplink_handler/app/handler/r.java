package com.avito.android.deeplink_handler.app.handler;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.ConditionChainLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kv.C43501a;

/* compiled from: ConditionChainLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ConditionChainLink;", "a", "b", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r extends AbstractC40161a<ConditionChainLink> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f134450h = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134451f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f134452g = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ConditionChainLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r$a;", "", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConditionChainLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r$b;", "", "<init>", "()V", "a", "b", "c", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ConditionChainLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r$b$a;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f134453b = new a();
        }

        /* compiled from: ConditionChainLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r$b$b;", "LJu/c$b;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink_handler.app.handler.r$b$b, reason: collision with other inner class name */
        public static final class C4042b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4042b f134454b = new C4042b();
        }

        /* compiled from: ConditionChainLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/r$b$c;", "LJu/c$a;", "<init>", "()V", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f134455b = new c();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ConditionChainLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.r {
        public c() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = ((C43501a) obj).f413260a;
            a aVar2 = r.f134450h;
            String strE = r.this.e();
            aVar2.getClass();
            return kotlin.jvm.internal.L.f(aVar.f134521b, strE + "_condition");
        }
    }

    /* compiled from: ConditionChainLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof InterfaceC14247a.b;
            r rVar = r.this;
            com.avito.android.deeplink_handler.handler.composite.a aVar = rVar.f134451f;
            if (z12) {
                a aVar2 = r.f134450h;
                ConditionChainLink conditionChainLinkC = rVar.c();
                if (conditionChainLinkC == null) {
                    return;
                }
                rVar.i(b.c.f134455b, aVar, conditionChainLinkC.f133113c);
                return;
            }
            if (!(interfaceC14249c instanceof InterfaceC14247a.InterfaceC0545a)) {
                a aVar3 = r.f134450h;
                ConditionChainLink conditionChainLinkC2 = rVar.c();
                if (conditionChainLinkC2 == null) {
                    return;
                }
                rVar.i(b.c.f134455b, aVar, conditionChainLinkC2.f133113c);
                return;
            }
            a aVar4 = r.f134450h;
            ConditionChainLink conditionChainLinkC3 = rVar.c();
            if (conditionChainLinkC3 == null) {
                return;
            }
            DeepLink deepLink = conditionChainLinkC3.f133114d;
            if (deepLink == null) {
                rVar.j(b.C4042b.f134454b);
            } else {
                rVar.i(b.a.f134453b, aVar, deepLink);
            }
        }
    }

    @Inject
    public r(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f134451f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        f134450h.getClass();
        this.f134451f.r6(bundle, ((ConditionChainLink) deepLink).f133112b, str + "_condition");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f134452g.b(this.f134451f.d9().N(new c()).t0(new d()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f134452g.e();
    }
}
