package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.g4;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.m11;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.rg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class L0 implements jc0.f, ol, m90.a, rg.a, InitializationListener, c20.a, vu, m90.b, kh, ly {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383249b;

    public /* synthetic */ L0(int i12) {
        this.f383249b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.jc0.f
    public int a(Object obj) {
        ec0 ec0Var = (ec0) obj;
        switch (this.f383249b) {
            case 0:
                return jc0.a(ec0Var);
            default:
                return jc0.b(ec0Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ol
    public void accept(Object obj) {
        m11.a((m11.b) obj);
    }

    @Override // com.yandex.mobile.ads.impl.ly
    public Object apply(Object obj) {
        return kh0.a((s91) obj);
    }

    @Override // com.yandex.mobile.ads.impl.rg.a
    public rg fromBundle(Bundle bundle) {
        switch (this.f383249b) {
            case 4:
                return a91.b(bundle);
            case 5:
                return aa1.a(bundle);
            case 7:
                return ad0.a(bundle);
            case 11:
                return es0.b(bundle);
            case 15:
                return g4.a(bundle);
            case 16:
                return g4.a.a(bundle);
            case 20:
                return i91.b.a(bundle);
            case 21:
                return i91.d.a(bundle);
            case 22:
                return iz.b(bundle);
            default:
                return kk.a(bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        pt.c((gt0.b) obj);
    }

    @Override // com.yandex.mobile.ads.common.InitializationListener
    public void onInitializationCompleted() {
        ab.a();
    }

    @Override // com.yandex.mobile.ads.impl.kh
    public String a(kn knVar) {
        return kh.b(knVar);
    }

    @Override // com.yandex.mobile.ads.impl.m90.b
    public void a(Object obj, nw nwVar) {
        fo.a((k9) obj, nwVar);
    }

    @Override // com.yandex.mobile.ads.impl.c20.a
    public boolean a(int i12, int i13, int i14, int i15, int i16) {
        switch (this.f383249b) {
            case 8:
                return c20.b(i12, i13, i14, i15, i16);
            default:
                return jh0.a(i12, i13, i14, i15, i16);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vu
    /* renamed from: a */
    public ru[] mo127a() {
        switch (this.f383249b) {
            case 9:
                return eb1.a();
            case 10:
                return el1.a();
            case 11:
            case 13:
            case 15:
            case 16:
            case 20:
            case 21:
            case 22:
            default:
                return kh0.d();
            case 12:
                return ew0.a();
            case 14:
                return C39325g.a();
            case 17:
                return hb0.d();
            case 18:
                return hw.a();
            case 19:
                return i9.a();
            case 23:
                return C39335j.a();
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return jh0.b();
        }
    }
}
