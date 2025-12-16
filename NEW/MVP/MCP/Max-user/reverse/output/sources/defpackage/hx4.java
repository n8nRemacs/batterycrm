package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class hx4 extends h6f {
    public final File a;
    public final int b;
    public final List c = Arrays.asList(new String[0]);

    public hx4(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // defpackage.h6f
    public String b() {
        return "DirectorySoSource";
    }

    @Override // defpackage.h6f
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.c.contains(str);
        File file = this.a;
        if (zContains) {
            StringBuilder sbO = ho7.o(str, " is on the denyList, skip loading from ");
            sbO.append(file.getCanonicalPath());
            cri.a("SoLoader", sbO.toString());
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            StringBuilder sbO2 = ho7.o(str, " file not found on ");
            sbO2.append(file.getCanonicalPath());
            cri.e("SoLoader", sbO2.toString());
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        cri.a("SoLoader", str + " file found at " + canonicalPath);
        int i2 = i & 1;
        int i3 = this.b;
        if (i2 != 0 && (i3 & 2) != 0) {
            cri.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((i3 & 1) != 0) {
            ea5 ea5Var = new ea5();
            ea5Var.a = file2;
            FileInputStream fileInputStream = new FileInputStream(ea5Var.a);
            ea5Var.b = fileInputStream;
            ea5Var.c = fileInputStream.getChannel();
            try {
                d.b(str, ea5Var, i, threadPolicy);
                ea5Var.close();
            } catch (Throwable th) {
                try {
                    ea5Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            cri.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.b.q(i, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw dbj.b(str, e);
        }
    }

    @Override // defpackage.h6f
    public final String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return xc0.h(sb, this.b, ']');
    }
}
