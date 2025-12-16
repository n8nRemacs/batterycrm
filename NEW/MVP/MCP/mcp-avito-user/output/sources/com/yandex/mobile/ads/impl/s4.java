package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class s4 implements ey, p31 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ViewGroup f389768a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final InterfaceC39323f1 f389769b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final pl f389770c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final List<v4> f389771d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ExtendedNativeAdView f389772e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final C39319e1 f389773f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final gv0 f389774g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final d01 f389775h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    private final ArrayList f389776i;

    /* renamed from: j, reason: collision with root package name */
    private final long f389777j;

    /* renamed from: k, reason: collision with root package name */
    private int f389778k;

    public final class a implements k2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.k2
        public final void a() {
            s4.this.a();
        }

        @Override // com.yandex.mobile.ads.impl.k2
        public final void b() {
            s4.this.a();
        }
    }

    @X41.j
    public s4(@Y61.k Context context, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k o01 o01Var, @Y61.l ArrayList arrayList, @Y61.l vq vqVar, @Y61.k ViewGroup viewGroup, @Y61.k InterfaceC39323f1 interfaceC39323f1, @Y61.k pl plVar, @Y61.k z80 z80Var, @Y61.k List list, @Y61.k ExtendedNativeAdView extendedNativeAdView, @Y61.k C39319e1 c39319e1, @Y61.k gv0 gv0Var, @Y61.k d01 d01Var) {
        this.f389768a = viewGroup;
        this.f389769b = interfaceC39323f1;
        this.f389770c = plVar;
        this.f389771d = list;
        this.f389772e = extendedNativeAdView;
        this.f389773f = c39319e1;
        this.f389774g = gv0Var;
        this.f389775h = d01Var;
        Iterator it = list.iterator();
        long jA2 = 0;
        while (it.hasNext()) {
            jA2 += ((v4) it.next()).a();
        }
        this.f389777j = jA2;
        this.f389776i = z80Var.a(context, this.f389772e, uVar, new a(), o01Var, this.f389774g, new u4(context, this), arrayList, vqVar, this.f389771d);
    }

    @Override // com.yandex.mobile.ads.impl.p31
    public final void a() {
        v4 v4Var = (v4) C42745f0.K(this.f389778k - 1, this.f389771d);
        this.f389774g.a(v4Var != null ? v4Var.a() : 0L);
        if (this.f389778k >= this.f389776i.size()) {
            this.f389769b.b();
            return;
        }
        int i12 = this.f389778k;
        this.f389778k = i12 + 1;
        if (((y80) this.f389776i.get(i12)).a()) {
            this.f389775h.a(this.f389772e, this.f389777j, this.f389774g.a());
        } else if (this.f389778k >= this.f389776i.size()) {
            this.f389770c.e();
        } else {
            a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ey
    public final void c() {
        ViewGroup viewGroup = this.f389768a;
        ExtendedNativeAdView extendedNativeAdView = this.f389772e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        if (this.f389773f.a(this.f389772e)) {
            this.f389778k = 1;
            y80 y80Var = (y80) C42745f0.G(this.f389776i);
            if (y80Var != null ? y80Var.a() : false) {
                this.f389775h.a(this.f389772e, this.f389777j, this.f389774g.a());
            } else if (this.f389778k >= this.f389776i.size()) {
                this.f389770c.e();
            } else {
                a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ey
    public final void invalidate() {
        Iterator it = this.f389776i.iterator();
        while (it.hasNext()) {
            ((y80) it.next()).b();
        }
        this.f389773f.getClass();
    }

    public /* synthetic */ s4(Context context, com.yandex.mobile.ads.nativeads.u uVar, o01 o01Var, ArrayList arrayList, vq vqVar, ViewGroup viewGroup, InterfaceC39323f1 interfaceC39323f1, pl plVar, z80 z80Var, List list) {
        this(context, uVar, o01Var, arrayList, vqVar, viewGroup, interfaceC39323f1, plVar, z80Var, list, new ExtendedNativeAdView(context), new C39319e1(uVar, plVar), new gv0(), new d01(new n91()));
    }
}
