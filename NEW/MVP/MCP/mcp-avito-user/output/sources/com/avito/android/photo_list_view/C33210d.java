package com.avito.android.photo_list_view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ImageListAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/d;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/photo_list_view/Q;", "a", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C33210d extends RecyclerView.Adapter<Q> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public List<? extends InterfaceC33208b> f218161c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final s f218162d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f218163e;

    /* compiled from: ImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/d$a;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.d$a */
    public interface a {
        @Y61.k
        Q a(@Y61.k Y41.l lVar, @Y61.k s sVar);

        @Y61.k
        Q b(@Y61.k Y41.l lVar, @Y61.k s sVar);
    }

    public C33210d(@Y61.k C42784z0 c42784z0, @Y61.k s sVar, @Y61.k a aVar) {
        this.f218161c = c42784z0;
        this.f218162d = sVar;
        this.f218163e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f218161c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        return !kotlin.jvm.internal.L.f(this.f218161c.get(i12).getF218068a(), "9223372036854775806") ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((Q) c12).B80(this.f218161c.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        C33211e c33211e = new C33211e(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        s sVar = this.f218162d;
        a aVar = this.f218163e;
        return i12 == 0 ? aVar.a(c33211e, sVar) : aVar.b(c33211e, sVar);
    }
}
