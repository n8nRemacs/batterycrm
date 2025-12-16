package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.nativeads.f0;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes8.dex */
public final class l0 extends g {
    public l0(@P List<eb<?>> list, @N rl0 rl0Var) {
        super(list, rl0Var);
    }

    @Override // com.yandex.mobile.ads.nativeads.g
    @SuppressLint({"VisibleForTests"})
    public final boolean a(@N f0.b bVar, @P List<eb<?>> list) {
        this.f392629b.getClass();
        return list == null || bVar.isValid(list);
    }
}
