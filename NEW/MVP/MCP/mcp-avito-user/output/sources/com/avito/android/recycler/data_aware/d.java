package com.avito.android.recycler.data_aware;

import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: DataAwareAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recycler/data_aware/d;", "Lcom/avito/android/recycler/data_aware/c;", "Lcom/avito/konveyor/adapter/a;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c, com.avito.konveyor.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<C> f252340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f252341c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f252342d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public UV0.a<? extends TV0.a> f252343e = new UV0.c(C42784z0.f406748b);

    @Inject
    public d(@Y61.k h31.e<C> eVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k e eVar2) {
        this.f252340b = eVar;
        this.f252341c = aVar;
        this.f252342d = eVar2;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void a(@Y61.k RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter, @Y61.k com.avito.konveyor.adapter.b bVar) {
        this.f252341c.a(adapter, bVar);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int b(int i12) {
        return this.f252341c.b(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void c(@Y61.k UV0.a<? extends TV0.a> aVar) {
        this.f252341c.c(aVar);
        C23424o.e eVarA = this.f252342d.a(this.f252343e, aVar);
        this.f252343e = aVar;
        eVarA.a(this.f252340b.get());
    }

    @Override // com.avito.konveyor.adapter.a
    public final void d(@Y61.k com.avito.konveyor.adapter.b bVar) {
        this.f252341c.d(bVar);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void e(@Y61.k com.avito.konveyor.adapter.b bVar, int i12, @Y61.k List list) {
        this.f252341c.e(bVar, i12, list);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int getCount() {
        return this.f252341c.getCount();
    }

    @Override // com.avito.konveyor.adapter.a
    public final long getItemId(int i12) {
        return this.f252341c.getItemId(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final boolean isEmpty() {
        return this.f252341c.isEmpty();
    }
}
