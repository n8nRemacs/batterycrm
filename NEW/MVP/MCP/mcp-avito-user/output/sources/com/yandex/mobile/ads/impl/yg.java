package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public interface yg {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(Throwable th2) {
            super(th2);
        }

        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface b {
        void a(lh lhVar);

        void a(yg ygVar, lh lhVar);

        void a(yg ygVar, lh lhVar, lh lhVar2);
    }

    long a();

    @j.l0
    File a(String str, long j12, long j13);

    @j.l0
    void a(lh lhVar);

    @j.l0
    void a(File file, long j12);

    @j.l0
    void a(String str);

    @j.l0
    void a(String str, tl tlVar);

    long b(String str, long j12, long j13);

    oo b(String str);

    void b(lh lhVar);

    @j.P
    @j.l0
    lh c(String str, long j12, long j13);

    long d(String str, long j12, long j13);

    @j.l0
    lh e(String str, long j12, long j13);
}
