package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.b30;
import com.yandex.mobile.ads.impl.ff1;
import com.yandex.mobile.ads.impl.me1;
import com.yandex.mobile.ads.impl.rb0;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.impl.yg1;
import com.yandex.mobile.ads.impl.yi0;
import com.yandex.mobile.ads.impl.yn0;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes8.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final yg1 f392727a = new yg1();

    /* renamed from: b, reason: collision with root package name */
    private final yi0 f392728b = new yi0();

    @P
    public final NativeAdMedia a(@P rd0 rd0Var) {
        if (rd0Var == null) {
            return null;
        }
        me1 me1VarC = rd0Var.c();
        rb0 rb0VarB = rd0Var.b();
        List<b30> listA = rd0Var.a();
        if (me1VarC != null) {
            yg1 yg1Var = this.f392727a;
            ff1<yn0> ff1VarA = me1VarC.a();
            yg1Var.getClass();
            return new NativeAdMedia(ff1VarA.c().getAdHeight() != 0 ? r5.getAdWidth() / r5.getAdHeight() : 1.7777778f);
        }
        if (listA != null && listA.size() > 1) {
            this.f392728b.getClass();
            return new NativeAdMedia((float) yi0.a(listA));
        }
        if (rb0VarB != null) {
            return new NativeAdMedia(rb0VarB.a());
        }
        return null;
    }
}
