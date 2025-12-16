package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class sv5 {
    public final qx5 a;
    public File b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public File j;
    public List k;

    public sv5(qx5 qx5Var) {
        this.a = qx5Var;
    }

    public final File a(zy0 zy0Var) {
        int iOrdinal = zy0Var.ordinal();
        qx5 qx5Var = this.a;
        switch (iOrdinal) {
            case 0:
                if (this.b == null) {
                    this.b = new File(iz5.b(((iz5) qx5Var).c));
                }
                return this.b;
            case 1:
                if (this.d == null) {
                    this.d = ((iz5) qx5Var).k();
                }
                return this.d;
            case 2:
                if (this.e == null) {
                    iz5 iz5Var = (iz5) qx5Var;
                    iz5Var.getClass();
                    this.e = iz5.g(iz5.b(iz5Var.c), "audioCache");
                }
                return this.e;
            case 3:
                if (this.g == null) {
                    iz5 iz5Var2 = (iz5) qx5Var;
                    iz5Var2.getClass();
                    this.g = iz5.g(iz5.b(iz5Var2.c), "gifCache");
                }
                return this.g;
            case 4:
                if (this.f == null) {
                    this.f = ((iz5) qx5Var).n();
                }
                return this.f;
            case 5:
                if (this.c == null) {
                    iz5 iz5Var3 = (iz5) qx5Var;
                    iz5Var3.getClass();
                    this.c = iz5.g(iz5.b(iz5Var3.c), "upload");
                }
                return this.c;
            case 6:
                if (this.h == null) {
                    iz5 iz5Var4 = (iz5) qx5Var;
                    iz5Var4.getClass();
                    this.h = iz5.g(iz5.b(iz5Var4.c), "exo_files_cache");
                }
                return this.h;
            case 7:
                if (this.i == null) {
                    iz5 iz5Var5 = (iz5) qx5Var;
                    iz5Var5.getClass();
                    this.i = iz5.g(iz5.b(iz5Var5.c), "videoCache");
                }
                return this.i;
            case 8:
                if (this.j == null) {
                    iz5 iz5Var6 = (iz5) qx5Var;
                    iz5Var6.getClass();
                    this.j = iz5.g(iz5.b(iz5Var6.c), "ringtones");
                }
                return this.j;
            default:
                return null;
        }
    }
}
