package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class xe4 {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;

    public ye4 a() {
        if (this.a != null) {
            return new ye4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public ze4 b() {
        hsi.i(this.a, "The uri must be set.");
        return new ze4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
