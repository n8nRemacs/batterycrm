package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b10;
import com.yandex.mobile.ads.impl.b71;
import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.iz0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;

/* loaded from: classes8.dex */
public final class z00 implements et {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private static final List<String> f392121g = qc1.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private static final List<String> f392122h = qc1.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final cx0 f392123a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final hx0 f392124b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final u00 f392125c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private volatile b10 f392126d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final sv0 f392127e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f392128f;

    public z00(@Y61.k bq0 bq0Var, @Y61.k cx0 cx0Var, @Y61.k hx0 hx0Var, @Y61.k u00 u00Var) {
        this.f392123a = cx0Var;
        this.f392124b = hx0Var;
        this.f392125c = u00Var;
        List<sv0> listR = bq0Var.r();
        sv0 sv0Var = sv0.f390037f;
        this.f392127e = listR.contains(sv0Var) ? sv0Var : sv0.f390036e;
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final okio.c0 a(@Y61.k ry0 ry0Var, long j12) {
        return this.f392126d.j();
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void b() {
        this.f392125c.flush();
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final cx0 c() {
        return this.f392123a;
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void cancel() {
        this.f392128f = true;
        b10 b10Var = this.f392126d;
        if (b10Var != null) {
            b10Var.a(xs.f391804g);
        }
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void a(@Y61.k ry0 ry0Var) throws IOException {
        if (this.f392126d != null) {
            return;
        }
        this.f392126d = this.f392125c.a(a.a(ry0Var), ry0Var.a() != null);
        if (this.f392128f) {
            this.f392126d.a(xs.f391804g);
            throw new IOException("Canceled");
        }
        b10.c cVarR = this.f392126d.r();
        long jE2 = this.f392124b.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVarR.timeout(jE2, timeUnit);
        this.f392126d.u().timeout(this.f392124b.g(), timeUnit);
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final long b(@Y61.k iz0 iz0Var) {
        if (l10.a(iz0Var)) {
            return qc1.a(iz0Var);
        }
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final void a() throws IOException {
        this.f392126d.j().close();
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.l
    public final iz0.a a(boolean z12) throws ProtocolException, NumberFormatException {
        iz0.a aVarA = a.a(this.f392126d.s(), this.f392127e);
        if (z12 && aVarA.b() == 100) {
            return null;
        }
        return aVarA;
    }

    public static final class a {
        @Y61.k
        public static ArrayList a(@Y61.k ry0 ry0Var) {
            gz gzVarD = ry0Var.d();
            ArrayList arrayList = new ArrayList(gzVarD.size() + 4);
            arrayList.add(new ez(ez.f385140f, ry0Var.f()));
            arrayList.add(new ez(ez.f385141g, xy0.a(ry0Var.h())));
            String strA = ry0Var.a("Host");
            if (strA != null) {
                arrayList.add(new ez(ez.f385143i, strA));
            }
            arrayList.add(new ez(ez.f385142h, ry0Var.h().l()));
            int size = gzVarD.size();
            for (int i12 = 0; i12 < size; i12++) {
                String lowerCase = gzVarD.a(i12).toLowerCase(Locale.US);
                if (!z00.f392121g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.L.f(gzVarD.b(i12), "trailers"))) {
                    arrayList.add(new ez(lowerCase, gzVarD.b(i12)));
                }
            }
            return arrayList;
        }

        @Y61.k
        public static iz0.a a(@Y61.k gz gzVar, @Y61.k sv0 sv0Var) throws ProtocolException, NumberFormatException {
            gz.a aVar = new gz.a();
            int size = gzVar.size();
            b71 b71VarA = null;
            for (int i12 = 0; i12 < size; i12++) {
                String strA = gzVar.a(i12);
                String strB = gzVar.b(i12);
                if (kotlin.jvm.internal.L.f(strA, Header.RESPONSE_STATUS_UTF8)) {
                    b71VarA = b71.a.a("HTTP/1.1 " + strB);
                } else if (!z00.f392122h.contains(strA)) {
                    aVar.b(strA, strB);
                }
            }
            if (b71VarA != null) {
                return new iz0.a().a(sv0Var).a(b71VarA.f383805b).b(b71VarA.f383806c).a(aVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    @Override // com.yandex.mobile.ads.impl.et
    @Y61.k
    public final okio.e0 a(@Y61.k iz0 iz0Var) {
        return this.f392126d.l();
    }
}
