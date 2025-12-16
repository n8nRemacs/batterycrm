package com.avito.android.scroll_tracker;

import androidx.compose.runtime.internal.P;
import com.avito.android.scroll_tracker.i;
import com.avito.android.serp.adapter.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetViewingDepthTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/scroll_tracker/j;", "Lcom/avito/android/scroll_tracker/i;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public i.a f261726a = new i.a();

    @Inject
    public j() {
    }

    @Override // com.avito.android.scroll_tracker.i
    public final void a() {
        this.f261726a.f261724a = new LinkedHashMap();
        this.f261726a.f261725b = new LinkedHashSet();
    }

    @Override // com.avito.android.scroll_tracker.i
    public final void b() {
        i.a aVar = this.f261726a;
        aVar.f261725b.addAll(aVar.f261724a.keySet());
    }

    @Override // com.avito.android.scroll_tracker.i
    public final void c(@Y61.k i.a aVar) {
        this.f261726a = aVar;
    }

    @Override // com.avito.android.scroll_tracker.i
    public final boolean d() {
        Iterator it = this.f261726a.f261724a.entrySet().iterator();
        while (it.hasNext()) {
            if (!this.f261726a.f261725b.contains((String) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.scroll_tracker.i
    public final void e(@Y61.k com.avito.conveyor_item.a aVar) {
        this.f261726a.f261724a.put(aVar.getF2697b(), aVar);
    }

    @Override // com.avito.android.scroll_tracker.i
    @Y61.k
    public final ArrayList f() {
        LinkedHashMap linkedHashMap = this.f261726a.f261724a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if ((((com.avito.conveyor_item.a) entry.getValue()) instanceof m1) && !this.f261726a.f261725b.contains(str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }
}
