package com.avito.android.rating_form.item.description;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/description/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/description/j;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f248387c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f248388d;

    public k(@Y61.k View view, boolean z12) {
        super(view);
        this.f248386b = z12;
        View viewFindViewById = view.findViewById(R.id.description_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248387c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description_list_values);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f248388d = (RecyclerView) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.description.j
    public final void B(@l List<String> list) {
        RecyclerView recyclerView = this.f248388d;
        if (list == null) {
            D6.w(recyclerView);
            return;
        }
        D6.H(recyclerView);
        b bVar = new b(this.f248386b);
        bVar.f248371d = list;
        bVar.notifyDataSetChanged();
        recyclerView.setAdapter(bVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // com.avito.android.rating_form.item.description.j
    public final void setTitle(@l String str) {
        I5.a(this.f248387c, str, false);
    }
}
