package com.avito.android.serp.adapter.mini_menu;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.publish.objects.C33947g;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rs0.InterfaceC47716a;

/* compiled from: MiniMenuBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/mini_menu/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f270330b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f270331c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f270332d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UV0.c<MiniMenuItem> f270333e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public j f270334f;

    /* compiled from: MiniMenuBlockItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/mini_menu/g$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.l f270336c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f270337d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.l<View, G0> f270338e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.ranges.l lVar, int i12, Y41.l<? super View, G0> lVar2) {
            this.f270336c = lVar;
            this.f270337d = i12;
            this.f270338e = lVar2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            View viewZ;
            if (i12 == 0) {
                g gVar = g.this;
                gVar.f270331c.v0(this);
                kotlin.ranges.l lVar = this.f270336c;
                int i13 = this.f270337d;
                boolean zH2 = lVar.h(i13);
                RecyclerView recyclerView2 = gVar.f270331c;
                if (!zH2) {
                    recyclerView2.A0(i13);
                }
                RecyclerView.m layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager == null || (viewZ = layoutManager.Z(i13)) == null) {
                    return;
                }
                ((k) this.f270338e).invoke(viewZ);
            }
        }
    }

    public g(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k C33947g c33947g, @Y61.k RecyclerView.l lVar) {
        super(view);
        this.f270330b = aVar;
        View viewFindViewById = view.findViewById(R.id.mini_menu_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter((RecyclerView.Adapter) c33947g.get());
        recyclerView.l(lVar, -1);
        this.f270331c = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f270332d = arrayList;
        this.f270333e = new UV0.c<>(arrayList);
        recyclerView.o(new f(this));
        recyclerView.setNestedScrollingEnabled(false);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.e
    public final void U6(@Y61.k InterfaceC47716a interfaceC47716a) {
        this.f270334f = (j) interfaceC47716a;
    }

    @Override // com.avito.android.serp.adapter.mini_menu.e
    public final void XC(@Y61.k List<MiniMenuItem> list) {
        ArrayList arrayList = this.f270332d;
        arrayList.clear();
        arrayList.addAll(list);
        this.f270330b.c(this.f270333e);
        RecyclerView recyclerView = this.f270331c;
        recyclerView.requestLayout();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.serp.adapter.mini_menu.e
    public final void e3(@Y61.l Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.m layoutManager = this.f270331c.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.X0(parcelable);
            }
        }
    }

    @Override // com.avito.android.serp.adapter.mini_menu.e
    public final void gG(int i12, @Y61.k Y41.l<? super View, G0> lVar) {
        View viewZ;
        RecyclerView recyclerView = this.f270331c;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        kotlin.ranges.l lVar2 = new kotlin.ranges.l(linearLayoutManager != null ? linearLayoutManager.H1() : -1, linearLayoutManager != null ? linearLayoutManager.L1() : -1, 1);
        if (!lVar2.h(i12)) {
            recyclerView.o(new a(lVar2, i12, lVar));
            recyclerView.F0(i12);
            return;
        }
        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 == null || (viewZ = layoutManager2.Z(i12)) == null) {
            return;
        }
        ((k) lVar).invoke(viewZ);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.e
    @Y61.l
    public final Parcelable l1() {
        RecyclerView.m layoutManager = this.f270331c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y0();
        }
        return null;
    }
}
