package com.avito.android.home.tags_item;

import Oi0.C14700d;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionTagsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/tags_item/k;", "Lcom/avito/android/home/tags_item/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f162507b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14700d f162508c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f162509d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f162510e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UV0.c<SectionTag> f162511f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f162512g;

    /* compiled from: SectionTagsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/home/tags_item/k$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f162513b;

        public a(Y41.a<G0> aVar) {
            this.f162513b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                ((e) this.f162513b).invoke();
            }
        }
    }

    public k(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C14700d c14700d) {
        super(view);
        this.f162507b = hVar;
        this.f162508c = c14700d;
        com.avito.android.home.tags_item.tag.a aVar = new com.avito.android.home.tags_item.tag.a(view.getResources());
        RecyclerView recyclerView = (RecyclerView) view;
        this.f162509d = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f162510e = arrayList;
        this.f162511f = new UV0.c<>(arrayList);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(c14700d);
        recyclerView.l(aVar, -1);
    }

    @Override // com.avito.android.home.tags_item.j
    public final void cc() {
        this.f162509d.A0(0);
    }

    @Override // com.avito.android.home.tags_item.j
    public final void d(@l Y41.a<G0> aVar) {
        this.f162512g = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f162509d.s();
        Y41.a<G0> aVar = this.f162512g;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f162512g = null;
    }

    @Override // com.avito.android.home.tags_item.j
    @SuppressLint({"NotifyDataSetChanged"})
    public final void qY(@Y61.k SectionTagsItem sectionTagsItem, @l Parcelable parcelable, @Y61.k Y41.a<G0> aVar) {
        RecyclerView recyclerView = this.f162509d;
        recyclerView.s();
        ArrayList arrayList = this.f162510e;
        arrayList.clear();
        arrayList.addAll(sectionTagsItem.f270152d);
        this.f162507b.f338510e = this.f162511f;
        this.f162508c.notifyDataSetChanged();
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
        recyclerView.o(new a(aVar));
    }

    @Override // com.avito.android.home.tags_item.j
    @l
    public final Parcelable uY() {
        RecyclerView.m layoutManager = this.f162509d.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.Y0();
        }
        return null;
    }
}
