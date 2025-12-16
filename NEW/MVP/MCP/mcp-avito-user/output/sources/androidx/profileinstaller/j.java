package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import j.X;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.concurrent.futures.e<c> f53629a = new androidx.concurrent.futures.e<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f53630b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @P
    public static c f53631c = null;

    /* compiled from: ProfileVerifier.java */
    @X
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    @RestrictTo
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f53632a;

        /* renamed from: b, reason: collision with root package name */
        public final int f53633b;

        /* renamed from: c, reason: collision with root package name */
        public final long f53634c;

        /* renamed from: d, reason: collision with root package name */
        public final long f53635d;

        public b(int i12, int i13, long j12, long j13) {
            this.f53632a = i12;
            this.f53633b = i13;
            this.f53634c = j12;
            this.f53635d = j13;
        }

        public static b a(@N File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final void b(@N File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f53632a);
                dataOutputStream.writeInt(this.f53633b);
                dataOutputStream.writeLong(this.f53634c);
                dataOutputStream.writeLong(this.f53635d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f53633b == bVar.f53633b && this.f53634c == bVar.f53634c && this.f53632a == bVar.f53632a && this.f53635d == bVar.f53635d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f53633b), Long.valueOf(this.f53634c), Integer.valueOf(this.f53632a), Long.valueOf(this.f53635d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f53636a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f53637b;

        /* compiled from: ProfileVerifier.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }

        public c(int i12, boolean z12) {
            this.f53636a = i12;
            this.f53637b = z12;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i12, boolean z12) {
        c cVar = new c(i12, z12);
        f53631c = cVar;
        f53629a.j(cVar);
        return f53631c;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    @j.N
    @androidx.annotation.RestrictTo
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(@j.N android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.j.c(android.content.Context, boolean):void");
    }
}
