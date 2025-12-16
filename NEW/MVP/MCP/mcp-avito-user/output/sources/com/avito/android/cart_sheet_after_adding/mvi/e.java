package com.avito.android.cart_sheet_after_adding.mvi;

import an.C19912a;
import androidx.compose.runtime.internal.P;
import bn.C25680a;
import bn.C25682c;
import com.avito.android.arch.mvi.a;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31170m;
import com.avito.android.rec.ScreenSource;
import gn.InterfaceC40710b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CartSheetAfterAddingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lgn/b;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lgn/e;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31170m f115365a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C25680a f115366b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_sheet_after_adding.domain.f f115367c;

    @Inject
    public e(@Y61.k InterfaceC31170m interfaceC31170m, @Y61.k C25680a c25680a, @Y61.k com.avito.android.cart_sheet_after_adding.domain.f fVar) {
        this.f115365a = interfaceC31170m;
        this.f115366b = c25680a;
        this.f115367c = fVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CartSheetAfterAddingInternalAction> b(InterfaceC40710b interfaceC40710b, gn.e eVar) {
        InterfaceC40710b interfaceC40710b2 = interfaceC40710b;
        gn.e eVar2 = eVar;
        if (interfaceC40710b2.equals(InterfaceC40710b.a.f396792a)) {
            return new C43210w(CartSheetAfterAddingInternalAction.OpenCart.f115377b);
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.c) {
            InterfaceC40710b.c cVar = (InterfaceC40710b.c) interfaceC40710b2;
            C25680a c25680a = this.f115366b;
            String strA = c25680a.f57424d.a();
            String str = strA != null ? strA : null;
            Map<String, Object> mapC = eVar2.f396822e;
            if (mapC == null) {
                mapC = P0.c();
            }
            c25680a.f57421a.c(new C25682c(cVar.f396795b, str, c25680a.f57422b, cVar.f396794a, mapC, null));
            return new C43210w(new CartSheetAfterAddingInternalAction.OpenAdvertDetails(cVar.f396795b, null, new C19912a(cVar.f396796c, ScreenSource.CART_SIMILAR_ITEMS.f251778d, cVar.f396799f, cVar.f396798e, cVar.f396797d), 2, null));
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.f) {
            return new C43210w(new CartSheetAfterAddingInternalAction.UpdateScreenTitle(((InterfaceC40710b.f) interfaceC40710b2).f396802a));
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.g) {
            return C43175k.G(new a(interfaceC40710b2, eVar2, null));
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.d) {
            return C43175k.G(new b(this, interfaceC40710b2, null));
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.e) {
            return C43175k.G(new c(interfaceC40710b2, eVar2, null));
        }
        if (interfaceC40710b2 instanceof InterfaceC40710b.C11227b) {
            return C43175k.G(new d(eVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
