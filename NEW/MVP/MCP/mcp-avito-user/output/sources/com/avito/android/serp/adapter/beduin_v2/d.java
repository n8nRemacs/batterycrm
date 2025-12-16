package com.avito.android.serp.adapter.beduin_v2;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.engine.component.z;
import iT.InterfaceC41342b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2ItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/d;", "LTV0/b;", "Lcom/avito/android/serp/adapter/beduin_v2/f;", "Lcom/avito/android/serp/adapter/beduin_v2/BeduinV2Item;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.b<f, BeduinV2Item> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Screen f269004a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f269005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.b f269006c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC41342b f269007d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C36135w2 f269008e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f269009f = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g.a<g> f269010g = new g.a<>(R.layout.beduin_v2_item, new a());

    /* compiled from: BeduinV2ItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/beduin_v2/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/beduin_v2/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            d dVar = d.this;
            Screen screen = dVar.f269004a;
            InterfaceC41342b interfaceC41342b = dVar.f269007d;
            z zVarH4 = interfaceC41342b.invoke().H4();
            InterfaceC27108f interfaceC27108fEd = interfaceC41342b.invoke().Ed();
            return new g(view2, screen, dVar.f269005b, dVar.f269006c, zVarH4, interfaceC27108fEd, dVar.f269008e);
        }
    }

    @Inject
    public d(@k Screen screen, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k InterfaceC41342b interfaceC41342b, @k C36135w2 c36135w2) {
        this.f269004a = screen;
        this.f269005b = screenPerformanceTracker;
        this.f269006c = bVar;
        this.f269007d = interfaceC41342b;
        this.f269008e = c36135w2;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, BeduinV2Item> a() {
        return this.f269009f;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f269010g;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof BeduinV2Item;
    }
}
