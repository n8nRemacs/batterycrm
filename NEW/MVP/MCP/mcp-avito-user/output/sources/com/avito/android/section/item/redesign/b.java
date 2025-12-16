package com.avito.android.section.item.redesign;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ComplementaryAdvertRedesignBottomSheetItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/item/redesign/b;", "Lcom/avito/android/section/item/redesign/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.section.item.redesign.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f264757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f264758b;

    /* compiled from: ComplementaryAdvertRedesignBottomSheetItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/item/redesign/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/item/redesign/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.h f264759l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f264760m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.connection_quality.connectivity.a f264761n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar) {
            super(2);
            this.f264759l = hVar;
            this.f264760m = locale;
            this.f264761n = aVar;
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
            m mVar = new m(view, this.f264759l, this.f264760m, this.f264761n);
            mVar.hf(1.0f);
            return mVar;
        }
    }

    @Inject
    public b(@Y61.k g gVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f264757a = gVar;
        this.f264758b = new g.a<>(R.layout.advert_item_grid_complementary_redesign_item, new a(hVar, locale, aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f264757a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f264758b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertItem) {
            if (((AdvertItem) aVar).f268374D == SerpViewType.f268583c) {
                return true;
            }
        }
        return false;
    }
}
