package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class wm4 {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public jbe a = new jbe(18);
    public boolean b;

    public static void a(ArrayList arrayList, int i) {
        if (jni.f(i, 0, 7, c) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public qw0 b(int i, hf6 hf6Var, boolean z, ArrayList arrayList, i4c i4cVar) {
        gp5 kj6Var;
        String str = hf6Var.m;
        if (!xz9.l(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                kj6Var = new jr8(this.a, this.b ? 1 : 3);
            } else if (Objects.equals(str, "image/jpeg")) {
                kj6Var = new go4(1);
            } else if (Objects.equals(str, "image/png")) {
                kj6Var = new yq0(1);
            } else {
                int i2 = z ? 4 : 0;
                if (!this.b) {
                    i2 |= 32;
                }
                kj6Var = new kj6(this.a, i2, null, arrayList, i4cVar);
            }
        } else {
            if (!this.b) {
                return null;
            }
            kj6Var = new mof(this.a.x(hf6Var), hf6Var);
        }
        return new qw0(kj6Var, i, hf6Var);
    }

    public hf6 c(hf6 hf6Var) {
        if (!this.b || !this.a.f(hf6Var)) {
            return hf6Var;
        }
        ff6 ff6VarA = hf6Var.a();
        String str = hf6Var.k;
        ff6VarA.m = xz9.n("application/x-media3-cues");
        ff6VarA.K = this.a.J(hf6Var);
        StringBuilder sb = new StringBuilder();
        sb.append(hf6Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        ff6VarA.j = sb.toString();
        ff6VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        return new hf6(ff6VarA);
    }
}
