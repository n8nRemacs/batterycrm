package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: LookupCache.java */
/* loaded from: classes4.dex */
public interface s<K, V> {
    Object a(Serializable serializable, Object obj);

    V get(Object obj);
}
