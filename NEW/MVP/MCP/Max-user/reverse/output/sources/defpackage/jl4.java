package defpackage;

import android.os.Environment;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jl4 implements vx4 {
    public static final long f = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int g = 0;
    public final File a;
    public final boolean b;
    public final File c;
    public final qha d;
    public final r8j e;

    public jl4(File file, int i, qha qhaVar) {
        this.a = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    qhaVar.getClass();
                }
            }
        } catch (Exception unused2) {
            qhaVar.getClass();
        }
        this.b = zContains;
        File file2 = new File(this.a, ho7.f(i, "v2.ols100."));
        this.c = file2;
        this.d = qhaVar;
        File file3 = this.a;
        if (!file3.exists()) {
            obj.a(file2);
        } else if (!file2.exists()) {
            ibj.b(file3);
            try {
                obj.a(file2);
            } catch (FileUtils$CreateDirectoryException unused3) {
                qha qhaVar2 = this.d;
                Objects.toString(file2);
                qhaVar2.getClass();
            }
        }
        this.e = r8j.A0;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hl4 g(defpackage.jl4 r8, java.io.File r9) {
        /*
            java.lang.String r0 = r9.getName()
            r1 = 46
            int r2 = r0.lastIndexOf(r1)
            r3 = 0
            if (r2 > 0) goto Lf
        Ld:
            r1 = r3
            goto L46
        Lf:
            java.lang.String r4 = r0.substring(r2)
            java.lang.String r5 = ".cnt"
            boolean r6 = r5.equals(r4)
            java.lang.String r7 = ".tmp"
            if (r6 == 0) goto L1e
            goto L27
        L1e:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L26
            r5 = r7
            goto L27
        L26:
            r5 = r3
        L27:
            if (r5 != 0) goto L2a
            goto Ld
        L2a:
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r2)
            boolean r2 = r5.equals(r7)
            if (r2 == 0) goto L40
            int r1 = r0.lastIndexOf(r1)
            if (r1 > 0) goto L3c
            goto Ld
        L3c:
            java.lang.String r0 = r0.substring(r4, r1)
        L40:
            hl4 r1 = new hl4
            r2 = 0
            r1.<init>(r5, r0, r2)
        L46:
            if (r1 != 0) goto L49
            goto L5f
        L49:
            java.lang.String r0 = r1.c
            java.io.File r2 = new java.io.File
            java.lang.String r8 = r8.i(r0)
            r2.<init>(r8)
            java.io.File r8 = r9.getParentFile()
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L5f
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl4.g(jl4, java.io.File):hl4");
    }

    @Override // defpackage.vx4
    public final mv5 a(Object obj, String str) {
        File fileH = h(str);
        if (!fileH.exists()) {
            return null;
        }
        this.e.getClass();
        fileH.setLastModified(System.currentTimeMillis());
        return new mv5(fileH);
    }

    @Override // defpackage.vx4
    public final void b() {
        ibj.c(this.a, new os0(this));
    }

    @Override // defpackage.vx4
    public final long c(gl4 gl4Var) {
        File file = gl4Var.b.a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // defpackage.vx4
    public final Collection d() {
        xo8 xo8Var = new xo8(this);
        ibj.c(this.c, xo8Var);
        return Collections.unmodifiableList((ArrayList) xo8Var.b);
    }

    @Override // defpackage.vx4
    public final hc8 e(String str, c1f c1fVar) throws IOException {
        File file = new File(i(str));
        boolean zExists = file.exists();
        qha qhaVar = this.d;
        if (!zExists) {
            try {
                obj.a(file);
            } catch (FileUtils$CreateDirectoryException e) {
                qhaVar.getClass();
                throw e;
            }
        }
        try {
            return new hc8(this, str, File.createTempFile(str.concat("."), ".tmp", file));
        } catch (IOException e2) {
            qhaVar.getClass();
            throw e2;
        }
    }

    @Override // defpackage.vx4
    public final void f() {
        File[] fileArrListFiles = this.a.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                ibj.b(file);
            }
        }
    }

    public final File h(String str) {
        return new File(ctd.j(az1.m(i(str)), File.separator, str, ".cnt"));
    }

    public final String i(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        return ho7.l(sb, File.separator, strValueOf);
    }

    @Override // defpackage.vx4
    public final boolean isExternal() {
        return this.b;
    }
}
