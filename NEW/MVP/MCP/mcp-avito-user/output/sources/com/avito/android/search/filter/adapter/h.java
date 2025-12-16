package com.avito.android.search.filter.adapter;

import Ap0.InterfaceC13067b;
import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f262344b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC13067b f262345c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Integer> f262346d;

    /* compiled from: FiltersItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/h$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC13067b f262347a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public List<? extends com.avito.conveyor_item.a> f262348b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public List<Integer> f262349c;

        public a(@k InterfaceC13067b interfaceC13067b) {
            this.f262347a = interfaceC13067b;
            C42784z0 c42784z0 = C42784z0.f406748b;
            this.f262348b = c42784z0;
            this.f262349c = c42784z0;
        }
    }

    public h() {
        throw null;
    }

    public h(List list, InterfaceC13067b interfaceC13067b, List list2, C42822w c42822w) {
        this.f262344b = list;
        this.f262345c = interfaceC13067b;
        this.f262346d = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        if (this.f262346d.contains(Integer.valueOf(iU2))) {
            return;
        }
        List<com.avito.conveyor_item.a> list = this.f262344b;
        com.avito.conveyor_item.a aVar = list.get(iU2);
        int i12 = iU2 + 1;
        this.f262345c.a(rect, aVar, (i12 < zVar.b() ? this : null) != null ? list.get(i12) : null, recyclerView.W(view));
    }
}
