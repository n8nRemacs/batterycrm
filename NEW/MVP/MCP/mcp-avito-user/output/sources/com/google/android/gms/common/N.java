package com.google.android.gms.common;

import aZ0.InterfaceC19846b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractBinderC36718n0;
import com.google.android.gms.common.internal.C36716m0;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36720o0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@InterfaceC19846b
/* loaded from: classes6.dex */
final class N {

    /* renamed from: e, reason: collision with root package name */
    public static volatile InterfaceC36720o0 f348880e;

    /* renamed from: g, reason: collision with root package name */
    public static Context f348882g;

    /* renamed from: a, reason: collision with root package name */
    public static final F f348876a = new F(J.f4("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    public static final G f348877b = new G(J.f4("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    public static final H f348878c = new H(J.f4("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    public static final I f348879d = new I(J.f4("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    public static final Object f348881f = new Object();

    public static V a(final String str, final J j12, final boolean z12, boolean z13) {
        try {
            b();
            C36729v.j(f348882g);
            try {
                return f348880e.R(new zzs(str, j12, z12, z13), new com.google.android.gms.dynamic.f(f348882g.getPackageManager())) ? V.f348887c : new T(new Callable() { // from class: com.google.android.gms.common.E
                    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[LOOP:1: B:17:0x0038->B:19:0x003b, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0027 A[SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() throws java.security.NoSuchAlgorithmException {
                        /*
                            r13 = this;
                            r0 = 1
                            r1 = 0
                            boolean r2 = r1
                            java.lang.String r3 = r2
                            com.google.android.gms.common.J r4 = r3
                            if (r2 != 0) goto L15
                            com.google.android.gms.common.V r5 = com.google.android.gms.common.N.a(r3, r4, r0, r1)
                            boolean r5 = r5.f348888a
                            if (r5 == 0) goto L17
                            java.lang.String r5 = "debug cert rejected"
                            goto L19
                        L15:
                            com.google.android.gms.common.F r5 = com.google.android.gms.common.N.f348876a
                        L17:
                            java.lang.String r5 = "not allowed"
                        L19:
                            java.lang.String r6 = "SHA-256"
                            r7 = r1
                        L1c:
                            r8 = 2
                            if (r7 >= r8) goto L27
                            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r6)     // Catch: java.security.NoSuchAlgorithmException -> L25
                            if (r9 != 0) goto L28
                        L25:
                            int r7 = r7 + r0
                            goto L1c
                        L27:
                            r9 = 0
                        L28:
                            com.google.android.gms.common.internal.C36729v.j(r9)
                            byte[] r4 = r4.g4()
                            byte[] r4 = r9.digest(r4)
                            int r6 = r4.length
                            int r6 = r6 + r6
                            char[] r6 = new char[r6]
                            r7 = r1
                        L38:
                            int r9 = r4.length
                            if (r1 >= r9) goto L52
                            r9 = r4[r1]
                            r10 = r9 & 255(0xff, float:3.57E-43)
                            int r11 = r7 + 1
                            char[] r12 = com.google.android.gms.common.util.n.f349617b
                            int r10 = r10 >>> 4
                            char r10 = r12[r10]
                            r6[r7] = r10
                            r9 = r9 & 15
                            char r9 = r12[r9]
                            r6[r11] = r9
                            int r7 = r7 + r8
                            int r1 = r1 + r0
                            goto L38
                        L52:
                            java.lang.String r0 = new java.lang.String
                            r0.<init>(r6)
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            r1.append(r5)
                            java.lang.String r4 = ": pkg="
                            r1.append(r4)
                            r1.append(r3)
                            java.lang.String r3 = ", sha256="
                            r1.append(r3)
                            r1.append(r0)
                            java.lang.String r0 = ", atk="
                            r1.append(r0)
                            r1.append(r2)
                            java.lang.String r0 = ", ver=12451000.false"
                            r1.append(r0)
                            java.lang.String r0 = r1.toString()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.E.call():java.lang.Object");
                    }
                }, null);
            } catch (RemoteException e12) {
                return new V("module call", false, e12);
            }
        } catch (DynamiteModule.LoadingException e13) {
            return new V("module init: ".concat(String.valueOf(e13.getMessage())), false, e13);
        }
    }

    public static void b() {
        InterfaceC36720o0 c36716m0;
        if (f348880e != null) {
            return;
        }
        C36729v.j(f348882g);
        synchronized (f348881f) {
            try {
                if (f348880e == null) {
                    IBinder iBinderB = DynamiteModule.c(f348882g, DynamiteModule.f349664e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i12 = AbstractBinderC36718n0.f349451a;
                    if (iBinderB == null) {
                        c36716m0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c36716m0 = iInterfaceQueryLocalInterface instanceof InterfaceC36720o0 ? (InterfaceC36720o0) iInterfaceQueryLocalInterface : new C36716m0(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f348880e = c36716m0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
