package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MultiselectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.select.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31037g extends kotlin.jvm.internal.N implements Y41.l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f172153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f172154m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C31039i f172155n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.inline_filters.dialog.select.adapter.i> f172156o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172157p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C31037g(Y41.p pVar, Filter filter, C31039i c31039i, List list, ArrayList arrayList) {
        super(1);
        this.f172153l = (kotlin.jvm.internal.N) pVar;
        this.f172154m = filter;
        this.f172155n = c31039i;
        this.f172156o = list;
        this.f172157p = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        C31039i c31039i = this.f172155n;
        this.f172153l.invoke(this.f172154m, new InlineFilterValue.InlineFilterMultiSelectValue(c31039i.f172165i));
        List<com.avito.android.inline_filters.dialog.select.adapter.i> list2 = this.f172156o;
        Iterator<T> it = list2.iterator();
        ArrayList arrayList = this.f172157p;
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(C42745f0.q(list2, 10), C42745f0.q(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            ((com.avito.android.inline_filters.dialog.select.adapter.i) next).f172094e = ((com.avito.android.inline_filters.dialog.select.adapter.i) it2.next()).f172094e;
            arrayList2.add(G0.f406611a);
        }
        c31039i.c();
        return G0.f406611a;
    }
}
