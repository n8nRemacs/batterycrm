package com.avito.konveyor.adapter;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: SimpleRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/konveyor/adapter/b;", "Landroidx/recyclerview/widget/C;", "Lcom/avito/konveyor/adapter/i;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class j extends RecyclerView.Adapter<b> implements C, i {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f338513c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TV0.g<b> f338514d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public LayoutInflater f338515e;

    /* compiled from: SimpleRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Integer, View> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f338517m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup) {
            super(1);
            this.f338517m = viewGroup;
        }

        @Override // Y41.l
        public final View invoke(Integer num) {
            int iIntValue = num.intValue();
            j jVar = j.this;
            LayoutInflater layoutInflater = jVar.f338515e;
            ViewGroup viewGroup = this.f338517m;
            if (layoutInflater == null) {
                jVar.f338515e = LayoutInflater.from(viewGroup.getContext());
            }
            LayoutInflater layoutInflater2 = jVar.f338515e;
            View viewInflate = layoutInflater2 != null ? layoutInflater2.inflate(iIntValue, viewGroup, false) : null;
            if (viewInflate != null) {
                return viewInflate;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@k com.avito.konveyor.adapter.a aVar, @k TV0.g<? extends b> gVar) {
        this.f338513c = aVar;
        this.f338514d = gVar;
    }

    @Override // com.avito.konveyor.adapter.i
    @l
    public final TV0.a getItem(int i12) {
        com.avito.konveyor.adapter.a aVar = this.f338513c;
        i iVar = aVar instanceof i ? (i) aVar : null;
        if (iVar != null) {
            return iVar.getItem(i12);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f338513c.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f338513c.getItemId(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return this.f338513c.b(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        b bVarK = this.f338514d.k(viewGroup, i12, new a(viewGroup));
        if (bVarK == null) {
            return new c(viewGroup);
        }
        this.f338513c.a(this, bVarK);
        return bVarK;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f338513c.e((b) c12, i12, c42784z0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        b bVar = (b) c12;
        this.f338513c.d(bVar);
        bVar.j5();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) {
        this.f338513c.e((b) c12, i12, list);
    }
}
