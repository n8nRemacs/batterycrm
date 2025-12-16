package com.avito.android.autoteka.deeplinks.choosingPurchase;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaChoosingPurchaseLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import u3.f;

/* compiled from: AutotekaChoosingPurchaseDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/choosingPurchase/b;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaChoosingPurchaseLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutotekaChoosingPurchaseLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f96256f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f96257g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96258h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f96259i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final f<ChoosingPurchaseTestGroup> f96260j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f96261k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AutotekaChoosingPurchaseDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: AutotekaChoosingPurchaseDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.deeplinks.choosingPurchase.b$b, reason: collision with other inner class name */
    public static final class C2847b<T> implements g {
        public C2847b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar = b.this;
            if (((C47918a) obj).f437156b == -1) {
                bVar.j(AutotekaChoosingPurchaseLink.b.C2844b.f96218b);
            } else {
                bVar.j(AutotekaChoosingPurchaseLink.b.a.f96217b);
            }
        }
    }

    @Inject
    public b(@k a.b bVar, @k Context context, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @sD.c @k f<ChoosingPurchaseTestGroup> fVar) {
        this.f96256f = bVar;
        this.f96257g = context;
        this.f96258h = interfaceC4053a;
        this.f96259i = c25719a;
        this.f96260j = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaChoosingPurchaseLink autotekaChoosingPurchaseLink = (AutotekaChoosingPurchaseLink) deepLink;
        this.f96259i.a(autotekaChoosingPurchaseLink, this, AuthSource.f92691Z, new com.avito.android.autoteka.deeplinks.choosingPurchase.a(this, autotekaChoosingPurchaseLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f96261k.b(this.f96256f.Q().N(new a()).t0(new C2847b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f96261k.e();
    }
}
