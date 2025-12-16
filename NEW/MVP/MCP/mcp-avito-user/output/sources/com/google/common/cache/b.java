package com.google.common.cache;

import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.ExecutionException;

/* compiled from: AbstractLoadingCache.java */
@XY0.c
@h
/* loaded from: classes6.dex */
public abstract class b<K, V> extends a<K, V> implements k<K, V> {
    @Override // com.google.common.base.InterfaceC37276u
    public final V apply(K k12) {
        try {
            return get(k12);
        } catch (ExecutionException e12) {
            throw new UncheckedExecutionException(e12.getCause());
        }
    }
}
