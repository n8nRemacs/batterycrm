package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingViewModel_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/r;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/p;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f115440e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f115441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f115442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f115443c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f115444d;

    /* compiled from: CartSheetAfterAddingViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/r$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public r(@Y61.k k kVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k u uVar2) {
        this.f115441a = kVar;
        this.f115442b = uVar;
        this.f115443c = provider;
        this.f115444d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f115441a.get();
        com.avito.android.arch.mvi.q qVar = (com.avito.android.arch.mvi.q) this.f115442b.get();
        R0 r02 = this.f115443c.get();
        this.f115444d.getClass();
        t tVar = new t();
        f115440e.getClass();
        return new p(jVar, qVar, r02, tVar);
    }
}
