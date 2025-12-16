package com.avito.android.location_list;

import android.R;
import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.L5;
import com.avito.android.util.N0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/k0;", "Lcom/avito/android/location_list/g0;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k0 implements g0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f182055b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f182056c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f182057d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Toolbar f182058e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final EditText f182059f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.app.m f182060g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f182061h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ProgressDialog f182062i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f182063j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ImageButton f182064k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f182065l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f182066m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f182067n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f182068o;

    public k0(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f182055b = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f182056c = recyclerView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.empty);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f182057d = viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(com.avito.android.R.id.toolbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById3;
        this.f182058e = toolbar;
        androidx.appcompat.app.m mVar = (androidx.appcompat.app.m) viewGroup.getContext();
        this.f182060g = mVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        this.f182063j = jVar;
        this.f182065l = new com.jakewharton.rxrelay3.c<>();
        this.f182066m = new com.jakewharton.rxrelay3.c<>();
        this.f182067n = new com.jakewharton.rxrelay3.c<>();
        this.f182068o = new com.jakewharton.rxrelay3.c<>();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        jVar.setHasStableIds(true);
        toolbar.m(com.avito.android.R.menu.region_list);
        com.avito.android.ui.d.b(toolbar, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 24));
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.location_list.h0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k0 f182049c;

            {
                this.f182049c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f182049c.f182068o.accept(G0.f406611a);
                        break;
                    default:
                        this.f182049c.f182059f.setText("");
                        break;
                }
            }
        });
        View viewInflate = LayoutInflater.from(mVar).inflate(com.avito.android.R.layout.select_dialog_search_view, (ViewGroup) toolbar, true);
        View viewFindViewById4 = viewInflate.findViewById(com.avito.android.R.id.select_dialog_search_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
        }
        EditText editText = (EditText) viewFindViewById4;
        this.f182059f = editText;
        View viewFindViewById5 = viewInflate.findViewById(com.avito.android.R.id.select_dialog_search_view_clear);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById5;
        this.f182064k = imageButton;
        D6.w(imageButton);
        editText.setHint(com.avito.android.R.string.region_or_city);
        final int i13 = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.location_list.h0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k0 f182049c;

            {
                this.f182049c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f182049c.f182068o.accept(G0.f406611a);
                        break;
                    default:
                        this.f182049c.f182059f.setText("");
                        break;
                }
            }
        });
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, com.avito.android.R.id.content, interfaceC28373a, 0, 0, 24, null);
        this.f182061h = lVar;
        lVar.h(this);
    }

    public final void a() {
        N0.a(this.f182062i);
    }

    public final void b() {
        K2.c(this.f182060g);
    }

    public final void c() {
        this.f182056c.F0(0);
    }

    public final void d() {
        L5.a(this.f182060g, com.avito.android.R.string.no_found_location_search_message, 0);
    }

    @Override // com.avito.android.progress_overlay.g
    public final void j0() {
        this.f182066m.accept(G0.f406611a);
    }
}
