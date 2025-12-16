package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class rnf implements zde, b65 {
    public final zde a;
    public final int b;
    public final int c;

    public rnf(zde zdeVar, int i, int i2) {
        this.a = zdeVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(ho7.f(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(ho7.g("endIndex should be not less than startIndex, but was ", i2, i, " < ").toString());
        }
    }

    @Override // defpackage.b65
    public final zde a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new rnf(this.a, i3, i + i3);
    }

    @Override // defpackage.b65
    public final zde b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? qd5.a : new rnf(this.a, i3 + i, i2);
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        return new cr6(this);
    }
}
