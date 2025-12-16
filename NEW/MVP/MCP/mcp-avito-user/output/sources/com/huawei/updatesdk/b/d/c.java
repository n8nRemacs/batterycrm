package com.huawei.updatesdk.b.d;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes7.dex */
public class c extends AsyncTask<Void, Void, Void> {

    /* renamed from: a, reason: collision with root package name */
    private String f363834a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f363835b;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.updatesdk.b.d.b f363837d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f363836c = false;

    /* renamed from: e, reason: collision with root package name */
    private Handler f363838e = new b(null);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f363835b != null) {
                c.this.f363836c = true;
                c.this.f363835b.disconnect();
            }
            com.huawei.updatesdk.a.a.d.d.a(new File(c.e()));
        }
    }

    public static class b extends Handler {
        private b() {
        }

        private void a(Message message, Intent intent, com.huawei.updatesdk.a.b.b.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putInt("download_status_param", message.what);
            intent.putExtras(bundle);
            com.huawei.updatesdk.b.f.c.b().b(bVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof com.huawei.updatesdk.b.d.b) {
                com.huawei.updatesdk.b.d.b bVar = (com.huawei.updatesdk.b.d.b) obj;
                Intent intent = new Intent();
                com.huawei.updatesdk.a.b.b.b bVarA = com.huawei.updatesdk.a.b.b.b.a(intent);
                int i12 = message.what;
                if (i12 == 2) {
                    intent.putExtra("download_apk_size", bVar.e());
                    intent.putExtra("download_apk_already", bVar.a());
                    com.huawei.updatesdk.b.f.c.b().a(bVarA);
                    return;
                }
                if (i12 != 3) {
                    if (i12 == 4) {
                        e.a(com.huawei.updatesdk.a.b.a.a.c().a(), c.e() + "/appmarket.apk", bVar.c(), bVar.d());
                    } else if (i12 != 5) {
                        return;
                    }
                }
                a(message, intent, bVarA);
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public c(com.huawei.updatesdk.b.d.b bVar) {
        this.f363837d = bVar;
        if (TextUtils.isEmpty(bVar.c())) {
            return;
        }
        this.f363834a = bVar.c();
    }

    private void d() {
        HttpURLConnection httpURLConnection = this.f363835b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e() {
        String strB = com.huawei.updatesdk.a.b.a.a.c().b();
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        String strQ = r.q(strB, "/updatesdk");
        File file = new File(strQ);
        return (file.exists() || file.mkdirs()) ? strQ : "";
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) throws Throwable {
        com.huawei.updatesdk.b.g.b.a(this);
        a(this.f363837d, e());
        return null;
    }

    public void b() {
        this.f363838e = null;
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        a();
    }

    public void a() {
        com.huawei.updatesdk.b.g.c.f363854a.execute(new a());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x007e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void a(com.huawei.updatesdk.b.d.b r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "Close FileOutputStream failed!"
            java.lang.String r1 = "DownloadMarketTask"
            java.lang.String r2 = "DOWNLOAD market package FileNotFoundException error:"
            java.lang.String r3 = "DOWNLOAD market package Exception error:"
            if (r8 == 0) goto L8c
            java.lang.String r4 = r8.b()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L16
            goto L8c
        L16:
            java.lang.String r4 = "/appmarket.apk"
            java.lang.String r9 = androidx.appcompat.app.r.q(r9, r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r9)
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b java.io.FileNotFoundException -> L4d
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b java.io.FileNotFoundException -> L4d
            boolean r8 = r7.a(r8, r6, r9)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d java.io.FileNotFoundException -> L3f
            if (r8 != 0) goto L41
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d java.io.FileNotFoundException -> L3f
            java.lang.String r9 = e()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d java.io.FileNotFoundException -> L3f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d java.io.FileNotFoundException -> L3f
            com.huawei.updatesdk.a.a.d.d.a(r8)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d java.io.FileNotFoundException -> L3f
            goto L41
        L3a:
            r8 = move-exception
            r5 = r6
            goto L82
        L3d:
            r8 = move-exception
            goto L45
        L3f:
            r8 = move-exception
            goto L47
        L41:
            r6.close()     // Catch: java.io.IOException -> L7e
            goto L81
        L45:
            r5 = r6
            goto L4f
        L47:
            r5 = r6
            goto L68
        L49:
            r8 = move-exception
            goto L82
        L4b:
            r8 = move-exception
            goto L4f
        L4d:
            r8 = move-exception
            goto L68
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L49
            r9.append(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L49
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r8)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L81
        L64:
            r5.close()     // Catch: java.io.IOException -> L7e
            goto L81
        L68:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L49
            r9.append(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L49
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r8)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L81
            goto L64
        L7e:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r0)
        L81:
            return
        L82:
            if (r5 == 0) goto L8b
            r5.close()     // Catch: java.io.IOException -> L88
            goto L8b
        L88:
            com.huawei.updatesdk.a.a.c.a.a.a.b(r1, r0)
        L8b:
            throw r8
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.d.c.a(com.huawei.updatesdk.b.d.b, java.lang.String):void");
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e12.toString());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e13) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e13.toString());
            }
        }
    }

    private void a(String str, int i12, long j12, String str2, int i13) {
        com.huawei.updatesdk.b.d.b bVar = new com.huawei.updatesdk.b.d.b();
        bVar.a(i12);
        bVar.a(j12);
        bVar.a(str2);
        bVar.b(str);
        Handler handler = this.f363838e;
        if (handler == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(i13, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.huawei.updatesdk.b.d.b r22, java.io.OutputStream r23, java.lang.String r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.d.c.a(com.huawei.updatesdk.b.d.b, java.io.OutputStream, java.lang.String):boolean");
    }
}
