package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.common.util.concurrent.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37534d {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC37532c abstractC37532c, long j12, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC37532c, j12, obj, obj2)) {
            if (unsafe.getObject(abstractC37532c, j12) != obj) {
                return false;
            }
        }
        return true;
    }
}
