package com.avito.android.inline_filters.dialog.group;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> f171567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f171568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f171569n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Y41.l<? super List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar, b bVar, Y41.a<G0> aVar) {
        super(0);
        this.f171567l = lVar;
        this.f171568m = bVar;
        this.f171569n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar = this.f171567l;
        if (lVar != null) {
            LinkedHashMap linkedHashMap = this.f171568m.f171557e;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Q(entry.getKey(), entry.getValue()));
            }
            lVar.invoke(arrayList);
        }
        ((i) this.f171569n).invoke();
        return G0.f406611a;
    }
}
