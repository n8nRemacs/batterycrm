package com.avito.android.similar_adverts.adapter;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34862u0;
import com.avito.android.serp.adapter.InterfaceC34748n0;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SimilarAdvertBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/adapter/b;", "Lcom/avito/android/similar_adverts/adapter/a;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.similar_adverts.adapter.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34748n0 f283800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.connection_quality.connectivity.a f283801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<C34862u0> f283802c;

    /* compiled from: SimilarAdvertBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/u0;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/u0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, C34862u0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.a f283803l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f283804m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b f283805n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.server_time.a aVar, Locale locale, b bVar) {
            super(2);
            this.f283803l = aVar;
            this.f283804m = locale;
            this.f283805n = bVar;
        }

        @Override // Y41.p
        public final C34862u0 invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            C34862u0 c34862u0 = new C34862u0(view2, this.f283805n.f283801b, this.f283803l, this.f283804m, AsyncViewportTracker.ViewContext.f430416f);
            View viewFindViewById = view2.findViewById(R.id.date);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            return c34862u0;
        }
    }

    @Inject
    public b(@k InterfaceC34748n0 interfaceC34748n0, @k com.avito.android.server_time.a aVar, @k Locale locale, @k com.avito.android.connection_quality.connectivity.a aVar2) {
        this.f283800a = interfaceC34748n0;
        this.f283801b = aVar2;
        this.f283802c = new g.a<>(R.layout.rds_advert_item_grid, new a(aVar, locale, this));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f283800a;
    }

    @Override // TV0.b
    @k
    public final g.a<C34862u0> b() {
        return this.f283802c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar.getClass().equals(AdvertItem.class)) {
            if (((AdvertItem) aVar).f268374D == SerpViewType.f268583c) {
                return true;
            }
        }
        return false;
    }
}
