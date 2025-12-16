package com.google.android.exoplayer2.ui;

import j.P;

/* compiled from: TimeBar.java */
/* loaded from: classes6.dex */
public interface C {

    /* compiled from: TimeBar.java */
    public interface a {
        void a(long j12);

        void b(long j12, boolean z12);

        void c(long j12);
    }

    void a(a aVar);

    void b(@P long[] jArr, @P boolean[] zArr, int i12);

    void c(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j12);

    void setDuration(long j12);

    void setEnabled(boolean z12);

    void setPosition(long j12);
}
