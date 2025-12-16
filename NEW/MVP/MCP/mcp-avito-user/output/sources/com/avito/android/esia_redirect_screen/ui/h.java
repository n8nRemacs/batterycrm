package com.avito.android.esia_redirect_screen.ui;

import Gz.C13934a;
import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.spinner.Spinner;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: EsiaRedirectRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/ui/h;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f148115a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f148116b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f148117c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C13934a f148118d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final NavBar f148119e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<RecyclerView> f148120f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<Spinner> f148121g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<ContentPlaceholder> f148122h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<ContentPlaceholder> f148123i;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k View view, @k Y41.a<G0> aVar, @k l<? super DeepLink, G0> lVar, @k com.avito.konveyor.adapter.d dVar, @k com.avito.konveyor.adapter.d dVar2, @k C13934a c13934a) {
        this.f148115a = lVar;
        this.f148116b = dVar;
        this.f148117c = dVar2;
        this.f148118d = c13934a;
        this.f148119e = (NavBar) view.findViewById(R.id.esia_redirect_nav_bar);
        Spinner spinner = (Spinner) view.findViewById(R.id.esia_redirect_loading);
        ContentPlaceholder contentPlaceholder = (ContentPlaceholder) view.findViewById(R.id.esia_redirect_error);
        ContentPlaceholder contentPlaceholder2 = (ContentPlaceholder) view.findViewById(R.id.esia_redirect_unauthorized);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.esia_redirect_content_rv);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.esia_redirect_buttons_rv);
        this.f148120f = C42745f0.U(recyclerView, recyclerView2);
        this.f148121g = Collections.singletonList(spinner);
        this.f148122h = Collections.singletonList(contentPlaceholder);
        this.f148123i = Collections.singletonList(contentPlaceholder2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setAdapter(dVar2);
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.esia_redirect_error_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.esia_redirect_error_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.esia_redirect_refresh, new Serializable[0]), new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(10, aVar)));
        contentPlaceholder2.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.esia_redirect_unauthorized_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.esia_redirect_unauthorized_subtitle, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.esia_redirect_refresh, new Serializable[0]), new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(11, aVar)));
    }
}
