package com.avito.android.search.filter.adapter.keywords.chips;

import Y61.k;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: KeywordsChipsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/adapter/keywords/chips/d;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/search/filter/adapter/keywords/chips/b;", "Lcom/avito/android/search/filter/adapter/keywords/chips/c;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<b> implements c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public List<String> f262447c = C42784z0.f406748b;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Integer> f262448d = new com.jakewharton.rxrelay3.c<>();

    @Override // com.avito.android.search.filter.adapter.keywords.chips.c
    public final void B(@k List<String> list) {
        C23424o.e eVarA = C23424o.a(new a(this.f262447c, list), true);
        this.f262447c = list;
        eVarA.b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f262447c.size();
    }

    @Override // com.avito.android.search.filter.adapter.keywords.chips.c
    @k
    public final C41981q0 h() {
        com.jakewharton.rxrelay3.c<Integer> cVar = this.f262448d;
        return l.l(cVar, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        String str = (String) C42745f0.K(i12, this.f262447c);
        if (str != null) {
            bVar.f262446b.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(C0.b(viewGroup, R.layout.keywords_chip_item, viewGroup, false), this.f262448d);
    }
}
