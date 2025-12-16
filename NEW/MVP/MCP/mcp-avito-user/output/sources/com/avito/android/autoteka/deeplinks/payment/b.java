package com.avito.android.autoteka.deeplinks.payment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaPaymentLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AutotekaPaymentDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/payment/b;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutotekaPaymentLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f96279f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96280g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f96281h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f96282i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f96283j;

    /* compiled from: AutotekaPaymentDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: AutotekaPaymentDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.deeplinks.payment.b$b, reason: collision with other inner class name */
    public static final class C2848b<T> implements g {
        public C2848b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b bVar = b.this;
            if (((C47918a) obj).f437156b == -1) {
                bVar.j(AutotekaPaymentLink.b.C2845b.f96223b);
            } else {
                bVar.j(AutotekaPaymentLink.b.a.f96222b);
            }
        }
    }

    @Inject
    public b(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f96279f = context;
        this.f96280g = interfaceC4053a;
        this.f96281h = bVar;
        this.f96282i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaPaymentLink autotekaPaymentLink = (AutotekaPaymentLink) deepLink;
        this.f96282i.a(autotekaPaymentLink, this, AuthSource.f92691Z, new com.avito.android.autoteka.deeplinks.payment.a(autotekaPaymentLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f96283j = (y) this.f96281h.Q().N(new a()).t0(new C2848b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f96283j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
