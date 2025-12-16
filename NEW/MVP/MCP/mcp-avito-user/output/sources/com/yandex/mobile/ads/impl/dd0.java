package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g31;

/* loaded from: classes8.dex */
public interface dd0 extends g31 {

    public interface a extends g31.a<dd0> {
        void a(dd0 dd0Var);
    }

    long a(long j12, y21 y21Var);

    long a(cu[] cuVarArr, boolean[] zArr, n11[] n11VarArr, boolean[] zArr2, long j12);

    void a(a aVar, long j12);

    boolean continueLoading(long j12);

    void discardBuffer(long j12, boolean z12);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    w91 getTrackGroups();

    boolean isLoading();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    void reevaluateBuffer(long j12);

    long seekToUs(long j12);
}
