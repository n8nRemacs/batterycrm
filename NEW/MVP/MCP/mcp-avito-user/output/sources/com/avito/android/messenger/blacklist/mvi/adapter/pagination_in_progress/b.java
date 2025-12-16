package com.avito.android.messenger.blacklist.mvi.adapter.pagination_in_progress;

import EY.a;
import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PaginationInProgress.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/adapter/pagination_in_progress/b;", "LTV0/b;", "Lcom/avito/android/messenger/blacklist/mvi/adapter/pagination_in_progress/e;", "LEY/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements TV0.b<e, a.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f186411a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f186412b = new g.a<>(R.layout.pending_view, a.f186410l);

    public b(@k d dVar) {
        this.f186411a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f186411a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f186412b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof a.b;
    }
}
