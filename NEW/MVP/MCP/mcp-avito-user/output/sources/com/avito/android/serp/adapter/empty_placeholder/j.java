package com.avito.android.serp.adapter.empty_placeholder;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PlaceholderAction;
import com.avito.android.serp.adapter.empty_placeholder.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: EmptyPlaceholderItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/j;", "Lcom/avito/android/serp/adapter/empty_placeholder/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f269913b;

    @Inject
    public j(@Y61.k h31.e<InterfaceC47690b> eVar) {
        this.f269913b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        EmptyPlaceholderItem emptyPlaceholderItem = (EmptyPlaceholderItem) aVar;
        lVar.setTitle(emptyPlaceholderItem.f269902e);
        lVar.f(emptyPlaceholderItem.f269903f);
        List<PlaceholderAction> list = emptyPlaceholderItem.f269904g;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String title = ((PlaceholderAction) obj).getTitle();
            if (title != null && title.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PlaceholderAction placeholderAction = (PlaceholderAction) it.next();
            String title2 = placeholderAction.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            arrayList2.add(new l.a(title2, new i(placeholderAction, this)));
        }
        lVar.h2(arrayList2);
    }
}
