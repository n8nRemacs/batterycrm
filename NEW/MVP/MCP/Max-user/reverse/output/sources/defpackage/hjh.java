package defpackage;

/* loaded from: classes.dex */
public final class hjh implements ry9 {
    public final String a;
    public final String b;

    public hjh(String str, String str2) {
        this.a = dsi.k(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ry9
    public final void a(u19 u19Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer numJ = jni.j(str2);
                if (numJ != null) {
                    u19Var.o = numJ;
                    break;
                }
                break;
            case 1:
                Integer numJ2 = jni.j(str2);
                if (numJ2 != null) {
                    u19Var.C = numJ2;
                    break;
                }
                break;
            case 2:
                Integer numJ3 = jni.j(str2);
                if (numJ3 != null) {
                    u19Var.n = numJ3;
                    break;
                }
                break;
            case 3:
                u19Var.c = str2;
                break;
            case 4:
                u19Var.D = str2;
                break;
            case 5:
                u19Var.a = str2;
                break;
            case 6:
                u19Var.g = str2;
                break;
            case 7:
                Integer numJ4 = jni.j(str2);
                if (numJ4 != null) {
                    u19Var.B = numJ4;
                    break;
                }
                break;
            case '\b':
                u19Var.d = str2;
                break;
            case '\t':
                u19Var.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hjh.class == obj.getClass()) {
            hjh hjhVar = (hjh) obj;
            if (this.a.equals(hjhVar.a) && this.b.equals(hjhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + u45.e(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
