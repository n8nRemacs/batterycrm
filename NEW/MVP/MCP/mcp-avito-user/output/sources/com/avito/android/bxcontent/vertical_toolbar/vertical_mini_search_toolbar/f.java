package com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar;

import Xr0.InterfaceC17042a;
import Y61.l;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.serp.adapter.vertical_main.mini_search_widget.MiniSearchWidgetItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import tl.InterfaceC48685a;

/* compiled from: VerticalMiniSearchToolbarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/vertical_mini_search_toolbar/f;", "Lcom/avito/android/bxcontent/vertical_toolbar/vertical_mini_search_toolbar/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f113200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f113201c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17042a f113202d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public i f113203e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public BxContentFragment.E f113204f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC48685a f113205g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public MiniSearchWidgetItem f113206h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public com.avito.android.serp.adapter.vertical_main.mini_search_widget.b f113207i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f113208j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f113209k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f113210l;

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC17042a interfaceC17042a) {
        this.f113200b = aVar;
        this.f113201c = gVar;
        this.f113202d = interfaceC17042a;
        new com.jakewharton.rxrelay3.c();
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f113209k = z1A;
        this.f113210l = C43175k.b(z1A);
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a
    public final void B(@Y61.k i iVar, @Y61.k BxContentFragment.E e12, @Y61.k InterfaceC48685a interfaceC48685a) {
        this.f113203e = iVar;
        this.f113204f = e12;
        this.f113205g = interfaceC48685a;
        this.f113207i = new com.avito.android.serp.adapter.vertical_main.mini_search_widget.b(iVar.getActionView());
        io.reactivex.rxjava3.disposables.d dVarT0 = iVar.getF113110q().t0(new b(interfaceC48685a));
        io.reactivex.rxjava3.disposables.c cVar = this.f113208j;
        cVar.b(dVarT0);
        cVar.b(iVar.getF113114u().t0(new c(interfaceC48685a)));
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f113210l;
    }

    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a
    public final void f0() {
        this.f113209k.setValue(null);
        this.f113208j.e();
        this.f113203e = null;
        this.f113204f = null;
        this.f113206h = null;
        this.f113207i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    @Override // com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(@Y61.l com.avito.android.serp.adapter.l1 r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.vertical_toolbar.vertical_mini_search_toolbar.f.h(com.avito.android.serp.adapter.l1):void");
    }
}
