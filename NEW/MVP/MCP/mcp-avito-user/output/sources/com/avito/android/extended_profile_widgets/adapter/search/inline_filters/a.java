package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import Aw0.InterfaceC13094a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.inline_filters.dialog.z;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineFiltersItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/a;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/m;", "Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/InlineFiltersItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<m, InlineFiltersItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f154627a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f154628b;

    /* compiled from: InlineFiltersItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.search.inline_filters.a$a, reason: collision with other inner class name */
    public static final class C4522a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Fragment f154629l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FragmentManager f154630m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f154631n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.onboarding_manager.a f154632o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.onboarding_manager.f f154633p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC30999b f154634q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ z f154635r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.select.i f154636s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.beduin_v2.feature.item.b f154637t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Screen f154638u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f154639v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13094a f154640w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41342b f154641x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ C36135w2 f154642y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4522a(Fragment fragment, FragmentManager fragmentManager, com.avito.android.util.text.a aVar, com.avito.android.onboarding_manager.a aVar2, com.avito.android.onboarding_manager.f fVar, InterfaceC30999b interfaceC30999b, z zVar, com.avito.android.select.i iVar, com.avito.android.lib.beduin_v2.feature.item.b bVar, Screen screen, ScreenPerformanceTracker screenPerformanceTracker, InterfaceC13094a interfaceC13094a, InterfaceC41342b interfaceC41342b, C36135w2 c36135w2) {
            super(2);
            this.f154629l = fragment;
            this.f154630m = fragmentManager;
            this.f154631n = aVar;
            this.f154632o = aVar2;
            this.f154633p = fVar;
            this.f154634q = interfaceC30999b;
            this.f154635r = zVar;
            this.f154636s = iVar;
            this.f154637t = bVar;
            this.f154638u = screen;
            this.f154639v = screenPerformanceTracker;
            this.f154640w = interfaceC13094a;
            this.f154641x = interfaceC41342b;
            this.f154642y = c36135w2;
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            InterfaceC41342b interfaceC41342b = this.f154641x;
            com.avito.beduin.v2.engine.component.z zVarH4 = interfaceC41342b.invoke().H4();
            InterfaceC27108f interfaceC27108fEd = interfaceC41342b.invoke().Ed();
            return new n(view, this.f154629l, this.f154630m, this.f154631n, this.f154632o, this.f154633p, this.f154634q, this.f154635r, this.f154636s, this.f154637t, this.f154638u, this.f154639v, this.f154640w, zVarH4, interfaceC27108fEd, this.f154642y);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k Fragment fragment, @NB.b @Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.onboarding_manager.a aVar2, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.k z zVar, @Y61.k com.avito.android.select.i iVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, @Y61.k InterfaceC41342b interfaceC41342b, @Y61.k C36135w2 c36135w2) {
        this.f154627a = cVar;
        this.f154628b = new g.a<>(R.layout.extended_profile_inline_filters_item, new C4522a(fragment, fragmentManager, aVar, aVar2, fVar, interfaceC30999b, zVar, iVar, bVar, screen, screenPerformanceTracker, interfaceC13094a, interfaceC41342b, c36135w2));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154627a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f154628b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof InlineFiltersItem;
    }
}
