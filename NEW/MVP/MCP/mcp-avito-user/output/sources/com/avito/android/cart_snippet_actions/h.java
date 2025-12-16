package com.avito.android.cart_snippet_actions;

import Dn.C13419a;
import Dn.C13420b;
import Lm.C14412c;
import Pm.C14806a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import l41.o;
import vn.C49355b;

/* compiled from: CartActionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LDn/a;", "typedResult", "LLm/c;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final h<T, R> f116256b = new h<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        LinkedHashMap linkedHashMap;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C13419a c13419a = (C13419a) ((TypedResult.Success) typedResult).getResult();
        Map<String, Dn.f> mapA = c13419a.a();
        C49355b c49355b = null;
        if (mapA != null) {
            linkedHashMap = new LinkedHashMap(P0.f(mapA.size()));
            Iterator<T> it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Dn.f fVar = (Dn.f) entry.getValue();
                linkedHashMap.put(key, new C14806a((int) fVar.getDiscount(), (int) fVar.getItemsLeft()));
            }
        } else {
            linkedHashMap = null;
        }
        int itemsQuantity = (int) c13419a.getItemsQuantity();
        DeepLink onAddItemDeepLink = c13419a.getOnAddItemDeepLink();
        n nVar = n.f116276a;
        C13420b discountOnDelivery = c13419a.getDiscountOnDelivery();
        nVar.getClass();
        if (discountOnDelivery != null) {
            AttributedText text = discountOnDelivery.getText();
            List<Double> listA = discountOnDelivery.getProgressBar().a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf((float) ((Number) it2.next()).doubleValue()));
            }
            c49355b = new C49355b(text, new C49355b.a(arrayList));
        }
        return new TypedResult.Success(new C14412c(linkedHashMap, itemsQuantity, onAddItemDeepLink, c49355b));
    }
}
