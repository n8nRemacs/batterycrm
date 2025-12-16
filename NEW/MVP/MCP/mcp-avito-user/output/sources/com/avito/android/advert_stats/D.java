package com.avito.android.advert_stats;

import com.avito.android.advert_stats.item.K;
import com.avito.android.advert_stats.r;

/* compiled from: AdvertStatsViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes10.dex */
public final class D implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final C f86022a;

    public D(C c12) {
        this.f86022a = c12;
    }

    @Override // com.avito.android.advert_stats.r.a
    public final r a(String str) {
        C c12 = this.f86022a;
        return new r(str, c12.f86014a.get(), c12.f86015b.get(), (K) c12.f86016c.get(), c12.f86017d.get(), c12.f86018e.get(), c12.f86019f.get(), c12.f86020g.get(), c12.f86021h.get());
    }
}
