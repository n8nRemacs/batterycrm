package com.avito.android.section.item;

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

/* compiled from: SectionAdvertItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/item/h;", "Lcom/avito/android/section/item/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f264729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<r> f264730b;

    /* compiled from: SectionAdvertItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/item/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/item/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, r> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.h f264731l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f264732m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.connection_quality.connectivity.a f264733n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.server_time.h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar) {
            super(2);
            this.f264731l = hVar;
            this.f264732m = locale;
            this.f264733n = aVar;
        }

        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) {
            return new r(view, this.f264733n, this.f264731l, this.f264732m, AsyncViewportTracker.ViewContext.f430433w);
        }
    }

    @Inject
    public h(@Y61.k m mVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f264729a = mVar;
        this.f264730b = new g.a<>(R.layout.section_advert_item, new a(hVar, locale, aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f264729a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r> b() {
        return this.f264730b;
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
            if (((AdvertItem) aVar).f268374D != SerpViewType.f268584d) {
                return true;
            }
        }
        return false;
    }
}
