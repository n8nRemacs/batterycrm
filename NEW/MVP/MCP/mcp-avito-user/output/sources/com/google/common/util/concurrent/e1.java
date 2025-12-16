package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC37532c;

/* compiled from: SettableFuture.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
public final class e1<V> extends AbstractC37532c.j<V> {
    public static <V> e1<V> r() {
        return new e1<>();
    }

    @Override // com.google.common.util.concurrent.AbstractC37532c.j, com.google.common.util.concurrent.AbstractC37532c, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f360561b instanceof AbstractC37532c.C10692c;
    }
}
