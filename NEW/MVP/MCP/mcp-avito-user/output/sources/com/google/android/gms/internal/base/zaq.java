package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public interface zaq {
    ExecutorService zaa(ThreadFactory threadFactory, int i12);

    ExecutorService zab(int i12, int i13);

    ExecutorService zac(int i12, ThreadFactory threadFactory, int i13);
}
