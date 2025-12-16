package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes2.dex */
public final class p28 implements d1e {
    public final Context b;
    public final vob c;
    public final c28 d;

    public p28(Context context, vob vobVar, c28 c28Var) {
        this.b = context;
        this.c = vobVar;
        this.d = c28Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.d1e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(defpackage.e1e r5, java.lang.String r6) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r1)
            if (r1 == 0) goto L21
            java.io.File r2 = new java.io.File
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r3 = "MAX"
            r2.<init>(r1, r3)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L22
            boolean r1 = r2.mkdirs()
            if (r1 != 0) goto L22
        L21:
            r2 = 0
        L22:
            r0.<init>(r2, r6)
            r5.n(r0)
            android.net.Uri r5 = android.net.Uri.fromFile(r0)
            android.content.Context r6 = r4.b
            defpackage.d1e.e(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p28.a(e1e, java.lang.String):android.net.Uri");
    }

    @Override // defpackage.d1e
    public final Uri b(e1e e1eVar, String str) {
        vob vobVar = this.c;
        File file = new File(vobVar.a(), str);
        e1eVar.n(file);
        Context context = vobVar.a;
        return FileProvider.d(context, file, context.getPackageName() + ".provider");
    }

    @Override // defpackage.d1e
    public final c28 d() {
        return this.d;
    }
}
