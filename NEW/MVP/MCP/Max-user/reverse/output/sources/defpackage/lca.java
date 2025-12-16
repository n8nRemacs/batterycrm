package defpackage;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class lca {
    public final Context a;
    public volatile int b = 1;
    public final Object c = new Object();

    public lca(Context context) {
        this.a = context;
    }

    public final boolean a(kca kcaVar) {
        if (this.b == 1) {
            synchronized (this.c) {
                if (this.b == 1) {
                    try {
                        try {
                            SoLoader.g(this.a, 0);
                            this.b = 2;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable unused) {
                        this.b = 3;
                    }
                }
            }
        }
        if (this.b != 2) {
            return false;
        }
        try {
            String str = kcaVar.a;
            if (SoLoader.k) {
                SoLoader.m(0, str);
            } else {
                nca.b(str);
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
