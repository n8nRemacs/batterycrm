package com.avito.android.serp.adapter.service_trust_grid;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertGridServiceTrustItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/service_trust_grid/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/service_trust_grid/f;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<f, AdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f272212a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f272213b;

    /* compiled from: AdvertGridServiceTrustItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/service_trust_grid/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/service_trust_grid/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.service_trust_grid.a$a, reason: collision with other inner class name */
    public static final class C8084a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.h f272214l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f272215m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.connection_quality.connectivity.a f272216n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8084a(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar) {
            super(2);
            this.f272214l = hVar;
            this.f272215m = locale;
            this.f272216n = aVar;
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, this.f272214l, this.f272215m, this.f272216n, AsyncViewportTracker.ViewContext.f430413c, null, 32, null);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.server_time.h hVar, @k Locale locale, @k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f272212a = cVar;
        this.f272213b = new g.a<>(R.layout.advert_item_grid_service_trust, new C8084a(hVar, locale, aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272212a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f272213b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AdvertItem) && ((AdvertItem) aVar).f268378F.isServiceTrustGrid();
    }
}
