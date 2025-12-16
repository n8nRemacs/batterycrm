package com.avito.android.select.sectioned_multiselect.Items.section_list;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_list/g;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.e f266402b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f266403c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f266404d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f266405e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public Object f266406f;

    public g(@k View view, @k com.avito.android.recycler.data_aware.e eVar, @k com.avito.konveyor.a aVar) {
        super(view);
        this.f266402b = eVar;
        this.f266403c = (TextView) view.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.section_list);
        this.f266406f = C42784z0.f406748b;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f266404d = hVar;
        j jVar = new j(hVar, aVar);
        this.f266405e = jVar;
        recyclerView.setAdapter(jVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.select.sectioned_multiselect.Items.section_list.f
    public final void B(@l List<com.avito.android.select.sectioned_multiselect.Items.section_item.a> list) {
        if (list != null) {
            UV0.c cVar = new UV0.c(this.f266406f);
            UV0.c cVar2 = new UV0.c(list);
            this.f266406f = list;
            this.f266404d.f338510e = cVar2;
            this.f266402b.a(cVar, cVar2).a(this.f266405e);
        }
    }

    @Override // com.avito.android.select.sectioned_multiselect.Items.section_list.f
    public final void setTitle(@k String str) {
        this.f266403c.setText(str);
    }
}
