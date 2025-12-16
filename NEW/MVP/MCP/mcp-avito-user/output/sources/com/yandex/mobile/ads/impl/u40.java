package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class u40 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f390445c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private static volatile u40 f390446d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f390447a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<InstreamAdPlayer, vb1> f390448b;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @Y61.k
        public final u40 a() {
            u40 u40Var = u40.f390446d;
            if (u40Var == null) {
                synchronized (this) {
                    u40Var = u40.f390446d;
                    if (u40Var == null) {
                        u40Var = new u40(0);
                        u40.f390446d = u40Var;
                    }
                }
            }
            return u40Var;
        }

        private a() {
        }
    }

    public /* synthetic */ u40(int i12) {
        this();
    }

    public final void b(@Y61.k InstreamAdPlayer instreamAdPlayer) {
        synchronized (this.f390447a) {
            this.f390448b.remove(instreamAdPlayer);
        }
    }

    private u40() {
        this.f390447a = new Object();
        this.f390448b = new WeakHashMap<>();
    }

    @Y61.l
    public final vb1 a(@Y61.k InstreamAdPlayer instreamAdPlayer) {
        vb1 vb1Var;
        synchronized (this.f390447a) {
            vb1Var = this.f390448b.get(instreamAdPlayer);
        }
        return vb1Var;
    }

    public final void a(@Y61.k InstreamAdPlayer instreamAdPlayer, @Y61.k vb1 vb1Var) {
        synchronized (this.f390447a) {
            this.f390448b.put(instreamAdPlayer, vb1Var);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
