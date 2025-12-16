package com.avito.android.inline_filters.dialog.group.item.multiselect;

import Y41.l;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f171611l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f171611l = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        f fVar = this.f171611l;
        Filter filter = fVar.f171619h;
        if (filter != null) {
            ?? r12 = fVar.f171616e;
            Iterable iterable = (Iterable) fVar.f171618g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((i) obj).f172094e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((i) it.next()).f172092c);
            }
            r12.invoke(filter, arrayList2);
        }
        return G0.f406611a;
    }
}
