package com.google.common.util.concurrent;

import com.google.common.base.InterfaceC37276u;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongMap.java */
/* renamed from: com.google.common.util.concurrent.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37575y implements InterfaceC37276u<AtomicLong, Long> {
    @Override // com.google.common.base.InterfaceC37276u
    public final Object apply(Object obj) {
        return Long.valueOf(((AtomicLong) obj).get());
    }
}
