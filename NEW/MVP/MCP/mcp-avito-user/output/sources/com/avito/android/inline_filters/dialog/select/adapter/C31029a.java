package com.avito.android.inline_filters.dialog.select.adapter;

import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CandyDiffCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.select.adapter.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31029a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ArrayList f172069a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<i> f172070b;

    public C31029a(@Y61.l ArrayList arrayList, @Y61.k List list) {
        this.f172069a = arrayList;
        this.f172070b = list;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        ArrayList arrayList = this.f172069a;
        if (arrayList == null) {
            return false;
        }
        i iVar = (i) arrayList.get(i12);
        i iVar2 = this.f172070b.get(i13);
        return iVar.f172094e == iVar2.f172094e && L.f(iVar.f172104o, iVar2.f172104o);
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        i iVar;
        ArrayList arrayList = this.f172069a;
        return (arrayList == null || (iVar = (i) arrayList.get(i12)) == null || iVar.getId() != this.f172070b.get(i13).getId()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f172070b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        ArrayList arrayList = this.f172069a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
