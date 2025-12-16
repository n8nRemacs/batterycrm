package com.avito.android.select.bottom_sheet_pagination.blueprints.loading;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PaginationLoadingItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/loading/d;", "Lcom/avito/android/select/bottom_sheet_pagination/blueprints/loading/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<PaginationState> f265347b;

    @Inject
    public d(@k l41.g<PaginationState> gVar) {
        this.f265347b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f265347b.accept(PaginationState.f265329b);
    }
}
