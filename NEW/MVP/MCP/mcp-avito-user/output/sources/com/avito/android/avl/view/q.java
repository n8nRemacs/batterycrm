package com.avito.android.avl.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.google.android.exoplayer2.upstream.cache.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvlPlayerVideosAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avl/view/q;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/konveyor/adapter/b;", "a", "b", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q extends RecyclerView.Adapter<com.avito.konveyor.adapter.b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f98398c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f98399d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f98400e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl_analytics.a f98401f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J80.b f98402g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f98403h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f98404i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f98405j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.d f98406k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.avl.features.a f98407l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f98408m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ArrayList<com.avito.conveyor_item.a> f98409n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public boolean f98410o = true;

    /* compiled from: AvlPlayerVideosAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/avl/view/q$a;", "", "<init>", "()V", "", "VIEW_TYPE_UNKNOWN", "I", "VIEW_TYPE_VIDEO", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvlPlayerVideosAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl/view/q$b;", "Landroidx/recyclerview/widget/o$b;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C23424o.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f98411a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.conveyor_item.a> f98412b;

        public b(@Y61.k ArrayList arrayList, @Y61.k List list) {
            this.f98411a = arrayList;
            this.f98412b = list;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areContentsTheSame(int i12, int i13) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f98411a.get(i12);
            com.avito.conveyor_item.a aVar2 = this.f98412b.get(i13);
            return aVar2 instanceof CommercialItem ? ((CommercialItem) aVar2).isContentEqualWith(aVar) : aVar2 instanceof BaseAvlVideoItem ? ((BaseAvlVideoItem) aVar2).o1(aVar) : L.f(aVar2, aVar);
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areItemsTheSame(int i12, int i13) {
            return L.f(((com.avito.conveyor_item.a) this.f98411a.get(i12)).getStringId(), this.f98412b.get(i13).getStringId());
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        @Y61.l
        public final Object getChangePayload(int i12, int i13) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) this.f98411a.get(i12);
            if (aVar.getClass() == this.f98412b.get(i13).getClass() && (aVar instanceof CommercialItem)) {
                return G0.f406611a;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getNewListSize() {
            return this.f98412b.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getOldListSize() {
            return this.f98411a.size();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k com.avito.konveyor.a aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k com.avito.android.avl_analytics.a aVar4, @Y61.k J80.b bVar, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.l<? super Integer, G0> lVar3, @Y61.k a.d dVar, @Y61.k com.avito.android.avl.features.a aVar5) {
        this.f98398c = aVar;
        this.f98399d = aVar2;
        this.f98400e = aVar3;
        this.f98401f = aVar4;
        this.f98402g = bVar;
        this.f98403h = lVar;
        this.f98404i = lVar2;
        this.f98405j = lVar3;
        this.f98406k = dVar;
        this.f98407l = aVar5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f98409n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        ArrayList<com.avito.conveyor_item.a> arrayList = this.f98409n;
        if (i12 >= arrayList.size() || i12 < 0) {
            return -1;
        }
        com.avito.conveyor_item.a aVar = arrayList.get(i12);
        if (aVar instanceof BaseAvlVideoItem) {
            return Integer.MAX_VALUE;
        }
        return this.f98398c.O(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) throws ItemNotSupportedException {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        com.avito.conveyor_item.a aVar = this.f98409n.get(i12);
        if (!(bVar instanceof B)) {
            this.f98398c.O5(bVar, aVar, i12);
        } else if (aVar instanceof BaseAvlVideoItem) {
            ((B) bVar).E80((BaseAvlVideoItem) aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        if (i12 != Integer.MAX_VALUE) {
            com.avito.konveyor.adapter.b bVarK = this.f98398c.k(viewGroup, i12, new t(this, viewGroup));
            return bVarK == null ? new com.avito.konveyor.adapter.c(viewGroup) : bVarK;
        }
        return new B(C0.b(viewGroup, R.layout.avl_fulscreen_item, viewGroup, false), this.f98399d, this.f98400e, this.f98403h, this.f98404i, this.f98401f, this.f98402g, new r(this), new s(this), this.f98405j, this.f98406k, this.f98407l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        super.onViewRecycled(bVar);
        if (bVar instanceof B) {
            ((B) bVar).C80();
        }
        bVar.j5();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) throws ItemNotSupportedException {
        com.avito.konveyor.adapter.b bVar = (com.avito.konveyor.adapter.b) c12;
        com.avito.conveyor_item.a aVar = this.f98409n.get(i12);
        if (bVar instanceof B) {
            if (aVar instanceof BaseAvlVideoItem) {
                ((B) bVar).E80((BaseAvlVideoItem) aVar);
                return;
            }
            return;
        }
        this.f98398c.g2(bVar, aVar, i12, list);
    }
}
