package com.avito.android.vas_performance.ui.visual_legacy;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.I;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VisualVasViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/n;", "Landroidx/lifecycle/P0$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f322117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322118b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f322119c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I f322120d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322121e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TL0.d f322122f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f322123g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322124h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f322125i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<G0, P2<HL0.b>> f322126j;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k I i12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k TL0.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, boolean z12, @Y61.k com.avito.android.preloading.j<G0, ? extends P2<? super HL0.b>> jVar) {
        this.f322117a = str;
        this.f322118b = str2;
        this.f322119c = aVar;
        this.f322120d = i12;
        this.f322121e = interfaceC35745a5;
        this.f322122f = dVar;
        this.f322123g = aVar2;
        this.f322124h = interfaceC28373a;
        this.f322125i = z12;
        this.f322126j = jVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(p.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new p(this.f322117a, this.f322118b, this.f322119c, this.f322120d, this.f322121e, this.f322122f, this.f322123g, this.f322124h, this.f322125i, this.f322126j);
    }
}
