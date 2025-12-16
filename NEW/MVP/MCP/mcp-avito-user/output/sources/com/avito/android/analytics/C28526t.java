package com.avito.android.analytics;

import kotlin.Metadata;

/* compiled from: FavoriteAdvertsAnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.analytics.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28526t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28527u f91104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.a f91105c;

    public C28526t(C28527u c28527u, com.avito.android.analytics.provider.clickstream.a aVar) {
        this.f91104b = c28527u;
        this.f91105c = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            this.f91104b.f91115a.c(this.f91105c);
        }
        return io.reactivex.rxjava3.core.I.q(bool);
    }
}
