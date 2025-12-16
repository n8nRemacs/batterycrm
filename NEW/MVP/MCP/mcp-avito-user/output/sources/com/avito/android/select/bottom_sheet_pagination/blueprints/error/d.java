package com.avito.android.select.bottom_sheet_pagination.blueprints.error;

import Y61.k;
import Yp0.AbstractC18314a;
import androidx.compose.runtime.internal.P;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaginationFavoriteErrorItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet_pagination/blueprints/error/d;", "Lcom/avito/android/select/bottom_sheet_pagination/blueprints/error/c;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<PaginationState> f265337b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f265338c = new a();

    /* compiled from: PaginationFavoriteErrorItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f265337b.accept(PaginationState.f265330c);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k l41.g<PaginationState> gVar) {
        this.f265337b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.lM(((AbstractC18314a.C1404a) aVar).f19692b);
        fVar.u1(this.f265338c);
    }
}
