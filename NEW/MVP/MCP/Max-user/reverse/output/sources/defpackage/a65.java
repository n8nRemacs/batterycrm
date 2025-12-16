package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class a65 implements zde, b65 {
    public final /* synthetic */ int a;
    public final zde b;
    public final int c;

    public a65(zde zdeVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = zdeVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
            default:
                this.b = zdeVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // defpackage.b65
    public final zde a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new a65(this, i, 1) : new rnf(this.b, i2, i3);
            default:
                return i >= this.c ? this : new a65(this.b, i, 1);
        }
    }

    @Override // defpackage.b65
    public final zde b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new a65(this, i, 0) : new a65(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? qd5.a : new rnf(this.b, i, i3);
        }
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new z55(this);
            default:
                return new z55(this, (byte) 0);
        }
    }
}
