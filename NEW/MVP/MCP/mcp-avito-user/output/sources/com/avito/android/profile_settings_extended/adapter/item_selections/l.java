package com.avito.android.profile_settings_extended.adapter.item_selections;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectionsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f229632g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f229633b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f229634c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f229635d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f229636e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f229637f;

    /* compiled from: SelectionsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_settings_extended/adapter/item_selections/l$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Parcelable, G0> f229639c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Parcelable, G0> lVar) {
            this.f229639c = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            int i13 = l.f229632g;
            l lVar = l.this;
            if (lVar.f229635d.getScrollState() != 0) {
                return;
            }
            ((h) this.f229639c).invoke(lVar.f229636e.Y0());
        }
    }

    public l(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        super(view);
        this.f229633b = (TextView) view.findViewById(R.id.extended_profile_selections_title);
        this.f229634c = (TextView) view.findViewById(R.id.extended_profile_selections_description);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.extended_profile_item_selections_recycler);
        this.f229635d = recyclerView;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f229636e = linearLayoutManager;
        com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(aVar2, aVar, null, 4, null);
        this.f229637f = dVar;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        int dimension = (int) recyclerView.getResources().getDimension(R.dimen.extended_profile_settings_horizontal_margin);
        recyclerView.l(new com.avito.android.profile.horizontal_scroll_widget.a(dimension, dimension, y6.b(8)), -1);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.item_selections.k
    public final void Xe(@Y61.k SelectionsItem selectionsItem, @Y61.k Y41.l<? super Parcelable, G0> lVar) {
        I5.a(this.f229633b, selectionsItem.f229522d, false);
        I5.a(this.f229634c, selectionsItem.f229523e, false);
        this.f229637f.l(selectionsItem.f229524f, null);
        RecyclerView recyclerView = this.f229635d;
        if (!(recyclerView.getScrollState() != 0)) {
            Parcelable parcelable = selectionsItem.f229525g;
            if (parcelable != null) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.X0(parcelable);
                }
            } else {
                RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.l1(0);
                }
            }
        }
        recyclerView.o(new a(lVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229635d.s();
    }
}
