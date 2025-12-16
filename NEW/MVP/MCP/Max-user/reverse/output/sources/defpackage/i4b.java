package defpackage;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class i4b implements FileFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return jz5.c(file).equals("zip");
            case 1:
                return jz5.c(file).equals("zip");
            default:
                return jz5.c(file).equals("log");
        }
    }
}
