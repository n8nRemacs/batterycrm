package com.avito.android.serp.adapter.model_card;

import Y41.q;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.seller_promotions.o;
import com.avito.android.serp.adapter.model_card.item.ModelCardWidgetItem;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ModelCardWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/m;", "Lcom/avito/android/serp/adapter/model_card/l;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.android.serp.c implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f270435e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f270436b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f270437c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.model_card.item.a f270438d;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270436b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270437c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.modelsRecyclerView);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        com.avito.android.serp.adapter.model_card.item.a aVar = new com.avito.android.serp.adapter.model_card.item.a(null, null, 3, null);
        this.f270438d = aVar;
        recyclerView.setAdapter(aVar);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.c2(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.l(new com.avito.android.serp.adapter.model_card.item.b(), -1);
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void F40(@Y61.k Y41.a<G0> aVar) {
        this.f270436b.setOnClickListener(new o(21, aVar));
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void b(@Y61.k String str) {
        this.f270436b.setText(str);
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void eh(int i12) {
        this.f270436b.setCompoundDrawablesWithIntrinsicBounds(0, 0, i12, 0);
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void fX(@Y61.k q<? super String, ? super Integer, ? super DeepLink, G0> qVar) {
        this.f270438d.f270422c = qVar;
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void j(@Y61.l String str) {
        I5.a(this.f270437c, str, false);
    }

    @Override // com.avito.android.serp.adapter.model_card.l
    public final void s1(@Y61.k List<ModelCardWidgetItem> list) {
        com.avito.android.serp.adapter.model_card.item.a aVar = this.f270438d;
        List<ModelCardWidgetItem> list2 = aVar.f270423d;
        list2.clear();
        list2.addAll(list);
        aVar.notifyDataSetChanged();
    }
}
