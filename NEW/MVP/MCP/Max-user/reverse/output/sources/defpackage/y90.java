package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y90 implements df5 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public y90(int i, int i2, List list, List list2) {
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
    }

    public static y90 e(int i, int i2, List list, List list2) {
        return new y90(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof y90) {
            y90 y90Var = (y90) obj;
            if (this.a == y90Var.a && this.b == y90Var.b && this.c.equals(y90Var.c) && this.d.equals(y90Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return az1.j(sb, this.d, "}");
    }
}
