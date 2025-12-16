package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import com.facebook.soloader.a;
import com.facebook.soloader.e;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class hg0 extends urg {
    public final File e;
    public final String f;
    public final int g;

    public hg0(Context context, File file, String str) {
        super(context, str);
        this.e = file;
        this.f = "^lib/([^/]+)/([^/]+\\.so)$";
        this.g = 1;
    }

    @Override // defpackage.hx4, defpackage.h6f
    public final String b() {
        return "BackupSoSource";
    }

    @Override // defpackage.urg
    public final byte[] e() throws IOException {
        int i;
        Context context = this.d;
        File canonicalFile = this.e.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            } else {
                i = 0;
            }
            parcelObtain.writeInt(i);
            if ((this.g & 1) == 0) {
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

    @Override // defpackage.urg
    public final e g(boolean z) {
        return new a(this, this, z);
    }
}
