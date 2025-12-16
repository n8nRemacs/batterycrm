package com.github.luben.zstd;

/* loaded from: classes4.dex */
abstract class SharedDictBase extends AutoCloseBase {
    public void finalize() {
        close();
    }
}
