package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class xx5 extends wx5 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // defpackage.by5
    public final File a() {
        int i;
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return file;
    }
}
