package com.avito.android.favorites;

import Lm.C14412c;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.g;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeeplinkArgs;
import com.avito.android.remote.model.TypedResult;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LLm/c;", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.v0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30699v0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f157559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f157560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f157561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f157562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.h<Map<String, List<CartItemQuantityChange>>> f157563f;

    public C30699v0(Y41.a aVar, x1 x1Var, Y41.a aVar2, C30684r0 c30684r0, l0.h hVar) {
        this.f157559b = aVar;
        this.f157560c = x1Var;
        this.f157561d = aVar2;
        this.f157562e = c30684r0;
        this.f157563f = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            this.f157559b.invoke();
            TypedResult.Error error = (TypedResult.Error) typedResult;
            String strI = com.avito.android.error.z.i(error.getError());
            PrintableText printableTextF = strI != null ? com.avito.android.printable_text.b.f(strI) : com.avito.android.printable_text.b.c(R.string.update_cart_items_error, new Serializable[0]);
            f.c cVar = new f.c(error.getError());
            x1 x1Var = this.f157560c;
            g.a.a(x1Var, printableTextF, cVar.equals(f.a.f125253a) ? true : cVar.equals(f.b.f125254a) ? ToastBarPosition.f181047e : ToastBarPosition.f181046d, cVar, 62);
            com.avito.android.cart_snippet_actions.utils.j.a(x1Var.f157598b);
        } else if (typedResult instanceof TypedResult.Success) {
            this.f157561d.invoke();
            C30684r0 c30684r0 = this.f157562e;
            TypedResult.Success success = (TypedResult.Success) typedResult;
            c30684r0.f157499w.qe(((C14412c) success.getResult()).getItemsQuantity());
            Map<String, List<CartItemQuantityChange>> map = this.f157563f.f406842b;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, List<CartItemQuantityChange>>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((CartItemQuantityChange) C42745f0.E(it.next().getValue())).getF116267c() == 0) {
                        DeepLink onAddItemDeepLink = ((C14412c) success.getResult()).getOnAddItemDeepLink();
                        if (onAddItemDeepLink != null) {
                            b.a.a(c30684r0.f157489r, onAddItemDeepLink, null, onAddItemDeepLink instanceof RelatedProductsBottomSheetDeepLink ? C22777e.b(new kotlin.Q("related_products_bottom_sheet_deeplink_args", new RelatedProductsBottomSheetDeeplinkArgs(c30684r0.f157436G))) : null, 2);
                        }
                    }
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
