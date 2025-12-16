package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gc0 implements df5 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final x90 e;
    public final z90 f;

    public gc0(int i, int i2, List list, List list2, x90 x90Var, z90 z90Var) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
        this.e = x90Var;
        if (z90Var == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f = z90Var;
    }

    @Override // defpackage.df5
    public final int a() {
        return this.a;
    }

    @Override // defpackage.df5
    public final int b() {
        return this.b;
    }

    @Override // defpackage.df5
    public final List c() {
        return this.c;
    }

    @Override // defpackage.df5
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        x90 x90Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gc0) {
            gc0 gc0Var = (gc0) obj;
            int i = gc0Var.a;
            x90 x90Var2 = gc0Var.e;
            if (this.a == i && this.b == gc0Var.b && this.c.equals(gc0Var.c) && this.d.equals(gc0Var.d) && ((x90Var = this.e) != null ? x90Var.equals(x90Var2) : x90Var2 == null) && this.f.equals(gc0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        x90 x90Var = this.e;
        return ((iHashCode ^ (x90Var == null ? 0 : x90Var.hashCode())) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
