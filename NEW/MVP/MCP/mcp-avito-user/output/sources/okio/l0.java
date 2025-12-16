package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okio.S;

/* compiled from: ZipFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/l0;", "Lokio/v;", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l0 extends AbstractC44811v {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final S f420135e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f420136b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC44811v f420137c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f420138d;

    /* compiled from: ZipFileSystem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokio/l0$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f420135e = S.a.b(S.f420033c, "/");
    }

    public l0(@Y61.k S s5, @Y61.k AbstractC44811v abstractC44811v, @Y61.k LinkedHashMap linkedHashMap) {
        this.f420136b = s5;
        this.f420137c = abstractC44811v;
        this.f420138d = linkedHashMap;
    }

    @Override // okio.AbstractC44811v
    public final void a(@Y61.k S s5) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final List<S> c(@Y61.k S s5) {
        return j(s5, true);
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public final List<S> d(@Y61.k S s5) {
        return j(s5, false);
    }

    @Override // okio.AbstractC44811v
    @Y61.l
    public final C44810u f(@Y61.k S s5) throws Throwable {
        C44810u c44810uE;
        Throwable th2;
        S s12 = f420135e;
        s12.getClass();
        okio.internal.q qVar = (okio.internal.q) this.f420138d.get(okio.internal.h.b(s12, s5, true));
        Throwable th3 = null;
        if (qVar == null) {
            return null;
        }
        boolean z12 = qVar.f420103b;
        C44810u c44810u = new C44810u(!z12, z12, null, z12 ? null : Long.valueOf(qVar.f420105d), null, qVar.f420107f, null, null, 128, null);
        long j12 = qVar.f420108g;
        if (j12 == -1) {
            return c44810u;
        }
        AbstractC44809t abstractC44809tG = this.f420137c.g(this.f420136b);
        try {
            Y y12 = new Y(abstractC44809tG.d(j12));
            try {
                c44810uE = okio.internal.v.e(y12, c44810u);
                try {
                    y12.close();
                    th2 = null;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                try {
                    y12.close();
                } catch (Throwable th6) {
                    C42833p.a(th5, th6);
                }
                th2 = th5;
                c44810uE = null;
            }
        } catch (Throwable th7) {
            if (abstractC44809tG != null) {
                try {
                    abstractC44809tG.close();
                } catch (Throwable th8) {
                    C42833p.a(th7, th8);
                }
            }
            c44810uE = null;
            th3 = th7;
        }
        if (th2 != null) {
            throw th2;
        }
        try {
            abstractC44809tG.close();
        } catch (Throwable th9) {
            th3 = th9;
        }
        if (th3 == null) {
            return c44810uE;
        }
        throw th3;
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final AbstractC44809t g(@Y61.k S s5) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final c0 h(@Y61.k S s5) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.AbstractC44811v
    @Y61.k
    public final e0 i(@Y61.k S s5) throws Throwable {
        Y y12;
        Throwable th2;
        S s12 = f420135e;
        s12.getClass();
        okio.internal.q qVar = (okio.internal.q) this.f420138d.get(okio.internal.h.b(s12, s5, true));
        if (qVar == null) {
            throw new FileNotFoundException("no such file: " + s5);
        }
        AbstractC44809t abstractC44809tG = this.f420137c.g(this.f420136b);
        try {
            y12 = new Y(abstractC44809tG.d(qVar.f420108g));
            try {
                abstractC44809tG.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (abstractC44809tG != null) {
                try {
                    abstractC44809tG.close();
                } catch (Throwable th5) {
                    C42833p.a(th4, th5);
                }
            }
            y12 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        okio.internal.v.e(y12, null);
        int i12 = qVar.f420106e;
        long j12 = qVar.f420105d;
        return i12 == 0 ? new okio.internal.m(y12, j12, true) : new okio.internal.m(new F(new okio.internal.m(y12, qVar.f420104c, true), new Inflater(true)), j12, false);
    }

    public final List<S> j(S s5, boolean z12) throws IOException {
        S s12 = f420135e;
        s12.getClass();
        okio.internal.q qVar = (okio.internal.q) this.f420138d.get(okio.internal.h.b(s12, s5, true));
        if (qVar != null) {
            return C42745f0.M0(qVar.f420109h);
        }
        if (!z12) {
            return null;
        }
        throw new IOException("not a directory: " + s5);
    }
}
