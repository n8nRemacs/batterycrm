package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes2.dex */
public final class rl implements Provider, tn5, CameraVideoCapturer.CameraConfigurationProvider {
    public static omf d;
    public static omf o;
    public final /* synthetic */ int a;
    public final Object b;
    public volatile Object c;

    public /* synthetic */ rl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ql a() {
        vl3 vl3Var = (vl3) this.b;
        sl slVarI = vl3Var.i();
        if (((h79) vl3Var.b) == null) {
            vl3Var.b = new h79(new awd(2, tl.e.a("CMBGJFMGDIHBABABA")));
        }
        h79 h79Var = (h79) vl3Var.b;
        if (((pm) vl3Var.X) == null) {
            if (((xu9) vl3Var.Y) != null) {
                sl slVarI2 = vl3Var.i();
                if (((String) vl3Var.a) == null) {
                    vl3Var.a = "test";
                }
                String str = (String) vl3Var.a;
                xu9 xu9Var = (xu9) vl3Var.Y;
                jkc jkcVar = new jkc();
                if (str == null) {
                    str = "test";
                }
                jkcVar.c = str;
                jkcVar.a = xu9Var;
                jkcVar.b = slVarI2;
                vl3Var.X = jkcVar;
            } else {
                sl slVarI3 = vl3Var.i();
                if (((String) vl3Var.a) == null) {
                    vl3Var.a = "test";
                }
                String str2 = (String) vl3Var.a;
                vl3Var.X = new i5i(str2 != null ? str2 : "test", slVarI3);
            }
        }
        return new ql(slVarI, h79Var, (pm) vl3Var.X);
    }

    public Uri b(hm hmVar) {
        Uri uri = hmVar.getUri();
        if (!fni.a(uri.getScheme(), "ok")) {
            return uri;
        }
        Uri uriV = ((f97) this.c).v(uri.getAuthority());
        Uri.Builder builderEncodedAuthority = uri.buildUpon().scheme(uriV.getScheme()).encodedAuthority(uriV.getEncodedAuthority());
        String encodedPath = uriV.getEncodedPath();
        String encodedPath2 = uri.getEncodedPath();
        if (encodedPath == null || encodedPath.length() == 0 || encodedPath.equals("/")) {
            encodedPath = encodedPath2;
        } else if (encodedPath2 != null && encodedPath2.length() != 0 && !encodedPath2.equals("/")) {
            if (encodedPath.charAt(encodedPath.length() - 1) == '/') {
                encodedPath = encodedPath.substring(0, encodedPath.length() - 1);
            }
            encodedPath = encodedPath.concat(encodedPath2);
        }
        Uri.Builder builderEncodedPath = builderEncodedAuthority.encodedPath(encodedPath);
        String encodedQuery = uriV.getEncodedQuery();
        String encodedQuery2 = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            encodedQuery = encodedQuery2;
        } else if (encodedQuery2 != null && encodedQuery.length() != 0) {
            encodedQuery = encodedQuery + '&' + encodedQuery2;
        }
        return builderEncodedPath.encodedQuery(encodedQuery).build();
    }

    public void c(List list, cm6 cm6Var) {
        qt7 qt7Var;
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            dmd dmdVar = (dmd) this.c;
            if (dmdVar == null || !dmdVar.a.isActive() || !list.equals(dmdVar.b)) {
                if (dmdVar != null && (qt7Var = dmdVar.a) != null) {
                    qt7Var.cancel(null);
                }
                qt7 qt7Var2 = (qt7) cm6Var.invoke();
                dmd dmdVar2 = new dmd(qt7Var2, list);
                qt7Var2.start();
                this.c = dmdVar2;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d(z3e z3eVar) {
        this.c = z3eVar;
        Uri uriA = ((z3e) this.c).a();
        ((wo3) this.b).setSessionInfo(new vo3(((z3e) this.c).a.c, ((z3e) this.c).a.d, uriA == null ? null : uriA.toString(), ((z3e) this.c).a.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.e94 e() {
        /*
            r19 = this;
            r1 = r19
            java.lang.Object r0 = r1.b
            zva r0 = (defpackage.zva) r0
            java.lang.Object r2 = r0.d
            bwf r2 = (defpackage.bwf) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 <= 0) goto Lda
            java.lang.Object r0 = r0.b
            bwf r0 = (defpackage.bwf) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lda
            java.lang.Object r0 = r1.c
            r2 = r0
            e94 r2 = (defpackage.e94) r2
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L5f
            java.lang.String r0 = "/proc/self/stat"
            java.lang.String r5 = "r"
            r4.<init>(r0, r5)     // Catch: java.io.IOException -> L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L4e
        L44:
            if (r5 == 0) goto L51
            r0.append(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L4e
            goto L44
        L4e:
            r0 = move-exception
            r5 = r0
            goto L59
        L51:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r4.close()     // Catch: java.io.IOException -> L5f
            goto L60
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            defpackage.r4j.a(r4, r5)     // Catch: java.io.IOException -> L5f
            throw r0     // Catch: java.io.IOException -> L5f
        L5f:
            r0 = r3
        L60:
            if (r0 != 0) goto L64
        L62:
            r6 = r3
            goto Lc5
        L64:
            java.lang.String r4 = " "
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = 6
            java.util.List r0 = defpackage.vmf.S(r0, r4, r5)
            int r4 = r0.size()
            r5 = 24
            if (r4 > r5) goto L78
            goto L62
        L78:
            kac r6 = new kac     // Catch: java.lang.NumberFormatException -> L62
            r4 = 13
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            long r7 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            r4 = 14
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            long r9 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            r4 = 15
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            long r11 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            r4 = 16
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            long r13 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            r4 = 21
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> L62
            long r15 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L62
            r4 = 23
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.NumberFormatException -> L62
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L62
            long r17 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L62
            r6.<init>(r7, r9, r11, r13, r15, r17)     // Catch: java.lang.NumberFormatException -> L62
        Lc5:
            if (r6 != 0) goto Lc8
            goto Ld7
        Lc8:
            e94 r3 = new e94
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.toSeconds(r4)
            r3.<init>(r4, r6)
        Ld7:
            r1.c = r3
            return r2
        Lda:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.e():e94");
    }

    @Override // defpackage.tn5
    public z3e f() {
        String str;
        String str2;
        if (((z3e) this.c) == null) {
            vo3 sessionInfo = ((wo3) this.b).getSessionInfo();
            z3e z3eVarD = z3e.c.b(((wo3) this.b).getAppKey()).d(Uri.parse(((wo3) this.b).getBaseEndpoint()));
            if (sessionInfo != null && (str = sessionInfo.a) != null && (str2 = sessionInfo.b) != null) {
                z3eVarD = z3eVarD.c(str, str2);
            }
            this.c = z3eVarD;
        }
        return (z3e) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.io.OutputStream r11, defpackage.hm r12, defpackage.tl r13, int r14) throws java.io.IOException, ru.ok.android.api.core.ApiRequestException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.g(java.io.OutputStream, hm, tl, int):void");
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 0:
                if (((ql) this.c) == null) {
                    synchronized (this) {
                        try {
                            if (((ql) this.c) == null) {
                                this.c = a();
                            }
                        } finally {
                        }
                    }
                }
                return (ql) this.c;
            default:
                Object obj = this.c;
                if (obj == null) {
                    synchronized (this) {
                        try {
                            obj = this.c;
                            if (obj == null) {
                                obj = ((frf) this.b).get();
                                this.c = obj;
                            }
                        } finally {
                        }
                    }
                }
                return obj;
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraConfigurationProvider
    public boolean isCrashOnCameraCloseRequired() {
        ((k32) this.c).getClass();
        return false;
    }

    public rl(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.c = f97.w;
                this.b = new ArrayList();
                break;
            case 5:
            default:
                this.b = new CopyOnWriteArraySet();
                break;
            case 6:
                this.b = new ReentrantLock();
                break;
            case 7:
                this.c = new k32();
                this.b = new Object();
                break;
        }
    }
}
