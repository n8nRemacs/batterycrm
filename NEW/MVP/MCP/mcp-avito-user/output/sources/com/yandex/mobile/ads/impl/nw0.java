package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.Rating;

/* loaded from: classes8.dex */
public final class nw0<V extends View & Rating> extends bj1<V, String> {
    public nw0(@j.N V v12) {
        super(v12);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final /* bridge */ /* synthetic */ boolean a(@j.N View view, @j.N String str) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N String str) {
        try {
            ((Rating) view).setRating(Math.max(Float.parseFloat(str), 0.0f));
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N V v12) {
        v12.setRating(0.0f);
        super.a(v12);
    }
}
