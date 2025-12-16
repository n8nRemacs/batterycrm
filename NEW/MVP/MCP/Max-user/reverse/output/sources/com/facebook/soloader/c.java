package com.facebook.soloader;

import defpackage.n2;
import defpackage.rw5;
import defpackage.wm5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends e {
    public final wm5[] a;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
    
        throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(defpackage.xm5 r18, defpackage.xm5 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.<init>(xm5, xm5):void");
    }

    @Override // com.facebook.soloader.e
    public final n2[] l() {
        return this.a;
    }

    @Override // com.facebook.soloader.e
    public final void w(File file) throws IOException {
        byte[] bArr = new byte[32768];
        for (wm5 wm5Var : this.a) {
            FileInputStream fileInputStream = new FileInputStream(wm5Var.d);
            try {
                rw5 rw5Var = new rw5(wm5Var, 2, fileInputStream);
                fileInputStream = null;
                try {
                    e.c(rw5Var, bArr, file);
                    rw5Var.close();
                } finally {
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
    }
}
