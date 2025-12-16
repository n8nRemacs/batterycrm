package com.avito.android.paid_services_impl;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.util.C35967w2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import rv.C47918a;

/* compiled from: PaidServicesDeeplinkHandlerDelegateImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/paid_services_impl/d;", "Lcom/avito/android/paid_services/a;", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.paid_services.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f210636a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.b f210637b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v50.c f210638c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f210639d = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PaidServicesDeeplinkHandlerDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f210640b;

        public a(int i12) {
            this.f210640b = i12;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == this.f210640b;
        }
    }

    /* compiled from: PaidServicesDeeplinkHandlerDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f210641b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super PaidServicesLink.a, G0> lVar) {
            this.f210641b = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f210641b.invoke(((C47918a) obj).f437156b == -1 ? PaidServicesLink.a.b.f210607b : PaidServicesLink.a.C6287a.f210606b);
        }
    }

    @Inject
    public d(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k v50.c cVar) {
        this.f210636a = interfaceC4053a;
        this.f210637b = bVar;
        this.f210638c = cVar;
    }

    @Override // com.avito.android.paid_services.a
    public final void a(@Y61.k PaidServicesLink paidServicesLink, int i12, @Y61.l Bundle bundle, @Y61.l Intent intent) {
        Intent intent2;
        if (intent == null) {
            if (bundle != null) {
                intent2 = (Intent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
            } else {
                intent2 = null;
            }
            Intent intentAddFlags = this.f210638c.a(paidServicesLink).addFlags(603979776);
            if (intent2 != null) {
                intentAddFlags.putExtra("up_intent", intent2);
            }
            C35967w2.c(intentAddFlags, bundle != null ? com.avito.android.util.H.b(bundle) : null);
            intent = intentAddFlags;
        }
        boolean z12 = bundle != null ? bundle.getBoolean("paid_services_key_should_start_for_result", true) : true;
        a.InterfaceC4053a interfaceC4053a = this.f210636a;
        if (z12) {
            interfaceC4053a.J(intent, i12, com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intent, com.avito.android.deeplink_handler.view.b.f134588l);
        }
    }

    @Override // com.avito.android.paid_services.a
    public final void b(int i12, @Y61.k Y41.l<? super PaidServicesLink.a, G0> lVar) {
        this.f210639d.b(this.f210637b.Q().N(new a(i12)).t0(new b(lVar)));
    }

    @Override // com.avito.android.paid_services.a
    public final void e() {
        this.f210639d.e();
    }
}
