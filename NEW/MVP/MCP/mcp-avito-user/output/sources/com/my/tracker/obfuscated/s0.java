package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.q0;
import com.my.tracker.obfuscated.y0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;
import shark.AndroidResourceIdNames;

/* loaded from: classes7.dex */
public final class s0 {

    /* renamed from: n, reason: collision with root package name */
    static final DecimalFormat f365778n;

    /* renamed from: a, reason: collision with root package name */
    final Context f365779a;

    /* renamed from: b, reason: collision with root package name */
    final q0 f365780b;

    /* renamed from: c, reason: collision with root package name */
    final f2 f365781c;

    /* renamed from: d, reason: collision with root package name */
    final C37849x f365782d;

    /* renamed from: e, reason: collision with root package name */
    final int f365783e;

    /* renamed from: f, reason: collision with root package name */
    final int f365784f;

    /* renamed from: g, reason: collision with root package name */
    final int f365785g;

    /* renamed from: h, reason: collision with root package name */
    final int f365786h;

    /* renamed from: i, reason: collision with root package name */
    ByteArrayOutputStream f365787i = new ByteArrayOutputStream(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);

    /* renamed from: j, reason: collision with root package name */
    ByteArrayOutputStream f365788j = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: k, reason: collision with root package name */
    ByteArrayOutputStream f365789k = new ByteArrayOutputStream(4096);

    /* renamed from: l, reason: collision with root package name */
    long f365790l;

    /* renamed from: m, reason: collision with root package name */
    long f365791m;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        f365778n = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private s0(q0 q0Var, f2 f2Var, int i12, int i13, int i14, int i15, Context context) {
        this.f365779a = context.getApplicationContext();
        this.f365782d = C37849x.a(f2Var);
        this.f365780b = q0Var;
        this.f365781c = f2Var;
        this.f365783e = i12;
        this.f365784f = i13;
        this.f365785g = i14;
        this.f365786h = i15;
        Long lB2 = q0Var.b("timestamp_base");
        this.f365790l = lB2 == null ? 0L : lB2.longValue();
        this.f365791m = q0Var.k();
    }

    public static int a(q0 q0Var, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, OutputStream outputStream) {
        q0.f fVarA;
        q0.g gVarG;
        int i12 = 0;
        q0.g gVar = null;
        try {
            fVarA = q0Var.a("default_session");
            while (fVarA.a()) {
                try {
                    byteArrayOutputStream.reset();
                    long jB2 = fVarA.b();
                    String strC = fVarA.c();
                    try {
                        gVarG = q0Var.g(jB2);
                        while (gVarG.a()) {
                            try {
                                byteArrayOutputStream2.reset();
                                c1.a(1, gVarG.c(), (OutputStream) byteArrayOutputStream2);
                                if (!gVarG.d()) {
                                    c1.a(2, gVarG.b(), (OutputStream) byteArrayOutputStream2);
                                }
                                c1.a(1, byteArrayOutputStream2, byteArrayOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        try {
                            gVarG.close();
                            if (byteArrayOutputStream.size() != 0) {
                                long jE2 = fVarA.e();
                                if (jE2 > 0) {
                                    c1.a(2, jE2, (OutputStream) byteArrayOutputStream);
                                }
                                c1.a(42, byteArrayOutputStream, outputStream);
                                i12++;
                            }
                        } catch (Throwable th3) {
                            e2.b("MyTrackerRepository error: failed to read session " + strC + ": ", th3);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        gVarG = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gVar = fVarA;
                    try {
                        e2.b("MyTrackerRepository error: failed to read sessions: ", th);
                        if (gVar != null) {
                            fVarA = gVar;
                            fVarA.close();
                        }
                        e2.a("MyTrackerRepository: " + i12 + " sessions are prepared to sending");
                        return i12;
                    } finally {
                        if (gVar != null) {
                            gVar.close();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        fVarA.close();
        e2.a("MyTrackerRepository: " + i12 + " sessions are prepared to sending");
        return i12;
    }

    public List<d0> b() {
        ArrayList arrayList = new ArrayList();
        q0.e eVarJ = null;
        try {
            eVarJ = this.f365780b.j();
            while (eVarJ.a()) {
                d0 d0VarA = d0.a(eVarJ.b(), eVarJ.d(), eVarJ.e());
                if (d0VarA != null) {
                    arrayList.add(d0VarA.a(eVarJ.c()));
                }
            }
        } catch (Throwable th2) {
            try {
                e2.b("MyTrackerRepository error: error while reading purchases", th2);
            } finally {
                if (eVarJ != null) {
                    eVarJ.close();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0032: MOVE (r6 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]) (LINE:51), block:B:12:0x0032 */
    public boolean d(long j12, long j13) {
        q0.f fVar;
        q0.f fVar2;
        long j14;
        q0.f fVarA = null;
        try {
            fVarA = this.f365780b.a("default_session");
            try {
                long jB2 = 0;
                try {
                    if (fVarA.a()) {
                        long jB3 = fVarA.b();
                        long jD2 = fVarA.d();
                        long jE2 = fVarA.e();
                        fVar2 = fVarA;
                        if (this.f365790l == 0) {
                            b(jD2);
                        }
                        e2.a("MyTrackerRepository: finish previous session");
                        if (j13 == 0) {
                            j14 = jB3;
                            this.f365780b.a(jB3, jD2 - this.f365790l, true, 0L);
                        } else {
                            j14 = jB3;
                            q0 q0Var = this.f365780b;
                            long j15 = this.f365790l;
                            q0Var.a(j14, jD2 - j15, false, j13 - j15);
                        }
                        long j16 = j14;
                        long jF2 = this.f365780b.f(j16);
                        e2.a("MyTrackerRepository: session timestamps count: " + jF2);
                        long j17 = (long) this.f365785g;
                        if (jF2 > j17) {
                            jB2 = this.f365780b.b(j16, jF2 - j17);
                            e2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB2);
                        }
                        e2.a("MyTrackerRepository: start new session");
                        this.f365780b.a(j16, j12, jE2 + jB2);
                    } else {
                        fVar2 = fVarA;
                        e2.a("MyTrackerRepository: insert session");
                        if (this.f365780b.a("default_session", j12) == q0.f365736x) {
                            e2.b("MyTrackerRepository error: session insertion failed ");
                            fVar2.close();
                            return false;
                        }
                        if (this.f365790l == 0) {
                            b(j12);
                        }
                    }
                    fVar2.close();
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fVarA = fVar;
                    try {
                        e2.b("MyTrackerRepository error: session insertion failed ", th);
                        if (fVarA == null) {
                            return false;
                        }
                        fVarA.close();
                        return false;
                    } finally {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int a(q0 q0Var, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        int i12;
        q0.c cVarH;
        q0.d dVarD;
        int i13;
        int i14 = 0;
        q0.d dVar = null;
        try {
            cVarH = q0Var.h();
            i12 = 0;
            while (cVarH.a()) {
                try {
                    byteArrayOutputStream.reset();
                    int iE2 = (int) cVarH.e();
                    long jC2 = cVarH.c();
                    byte[] bArrB = cVarH.b();
                    try {
                        dVarD = q0Var.d(jC2);
                        int i15 = 0;
                        while (dVarD.a()) {
                            try {
                                c1.a(2, dVarD.b(), (OutputStream) byteArrayOutputStream);
                                i15++;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (i15 == 0) {
                            e2.b("MyTrackerRepository error: no timestamps for event " + iE2 + ", event ignored");
                            try {
                                dVarD.close();
                            } catch (Throwable th3) {
                                e2.b("MyTrackerRepository error: failed to read event " + iE2, th3);
                            }
                        } else {
                            dVarD.close();
                            c1.b(1, iE2, byteArrayOutputStream);
                            long jD2 = cVarH.d();
                            if (jD2 > 0) {
                                c1.a(3, jD2, (OutputStream) byteArrayOutputStream);
                            }
                            if (bArrB.length > 0) {
                                switch (iE2) {
                                    case 1:
                                        i13 = 12;
                                        break;
                                    case 2:
                                        i13 = 13;
                                        break;
                                    case 3:
                                        i13 = 11;
                                        break;
                                    case 4:
                                    case 11:
                                    case 12:
                                    case 16:
                                    case 30:
                                    default:
                                        e2.b("MyTrackerRepository error: unrecognized eventType " + iE2);
                                        continue;
                                    case 5:
                                        i13 = 17;
                                        break;
                                    case 6:
                                        i13 = 22;
                                        break;
                                    case 7:
                                        i13 = 18;
                                        break;
                                    case 8:
                                        i13 = 19;
                                        break;
                                    case 9:
                                        i13 = 20;
                                        break;
                                    case 10:
                                        i13 = 23;
                                        break;
                                    case 13:
                                        i13 = 21;
                                        break;
                                    case 14:
                                        i13 = 14;
                                        break;
                                    case 15:
                                        i13 = 16;
                                        break;
                                    case 17:
                                        i13 = 25;
                                        break;
                                    case 18:
                                        i13 = 26;
                                        break;
                                    case 19:
                                        i13 = 27;
                                        break;
                                    case 20:
                                        i13 = 28;
                                        break;
                                    case 21:
                                        i13 = 29;
                                        break;
                                    case 22:
                                        i13 = 30;
                                        break;
                                    case 23:
                                        i13 = 31;
                                        break;
                                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                                        i13 = 32;
                                        break;
                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        i13 = 33;
                                        break;
                                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                        i13 = 34;
                                        break;
                                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                        i13 = 35;
                                        break;
                                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                        i13 = 36;
                                        break;
                                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                        i13 = 37;
                                        break;
                                    case 31:
                                        i13 = 39;
                                        break;
                                    case 32:
                                        i13 = 40;
                                        break;
                                    case 33:
                                        i13 = 41;
                                        break;
                                }
                                c1.a(i13, bArrB, byteArrayOutputStream);
                            }
                            c1.a(41, byteArrayOutputStream, outputStream);
                            i12++;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        dVarD = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dVar = cVarH;
                    i14 = i12;
                    try {
                        e2.b("MyTrackerRepository error: failed to read events: ", th);
                        if (dVar != null) {
                            i12 = i14;
                            cVarH = dVar;
                            cVarH.close();
                            i14 = i12;
                        }
                        e2.a("MyTrackerRepository: " + i14 + " events are prepared to sending");
                        return i14;
                    } finally {
                        if (dVar != null) {
                            dVar.close();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        cVarH.close();
        i14 = i12;
        e2.a("MyTrackerRepository: " + i14 + " events are prepared to sending");
        return i14;
    }

    public void b(long j12) {
        try {
            this.f365780b.a("timestamp_base", Long.valueOf(j12));
            this.f365790l = j12;
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: ", th2);
        }
    }

    public long c() {
        return this.f365791m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.my.tracker.obfuscated.h0$b] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.my.tracker.obfuscated.h0$b<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.my.tracker.obfuscated.h0.b<java.lang.String> a(com.my.tracker.MyTracker.FlushListener r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.s0.a(com.my.tracker.MyTracker$FlushListener):com.my.tracker.obfuscated.h0$b");
    }

    public void b(MyTracker.FlushListener flushListener, boolean z12) {
        if (flushListener == null) {
            return;
        }
        C37835i.f(new D.b(14, flushListener, z12));
    }

    public boolean c(long j12, long j13) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365550w) {
                if (i12 == 2) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                }
            }
            return a(29, this.f365787i.toByteArray(), false, true, j13);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 29", th2);
            return false;
        }
    }

    public static s0 a(f2 f2Var, int i12, int i13, int i14, int i15, Context context) {
        q0 q0VarA = q0.a(f2Var.g(), context);
        if (q0VarA == null) {
            e2.b("MyTrackerRepository error: database is null");
            return null;
        }
        try {
            return new s0(q0VarA, f2Var, i12, i13, i14, i15, context);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th2);
            return null;
        }
    }

    public void b(d0 d0Var) {
        Long lB2 = d0Var.b();
        if (lB2 != null) {
            try {
                this.f365780b.b(lB2.longValue());
            } catch (Throwable th2) {
                e2.b("MyTrackerRepository error: error while removing raw purchase with id " + lB2, th2);
            }
        }
    }

    public static s0 a(f2 f2Var, Context context) {
        return a(f2Var, 1000, 500, 500, 100, context);
    }

    public void b(C37831e c37831e) {
        Long lB2 = c37831e.b();
        if (lB2 != null) {
            try {
                this.f365780b.a(lB2.longValue());
            } catch (Throwable th2) {
                e2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + lB2, th2);
            }
        }
    }

    public List<C37831e> a() {
        ArrayList arrayList = new ArrayList();
        q0.b bVarG = null;
        try {
            bVarG = this.f365780b.g();
            while (bVarG.a()) {
                C37831e c37831eA = C37831e.a(bVarG.b(), bVarG.d(), bVarG.e(), bVarG.f(), bVarG.g());
                if (c37831eA != null) {
                    arrayList.add(c37831eA.a(bVarG.c()));
                }
            }
        } catch (Throwable th2) {
            try {
                e2.b("MyTrackerRepository error: error while reading purchases", th2);
            } finally {
                if (bVarG != null) {
                    bVarG.close();
                }
            }
        }
        return arrayList;
    }

    public boolean b(long j12, long j13) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365549v) {
                if (i12 == 2) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                }
            }
            return a(28, this.f365787i.toByteArray(), false, true, j13);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 28", th2);
            return false;
        }
    }

    public boolean b(long j12, long j13, long j14, long j15) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365547t) {
                if (i12 == 2) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                } else if (i12 == 3) {
                    c1.a(i12, j13, (OutputStream) this.f365787i);
                } else if (i12 == 4) {
                    c1.a(i12, j14, (OutputStream) this.f365787i);
                }
            }
            return a(26, this.f365787i.toByteArray(), false, true, j15);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 26", th2);
            return false;
        }
    }

    public void a(d0 d0Var) {
        String string = d0Var.d().toString();
        String strA = d0Var.a();
        try {
            if (this.f365780b.i() >= this.f365786h) {
                e2.a("MyTrackerRepository: max count of raw purchases is reached");
                e2.a("MyTrackerRepository: raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA2 = this.f365780b.a(string, strA, d0Var.f());
            if (jA2 >= 0) {
                e2.a("MyTrackerRepository: raw purchase was inserted; id: " + jA2 + ", data: " + string + ", signature: " + strA);
                d0Var.a(jA2);
            }
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: can't insert raw purchase with data: " + string + ", signature " + strA, th2);
        }
    }

    public boolean b(String str, String str2, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365535h) {
                if (i12 == 1) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 == 2 && !TextUtils.isEmpty(str2)) {
                    c1.a(i12, str2, this.f365787i);
                }
            }
            return a(2, this.f365787i.toByteArray(), true, false, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 2", th2);
            return false;
        }
    }

    public void a(C37831e c37831e) {
        String string = c37831e.e().toString();
        String strA = c37831e.a();
        String strF = c37831e.f();
        int iG2 = c37831e.g();
        try {
            if (this.f365780b.f() >= this.f365786h) {
                e2.a("MyTrackerRepository: max count of raw purchases is reached");
                e2.a("MyTrackerRepository: appgalleery raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA2 = this.f365780b.a(string, strA, strF, iG2, c37831e.h());
            if (jA2 >= 0) {
                e2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + jA2 + ", data: " + string + ", signature: " + strA);
                c37831e.a(jA2);
            }
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + string + ", signature " + strA, th2);
        }
    }

    public boolean b(String str, String str2, long j12, long j13, long j14) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365537j) {
                if (i12 == 1) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 != 2) {
                    if (i12 == 3) {
                        c1.a(i12, j13, (OutputStream) this.f365787i);
                    } else if (i12 == 4) {
                        c1.a(i12, j12, (OutputStream) this.f365787i);
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    c1.a(i12, str2, this.f365787i);
                }
            }
            return a(31, this.f365787i.toByteArray(), true, false, j14);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 31", th2);
            return false;
        }
    }

    public boolean a(int i12, String str, String str2, Map<String, String> map, long j12) {
        try {
            this.f365787i.reset();
            for (int i13 : b1.f365534g) {
                if (i13 == 1) {
                    m0.a(i13, map, this.f365788j, this.f365787i);
                } else if (i13 == 2) {
                    c1.a(i13, str, this.f365787i);
                } else if (i13 == 3) {
                    c1.a(i13, str2, this.f365787i);
                }
            }
            return a(i12, this.f365787i.toByteArray(), j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: " + i12, th2);
            return false;
        }
    }

    public boolean b(String str, String str2, Map<String, String> map, long j12) {
        return a(8, str, str2, map, j12);
    }

    public boolean a(int i12, Map<String, String> map, long j12) {
        try {
            this.f365787i.reset();
            for (int i13 : b1.f365529b) {
                if (i13 == 1) {
                    m0.a(i13, map, this.f365788j, this.f365787i);
                } else if (i13 == 2) {
                    c1.b(i13, i12, this.f365787i);
                }
            }
            return a(13, this.f365787i.toByteArray(), j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 13", th2);
            return false;
        }
    }

    public boolean b(Map<String, String> map, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365529b) {
                if (i12 == 1) {
                    m0.a(i12, map, this.f365788j, this.f365787i);
                }
            }
            return a(13, this.f365787i.toByteArray(), j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 13", th2);
            return false;
        }
    }

    public boolean a(int i12, byte[] bArr, long j12) {
        try {
            return a(i12, bArr, false, true, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: " + i12, th2);
            return false;
        }
    }

    public boolean a(int i12, byte[] bArr, boolean z12, boolean z13, long j12) {
        long jD2;
        try {
            long jA2 = q0.f365736x;
            if (z13) {
                q0.c cVarB = null;
                try {
                    cVarB = this.f365780b.b(i12, bArr);
                    if (cVarB.a()) {
                        jA2 = cVarB.c();
                        jD2 = cVarB.d();
                    } else {
                        jA2 = jA2;
                        jD2 = 0;
                    }
                    cVarB.close();
                } catch (Throwable th2) {
                    if (cVarB != null) {
                        cVarB.close();
                    }
                    throw th2;
                }
            } else {
                jD2 = 0;
            }
            if (jA2 == q0.f365736x) {
                e2.a("MyTrackerRepository: insert " + i12 + " event");
                jA2 = this.f365780b.a(i12, bArr, z12);
                if (jA2 != q0.f365736x && z12) {
                    this.f365791m++;
                }
            } else {
                e2.a("MyTrackerRepository: aggregate " + i12 + " event");
            }
            if (jA2 == q0.f365736x) {
                e2.b("MyTrackerRepository error: event insertion failed, type: " + i12);
                return false;
            }
            if (this.f365790l == 0) {
                b(j12);
            }
            this.f365780b.c(jA2, j12 - this.f365790l);
            long jC2 = this.f365780b.c(jA2);
            e2.a("MyTrackerRepository: event timestamps count: " + jC2);
            long j13 = (long) this.f365783e;
            if (jC2 <= j13) {
                return true;
            }
            long jA3 = this.f365780b.a(jA2, jC2 - j13);
            this.f365780b.d(jA2, jD2 + jA3);
            e2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA3);
            return true;
        } catch (Throwable th3) {
            e2.b("MyTrackerRepository error: event insertion failed, type: " + i12, th3);
            return false;
        }
    }

    public boolean a(long j12) {
        return a(3, new byte[0], j12);
    }

    public boolean a(long j12, long j13) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365546s) {
                if (i12 == 2) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                }
            }
            return a(25, this.f365787i.toByteArray(), false, true, j13);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 25", th2);
            return false;
        }
    }

    public boolean a(long j12, long j13, long j14, long j15) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365548u) {
                if (i12 == 2) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                } else if (i12 == 3) {
                    c1.a(i12, j13, (OutputStream) this.f365787i);
                } else if (i12 == 4) {
                    c1.a(i12, j14, (OutputStream) this.f365787i);
                }
            }
            return a(27, this.f365787i.toByteArray(), false, true, j15);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 27", th2);
            return false;
        }
    }

    public boolean a(long j12, String str, y0.a aVar, long j13) {
        String str2;
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365530c) {
                if (i12 == 1) {
                    c1.a(i12, j12, (OutputStream) this.f365787i);
                } else if (i12 == 2) {
                    this.f365788j.reset();
                    for (int i13 : b1.f365531d) {
                        if (i13 == 1) {
                            if (!TextUtils.isEmpty(str)) {
                                c1.a(i13, str, this.f365788j);
                            }
                        } else if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4 && aVar != null) {
                                    str2 = aVar.f365880c;
                                    c1.a(i13, str2, this.f365788j);
                                }
                            } else if (aVar != null) {
                                str2 = aVar.f365879b;
                                c1.a(i13, str2, this.f365788j);
                            }
                        } else if (aVar != null) {
                            c1.b(i13, aVar.f365878a, this.f365788j);
                        }
                    }
                    if (this.f365788j.size() > 0) {
                        c1.a(i12, this.f365788j, this.f365787i);
                    }
                }
            }
            return a(1, this.f365787i.toByteArray(), true, false, j13);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 1", th2);
            return false;
        }
    }

    public boolean a(AdEvent adEvent, long j12) {
        String str;
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365540m) {
                switch (i12) {
                    case 1:
                        c1.b(i12, adEvent.network, this.f365787i);
                        continue;
                    case 2:
                        if (adEvent.eventType == 19) {
                            str = f365778n.format(adEvent.revenue);
                            break;
                        }
                    case 3:
                        if (adEvent.eventType == 19) {
                            str = adEvent.currency;
                            break;
                        }
                    case 4:
                        str = adEvent.source;
                        break;
                    case 5:
                        str = adEvent.placementId;
                        break;
                    case 6:
                        str = adEvent.adId;
                        break;
                    case 7:
                        str = adEvent.adFormat;
                        break;
                    default:
                        continue;
                }
                c1.a(i12, str, this.f365787i);
            }
            return a(adEvent.eventType, this.f365787i.toByteArray(), true, true, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: " + adEvent.eventType, th2);
            return false;
        }
    }

    public boolean a(MiniAppEvent miniAppEvent, long j12) {
        String str;
        int i12 = miniAppEvent.eventType;
        try {
            this.f365787i.reset();
            boolean z12 = i12 == 20 || i12 == 21;
            for (int i13 : b1.f365545r) {
                switch (i13) {
                    case 1:
                        if (i12 == 24) {
                            m0.a(i13, miniAppEvent.eventParams, this.f365788j, this.f365787i);
                            continue;
                        }
                    case 2:
                        str = miniAppEvent.miniAppId;
                        break;
                    case 3:
                        str = miniAppEvent.platformUserId;
                        break;
                    case 4:
                        if (i12 == 20) {
                            str = miniAppEvent.query;
                            break;
                        }
                    case 5:
                        if (i12 == 24 || i12 == 22 || i12 == 23) {
                            str = miniAppEvent.customUserId;
                            break;
                        }
                        break;
                    case 6:
                        if (i12 == 24) {
                            str = miniAppEvent.name;
                            break;
                        }
                    default:
                        continue;
                }
                c1.a(i13, str, this.f365787i);
            }
            byte[] byteArray = this.f365787i.toByteArray();
            if (i12 == 24) {
                long j13 = i12;
                if (this.f365780b.e(j13) >= this.f365784f && this.f365780b.a(j13, byteArray) == 0) {
                    e2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            }
            return a(i12, byteArray, z12, true, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: " + i12, th2);
            return false;
        }
    }

    public boolean a(d0 d0Var, Map<String, String> map) {
        String string;
        String strOptString;
        try {
            this.f365787i.reset();
            JSONObject jSONObjectE = d0Var.e();
            String str = null;
            if (jSONObjectE != null) {
                try {
                    string = jSONObjectE.toString();
                } catch (Throwable th2) {
                    e2.a("MyTrackerRepository error: can't convert skuDetails json to string", th2);
                    string = null;
                }
                try {
                    str = f365778n.format(Double.parseDouble(jSONObjectE.optString("price_amount_micros")) / 1000000.0d);
                } catch (Throwable th3) {
                    e2.a("MyTrackerRepository error: wrong price in micros in sku details: ", th3);
                }
                strOptString = jSONObjectE.optString("price_currency_code");
            } else {
                strOptString = null;
                string = null;
            }
            for (int i12 : b1.f365542o) {
                int i13 = 1;
                if (i12 == 1) {
                    m0.a(i12, map, this.f365788j, this.f365787i);
                } else if (i12 == 2) {
                    this.f365788j.reset();
                    int[] iArr = b1.f365544q;
                    int length = iArr.length;
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = iArr[i14];
                        if (i15 == i13) {
                            try {
                                c1.a(i15, d0Var.d().toString(), this.f365788j);
                            } catch (Throwable th4) {
                                e2.b("MyTrackerRepository error: can't convert purchaseData json to string", th4);
                            }
                        } else if (i15 == 2) {
                            c1.a(i15, d0Var.a(), this.f365788j);
                        } else if (i15 == 3) {
                            c1.a(i15, string, this.f365788j);
                        }
                        i14++;
                        i13 = 1;
                    }
                    if (this.f365788j.size() > 0) {
                        c1.a(i12, this.f365788j, this.f365787i);
                    }
                } else if (i12 == 4) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 == 5) {
                    c1.a(i12, strOptString, this.f365787i);
                }
            }
            return a(10, this.f365787i.toByteArray(), true, false, d0Var.f());
        } catch (Throwable th5) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 10", th5);
            return false;
        }
    }

    public boolean a(C37831e c37831e, Map<String, String> map) {
        String string;
        String strOptString;
        String strA;
        try {
            this.f365787i.reset();
            JSONObject jSONObjectD = c37831e.d();
            String strValueOf = null;
            if (jSONObjectD != null) {
                try {
                    string = jSONObjectD.toString();
                } catch (Throwable th2) {
                    e2.a("MyTrackerRepository error: can't convert productInfo json to string", th2);
                    string = null;
                }
                try {
                    strValueOf = String.valueOf(jSONObjectD.optDouble("microsPrice") / 1000000.0d);
                } catch (Throwable th3) {
                    e2.a("MyTrackerRepository error: wrong price in micros in sku details: ", th3);
                }
                strOptString = jSONObjectD.optString("currency");
            } else {
                strOptString = null;
                string = null;
            }
            for (int i12 : b1.f365543p) {
                switch (i12) {
                    case 1:
                        m0.a(i12, map, this.f365788j, this.f365787i);
                    case 2:
                        try {
                            c1.a(i12, c37831e.e().toString(), this.f365787i);
                        } catch (Throwable th4) {
                            e2.b("MyTrackerRepository error: can't convert purchaseData json to string", th4);
                        }
                    case 3:
                        c1.a(i12, string, this.f365787i);
                    case 4:
                        strA = c37831e.a();
                        c1.a(i12, strA, this.f365787i);
                    case 5:
                        c1.a(i12, strValueOf, this.f365787i);
                    case 6:
                        c1.a(i12, strOptString, this.f365787i);
                    case 7:
                        strA = c37831e.f();
                        c1.a(i12, strA, this.f365787i);
                    case 8:
                        c1.b(i12, c37831e.g(), this.f365787i);
                    default:
                }
            }
            return a(32, this.f365787i.toByteArray(), true, false, c37831e.h());
        } catch (Throwable th5) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 32", th5);
            return false;
        }
    }

    public boolean a(String str, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365538k) {
                if (i12 == 1) {
                    c1.a(i12, str, this.f365787i);
                }
            }
            return a(33, this.f365787i.toByteArray(), true, false, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 33", th2);
            return false;
        }
    }

    public boolean a(String str, String str2, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365541n) {
                if (i12 == 1) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 == 2 && !TextUtils.isEmpty(str2)) {
                    c1.a(i12, str2, this.f365787i);
                }
            }
            return a(15, this.f365787i.toByteArray(), true, true, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 15", th2);
            return false;
        }
    }

    public boolean a(String str, String str2, long j12, long j13, long j14) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365536i) {
                if (i12 == 1) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 != 2) {
                    if (i12 == 3) {
                        c1.a(i12, j13, (OutputStream) this.f365787i);
                    } else if (i12 == 4) {
                        c1.a(i12, j12, (OutputStream) this.f365787i);
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    c1.a(i12, str2, this.f365787i);
                }
            }
            return a(14, this.f365787i.toByteArray(), true, false, j14);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 14", th2);
            return false;
        }
    }

    public boolean a(String str, String str2, String str3, String str4, String str5, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365532e) {
                if (i12 == 1) {
                    c1.a(i12, str3, this.f365787i);
                } else if (i12 == 2) {
                    c1.a(i12, str4, this.f365787i);
                } else if (i12 == 3) {
                    c1.a(i12, str, this.f365787i);
                } else if (i12 == 4) {
                    c1.a(i12, str2, this.f365787i);
                } else if (i12 == 5) {
                    this.f365788j.reset();
                    for (int i13 : b1.f365533f) {
                        if (i13 == 1 && !TextUtils.isEmpty(str5)) {
                            c1.a(i13, str5, this.f365788j);
                        }
                    }
                    if (this.f365788j.size() > 0) {
                        c1.a(i12, this.f365788j, this.f365787i);
                    }
                }
            }
            return a(5, this.f365787i.toByteArray(), true, false, j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 5", th2);
            return false;
        }
    }

    public boolean a(String str, String str2, Map<String, String> map, long j12) {
        return a(7, str, str2, map, j12);
    }

    public boolean a(String str, Map<String, String> map, long j12) {
        byte[] byteArray;
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365539l) {
                if (i12 == 1) {
                    m0.a(i12, map, this.f365788j, this.f365787i);
                } else if (i12 == 2) {
                    c1.a(i12, str, this.f365787i);
                }
            }
            byteArray = this.f365787i.toByteArray();
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 6", th2);
        }
        if (this.f365780b.e(6L) >= this.f365784f) {
            long jLongValue = 0;
            if (this.f365780b.a(6L, byteArray) == 0) {
                e2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                Long lB2 = this.f365780b.b("custom_events_skipped_count");
                if (lB2 != null) {
                    jLongValue = lB2.longValue();
                }
                long j13 = jLongValue + 1;
                e2.a("MyTrackerRepository: skipped custom events count: " + j13);
                this.f365780b.a("custom_events_skipped_count", Long.valueOf(j13));
                return false;
            }
        }
        return a(6, byteArray, false, true, j12);
    }

    public boolean a(Map<String, String> map, long j12) {
        try {
            this.f365787i.reset();
            for (int i12 : b1.f365528a) {
                if (i12 == 1) {
                    m0.a(i12, map, this.f365788j, this.f365787i);
                }
            }
            return a(9, this.f365787i.toByteArray(), j12);
        } catch (Throwable th2) {
            e2.b("MyTrackerRepository error: event serialization failed, type: 9", th2);
            return false;
        }
    }
}
