package com.avito.android.analytics;

import com.avito.android.analytics.event.C28413f;
import com.avito.android.analytics.event.C28437r0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsAnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/u;", "Lcom/avito/android/analytics/s;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28527u implements InterfaceC28467s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91115a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f91116b;

    @Inject
    public C28527u(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f91115a = interfaceC28373a;
        this.f91116b = e12;
    }

    @Override // com.avito.android.analytics.InterfaceC28467s
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.v a(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f91116b.o().s(io.reactivex.rxjava3.schedulers.b.f404943c).n(new C28526t(this, new C28437r0(str))));
    }

    @Override // com.avito.android.analytics.InterfaceC28467s
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.v b(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f91116b.o().s(io.reactivex.rxjava3.schedulers.b.f404943c).n(new C28526t(this, new C28413f(str, str2, str3))));
    }
}
