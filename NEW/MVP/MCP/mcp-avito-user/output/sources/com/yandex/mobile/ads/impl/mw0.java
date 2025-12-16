package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;

/* loaded from: classes8.dex */
public abstract class mw0 implements rg {

    /* renamed from: a, reason: collision with root package name */
    public static final rg.a<mw0> f388112a = new Q0(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static mw0 a(Bundle bundle) {
        int i12 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i12 == 0) {
            return (mw0) iz.f386700d.fromBundle(bundle);
        }
        if (i12 == 1) {
            return (mw0) es0.f385095c.fromBundle(bundle);
        }
        if (i12 == 2) {
            return (mw0) w61.f391297d.fromBundle(bundle);
        }
        if (i12 == 3) {
            return (mw0) a91.f383446d.fromBundle(bundle);
        }
        throw new IllegalArgumentException(ba.a("Unknown RatingType: ", i12));
    }
}
