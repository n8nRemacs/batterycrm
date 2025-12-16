package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.AbstractC36502a;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C36546i;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ConcatenatingMediaSource.java */
/* renamed from: com.google.android.exoplayer2.source.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36546i extends AbstractC36542e<e> {

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.android.exoplayer2.O f346613o;

    /* renamed from: l, reason: collision with root package name */
    @j.B
    @j.P
    public Handler f346614l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f346615m;

    /* renamed from: n, reason: collision with root package name */
    public O f346616n;

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.i$b */
    public static final class b extends AbstractC36502a {
        @Override // com.google.android.exoplayer2.s0
        public final int h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int o() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int q(Object obj) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int r(int i12) {
            return com.google.android.exoplayer2.util.U.e(null, i12 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int s(int i12) {
            return com.google.android.exoplayer2.util.U.e(null, i12 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final Object t(int i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int u(int i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final int v(int i12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractC36502a
        public final s0 y(int i12) {
            throw null;
        }
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.i$d */
    public static final class d {
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.i$e */
    public static final class e {
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.i$f */
    public static final class f<T> {
    }

    static {
        O.c cVar = new O.c();
        cVar.f343535b = Uri.EMPTY;
        f346613o = cVar.a();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final synchronized void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        super.B(m12);
        this.f346614l = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                com.google.android.exoplayer2.O o12 = C36546i.f346613o;
                C36546i c36546i = this.f346247b;
                c36546i.getClass();
                int i12 = message.what;
                if (i12 == 0) {
                    Object obj = message.obj;
                    int i13 = com.google.android.exoplayer2.util.U.f348106a;
                    ((C36546i.f) obj).getClass();
                    throw null;
                }
                if (i12 == 1) {
                    Object obj2 = message.obj;
                    int i14 = com.google.android.exoplayer2.util.U.f348106a;
                    ((C36546i.f) obj2).getClass();
                    throw null;
                }
                if (i12 == 2) {
                    Object obj3 = message.obj;
                    int i15 = com.google.android.exoplayer2.util.U.f348106a;
                    O o13 = c36546i.f346616n;
                    ((C36546i.f) obj3).getClass();
                    c36546i.f346616n = o13.g(1);
                    throw null;
                }
                if (i12 == 3) {
                    Object obj4 = message.obj;
                    int i16 = com.google.android.exoplayer2.util.U.f348106a;
                    ((C36546i.f) obj4).getClass();
                    c36546i.f346616n = null;
                    if (!c36546i.f346615m) {
                        c36546i.f346614l.obtainMessage(4).sendToTarget();
                        c36546i.f346615m = true;
                    }
                    return true;
                }
                if (i12 == 4) {
                    c36546i.f346615m = false;
                    new HashSet();
                    new C36546i.b(c36546i.f346616n);
                    throw null;
                }
                if (i12 != 5) {
                    throw new IllegalStateException();
                }
                Object obj5 = message.obj;
                int i17 = com.google.android.exoplayer2.util.U.f348106a;
                Set set = (Set) obj5;
                synchronized (c36546i) {
                    try {
                        Iterator it = set.iterator();
                        if (!it.hasNext()) {
                            throw null;
                        }
                        ((C36546i.d) it.next()).getClass();
                        throw null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final synchronized void D() {
        super.D();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    @j.P
    public final y.b E(e eVar, y.b bVar) {
        eVar.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final int F(int i12, Object obj) {
        ((e) obj).getClass();
        return i12;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e
    public final void G(Object obj, AbstractC36538a abstractC36538a, s0 s0Var) {
        ((e) obj).getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final synchronized s0 a() {
        this.f346616n.getLength();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        int i12 = AbstractC36502a.f343739e;
        Pair pair = (Pair) bVar.f346696a;
        Object obj = pair.first;
        bVar.b(pair.second);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return f346613o;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void z() {
        super.z();
        throw null;
    }

    /* compiled from: ConcatenatingMediaSource.java */
    /* renamed from: com.google.android.exoplayer2.source.i$c */
    public static final class c extends AbstractC36538a {
        public c() {
        }

        @Override // com.google.android.exoplayer2.source.y
        public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.y
        public final com.google.android.exoplayer2.O getMediaItem() {
            return C36546i.f346613o;
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36538a
        public final void D() {
        }

        @Override // com.google.android.exoplayer2.source.y
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.AbstractC36538a
        public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        }

        @Override // com.google.android.exoplayer2.source.y
        public final void t(InterfaceC36559w interfaceC36559w) {
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36542e, com.google.android.exoplayer2.source.AbstractC36538a
    public final void A() {
    }
}
