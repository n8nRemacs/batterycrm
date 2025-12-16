package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class jy {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final AdResponse<?> f386995a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ViewGroup f386996b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final pl f386997c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final z80 f386998d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final l2 f386999e;

    @X41.j
    public jy(Context context, @Y61.k AdResponse adResponse, @Y61.k ViewGroup viewGroup, @Y61.k pl plVar, @Y61.k C39362s0 c39362s0, @Y61.k int i12, C39311c1 c39311c1, @Y61.k int i13) {
        this(context, adResponse, viewGroup, plVar, c39362s0, i12, c39311c1);
    }

    @Y61.k
    public final ey a(@Y61.k Context context, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k pl plVar) {
        ArrayList arrayList;
        vq vqVar;
        q4 q4VarB;
        vq vqVarPrevious;
        o01 o01Var = new o01(context, new tq(uVar, plVar), plVar);
        InterfaceC39323f1 interfaceC39323f1A = this.f386999e.a(this.f386995a, o01Var);
        List<vq> listC = uVar.c();
        if (listC != null) {
            arrayList = new ArrayList();
            for (Object obj : listC) {
                if (kotlin.jvm.internal.L.f(((vq) obj).c(), xp.a(1))) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List<vq> listC2 = uVar.c();
        if (listC2 != null) {
            ListIterator<vq> listIterator = listC2.listIterator(listC2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vqVarPrevious = null;
                    break;
                }
                vqVarPrevious = listIterator.previous();
                if (kotlin.jvm.internal.L.f(vqVarPrevious.c(), xp.a(2))) {
                    break;
                }
            }
            vqVar = vqVarPrevious;
        } else {
            vqVar = null;
        }
        bl0 bl0VarA = uVar.a();
        List<v4> listA = (bl0VarA == null || (q4VarB = bl0VarA.b()) == null) ? null : q4VarB.a();
        if (kotlin.jvm.internal.L.f(this.f386995a.w(), "ad_pod") && listA != null && ((uVar instanceof z41) || vqVar != null)) {
            return new s4(context, uVar, o01Var, arrayList, vqVar, this.f386996b, interfaceC39323f1A, plVar, this.f386998d, listA);
        }
        return new iy(this.f386998d.a(context, this.f386996b, uVar, new bw0(interfaceC39323f1A), o01Var, new f91(new gv0(), new e41(this.f386995a), new g41(this.f386995a)), new h41(), arrayList != null ? (vq) C42745f0.G(arrayList) : null), plVar);
    }

    @X41.j
    public jy(@Y61.k Context context, @Y61.k AdResponse adResponse, @Y61.k ViewGroup viewGroup, @Y61.k pl plVar, @Y61.k C39362s0 c39362s0, @Y61.k C39311c1 c39311c1, @Y61.k z80 z80Var, @Y61.k l2 l2Var) {
        this.f386995a = adResponse;
        this.f386996b = viewGroup;
        this.f386997c = plVar;
        this.f386998d = z80Var;
        this.f386999e = l2Var;
    }

    public /* synthetic */ jy(Context context, AdResponse adResponse, ViewGroup viewGroup, pl plVar, C39362s0 c39362s0, int i12, C39311c1 c39311c1) {
        this(context, adResponse, viewGroup, plVar, c39362s0, c39311c1, new z80(context, adResponse, plVar, c39362s0, i12, c39311c1), new l2(c39311c1));
    }
}
