package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import com.facebook.soloader.G;
import com.facebook.soloader.r;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* compiled from: ApkSoSource.java */
/* renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C36424a extends r {

    /* renamed from: j, reason: collision with root package name */
    public final int f340859j;

    /* compiled from: ApkSoSource.java */
    /* renamed from: com.facebook.soloader.a$a, reason: collision with other inner class name */
    public class C10542a extends r.c {

        /* renamed from: f, reason: collision with root package name */
        public final File f340860f;

        /* renamed from: g, reason: collision with root package name */
        public final int f340861g;

        public C10542a(C36424a c36424a) {
            super(c36424a);
            this.f340860f = new File(C36424a.this.f340835d.getApplicationInfo().nativeLibraryDir);
            this.f340861g = C36424a.this.f340859j;
        }

        @Override // com.facebook.soloader.r.c
        public final boolean d(ZipEntry zipEntry, String str) {
            zipEntry.getName();
            C36424a c36424a = C36424a.this;
            if (str.equals(c36424a.f340836e)) {
                c36424a.f340836e = null;
                "allowing consideration of corrupted lib ".concat(str);
                return true;
            }
            if ((this.f340861g & 1) == 0) {
                return true;
            }
            File file = this.f340860f;
            File file2 = new File(file, str);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (!file2.isFile()) {
                        return true;
                    }
                    long length = file2.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file2, Long.valueOf(length), Long.valueOf(size));
                        return true;
                    }
                }
            } catch (IOException e12) {
                e12.toString();
            }
            return false;
        }
    }

    public C36424a(Context context, String str, File file) {
        super(context, str, file);
        this.f340859j = 1;
    }

    @Override // com.facebook.soloader.G
    public final byte[] h() throws IOException {
        int i12;
        Context context = this.f340835d;
        File canonicalFile = this.f340885h.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    i12 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            } else {
                i12 = 0;
            }
            parcelObtain.writeInt(i12);
            if ((this.f340859j & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.r, com.facebook.soloader.G
    public final G.f k() {
        return new C10542a(this);
    }
}
