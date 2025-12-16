package com.avito.android.ab_groups;

import Au.ViewOnClickListenerC13080b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AbGroupsRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_groups/x;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/ab_groups/x$a;", "a", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<q3.h, G0> f67697c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f67698d;

    /* compiled from: AbGroupsRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_groups/x$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f67699c = 0;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f67700b;

        public a(@Y61.k View view) {
            super(view);
            this.f67700b = (TextView) view.findViewById(R.id.ab_title);
        }
    }

    public x(@Y61.k Y41.l lVar, @Y61.k List list) {
        this.f67697c = lVar;
        this.f67698d = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f67698d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        q3.h hVar = (q3.h) this.f67698d.get(i12);
        aVar.f67700b.setText(hVar.getLabel());
        aVar.itemView.setOnClickListener(new ViewOnClickListenerC13080b(29, this.f67697c, hVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.ab_group_item, viewGroup, false));
    }
}
