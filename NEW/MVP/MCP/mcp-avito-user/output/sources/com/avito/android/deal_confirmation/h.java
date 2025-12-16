package com.avito.android.deal_confirmation;

import com.avito.android.account.E;
import com.avito.android.analytics.clickstream.I;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.operators.single.U;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import xu.InterfaceC49998a;

/* compiled from: DealConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deal_confirmation/h;", "Lcom/avito/android/deal_confirmation/d;", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f132762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f132763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f132764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f132765d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public k f132766e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public m f132767f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f132768g;

    @Inject
    public h(@Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k E e12, @InterfaceC49998a @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @com.avito.android.deal_confirmation.di.b @Y61.l Kundle kundle) {
        this.f132762a = aVar;
        this.f132763b = interfaceC35745a5;
        this.f132764c = e12;
        this.f132765d = screenPerformanceTracker;
        this.f132768g = kundle != null ? kundle.g("confirmation_response") : null;
    }

    @Override // com.avito.android.deal_confirmation.d
    public final void a(@Y61.k String str, @Y61.k String str2) {
        m mVar = this.f132767f;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f132767f = A1.g(c(str, str2), null, null, 3);
    }

    @Override // com.avito.android.deal_confirmation.d
    public final void b(@Y61.k k kVar) {
        this.f132766e = kVar;
    }

    @Override // com.avito.android.deal_confirmation.d
    @Y61.k
    public final U c(@Y61.k String str, @Y61.k String str2) {
        return this.f132764c.o().n(new f(this, str, str2)).i(new g(this)).u(new I(5));
    }

    @Override // com.avito.android.deal_confirmation.d
    public final void c0() {
        this.f132766e = null;
        m mVar = this.f132767f;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.deal_confirmation.d
    public final void d(@Y61.k String str) {
        k kVar = this.f132766e;
        if (kVar != null) {
            kVar.j(str);
        } else {
            this.f132768g = str;
        }
    }

    @Override // com.avito.android.deal_confirmation.d
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("confirmation_response", this.f132768g);
        return kundle;
    }

    @Override // com.avito.android.deal_confirmation.d
    public final void onResume() {
        String str = this.f132768g;
        if (str != null) {
            d(str);
            this.f132768g = null;
        }
    }
}
