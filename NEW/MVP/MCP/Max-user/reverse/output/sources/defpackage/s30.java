package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s30 {
    public final int a;
    public final j30 b;
    public final Handler c;
    public final k20 d;
    public final boolean e;
    public final AudioFocusRequest f;

    public s30(int i, j30 j30Var, Handler handler, k20 k20Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = k20Var;
        this.e = z;
        this.b = j30Var;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes((AudioAttributes) k20Var.b().b).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(j30Var, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30Var = (s30) obj;
        return this.a == s30Var.a && this.e == s30Var.e && this.b.equals(s30Var.b) && Objects.equals(this.c, s30Var.c) && Objects.equals(this.d, s30Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
