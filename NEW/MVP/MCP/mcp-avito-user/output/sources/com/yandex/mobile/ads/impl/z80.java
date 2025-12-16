package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class z80 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final AdResponse<?> f392203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pl f392204b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final C39362s0 f392205c;

    /* renamed from: d, reason: collision with root package name */
    private final int f392206d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final InterfaceC39377x0 f392207e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final a90 f392208f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final NativeAdEventListener f392209g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final pn f392210h;

    public z80(@Y61.k Context context, @Y61.k AdResponse adResponse, @Y61.k pl plVar, @Y61.k C39362s0 c39362s0, int i12, @Y61.k C39311c1 c39311c1, @Y61.k a90 a90Var, @Y61.k NativeAdEventListener nativeAdEventListener, @Y61.k pn pnVar) {
        this.f392203a = adResponse;
        this.f392204b = plVar;
        this.f392205c = c39362s0;
        this.f392206d = i12;
        this.f392207e = c39311c1;
        this.f392208f = a90Var;
        this.f392209g = nativeAdEventListener;
        this.f392210h = pnVar;
    }

    @Y61.k
    public final y80<ExtendedNativeAdView> a(@Y61.k Context context, @Y61.k ViewGroup viewGroup, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k k2 k2Var, @Y61.k o01 o01Var, @Y61.k f91 f91Var, @Y61.k qq qqVar, @Y61.l vq vqVar) {
        ArrayList arrayListA = yp.a(this.f392203a, this.f392207e, this.f392206d).a(context, this.f392203a, uVar, this.f392204b, this.f392205c, this.f392210h, k2Var, o01Var, f91Var, qqVar, vqVar);
        a90 a90Var = this.f392208f;
        AdResponse<?> adResponse = this.f392203a;
        pl plVar = this.f392204b;
        NativeAdEventListener nativeAdEventListener = this.f392209g;
        C39362s0 c39362s0 = this.f392205c;
        a90Var.getClass();
        return new y80<>(context, viewGroup, a90.a(context, adResponse, uVar, plVar, nativeAdEventListener, c39362s0, arrayListA));
    }

    public /* synthetic */ z80(Context context, AdResponse adResponse, pl plVar, C39362s0 c39362s0, int i12, C39311c1 c39311c1) {
        this(context, adResponse, plVar, c39362s0, i12, c39311c1, new a90(), new dm0(c39311c1, new dy(q21.b().a(context))), new rn(context, rz0.a(adResponse)).a());
    }

    @Y61.k
    public final ArrayList a(@Y61.k Context context, @Y61.k ExtendedNativeAdView extendedNativeAdView, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k k2 k2Var, @Y61.k o01 o01Var, @Y61.k gv0 gv0Var, @Y61.k u4 u4Var, @Y61.l ArrayList arrayList, @Y61.l vq vqVar, @Y61.k List list) {
        ArrayList arrayList2;
        y80<ExtendedNativeAdView> y80VarA;
        if (uVar instanceof z41) {
            z41 z41Var = (z41) uVar;
            ArrayList arrayListD = z41Var.d();
            arrayList2 = new ArrayList();
            int size = arrayListD.size();
            for (int i12 = 0; i12 < size; i12++) {
                r4 r4Var = new r4(list);
                v4 v4Var = (v4) C42745f0.K(i12, list);
                arrayList2.add(a(context, extendedNativeAdView, (com.yandex.mobile.ads.nativeads.u) arrayListD.get(i12), k2Var, o01Var, new f91(gv0Var, r4Var, new t4(v4Var != null ? v4Var.a() : 0L)), u4Var, arrayList != null ? (vq) C42745f0.K(i12, arrayList) : null));
            }
            r4 r4Var2 = new r4(list);
            v4 v4Var2 = (v4) C42745f0.K(arrayListD.size(), list);
            y80VarA = vqVar != null ? a(context, extendedNativeAdView, z41Var, k2Var, o01Var, new f91(gv0Var, r4Var2, new t4(v4Var2 != null ? v4Var2.a() : 0L)), u4Var, vqVar) : null;
            if (y80VarA != null) {
                arrayList2.add(y80VarA);
            }
        } else {
            arrayList2 = new ArrayList();
            r4 r4Var3 = new r4(list);
            v4 v4Var3 = (v4) C42745f0.G(list);
            arrayList2.add(a(context, extendedNativeAdView, uVar, k2Var, o01Var, new f91(gv0Var, r4Var3, new t4(v4Var3 != null ? v4Var3.a() : 0L)), u4Var, arrayList != null ? (vq) C42745f0.G(arrayList) : null));
            r4 r4Var4 = new r4(list);
            v4 v4Var4 = (v4) C42745f0.K(1, list);
            y80VarA = vqVar != null ? a(context, extendedNativeAdView, uVar, k2Var, o01Var, new f91(gv0Var, r4Var4, new t4(v4Var4 != null ? v4Var4.a() : 0L)), u4Var, vqVar) : null;
            if (y80VarA != null) {
                arrayList2.add(y80VarA);
            }
        }
        return arrayList2;
    }
}
