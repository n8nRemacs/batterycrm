package com.google.android.datatransport.runtime.scheduling.persistence;

import j.P;
import j.l0;
import java.io.Closeable;

/* compiled from: EventStore.java */
@l0
/* loaded from: classes10.dex */
public interface d extends Closeable {
    Iterable<k> A5(com.google.android.datatransport.runtime.r rVar);

    void L1(Iterable<k> iterable);

    Iterable<com.google.android.datatransport.runtime.r> T4();

    void X5(long j12, com.google.android.datatransport.runtime.r rVar);

    @P
    k f6(com.google.android.datatransport.runtime.r rVar, com.google.android.datatransport.runtime.j jVar);

    int s();

    long s2(com.google.android.datatransport.runtime.r rVar);

    boolean v2(com.google.android.datatransport.runtime.r rVar);

    void v5(Iterable<k> iterable);
}
