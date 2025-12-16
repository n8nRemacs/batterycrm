package com.avito.android.recycler.responsive;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResponsiveAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recycler/responsive/f;", "Lcom/avito/konveyor/adapter/a;", "Lcom/avito/android/recycler/responsive/e;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.konveyor.adapter.a, e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f252361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f252362c;

    @Inject
    public f(@k com.avito.konveyor.adapter.a aVar, @k a aVar2) {
        this.f252361b = aVar2;
        this.f252362c = aVar;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void a(@k RecyclerView.Adapter<com.avito.konveyor.adapter.b> adapter, @k com.avito.konveyor.adapter.b bVar) {
        this.f252362c.a(adapter, bVar);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int b(int i12) {
        return this.f252362c.b(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void c(@k UV0.a<? extends TV0.a> aVar) {
        this.f252362c.c(aVar);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void d(@k com.avito.konveyor.adapter.b bVar) {
        this.f252362c.d(bVar);
    }

    @Override // com.avito.konveyor.adapter.a
    public final void e(@k com.avito.konveyor.adapter.b bVar, int i12, @k List list) {
        this.f252362c.e(bVar, i12, list);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int getCount() {
        return this.f252362c.getCount();
    }

    @Override // com.avito.konveyor.adapter.a
    public final long getItemId(int i12) {
        return this.f252362c.getItemId(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final boolean isEmpty() {
        return this.f252362c.isEmpty();
    }

    @Override // com.avito.android.recycler.responsive.e
    public final void r0(@k com.avito.konveyor.adapter.b bVar, int i12) {
        this.f252361b.a(bVar, i12);
    }

    @Override // com.avito.android.recycler.responsive.e
    public final void t0(@k com.avito.konveyor.adapter.b bVar, int i12) {
        this.f252361b.b(bVar, i12);
    }
}
