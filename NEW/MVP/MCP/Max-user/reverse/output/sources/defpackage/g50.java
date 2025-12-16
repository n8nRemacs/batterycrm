package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g50 {
    public final wg7 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public i50 d;
    public i50 e;
    public boolean f;

    public g50(wg7 wg7Var) {
        this.a = wg7Var;
        i50 i50Var = i50.e;
        this.d = i50Var;
        this.e = i50Var;
        this.f = false;
    }

    public final i50 a(i50 i50Var) {
        if (i50Var.equals(i50.e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(i50Var);
        }
        int i = 0;
        while (true) {
            wg7 wg7Var = this.a;
            if (i >= wg7Var.size()) {
                this.e = i50Var;
                return i50Var;
            }
            l50 l50Var = (l50) wg7Var.get(i);
            i50 i50VarE = l50Var.e(i50Var);
            if (l50Var.isActive()) {
                hsi.g(!i50VarE.equals(i50.e));
                i50Var = i50VarE;
            }
            i++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            wg7 wg7Var = this.a;
            if (i >= wg7Var.size()) {
                break;
            }
            l50 l50Var = (l50) wg7Var.get(i);
            l50Var.flush();
            if (l50Var.isActive()) {
                arrayList.add(l50Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((l50) arrayList.get(i2)).b();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return l50.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(l50.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((l50) this.b.get(c())).a() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        wg7 wg7Var = this.a;
        if (wg7Var.size() != g50Var.a.size()) {
            return false;
        }
        for (int i = 0; i < wg7Var.size(); i++) {
            if (wg7Var.get(i) != g50Var.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    l50 l50Var = (l50) arrayList.get(i);
                    if (!l50Var.a()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : l50.a;
                        long jRemaining = byteBuffer2.remaining();
                        l50Var.c(byteBuffer2);
                        this.c[i] = l50Var.b();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((l50) arrayList.get(i + 1)).d();
                    }
                }
                i++;
            }
        }
    }

    public final void h() {
        if (!f() || this.f) {
            return;
        }
        this.f = true;
        ((l50) this.b.get(0)).d();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i = 0;
        while (true) {
            wg7 wg7Var = this.a;
            if (i >= wg7Var.size()) {
                this.c = new ByteBuffer[0];
                i50 i50Var = i50.e;
                this.d = i50Var;
                this.e = i50Var;
                this.f = false;
                return;
            }
            l50 l50Var = (l50) wg7Var.get(i);
            l50Var.flush();
            l50Var.reset();
            i++;
        }
    }
}
