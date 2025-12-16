package com.avito.android.section.item;

import TV0.g;
import Tp0.InterfaceC15393c;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.di.module.Q2;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.C34862u0;
import com.avito.android.serp.adapter.InterfaceC34748n0;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ComplementaryAdvertItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/item/b;", "Lcom/avito/android/section/item/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.section.item.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34748n0 f264705a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f264706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f264707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<C34862u0> f264708d;

    /* compiled from: ComplementaryAdvertItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/u0;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/u0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, C34862u0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.server_time.h f264709l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f264710m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b f264711n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.server_time.h hVar, Locale locale, b bVar) {
            super(2);
            this.f264709l = hVar;
            this.f264710m = locale;
            this.f264711n = bVar;
        }

        @Override // Y41.p
        public final C34862u0 invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            b bVar = this.f264711n;
            C34862u0 c34862u0 = new C34862u0(view2, bVar.f264707c, this.f264709l, this.f264710m, AsyncViewportTracker.ViewContext.f430416f);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = bVar.f264706b.a(SerpViewType.f268583c);
            view2.setLayoutParams(layoutParams);
            View viewFindViewById = view2.findViewById(R.id.date);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            return c34862u0;
        }
    }

    @Inject
    public b(@Y61.k @Q2 InterfaceC34748n0 interfaceC34748n0, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @InterfaceC15393c @Y61.k s sVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f264705a = interfaceC34748n0;
        this.f264706b = sVar;
        this.f264707c = aVar;
        this.f264708d = new g.a<>(R.layout.rds_advert_item_grid, new a(hVar, locale, this));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f264705a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C34862u0> b() {
        return this.f264708d;
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
            AdvertItem advertItem = (AdvertItem) aVar;
            if (advertItem.f268374D == SerpViewType.f268583c && !advertItem.f268405S0) {
                return true;
            }
        }
        return false;
    }
}
