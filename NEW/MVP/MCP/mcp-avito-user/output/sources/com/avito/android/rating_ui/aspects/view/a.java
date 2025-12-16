package com.avito.android.rating_ui.aspects.view;

import Y61.k;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.chips.w;
import com.avito.android.rating_ui.aspects.view.button.RatingAspectsButton;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingAspectsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/rating_ui/aspects/view/b;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.Adapter<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final w f249899c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f249900d = true;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f249901e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public ArrayList f249902f;

    /* compiled from: RatingAspectsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/a$a;", "Landroidx/recyclerview/widget/o$b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_ui.aspects.view.a$a, reason: collision with other inner class name */
    public static final class C7492a extends C23424o.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f249903a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f249904b;

        public C7492a(@k ArrayList arrayList, @k ArrayList arrayList2) {
            this.f249903a = arrayList;
            this.f249904b = arrayList2;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areContentsTheSame(int i12, int i13) {
            return L.f(this.f249903a.get(i12), this.f249904b.get(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areItemsTheSame(int i12, int i13) {
            return ((RatingAspectsChipable) this.f249903a.get(i12)).f249888b == ((RatingAspectsChipable) this.f249904b.get(i13)).f249888b;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getNewListSize() {
            return this.f249904b.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getOldListSize() {
            return this.f249903a.size();
        }
    }

    public a(@k w wVar, @k c cVar) {
        this.f249899c = wVar;
        this.f249901e = cVar;
        setHasStableIds(true);
        this.f249902f = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f249902f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return ((RatingAspectsChipable) this.f249902f.get(i12)).f249888b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        String str;
        b bVar = (b) c12;
        boolean z12 = ((RatingAspectsChipable) this.f249902f.get(i12)).f249891e;
        w wVar = this.f249899c;
        if (!z12) {
            wVar.d(i12, false, true);
        } else if (!wVar.c(i12)) {
            wVar.e(i12, false, true);
        }
        boolean z13 = this.f249900d && (!wVar.b() || wVar.c(i12)) && ((RatingAspectsChipable) this.f249902f.get(i12)).f249892f;
        ((RatingAspectsChipable) this.f249902f.get(i12)).getClass();
        RatingAspectsButton ratingAspectsButton = bVar.f249905b;
        ratingAspectsButton.setEnabled(z13);
        ratingAspectsButton.setSelected(z12);
        boolean zIsSelected = ratingAspectsButton.isSelected();
        c cVar = this.f249901e;
        ratingAspectsButton.setStyle(zIsSelected ? cVar.f249932a : cVar.f249933b);
        ratingAspectsButton.setText(((RatingAspectsChipable) this.f249902f.get(i12)).f249889c);
        Object obj = this.f249902f.get(i12);
        RatingAspectsChipable ratingAspectsChipable = obj instanceof RatingAspectsChipable ? (RatingAspectsChipable) obj : null;
        if (ratingAspectsChipable == null || (str = ratingAspectsChipable.f249890d) == null) {
            str = "";
        }
        ratingAspectsButton.setSubtitle(str);
        ratingAspectsButton.setOnClickListener(new com.avito.android.fakedoor_dialog.a(i12, 5, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(C0.b(viewGroup, R.layout.rating_aspects_button_viewholder_layout, viewGroup, false));
    }
}
