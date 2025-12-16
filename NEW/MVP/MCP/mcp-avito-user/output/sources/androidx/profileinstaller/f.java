package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f53621a = new a();

    /* renamed from: b, reason: collision with root package name */
    @N
    public static final d f53622b = new b();

    /* compiled from: ProfileInstaller.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface c {
    }

    /* compiled from: ProfileInstaller.java */
    public interface d {
        void a();

        void b(int i12, @P Serializable serializable);
    }

    /* compiled from: ProfileInstaller.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface e {
    }

    @RestrictTo
    public static void a(@N PackageInfo packageInfo, @N File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(@j.N android.content.Context r16, @j.N java.util.concurrent.Executor r17, @j.N androidx.profileinstaller.f.d r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.f.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.f$d, boolean):void");
    }

    /* compiled from: ProfileInstaller.java */
    public class a implements d {
        @Override // androidx.profileinstaller.f.d
        public final void a() {
        }

        @Override // androidx.profileinstaller.f.d
        public final void b(int i12, @P Serializable serializable) {
        }
    }

    /* compiled from: ProfileInstaller.java */
    public class b implements d {
        @Override // androidx.profileinstaller.f.d
        public final void b(int i12, @P Serializable serializable) {
            if (i12 == 6 || i12 == 7 || i12 == 8) {
            }
        }

        @Override // androidx.profileinstaller.f.d
        public final void a() {
        }
    }
}
