package com.avito.android.section;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: SectionItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/u;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f264915b;

    public u(v vVar) {
        this.f264915b = vVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        if (i12 == 0) {
            v vVar = this.f264915b;
            Object tag = vVar.f264922h.getTag();
            if (tag instanceof String) {
                LinearLayoutManager linearLayoutManager = vVar.f264923i;
                int iH1 = linearLayoutManager.H1();
                int iM1 = linearLayoutManager.M1();
                vVar.f264916b.M1(iH1, iM1, (String) tag);
            }
        }
    }
}
