package com.avito.android.cart_snippet_actions.utils;

import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import java.util.Map;
import kotlin.Metadata;
import un.C49079a;

/* compiled from: ItemQuantityChanges.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Response", "", "", "Lcom/avito/android/cart_snippet_actions/utils/Change;", "acc", "Lun/a;", "change", "apply", "(Ljava/util/Map;Lun/a;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a<T1, T2, R> f116279b = new a<>();

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        Change change;
        Map map = (Map) obj;
        C49079a c49079a = (C49079a) obj2;
        String str = c49079a.f440278a;
        Change change2 = (Change) map.get(str);
        int i12 = c49079a.f440281d;
        int i13 = c49079a.f440280c;
        if (change2 != null) {
            change = new Change(change2.f116277b, new CartItemInfo(i13, Integer.valueOf(i12)));
        } else {
            change = new Change(c49079a.f440279b, new CartItemInfo(i13, Integer.valueOf(i12)));
        }
        map.put(str, change);
        return map;
    }
}
