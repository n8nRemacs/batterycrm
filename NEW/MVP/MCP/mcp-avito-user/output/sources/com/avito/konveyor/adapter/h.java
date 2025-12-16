package com.avito.konveyor.adapter;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.konveyor.adapter.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: SimpleAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/konveyor/adapter/h;", "Lcom/avito/konveyor/adapter/a;", "Lcom/avito/konveyor/adapter/i;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.konveyor.adapter.a, i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TV0.h f338507b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TV0.d<TV0.e, TV0.a> f338508c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f338509d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public UV0.a<? extends TV0.a> f338510e;

    /* compiled from: SimpleAdapterPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TV0.a f338512m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TV0.a aVar) {
            super(0);
            this.f338512m = aVar;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(h.this.f338507b.O(this.f338512m));
        }
    }

    public h() {
        throw null;
    }

    public h(TV0.h hVar, TV0.d dVar, f fVar, int i12, C42822w c42822w) {
        fVar = (i12 & 4) != 0 ? new f.a() : fVar;
        this.f338507b = hVar;
        this.f338508c = dVar;
        this.f338509d = fVar;
        this.f338510e = new UV0.c(C42784z0.f406748b);
    }

    @Override // com.avito.konveyor.adapter.a
    public final int b(int i12) {
        TV0.a item = this.f338510e.getItem(i12);
        return ((Number) this.f338509d.a("getViewItemType:#".concat(item.getClass().getSimpleName()), new a(item))).intValue();
    }

    @Override // com.avito.konveyor.adapter.a
    public final void c(@k UV0.a<? extends TV0.a> aVar) {
        this.f338510e = aVar;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void e(@k b bVar, int i12, @k List list) {
        TV0.a item = getItem(i12);
        this.f338509d.a("onBindViewHolder:#".concat(item.getClass().getSimpleName()), new g(this, bVar, item, i12, list));
    }

    @Override // com.avito.konveyor.adapter.a
    public final int getCount() {
        return this.f338510e.getCount();
    }

    @Override // com.avito.konveyor.adapter.i
    @k
    public final TV0.a getItem(int i12) {
        return this.f338510e.getItem(i12);
    }

    @Override // com.avito.konveyor.adapter.a
    public final long getItemId(int i12) {
        return getItem(i12).getId();
    }

    @Override // com.avito.konveyor.adapter.a
    public final boolean isEmpty() {
        return this.f338510e.getCount() == 0;
    }

    @Override // com.avito.konveyor.adapter.a
    public final void d(@k b bVar) {
    }

    @Override // com.avito.konveyor.adapter.a
    public final void a(@k RecyclerView.Adapter<b> adapter, @k b bVar) {
    }
}
