package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class zx5 extends wx5 {
    public boolean b;
    public File[] c;
    public int d;

    @Override // defpackage.by5
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.c;
        int i = this.d;
        this.d = i + 1;
        return fileArr2[i];
    }
}
