package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import com.avito.android.cart_snippet_actions.utils.Change;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CartSnippetActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/cart_snippet_actions/feature/entity/TrueCartSnippetActionsInternalAction;", "initialStocks", "", "", "Lcom/avito/android/cart_snippet_actions/utils/Change;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class d extends N implements Y41.l<Map<String, ? extends Change>, TrueCartSnippetActionsInternalAction> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f116178l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final TrueCartSnippetActionsInternalAction invoke(Map<String, ? extends Change> map) {
        Map<String, ? extends Change> map2 = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((Change) entry.getValue()).f116277b));
        }
        return new TrueCartSnippetActionsInternalAction.d(linkedHashMap);
    }
}
