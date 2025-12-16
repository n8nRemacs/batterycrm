package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.media3.datasource.j;
import androidx.media3.datasource.p;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.C23192k;
import androidx.media3.extractor.H;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: DefaultMediaSourceFactory.java */
/* renamed from: androidx.media3.exoplayer.source.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23161l implements E {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f49779j = 0;

    /* renamed from: c, reason: collision with root package name */
    public final b f49780c;

    /* renamed from: d, reason: collision with root package name */
    public final j.a f49781d;

    /* renamed from: e, reason: collision with root package name */
    public final long f49782e;

    /* renamed from: f, reason: collision with root package name */
    public final long f49783f;

    /* renamed from: g, reason: collision with root package name */
    public final long f49784g;

    /* renamed from: h, reason: collision with root package name */
    public final float f49785h;

    /* renamed from: i, reason: collision with root package name */
    public final float f49786i;

    /* compiled from: DefaultMediaSourceFactory.java */
    @androidx.media3.common.util.J
    @Deprecated
    /* renamed from: androidx.media3.exoplayer.source.l$a */
    public interface a extends a.b {
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: androidx.media3.exoplayer.source.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C23192k f49787a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f49788b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f49789c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f49790d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public j.a f49791e;

        public b(C23192k c23192k) {
            this.f49787a = c23192k;
        }
    }

    @androidx.media3.common.util.J
    public C23161l(Context context, C23192k c23192k) {
        this(new p.a(context), c23192k);
    }

    public static A.a b(Class cls, j.a aVar) {
        try {
            return (A.a) cls.getConstructor(j.a.class).newInstance(aVar);
        } catch (Exception e12) {
            throw new IllegalStateException(e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    @Override // androidx.media3.exoplayer.source.A.a
    @androidx.media3.common.util.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.source.A a(androidx.media3.common.z r20) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C23161l.a(androidx.media3.common.z):androidx.media3.exoplayer.source.A");
    }

    @androidx.media3.common.util.J
    public C23161l(j.a aVar, C23192k c23192k) {
        this.f49781d = aVar;
        b bVar = new b(c23192k);
        this.f49780c = bVar;
        if (aVar != bVar.f49791e) {
            bVar.f49791e = aVar;
            bVar.f49788b.clear();
            bVar.f49790d.clear();
        }
        this.f49782e = -9223372036854775807L;
        this.f49783f = -9223372036854775807L;
        this.f49784g = -9223372036854775807L;
        this.f49785h = -3.4028235E38f;
        this.f49786i = -3.4028235E38f;
    }

    /* compiled from: DefaultMediaSourceFactory.java */
    /* renamed from: androidx.media3.exoplayer.source.l$c */
    public static final class c implements androidx.media3.extractor.p {
        @Override // androidx.media3.extractor.p
        public final boolean b(androidx.media3.extractor.q qVar) {
            return true;
        }

        @Override // androidx.media3.extractor.p
        public final int h(androidx.media3.extractor.q qVar, androidx.media3.extractor.F f12) {
            return ((C23191j) qVar).o(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // androidx.media3.extractor.p
        public final void i(androidx.media3.extractor.r rVar) {
            J j12 = (J) rVar;
            j12.c(0, 3);
            j12.e(new H.b(-9223372036854775807L));
            j12.b();
            throw null;
        }

        @Override // androidx.media3.extractor.p
        public final void release() {
        }

        @Override // androidx.media3.extractor.p
        public final void a(long j12, long j13) {
        }
    }
}
