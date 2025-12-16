package com.avito.android.select.sectioned_multiselect.tab;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectTabViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/t;", "Lcom/avito/android/select/sectioned_multiselect/tab/s;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f266813a;

    public t(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.recycler.data_aware.c cVar) {
        this.f266813a = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.section_list);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(jVar);
    }

    public final void a(@Y61.k ArrayList arrayList) {
        com.avito.konveyor.util.a.a(this.f266813a, arrayList);
    }
}
