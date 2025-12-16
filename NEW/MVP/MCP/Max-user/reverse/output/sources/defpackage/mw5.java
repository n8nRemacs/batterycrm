package defpackage;

import android.content.Context;
import java.io.File;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class mw5 {
    public static final /* synthetic */ yy7[] f = {new toc(mw5.class, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0), ho7.d(vid.a, mw5.class, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), new toc(mw5.class, "dispatcher", "getDispatcher()Lru/ok/tamtam/coroutines/IoDispatcher;", 0), new toc(mw5.class, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0)};
    public static final String g = mw5.class.getName();
    public final Context a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;
    public final bwf e = new bwf(new nq5(4));

    public mw5(Context context, kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3) {
        this.a = context;
        this.b = kz4Var;
        this.c = kz4Var2;
        this.d = kz4Var3;
    }

    public final void a(File file, boolean z) {
        if (file == null) {
            wqi.q(g, "file is null!", new Object[0]);
            return;
        }
        f84 f84Var = (f84) this.e.getValue();
        yy7 yy7Var = f[2];
        svi.e(f84Var, ((ms7) this.c.get()).a.plus(bia.a), null, new lw5(file, this, z, null), 2);
    }

    public final void b(File file) {
        try {
            kz4 kz4Var = this.d;
            yy7 yy7Var = f[3];
            l5c l5cVar = (l5c) ((age) kz4Var.get());
            l5cVar.getClass();
            long j = 1024;
            long jM = (int) l5cVar.m(PmsKey.f81maxdownloadedsizefornotifykb, j);
            long length = file.length();
            if (length < 0) {
                length = 0;
            }
            a(file, jM < length / j);
        } catch (Throwable th) {
            wqi.e(g, "notifyWithForegroundCheckAndSize fail!", th);
        }
    }
}
