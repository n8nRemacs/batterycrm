package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import j.P;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter.java */
/* renamed from: com.google.android.exoplayer2.upstream.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36574d {

    /* compiled from: BandwidthMeter.java */
    /* renamed from: com.google.android.exoplayer2.upstream.d$a */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: com.google.android.exoplayer2.upstream.d$a$a, reason: collision with other inner class name */
        public static final class C10611a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C10612a> f347907a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: com.google.android.exoplayer2.upstream.d$a$a$a, reason: collision with other inner class name */
            public static final class C10612a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f347908a;

                /* renamed from: b, reason: collision with root package name */
                public final a f347909b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f347910c;

                public C10612a(Handler handler, a aVar) {
                    this.f347908a = handler;
                    this.f347909b = aVar;
                }
            }
        }

        void c(int i12, long j12, long j13);
    }

    long a();

    void b(Handler handler, a aVar);

    @P
    M c();

    void g(a aVar);
}
