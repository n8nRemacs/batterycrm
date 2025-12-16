package com.avito.android.beduin.ui.universal;

import Hr.InterfaceC14024a;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalBeduinViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/q;", "Landroidx/lifecycle/P0$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.g f104533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28481c f104534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.r f104535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D f104536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f104537e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f104538f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f104539g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Screen f104540h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f104541i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f104542j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.ui.universal.beduin.a f104543k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Wi.b f104544l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.actionhandler.set_navigation_bar.a f104545m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ScreenPerformanceTracker f104546n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kj.d f104547o;

    @Inject
    public q(@Y61.k InterfaceC14024a interfaceC14024a, @Y61.k Wi.b bVar, @Y61.l Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar, @Y61.k D d12, @Y61.k InterfaceC28481c interfaceC28481c, @Y61.l ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.beduin.common.g gVar, @Y61.k com.avito.android.beduin.common.actionhandler.set_navigation_bar.a aVar, @Y61.k com.avito.android.beduin.ui.universal.beduin.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @com.avito.android.beduin.ui.universal.di.a @Y61.l Long l12, @Y61.l String str, @Y61.k kj.d dVar) {
        this.f104533a = gVar;
        this.f104534b = interfaceC28481c;
        this.f104535c = rVar;
        this.f104536d = d12;
        this.f104537e = interfaceC14024a;
        this.f104538f = interfaceC40691b;
        this.f104539g = l12;
        this.f104540h = screen;
        this.f104541i = str;
        this.f104542j = interfaceC35745a5;
        this.f104543k = aVar2;
        this.f104544l = bVar;
        this.f104545m = aVar;
        this.f104546n = screenPerformanceTracker;
        this.f104547o = dVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        com.avito.android.beduin.common.g gVar = this.f104533a;
        InterfaceC28481c interfaceC28481c = this.f104534b;
        D d12 = this.f104536d;
        InterfaceC14024a interfaceC14024a = this.f104537e;
        InterfaceC40691b interfaceC40691b = this.f104538f;
        kj.d dVar = this.f104547o;
        InterfaceC35745a5 interfaceC35745a5 = this.f104542j;
        com.avito.android.analytics.screens.r rVar = this.f104535c;
        Long l12 = this.f104539g;
        String str = this.f104541i;
        return new m(interfaceC14024a, this.f104544l, this.f104540h, rVar, d12, interfaceC28481c, this.f104546n, gVar, this.f104545m, this.f104543k, interfaceC35745a5, interfaceC40691b, l12, str, dVar);
    }
}
