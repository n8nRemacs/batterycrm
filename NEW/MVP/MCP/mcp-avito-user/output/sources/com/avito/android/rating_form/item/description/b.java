package com.avito.android.rating_form.item.description;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionItemAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/description/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/rating_form/item/description/b$a;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f248370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public List<String> f248371d = C42784z0.f406748b;

    /* compiled from: DescriptionItemAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/description/b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f248372b;

        public a(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.description_text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f248372b = (TextView) viewFindViewById;
        }
    }

    public b(boolean z12) {
        this.f248370c = z12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f248371d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((a) c12).f248372b.setText(this.f248371d.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, this.f248370c ? R.layout.rating_form_description_list_item_redesign : R.layout.rating_form_description_list_item, viewGroup, false));
    }
}
