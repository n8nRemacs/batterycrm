package com.yandex.mobile.ads.impl;

import android.util.LruCache;

/* loaded from: classes8.dex */
public final class zt extends LruCache<ff1, du> {
    public zt(int i12) {
        super(i12);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z12, @j.P ff1 ff1Var, @j.P du duVar, @j.P du duVar2) {
        du duVar3 = duVar;
        if (duVar3 != null) {
            duVar3.l();
        }
    }
}
