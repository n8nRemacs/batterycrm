package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingFeatureBuilder_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/k;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/j;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f115405f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f115406a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f115407b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f115408c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f115409d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f115410e;

    /* compiled from: CartSheetAfterAddingFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/k$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k h hVar, @Y61.k f fVar, @Y61.k m mVar, @Y61.k o oVar, @Y61.k dagger.internal.u uVar) {
        this.f115406a = hVar;
        this.f115407b = fVar;
        this.f115408c = mVar;
        this.f115409d = oVar;
        this.f115410e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f115406a.get();
        e eVar = (e) this.f115407b.get();
        l lVar = (l) this.f115408c.get();
        n nVar = (n) this.f115409d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f115410e.get();
        f115405f.getClass();
        gn.e.f396817g.getClass();
        return new j("CartSheetAfterAdding", gn.e.f396818h, new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
