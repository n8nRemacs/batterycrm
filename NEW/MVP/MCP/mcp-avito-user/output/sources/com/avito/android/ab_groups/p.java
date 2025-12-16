package com.avito.android.ab_groups;

import Au.ViewOnClickListenerC13080b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import q3.C47189a;

/* compiled from: AbExperimentsRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_groups/p;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/ab_groups/p$a;", "a", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C47189a, G0> f67668c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f67669d = true;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList<C47189a> f67670e = new ArrayList<>();

    /* compiled from: AbExperimentsRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_groups/p$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f67671e = 0;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f67672b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f67673c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f67674d;

        public a(@Y61.k View view) {
            super(view);
            this.f67672b = (TextView) view.findViewById(R.id.ab_title);
            this.f67673c = (TextView) view.findViewById(R.id.ab_label);
            this.f67674d = (TextView) view.findViewById(R.id.ab_group);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Y61.k Y41.l<? super C47189a, G0> lVar) {
        this.f67668c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f67670e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        Object next;
        a aVar = (a) c12;
        C47189a c47189a = this.f67670e.get(i12);
        boolean z12 = this.f67669d;
        aVar.f67672b.setText(c47189a.getTitle());
        aVar.f67673c.setText(c47189a.getLabel());
        Iterator<T> it = c47189a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            q3.h hVar = (q3.h) next;
            if ((z12 && hVar.getIsChosenProd()) || (!z12 && hVar.getIsChosenStaging())) {
                break;
            }
        }
        q3.h hVar2 = (q3.h) next;
        I5.a(aVar.f67674d, hVar2 != null ? hVar2.getLabel() : null, false);
        aVar.itemView.setOnClickListener(new ViewOnClickListenerC13080b(28, this.f67668c, c47189a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.ab_experiment_item, viewGroup, false));
    }
}
