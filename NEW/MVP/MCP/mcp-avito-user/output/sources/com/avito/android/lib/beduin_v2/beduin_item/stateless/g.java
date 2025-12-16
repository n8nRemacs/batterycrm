package com.avito.android.lib.beduin_v2.beduin_item.stateless;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.beduin.v2.engine.component.B;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinItemBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/g;", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/b;", "_design-modules_beduin-v2_beduin-item_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f175463a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C<x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent>> f175464b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f175465c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final aU0.b f175466d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final B f175467e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f175468f = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f175469g = new g.a<>(R.layout.beduin_item_layout, new a());

    /* compiled from: BeduinItemBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            FrameLayout frameLayout = (FrameLayout) view;
            g gVar = g.this;
            x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> value = gVar.f175464b.getValue();
            return new j(frameLayout, gVar.f175465c, gVar.f175466d, gVar.f175467e, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k String str, @k InterfaceC42726C<? extends x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> interfaceC42726C, @k ScreenPerformanceTracker screenPerformanceTracker, @k aU0.b bVar, @k B b12) {
        this.f175463a = str;
        this.f175464b = interfaceC42726C;
        this.f175465c = screenPerformanceTracker;
        this.f175466d = bVar;
        this.f175467e = b12;
    }

    @Override // TV0.b
    @k
    public final TV0.d<h, com.avito.android.lib.beduin_v2.beduin_item.stateless.a> a() {
        return this.f175468f;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f175469g;
    }

    @Override // TV0.b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF175463a() {
        return this.f175463a;
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof com.avito.android.lib.beduin_v2.beduin_item.stateless.a) && L.f(((com.avito.android.lib.beduin_v2.beduin_item.stateless.a) aVar).f175462c, this.f175463a);
    }
}
