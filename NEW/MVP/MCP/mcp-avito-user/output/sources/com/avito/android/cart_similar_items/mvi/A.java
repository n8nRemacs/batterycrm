package com.avito.android.cart_similar_items.mvi;

import Sq0.c;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_similar_items.konveyor.pagination.a;
import com.avito.android.cart_similar_items.mvi.entity.CartSimilarItemsInternalAction;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.remote.model.Image;
import gj.InterfaceC40691b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import mn.C44104d;
import mn.InterfaceC44106f;
import mn.InterfaceC44107g;
import on.C44826b;
import wn.C49654a;

/* compiled from: CartSimilarItemsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/mvi/A;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cart_similar_items/mvi/entity/CartSimilarItemsInternalAction;", "Lmn/d;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements com.avito.android.arch.mvi.u<CartSimilarItemsInternalAction, C44104d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f115929b;

    @Inject
    public A(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f115929b = interfaceC40691b;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44104d a(CartSimilarItemsInternalAction cartSimilarItemsInternalAction, C44104d c44104d) {
        com.avito.android.cart_similar_items.konveyor.snippet.c cVar;
        Stepper stepper;
        boolean z12;
        ArrayList arrayListI0;
        ArrayList arrayListI02;
        CartSimilarItemsInternalAction cartSimilarItemsInternalAction2 = cartSimilarItemsInternalAction;
        C44104d c44104d2 = c44104d;
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.Content) {
            CartSimilarItemsInternalAction.Content content = (CartSimilarItemsInternalAction.Content) cartSimilarItemsInternalAction2;
            z12 = content.f116026g == null;
            List<Sq0.c> list = content.f116025f;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((Sq0.c) it.next()));
            }
            if (z12) {
                arrayListI02 = arrayList;
            } else {
                com.avito.android.cart_similar_items.konveyor.pagination.a.f115845e.getClass();
                arrayListI02 = C42745f0.i0(com.avito.android.cart_similar_items.konveyor.pagination.a.f115846f, arrayList);
            }
            return C44104d.a(c44104d2, content.f116022c, com.avito.android.printable_text.b.f(content.f116021b), InterfaceC44106f.b.f414720a, new InterfaceC44107g.b(z12), null, null, content.f116023d, content.f116024e, arrayListI02, content.f116026g, 32);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.ScreenLoading) {
            return C44104d.a(c44104d2, null, null, ((CartSimilarItemsInternalAction.ScreenLoading) cartSimilarItemsInternalAction2).f116041d ? InterfaceC44106f.a.f414719a : InterfaceC44106f.c.f414721a, null, null, null, null, null, null, null, 1019);
        }
        boolean z13 = cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.PageLoading;
        List<com.avito.android.cart_similar_items.konveyor.c> list2 = c44104d2.f414714j;
        if (z13) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (!(((com.avito.android.cart_similar_items.konveyor.c) obj) instanceof com.avito.android.cart_similar_items.konveyor.pagination.a)) {
                    arrayList2.add(obj);
                }
            }
            com.avito.android.cart_similar_items.konveyor.pagination.a.f115845e.getClass();
            return C44104d.a(c44104d2, null, null, null, InterfaceC44107g.c.f414724a, null, null, null, null, C42745f0.i0(com.avito.android.cart_similar_items.konveyor.pagination.a.f115846f, arrayList2), null, 759);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.PageLoaded) {
            C44826b c44826b = ((CartSimilarItemsInternalAction.PageLoaded) cartSimilarItemsInternalAction2).f116036b;
            List<Sq0.c> listA = c44826b.a();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList3.add(b((Sq0.c) it2.next()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (!(((com.avito.android.cart_similar_items.konveyor.c) obj2) instanceof com.avito.android.cart_similar_items.konveyor.pagination.a)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayListH0 = C42745f0.h0(arrayList3, arrayList4);
            z12 = c44826b.getPaginationRequest() == null;
            InterfaceC44107g.b bVar = new InterfaceC44107g.b(z12);
            if (z12) {
                arrayListI0 = arrayListH0;
            } else {
                com.avito.android.cart_similar_items.konveyor.pagination.a.f115845e.getClass();
                arrayListI0 = C42745f0.i0(com.avito.android.cart_similar_items.konveyor.pagination.a.f115846f, arrayListH0);
            }
            return C44104d.a(c44104d2, null, null, null, bVar, null, null, null, null, arrayListI0, null, 759);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.PageLoadingError) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (!(((com.avito.android.cart_similar_items.konveyor.c) obj3) instanceof com.avito.android.cart_similar_items.konveyor.pagination.a)) {
                    arrayList5.add(obj3);
                }
            }
            String strJ = com.avito.android.error.z.j(((CartSimilarItemsInternalAction.PageLoadingError) cartSimilarItemsInternalAction2).f116038b);
            return C44104d.a(c44104d2, null, null, null, InterfaceC44107g.a.f414722a, null, null, null, null, C42745f0.i0(new com.avito.android.cart_similar_items.konveyor.pagination.a(null, null, new a.b.C3379a(strJ != null ? com.avito.android.printable_text.b.f(strJ) : com.avito.android.printable_text.b.c(R.string.cart_similar_items_failed_to_load_page_message, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.cart_similar_items_refresh, new Serializable[0])), 3, null), arrayList5), null, 759);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.HandleError) {
            return C44104d.a(c44104d2, null, null, InterfaceC44106f.b.f414720a, null, new C44104d.b(com.avito.android.printable_text.b.f(com.avito.android.error.z.l(((CartSimilarItemsInternalAction.HandleError) cartSimilarItemsInternalAction2).f116027b)), null, com.avito.android.printable_text.b.c(R.string.cart_similar_items_refresh, new Serializable[0]), 2, null), null, null, null, null, null, ErrorCodes.MALFORMED_URL_EXCEPTION);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.InternalError) {
            return C44104d.a(c44104d2, null, null, InterfaceC44106f.b.f414720a, null, new C44104d.b(com.avito.android.printable_text.b.f(com.avito.android.error.z.l(((CartSimilarItemsInternalAction.InternalError) cartSimilarItemsInternalAction2).f116029b)), null, null, 6, null), null, null, null, null, null, ErrorCodes.MALFORMED_URL_EXCEPTION);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateCartIconState) {
            return C44104d.a(c44104d2, null, null, null, null, null, ((CartSimilarItemsInternalAction.UpdateCartIconState) cartSimilarItemsInternalAction2).f116046b, null, null, null, null, 991);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.RevertItemsStocks) {
            List<com.avito.android.cart_similar_items.konveyor.c> list3 = list2;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list3, 10));
            for (com.avito.conveyor_item.a aVarA : list3) {
                if (aVarA instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) {
                    Integer num = (Integer) ((CartSimilarItemsInternalAction.RevertItemsStocks) cartSimilarItemsInternalAction2).f116040b.get(((com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA).f115873b);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        com.avito.android.cart_similar_items.konveyor.snippet.c cVar2 = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA;
                        Stepper stepper2 = cVar2.f115878g;
                        aVarA = com.avito.android.cart_similar_items.konveyor.snippet.c.a(cVar2, stepper2 != null ? Stepper.a(stepper2, iIntValue, null, 30) : null, false, 991);
                    } else {
                        aVarA = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA;
                    }
                }
                arrayList6.add(aVarA);
            }
            return C44104d.a(c44104d2, null, null, null, null, null, null, null, null, arrayList6, null, 767);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsStocks) {
            List<com.avito.android.cart_similar_items.konveyor.c> list4 = list2;
            ArrayList arrayList7 = new ArrayList(C42745f0.q(list4, 10));
            for (com.avito.conveyor_item.a aVarA2 : list4) {
                if (aVarA2 instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) {
                    com.avito.android.cart_similar_items.konveyor.snippet.c cVar3 = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA2;
                    aVarA2 = com.avito.android.cart_similar_items.konveyor.snippet.c.a(cVar3, com.avito.android.cart_snippet_actions.utils.i.a(cVar3.f115878g, (CartItemInfo) ((CartSimilarItemsInternalAction.UpdateItemsStocks) cartSimilarItemsInternalAction2).f116051b.get(((com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA2).f115873b)), false, 991);
                }
                arrayList7.add(aVarA2);
            }
            return C44104d.a(c44104d2, null, null, null, null, null, null, null, null, arrayList7, null, 767);
        }
        if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.ChangeItemQuantity) {
            List<com.avito.android.cart_similar_items.konveyor.c> list5 = list2;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list5, 10));
            for (com.avito.conveyor_item.a aVarA3 : list5) {
                CartSimilarItemsInternalAction.ChangeItemQuantity changeItemQuantity = (CartSimilarItemsInternalAction.ChangeItemQuantity) cartSimilarItemsInternalAction2;
                if (L.f(aVarA3.getF115847b(), changeItemQuantity.f116018b) && (aVarA3 instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) && (stepper = (cVar = (com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA3).f115878g) != null) {
                    int i12 = stepper.f116272c;
                    int i13 = changeItemQuantity.f116019c;
                    aVarA3 = com.avito.android.cart_similar_items.konveyor.snippet.c.a(cVar, Stepper.a(stepper, i13, C49654a.a(i13, i12), 22), false, 991);
                }
                arrayList8.add(aVarA3);
            }
            return C44104d.a(c44104d2, null, null, null, null, null, null, null, null, arrayList8, null, 767);
        }
        if (!(cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.SetItemsFavorite)) {
            if (cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.TopFormChanged) {
                return C44104d.a(c44104d2, null, null, null, null, null, null, null, ((CartSimilarItemsInternalAction.TopFormChanged) cartSimilarItemsInternalAction2).f116044b, null, null, 895);
            }
            if (cartSimilarItemsInternalAction2.equals(CartSimilarItemsInternalAction.CloseScreen.f116020b) ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.HandleBeduinActions ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.OpenAdvertDetails ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.OpenDeepLink ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateCartIconQuantity ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsLoadingStarted ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsLoadingFinished ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsSuccess ? true : cartSimilarItemsInternalAction2 instanceof CartSimilarItemsInternalAction.UpdateItemsError) {
                return c44104d2;
            }
            throw new NoWhenBranchMatchedException();
        }
        CartSimilarItemsInternalAction.SetItemsFavorite setItemsFavorite = (CartSimilarItemsInternalAction.SetItemsFavorite) cartSimilarItemsInternalAction2;
        Set setP0 = C42745f0.P0(setItemsFavorite.f116042b);
        List<com.avito.android.cart_similar_items.konveyor.c> list6 = list2;
        ArrayList arrayList9 = new ArrayList(C42745f0.q(list6, 10));
        for (com.avito.conveyor_item.a aVarA4 : list6) {
            if ((aVarA4 instanceof com.avito.android.cart_similar_items.konveyor.snippet.c) && setP0.contains(((com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA4).f115873b)) {
                aVarA4 = com.avito.android.cart_similar_items.konveyor.snippet.c.a((com.avito.android.cart_similar_items.konveyor.snippet.c) aVarA4, null, setItemsFavorite.f116043c, 959);
            }
            arrayList9.add(aVarA4);
        }
        return C44104d.a(c44104d2, null, null, null, null, null, null, null, null, arrayList9, null, 767);
    }

    public final com.avito.android.cart_similar_items.konveyor.c b(Sq0.c cVar) {
        Stepper stepper;
        boolean z12 = cVar instanceof c.a;
        InterfaceC40691b interfaceC40691b = this.f115929b;
        if (z12) {
            c.a aVar = (c.a) cVar;
            String id2 = aVar.getId();
            if (id2 == null) {
                id2 = "main";
            }
            String str = id2;
            return new com.avito.android.cart_similar_items.konveyor.beduin.c(str, null, com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, str, aVar.a()), 2, null);
        }
        if (!(cVar instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        c.b bVar = (c.b) cVar;
        CartSnippetActionsStepper stepper2 = bVar.getStepper();
        if (stepper2 != null) {
            Integer maxValue = stepper2.getMaxValue();
            stepper = new Stepper(stepper2.getValue(), maxValue != null ? maxValue.intValue() : Integer.MAX_VALUE, null, null, false, 28, null);
        } else {
            stepper = null;
        }
        Stepper stepper3 = stepper;
        String id3 = bVar.getId();
        Image image = bVar.getImage();
        String title = bVar.getTitle();
        double price = bVar.getPrice();
        boolean isFavorite = bVar.getIsFavorite();
        DeepLink onTapDeepLink = bVar.getOnTapDeepLink();
        List<BeduinModel> listA = bVar.a();
        String id4 = bVar.getId();
        List<BeduinModel> listA2 = bVar.a();
        if (listA2 == null) {
            listA2 = C42784z0.f406748b;
        }
        return new com.avito.android.cart_similar_items.konveyor.snippet.c(id3, null, image, title, price, stepper3, isFavorite, onTapDeepLink, listA, com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, id4, listA2), 2, null);
    }
}
