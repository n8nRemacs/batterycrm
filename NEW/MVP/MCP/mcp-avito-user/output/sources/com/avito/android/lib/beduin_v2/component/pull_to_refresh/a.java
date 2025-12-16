package com.avito.android.lib.beduin_v2.component.pull_to_refresh;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.akita.view.component.pull_to_refresh.PullToRefresh;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.pull_to_refresh.a;
import com.avito.beduin.v2.avito.component.pull_to_refresh.h;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.C36341k;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import i3.C41216a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PullToRefreshComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00040\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/pull_to_refresh/a;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a;", "Lcom/akita/view/component/pull_to_refresh/PullToRefresh;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "a", "_design-modules_beduin-v2_renderer_component_pull-to-refresh"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends q<com.avito.beduin.v2.avito.component.pull_to_refresh.a, PullToRefresh, a.C10377a> implements s.c<a.C10377a> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f175865m;

    /* renamed from: n, reason: collision with root package name */
    public s<a.C10377a> f175866n;

    /* compiled from: PullToRefreshComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/pull_to_refresh/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_pull-to-refresh"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.pull_to_refresh.a$a, reason: collision with other inner class name */
    public static final class C5197a extends n<com.avito.beduin.v2.avito.component.pull_to_refresh.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5197a f175867c = new C5197a();

        public C5197a() {
            super(h.f334869c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a(a12);
        }
    }

    public a(@k A a12) {
        super(null, 1, null);
        this.f175865m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
        return ((a.C10377a) interfaceC36244d).f334861b.equals(((a.C10377a) interfaceC36244d2).f334861b);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ET0.b bVar = ((a.C10377a) interfaceC36244d).f334861b.f334862a;
        layoutParams.setMargins(bVar != null ? y6.b(bVar.f4016a) : 0, bVar != null ? y6.b(bVar.f4019d) : 0, bVar != null ? y6.b(bVar.f4017b) : 0, bVar != null ? y6.b(bVar.f4018c) : 0);
        return layoutParams;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.c
    public final /* bridge */ /* synthetic */ boolean h(InterfaceC36244d interfaceC36244d) {
        return true;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        PullToRefresh pullToRefresh = (PullToRefresh) view;
        com.avito.beduin.v2.avito.component.pull_to_refresh.a aVar = (com.avito.beduin.v2.avito.component.pull_to_refresh.a) obj;
        s<a.C10377a> sVar = this.f175866n;
        if (sVar == null) {
            sVar = null;
        }
        s.a(b.f175868l, sVar, kVar, C42745f0.V(aVar.f334854e));
        M.a(pullToRefresh, aVar.f334855f);
        pullToRefresh.setStyle((C41216a) D.a(aVar.f334850a, kVar));
        boolean zBooleanValue = aVar.f334853d.booleanValue();
        Y41.a aVar2 = aVar.f334852c;
        if (aVar2 == null) {
            aVar2 = c.f175869l;
        }
        pullToRefresh.setState(new com.akita.view.component.pull_to_refresh.state.a(aVar.f334851b, zBooleanValue, aVar2));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        PullToRefresh pullToRefresh = new PullToRefresh(viewGroup.getContext(), null, 0, 0, 14, null);
        A a12 = this.f175865m;
        this.f175866n = new s<>(a12, a12.f337907c, new C36341k(pullToRefresh), this, R.id.pull_to_refresh_component, this);
        return pullToRefresh;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<a.C10377a> sVar = this.f175866n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
