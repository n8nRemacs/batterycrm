package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import bn.C25680a;
import bn.C25681b;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.C31175s;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31170m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingActor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/f;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/e;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f115382d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C31175s f115383a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C25681b f115384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_sheet_after_adding.domain.g f115385c;

    /* compiled from: CartSheetAfterAddingActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/f$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k C31175s c31175s, @Y61.k C25681b c25681b, @Y61.k com.avito.android.cart_sheet_after_adding.domain.g gVar) {
        this.f115383a = c31175s;
        this.f115384b = c25681b;
        this.f115385c = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC31170m interfaceC31170m = (InterfaceC31170m) this.f115383a.get();
        C25680a c25680a = (C25680a) this.f115384b.get();
        com.avito.android.cart_sheet_after_adding.domain.f fVar = (com.avito.android.cart_sheet_after_adding.domain.f) this.f115385c.get();
        f115382d.getClass();
        return new e(interfaceC31170m, c25680a, fVar);
    }
}
