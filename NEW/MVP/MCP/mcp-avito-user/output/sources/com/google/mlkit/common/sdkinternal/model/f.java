package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.camera.camera2.internal.G;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.internal.mlkit_common.zznf;
import com.google.android.gms.internal.mlkit_common.zznl;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.internal.mlkit_common.zzsv;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C37640i;
import com.google.mlkit.common.sdkinternal.C37642k;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.B;
import j.N;
import j.P;
import j.k0;
import j.l0;
import java.io.File;
import java.util.HashMap;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public class f {

    /* renamed from: l, reason: collision with root package name */
    public static final C36713l f362351l = new C36713l("ModelDownloadManager", "");

    /* renamed from: m, reason: collision with root package name */
    @B
    public static final HashMap f362352m = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    @B
    public final LongSparseArray f362353a = new LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    @B
    public final LongSparseArray f362354b = new LongSparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final C37642k f362355c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final DownloadManager f362356d;

    /* renamed from: e, reason: collision with root package name */
    public final NZ0.d f362357e;

    /* renamed from: f, reason: collision with root package name */
    public final ModelType f362358f;

    /* renamed from: g, reason: collision with root package name */
    public final zzss f362359g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.mlkit.common.sdkinternal.p f362360h;

    /* renamed from: i, reason: collision with root package name */
    public final d f362361i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final e f362362j;

    /* renamed from: k, reason: collision with root package name */
    public final g f362363k;

    @k0
    public f(@N C37642k c37642k, @N NZ0.d dVar, @N d dVar2, @N g gVar, @P e eVar, @N zzss zzssVar) {
        this.f362355c = c37642k;
        this.f362358f = dVar.f11600b;
        this.f362357e = dVar;
        DownloadManager downloadManager = (DownloadManager) c37642k.b().getSystemService("download");
        this.f362356d = downloadManager;
        this.f362359g = zzssVar;
        if (downloadManager == null) {
            f362351l.a("Download manager service is not available in the service.");
        }
        this.f362361i = dVar2;
        com.google.firebase.components.b<?> bVar = com.google.mlkit.common.sdkinternal.p.f362380b;
        this.f362360h = (com.google.mlkit.common.sdkinternal.p) c37642k.a(com.google.mlkit.common.sdkinternal.p.class);
        this.f362362j = eVar;
        this.f362363k = gVar;
    }

    @RX0.a
    @P
    public final synchronized Long a() {
        Long lValueOf;
        com.google.mlkit.common.sdkinternal.p pVar = this.f362360h;
        NZ0.d dVar = this.f362357e;
        synchronized (pVar) {
            long j12 = pVar.e().getLong("downloading_model_id_" + dVar.a(), -1L);
            if (j12 < 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(j12);
            }
        }
        return lValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    @RX0.a
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Integer b() {
        /*
            r8 = this;
            r0 = 1
            monitor-enter(r8)
            android.app.DownloadManager r1 = r8.f362356d     // Catch: java.lang.Throwable -> L47
            java.lang.Long r2 = r8.a()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            if (r1 == 0) goto L91
            if (r2 != 0) goto Lf
            goto L91
        Lf:
            android.app.DownloadManager$Query r4 = new android.app.DownloadManager$Query     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L47
            long[] r2 = new long[r0]     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r2[r7] = r5     // Catch: java.lang.Throwable -> L47
            android.app.DownloadManager$Query r2 = r4.setFilterById(r2)     // Catch: java.lang.Throwable -> L47
            android.database.Cursor r1 = r1.query(r2)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L3e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
            java.lang.String r2 = "status"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3c
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r0 = move-exception
            goto L76
        L3e:
            r2 = r3
        L3f:
            if (r2 != 0) goto L4b
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r0 = move-exception
            goto L93
        L49:
            monitor-exit(r8)
            return r3
        L4b:
            int r4 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r5 = 2
            if (r4 == r5) goto L70
            int r4 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r5 = 4
            if (r4 == r5) goto L70
            int r4 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            if (r4 == r0) goto L70
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r4 = 8
            if (r0 == r4) goto L70
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L3c
            r4 = 16
            if (r0 == r4) goto L70
            goto L71
        L70:
            r3 = r2
        L71:
            r1.close()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r8)
            return r3
        L76:
            r1.close()     // Catch: java.lang.Throwable -> L7a
            goto L90
        L7a:
            r1 = move-exception
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r3 = "addSuppressed"
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L90
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L90
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L90
            r2.invoke(r0, r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L90
        L90:
            throw r0     // Catch: java.lang.Throwable -> L47
        L91:
            monitor-exit(r8)
            return r3
        L93:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.f.b():java.lang.Integer");
    }

    @RX0.a
    public final synchronized void c() {
        DownloadManager downloadManager = this.f362356d;
        Long lA2 = a();
        if (downloadManager != null && lA2 != null) {
            f362351l.a("Cancel or remove existing downloading task: ".concat(lA2.toString()));
            if (this.f362356d.remove(lA2.longValue()) > 0 || b() == null) {
                d dVar = this.f362361i;
                NZ0.d dVar2 = this.f362357e;
                File fileE = dVar.e(dVar2.a(), dVar2.f11600b, true);
                if (!d.a(fileE)) {
                    d.f362346b.b("Failed to delete the temp labels file directory: ".concat(String.valueOf(fileE.getAbsolutePath())));
                }
                this.f362360h.a(this.f362357e);
            }
        }
    }

    @P
    @l0
    public final synchronized void d() {
        String str;
        try {
            String strA = this.f362357e.a();
            ModelType modelType = ModelType.f362325b;
            ModelType modelType2 = this.f362358f;
            d dVar = this.f362361i;
            boolean zExists = false;
            if (modelType2 == modelType) {
                dVar.getClass();
            } else {
                File fileE = dVar.e(strA, modelType2, false);
                int iB2 = d.b(fileE);
                if (iB2 == -1) {
                    str = null;
                } else {
                    str = fileE.getAbsolutePath() + "/" + iB2;
                }
                if (str != null) {
                    File file = new File(str);
                    if (file.exists()) {
                        File file2 = new File(file, "model.tflite");
                        String strConcat = "Model file path: ".concat(String.valueOf(file2.getAbsolutePath()));
                        C36713l c36713l = d.f362346b;
                        if (Log.isLoggable(c36713l.f349447a, 4)) {
                            c36713l.d(strConcat);
                        }
                        zExists = file2.exists();
                    }
                }
            }
            if (zExists) {
                zzss zzssVar = this.f362359g;
                NZ0.d dVar2 = this.f362357e;
                zzssVar.zzf(zzsv.zzg(), dVar2, zznf.NO_ERROR, false, dVar2.f11600b, zznl.LIVE);
            }
            e eVar = this.f362362j;
            if (eVar == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            if (eVar.a() != null) {
                C37642k c37642k = this.f362355c;
                NZ0.d dVar3 = this.f362357e;
                com.google.firebase.components.b<?> bVar = com.google.mlkit.common.sdkinternal.p.f362380b;
                com.google.mlkit.common.sdkinternal.p pVar = (com.google.mlkit.common.sdkinternal.p) c37642k.a(com.google.mlkit.common.sdkinternal.p.class);
                synchronized (pVar) {
                    pVar.e().getString("bad_hash_" + dVar3.a(), null);
                }
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Task e(long j12) {
        p pVar;
        C37642k c37642k = this.f362355c;
        synchronized (this) {
            pVar = (p) this.f362353a.get(j12);
            if (pVar == null) {
                pVar = new p(this, j12, f(j12), null);
                this.f362353a.put(j12, pVar);
            }
        }
        androidx.core.content.d.registerReceiver(c37642k.b(), pVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, C37640i.a().f362337a, 2);
        return f(j12).f355672a;
    }

    public final synchronized C37028k f(long j12) {
        C37028k c37028k = (C37028k) this.f362354b.get(j12);
        if (c37028k != null) {
            return c37028k;
        }
        C37028k c37028k2 = new C37028k();
        this.f362354b.put(j12, c37028k2);
        return c37028k2;
    }

    public final MlKitException g(@P Long l12) {
        Cursor cursorQuery = null;
        DownloadManager downloadManager = this.f362356d;
        if (downloadManager != null && l12 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l12.longValue()));
        }
        int i12 = 13;
        String strE = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i13 == 1006) {
                strE = "Model downloading failed due to insufficient space on the device.";
                i12 = UpdateStatusCode.DialogButton.CONFIRM;
            } else {
                strE = G.e(i13, "Model downloading failed due to error code: ", " from Android DownloadManager");
            }
        }
        return new MlKitException(strE, i12);
    }
}
