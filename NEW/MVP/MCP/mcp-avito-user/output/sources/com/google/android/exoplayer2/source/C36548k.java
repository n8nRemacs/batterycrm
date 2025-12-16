package com.google.android.exoplayer2.source;

import android.content.Context;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: DefaultMediaSourceFactory.java */
/* renamed from: com.google.android.exoplayer2.source.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36548k implements B {

    /* renamed from: a, reason: collision with root package name */
    public final b f346617a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36583m.a f346618b;

    /* renamed from: c, reason: collision with root package name */
    public final long f346619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f346620d;

    /* renamed from: e, reason: collision with root package name */
    public final long f346621e;

    /* renamed from: f, reason: collision with root package name */
    public final float f346622f;

    /* renamed from: g, reason: collision with root package name */
    public final float f346623g;

    /* compiled from: DefaultMediaSourceFactory.java */
    @Deprecated
    /* renamed from: com.google.android.exoplayer2.source.k$a */
    public interface a extends b.InterfaceC10593b {
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: com.google.android.exoplayer2.source.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.g f346624a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f346625b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f346626c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f346627d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC36583m.a f346628e;

        public b(com.google.android.exoplayer2.extractor.g gVar) {
            this.f346624a = gVar;
        }
    }

    public C36548k(Context context, com.google.android.exoplayer2.extractor.g gVar) {
        this(new t.a(context, new v.b()), gVar);
    }

    public static y.a b(Class cls, InterfaceC36583m.a aVar) {
        try {
            return (y.a) cls.getConstructor(InterfaceC36583m.a.class).newInstance(aVar);
        } catch (Exception e12) {
            throw new IllegalStateException(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    @Override // com.google.android.exoplayer2.source.y.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.source.y a(com.google.android.exoplayer2.O r19) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C36548k.a(com.google.android.exoplayer2.O):com.google.android.exoplayer2.source.y");
    }

    public C36548k(InterfaceC36583m.a aVar, com.google.android.exoplayer2.extractor.g gVar) {
        this.f346618b = aVar;
        b bVar = new b(gVar);
        this.f346617a = bVar;
        if (aVar != bVar.f346628e) {
            bVar.f346628e = aVar;
            bVar.f346627d.clear();
        }
        this.f346619c = -9223372036854775807L;
        this.f346620d = -9223372036854775807L;
        this.f346621e = -9223372036854775807L;
        this.f346622f = -3.4028235E38f;
        this.f346623g = -3.4028235E38f;
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: com.google.android.exoplayer2.source.k$c */
    public static final class c implements com.google.android.exoplayer2.extractor.j {
        @Override // com.google.android.exoplayer2.extractor.j
        public final void b(com.google.android.exoplayer2.extractor.l lVar) {
            lVar.c(0, 3);
            lVar.i(new y.b(-9223372036854775807L));
            lVar.b();
            throw null;
        }

        @Override // com.google.android.exoplayer2.extractor.j
        public final boolean h(com.google.android.exoplayer2.extractor.k kVar) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.j
        public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) {
            return ((com.google.android.exoplayer2.extractor.f) kVar).o(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.j
        public final void release() {
        }

        @Override // com.google.android.exoplayer2.extractor.j
        public final void a(long j12, long j13) {
        }
    }
}
