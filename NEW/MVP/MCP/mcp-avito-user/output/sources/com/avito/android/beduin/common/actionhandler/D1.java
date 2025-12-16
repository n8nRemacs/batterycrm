package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.ModifyCartItemsCacheAction;
import com.avito.android.beduin.common.actionhandler.D1;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.InterfaceC43543a;
import rU.C47595a;

/* compiled from: ModifyCartItemsCacheActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/D1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D1 implements InterfaceC15523b<ModifyCartItemsCacheAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<io.reactivex.rxjava3.disposables.c> f100063a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f100064b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.F f100065c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f100066d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f100067e;

    /* compiled from: ModifyCartItemsCacheActionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100068a;

        static {
            int[] iArr = new int[ModifyCartItemsCacheAction.Type.values().length];
            try {
                iArr[ModifyCartItemsCacheAction.Type.OVERWRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModifyCartItemsCacheAction.Type.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100068a = iArr;
        }
    }

    @Inject
    public D1(@Y61.k h31.e<io.reactivex.rxjava3.disposables.c> eVar, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.F f12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.account.E e12) {
        this.f100063a = eVar;
        this.f100064b = hVar;
        this.f100065c = f12;
        this.f100066d = interfaceC35745a5;
        this.f100067e = e12;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        final ModifyCartItemsCacheAction modifyCartItemsCacheAction = (ModifyCartItemsCacheAction) beduinAction;
        io.reactivex.rxjava3.internal.operators.maybe.D d12 = new io.reactivex.rxjava3.internal.operators.maybe.D(this.f100067e.k(), new E1(this, modifyCartItemsCacheAction));
        InterfaceC35745a5 interfaceC35745a5 = this.f100066d;
        io.reactivex.rxjava3.internal.operators.completable.M mX2 = d12.x(interfaceC35745a5.a());
        V2 v22 = V2.f318762a;
        io.reactivex.rxjava3.disposables.d dVarF = io.reactivex.rxjava3.kotlin.A1.f(mX2, new F1(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2);
        h31.e<io.reactivex.rxjava3.disposables.c> eVar = this.f100063a;
        eVar.get().b(dVarF);
        eVar.get().b(io.reactivex.rxjava3.kotlin.A1.f(new C41826q(new InterfaceC43543a() { // from class: com.avito.android.beduin.common.actionhandler.C1
            @Override // l41.InterfaceC43543a
            public final void run() {
                ModifyCartItemsCacheAction modifyCartItemsCacheAction2 = modifyCartItemsCacheAction;
                List<ModifyCartItemsCacheAction.CartItem> items = modifyCartItemsCacheAction2.getItems();
                ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
                for (ModifyCartItemsCacheAction.CartItem cartItem : items) {
                    arrayList.add(new CartItem(cartItem.getItemId(), new CartItemInfo(cartItem.getQuantity(), Integer.valueOf(cartItem.getMaxQuantity()))));
                }
                C47595a c47595a = new C47595a(arrayList);
                int i12 = D1.a.f100068a[modifyCartItemsCacheAction2.getType().ordinal()];
                com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar = this.f100059b.f100064b;
                if (i12 == 1) {
                    hVar.clear();
                    hVar.c(c47595a);
                } else {
                    if (i12 != 2) {
                        return;
                    }
                    hVar.c(c47595a);
                }
            }
        }).x(interfaceC35745a5.a()), new G1(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2));
    }
}
