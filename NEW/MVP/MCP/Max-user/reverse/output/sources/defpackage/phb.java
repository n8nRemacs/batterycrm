package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpErrorException;

/* loaded from: classes2.dex */
public final class phb implements ivg {
    public final ExecutorService a;
    public final String b;
    public final tgg c;
    public final String d;
    public final Uri e;
    public final File f;
    public final long g;
    public long h;

    public phb(String str, String str2, ExecutorService executorService, String str3, tgg tggVar) throws HttpErrorException {
        this.a = executorService;
        this.b = str3;
        this.c = tggVar;
        String name = phb.class.getName();
        this.d = name;
        this.e = Uri.parse(str);
        File file = new File(str2);
        this.f = file;
        long length = file.length();
        this.g = length;
        if (!file.exists()) {
            wqi.e(name, "File by path not found=".concat(str2), null);
            throw new HttpErrorException("File not found", null, null, 6);
        }
        if (length == 0) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.Y;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "Upload failed: trying to upload file with zero length", null);
                }
            }
            throw new HttpErrorException("File is zero length", null, null, 6);
        }
    }

    @Override // defpackage.ivg
    public final n46 a() {
        return new n46(new mwd(new d56(gw0.l(new lo1(gw0.f(new ohb(this, null)), 3), new cj0(24)), new ny5(3, null, 1), null)), new kga(this, (Continuation) null, 4));
    }
}
