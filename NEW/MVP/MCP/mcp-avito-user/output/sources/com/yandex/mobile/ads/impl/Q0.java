package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.lp;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.rg;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.uo;
import com.yandex.mobile.ads.impl.xc0;
import java.lang.reflect.Constructor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class Q0 implements rg.a, ly, m90.a, vu, uo.a.InterfaceC10987a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383288b;

    public /* synthetic */ Q0(int i12) {
        this.f383288b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.uo.a.InterfaceC10987a
    public Constructor a() {
        switch (this.f383288b) {
            case 6:
                return uo.b();
            default:
                return uo.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ly
    public Object apply(Object obj) {
        return new fo((hj) obj);
    }

    @Override // com.yandex.mobile.ads.impl.rg.a
    public rg fromBundle(Bundle bundle) {
        switch (this.f383288b) {
            case 0:
                return lp.d.a(bundle);
            case 1:
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 14:
            default:
                return xc0.h.a(bundle);
            case 2:
                return mw0.a(bundle);
            case 5:
                return sa1.a.a(bundle);
            case 9:
                return v91.a(bundle);
            case 10:
                return vm.a(bundle);
            case 11:
                return vw.a(bundle);
            case 12:
                return w61.b(bundle);
            case 13:
                return w91.a(bundle);
            case 15:
                return xc0.a(bundle);
            case 16:
                return xc0.b.a(bundle);
            case 17:
                return xc0.e.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        ((gt0.b) obj).onRenderedFirstFrame();
    }

    @Override // com.yandex.mobile.ads.impl.vu
    /* renamed from: a, reason: collision with other method in class */
    public ru[] mo127a() {
        switch (this.f383288b) {
            case 4:
                return pw.a();
            case 8:
                return v7.a();
            case 14:
                return wp0.a();
            default:
                return zw.a();
        }
    }
}
