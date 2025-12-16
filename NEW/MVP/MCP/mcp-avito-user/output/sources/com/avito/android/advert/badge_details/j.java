package com.avito.android.advert.badge_details;

import kotlin.Metadata;

/* compiled from: BadgeDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f68781b;

    public j(k kVar) {
        this.f68781b = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        k kVar = this.f68781b;
        BadgeDetailsActivity badgeDetailsActivity = kVar.f68793l;
        if (badgeDetailsActivity != null) {
            badgeDetailsActivity.a2(kVar.f68787f.getF68809a());
        }
    }
}
