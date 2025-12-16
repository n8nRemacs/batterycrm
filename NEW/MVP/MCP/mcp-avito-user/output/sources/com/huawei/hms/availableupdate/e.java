package com.huawei.hms.availableupdate;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: UpdateDownload.java */
/* loaded from: classes7.dex */
public class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f363365a;

    /* renamed from: b, reason: collision with root package name */
    public final l f363366b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final b f363367c = new b();

    /* renamed from: d, reason: collision with root package name */
    public g f363368d;

    /* renamed from: e, reason: collision with root package name */
    public File f363369e;

    /* compiled from: UpdateDownload.java */
    public class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public long f363370b;

        /* renamed from: c, reason: collision with root package name */
        public int f363371c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f363372d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f363373e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, int i12, int i13, String str) {
            super(file, i12);
            this.f363372d = i13;
            this.f363373e = str;
            this.f363370b = 0L;
            this.f363371c = e.this.f363367c.a();
        }

        public final void a(int i12) {
            e.this.f363367c.a(e.this.b(), i12, this.f363373e);
            e.this.a(2100, i12, this.f363372d);
        }

        @Override // com.huawei.hms.availableupdate.c, java.io.OutputStream
        public void write(byte[] bArr, int i12, int i13) throws IOException {
            super.write(bArr, i12, i13);
            int i14 = this.f363371c + i13;
            this.f363371c = i14;
            if (i14 > 209715200) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - this.f363370b) > 1000) {
                this.f363370b = jCurrentTimeMillis;
                a(this.f363371c);
            }
            int i15 = this.f363371c;
            if (i15 == this.f363372d) {
                a(i15);
            }
        }
    }

    public e(Context context) {
        this.f363365a = context.getApplicationContext();
    }

    public Context b() {
        return this.f363365a;
    }

    public final synchronized void a(g gVar) {
        this.f363368d = gVar;
    }

    public final synchronized void a(int i12, int i13, int i14) {
        g gVar = this.f363368d;
        if (gVar != null) {
            gVar.a(i12, i13, i14, this.f363369e);
        }
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a() {
        HMSLog.i("UpdateDownload", "Enter cancel.");
        a((g) null);
        this.f363366b.a();
    }

    @Override // com.huawei.hms.availableupdate.f
    public void a(g gVar, h hVar) throws IOException {
        Checker.checkNonNull(gVar, "callback must not be null.");
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        a(gVar);
        if (hVar != null && hVar.a()) {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                HMSLog.e("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
                a(2204, 0, 0);
                return;
            }
            String str = hVar.f363377b;
            if (TextUtils.isEmpty(str)) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                a(2201, 0, 0);
                return;
            }
            File localFile = UpdateProvider.getLocalFile(this.f363365a, str + ".apk");
            this.f363369e = localFile;
            if (localFile == null) {
                HMSLog.e("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
                a(2204, 0, 0);
                return;
            }
            File parentFile = localFile.getParentFile();
            if (parentFile == null || !(parentFile.mkdirs() || parentFile.isDirectory())) {
                HMSLog.e("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
                a(2201, 0, 0);
                return;
            } else if (parentFile.getUsableSpace() < hVar.f363379d * 3) {
                HMSLog.e("UpdateDownload", "In downloadPackage, No space for downloading file.");
                a(2203, 0, 0);
                return;
            } else {
                try {
                    a(hVar);
                    return;
                } catch (j unused) {
                    HMSLog.w("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                    a(2101, 0, 0);
                    return;
                }
            }
        }
        HMSLog.e("UpdateDownload", "In downloadPackage, Invalid update info.");
        a(2201, 0, 0);
    }

    public void a(h hVar) throws IOException {
        String str;
        HMSLog.i("UpdateDownload", "Enter downloadPackage.");
        c cVarA = null;
        try {
            try {
                str = hVar.f363377b;
            } catch (IOException e12) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + e12.getMessage());
                a(2201, 0, 0);
            }
            if (TextUtils.isEmpty(str)) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                a(2201, 0, 0);
                return;
            }
            this.f363367c.a(b(), str);
            if (this.f363367c.b(hVar.f363378c, hVar.f363379d, hVar.f363380e)) {
                if (this.f363367c.a() == this.f363367c.b()) {
                    if (FileUtil.verifyHash(hVar.f363380e, this.f363369e)) {
                        a(2000, 0, 0);
                        return;
                    } else {
                        this.f363367c.a(hVar.f363378c, hVar.f363379d, hVar.f363380e);
                        cVarA = a(this.f363369e, hVar.f363379d, str);
                    }
                } else {
                    cVarA = a(this.f363369e, hVar.f363379d, str);
                    cVarA.a(this.f363367c.a());
                }
            } else {
                this.f363367c.a(hVar.f363378c, hVar.f363379d, hVar.f363380e);
                cVarA = a(this.f363369e, hVar.f363379d, str);
            }
            int iA2 = this.f363366b.a(hVar.f363378c, cVarA, this.f363367c.a(), this.f363367c.b(), this.f363365a);
            if (iA2 != 200 && iA2 != 206) {
                HMSLog.e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package, HTTP code: " + iA2);
                a(2201, 0, 0);
                return;
            }
            if (!FileUtil.verifyHash(hVar.f363380e, this.f363369e)) {
                a(2202, 0, 0);
            } else {
                a(2000, 0, 0);
            }
        } finally {
            this.f363366b.close();
            IOUtils.closeQuietly((OutputStream) null);
        }
    }

    public final c a(File file, int i12, String str) {
        return new a(file, i12, i12, str);
    }
}
