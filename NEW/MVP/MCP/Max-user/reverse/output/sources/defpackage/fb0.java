package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class fb0 {
    public static final fb0 d;
    public static final fb0 e;
    public static final fb0 f;
    public static final fb0 g;
    public static final fb0 h;
    public static final fb0 i;
    public static final fb0 j;
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        fb0 fb0Var = new fb0(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        d = fb0Var;
        fb0 fb0Var2 = new fb0(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = fb0Var2;
        fb0 fb0Var3 = new fb0(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = fb0Var3;
        fb0 fb0Var4 = new fb0(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = fb0Var4;
        List list = Collections.EMPTY_LIST;
        fb0 fb0Var5 = new fb0(0, "LOWEST", list);
        h = fb0Var5;
        fb0 fb0Var6 = new fb0(1, "HIGHEST", list);
        i = fb0Var6;
        j = new fb0(-1, "NONE", list);
        k = new HashSet(Arrays.asList(fb0Var5, fb0Var6, fb0Var, fb0Var2, fb0Var3, fb0Var4));
        l = Arrays.asList(fb0Var4, fb0Var3, fb0Var2, fb0Var);
    }

    public fb0(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb0) {
            fb0 fb0Var = (fb0) obj;
            if (this.a == fb0Var.a && this.b.equals(fb0Var.b) && this.c.equals(fb0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", typicalSizes=");
        return az1.j(sb, this.c, "}");
    }
}
