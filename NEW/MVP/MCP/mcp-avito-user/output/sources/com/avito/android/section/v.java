package com.avito.android.section;

import Oi0.InterfaceC14697a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35976x4;
import com.jakewharton.rxbinding4.view.C37722i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/section/v;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/s;", "LOi0/a;", "Lcom/avito/android/section/title/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v extends com.avito.konveyor.adapter.b implements s, InterfaceC14697a, com.avito.android.section.title.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f264916b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f264917c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.n f264918d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.f f264919e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f264920f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.section.title.e f264921g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f264922h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f264923i;

    /* renamed from: j, reason: collision with root package name */
    public final int f264924j;

    /* renamed from: k, reason: collision with root package name */
    public final int f264925k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.recyclerview.widget.P f264926l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f264927m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f264928n;

    public v(@Y61.k o oVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.android.favorite.n nVar, @Y61.k com.avito.android.advert.viewed.f fVar, @Y61.k View view, @Y61.k com.avito.android.section.title.e eVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k com.avito.android.section.complementary.a aVar3) {
        super(view);
        this.f264916b = oVar;
        this.f264917c = aVar;
        this.f264918d = nVar;
        this.f264919e = fVar;
        this.f264920f = view;
        this.f264921g = eVar;
        View viewFindViewById = view.findViewById(R.id.section_items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f264922h = recyclerView;
        this.f264924j = view.getResources().getDimensionPixelOffset(R.dimen.content_horizontal_padding);
        this.f264925k = view.getResources().getDimensionPixelOffset(R.dimen.rds_column_offset) / 2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f264927m = cVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        this.f264928n = jVar;
        recyclerView.l(aVar3, -1);
        recyclerView.setItemAnimator(null);
        jVar.setHasStableIds(true);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f264923i = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        cVar.b(C37722i.d(recyclerView).z0(1L).t0(new t(this)));
        I.a(linearLayoutManager);
    }

    public final void B80(androidx.recyclerview.widget.P p12) {
        androidx.recyclerview.widget.P p13 = this.f264926l;
        if (p13 != null) {
            p13.b(null);
        }
        RecyclerView recyclerView = this.f264922h;
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.o(new u(this));
        p12.b(recyclerView);
        this.f264926l = p12;
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f264922h);
    }

    @Override // com.avito.android.section.s
    @Y61.k
    /* renamed from: O9, reason: from getter */
    public final com.avito.android.advert.viewed.f getF264919e() {
        return this.f264919e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.section.s
    public final void U9() {
        this.f264922h.setScrollingTouchSlop(1);
        B80(new SV.b(this.f264924j, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.avito.android.section.s
    @Y61.k
    /* renamed from: V5, reason: from getter */
    public final com.avito.android.favorite.n getF264918d() {
        return this.f264918d;
    }

    @Override // com.avito.android.section.s
    public final void W0(int i12) {
        this.f264923i.b2(i12, this.f264924j);
    }

    @Override // com.avito.android.section.s
    public final void Wd() {
        this.f264922h.setScrollingTouchSlop(0);
        B80(new com.avito.android.section.complementary.g(this.f264925k));
    }

    @Override // com.avito.android.section.title.d
    public final void b(@Y61.l String str) {
        this.f264921g.b(str);
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f264922h.setAdapter(null);
        this.f264918d.I();
        this.f264919e.e0();
        this.f264927m.dispose();
    }

    @Override // com.avito.android.section.s
    public final void e8() {
        RecyclerView recyclerView = this.f264922h;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.j jVar = this.f264928n;
        if (adapter == null) {
            recyclerView.setAdapter(jVar);
        } else {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.section.title.d
    public final void j(@Y61.l String str) {
        this.f264921g.j(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f264922h.setAdapter(null);
        this.f264918d.I();
        this.f264919e.e0();
        this.f264927m.dispose();
    }

    @Override // com.avito.android.section.s
    public final void s(@Y61.k String str) {
        this.f264922h.setTag(str);
    }

    @Override // com.avito.android.section.s
    @Y61.k
    /* renamed from: zc, reason: from getter */
    public final com.avito.konveyor.adapter.a getF264917c() {
        return this.f264917c;
    }
}
