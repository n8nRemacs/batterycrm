package com.avito.konveyor.adapter;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ListRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/konveyor/adapter/d;", "Landroidx/recyclerview/widget/B;", "LTV0/a;", "Lcom/avito/konveyor/adapter/b;", "b", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends B<TV0.a, com.avito.konveyor.adapter.b> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f338496h;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f338497e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TV0.g<com.avito.konveyor.adapter.b> f338498f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public LayoutInflater f338499g;

    /* compiled from: ListRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/konveyor/adapter/d$a", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.f<TV0.a> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(TV0.a aVar, TV0.a aVar2) {
            return aVar.equals(aVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(TV0.a aVar, TV0.a aVar2) {
            TV0.a aVar3 = aVar;
            TV0.a aVar4 = aVar2;
            return aVar3.getId() == aVar4.getId() && aVar3.getClass().equals(aVar4.getClass());
        }
    }

    /* compiled from: ListRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/konveyor/adapter/d$b;", "", "<init>", "()V", "com/avito/konveyor/adapter/d$a", "CALLBACK", "Lcom/avito/konveyor/adapter/d$a;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f338496h = new a();
    }

    public /* synthetic */ d(com.avito.konveyor.adapter.a aVar, TV0.g gVar, C23424o.f fVar, int i12, C42822w c42822w) {
        this(aVar, gVar, (i12 & 4) != 0 ? f338496h : fVar);
    }

    @Override // androidx.recyclerview.widget.B, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f338497e.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f338497e.getItemId(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return this.f338497e.b(i12);
    }

    @Override // androidx.recyclerview.widget.B
    public final void k(@k List list) {
        this.f338497e.c(new UV0.c(list));
    }

    @Override // androidx.recyclerview.widget.B
    public final void l(@l List<TV0.a> list, @l Runnable runnable) {
        super.l(list != null ? C42745f0.M0(list) : null, runnable);
    }

    @Override // androidx.recyclerview.widget.B
    public final void m(@l List<TV0.a> list) {
        l(list, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f338497e.e((com.avito.konveyor.adapter.b) c12, i12, c42784z0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        com.avito.konveyor.adapter.b bVarK = this.f338498f.k(viewGroup, i12, new e(this, viewGroup));
        if (bVarK == null) {
            return new c(viewGroup);
        }
        this.f338497e.a(this, bVarK);
        return bVarK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        super.onViewRecycled(bVar);
        bVar.j5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k com.avito.konveyor.adapter.a aVar, @k TV0.g<? extends com.avito.konveyor.adapter.b> gVar, @k C23424o.f<TV0.a> fVar) {
        super(fVar);
        this.f338497e = aVar;
        this.f338498f = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) {
        this.f338497e.e((com.avito.konveyor.adapter.b) c12, i12, list);
    }
}
