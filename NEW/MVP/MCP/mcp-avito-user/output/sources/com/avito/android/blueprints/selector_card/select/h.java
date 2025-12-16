package com.avito.android.blueprints.selector_card.select;

import JO.m;
import Y41.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCardGroupView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJO/m;", "selectedItem", "", "isSelected", "Lkotlin/G0;", "invoke", "(LJO/m;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements p<m, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f106669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(2);
        this.f106669l = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(m mVar, Boolean bool) {
        int i12;
        m mVar2 = mVar;
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        i iVar = this.f106669l;
        iVar.G();
        ArrayList arrayList = iVar.f106676h;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (((m) it.next()).f8964e) {
                break;
            }
            i14++;
        }
        RecyclerView recyclerView = iVar.f106673e;
        if (i14 >= 0) {
            ((m) arrayList.get(i14)).f8964e = false;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(i14);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (mVar2.getF74860b() == ((m) it2.next()).getF74860b()) {
                i12 = i13;
                break;
            }
            i13++;
        }
        if (i12 >= 0) {
            ((m) arrayList.get(i12)).f8964e = zBooleanValue;
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(i12);
            }
            iVar.f106675g.invoke(mVar2, bool2);
        }
        return G0.f406611a;
    }
}
