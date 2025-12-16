package defpackage;

/* loaded from: classes.dex */
public final class xl3 extends os0 {
    public final boolean c;

    public xl3(bj bjVar, boolean z) {
        super(bjVar);
        this.c = z;
    }

    @Override // defpackage.os0
    public final void n(byte b) {
        if (this.c) {
            u(String.valueOf(b & 255));
        } else {
            s(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.os0
    public final void q(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            u(unsignedString);
        } else {
            s(unsignedString);
        }
    }

    @Override // defpackage.os0
    public final void r(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            u(unsignedString);
        } else {
            s(unsignedString);
        }
    }

    @Override // defpackage.os0
    public final void t(short s) {
        if (this.c) {
            u(String.valueOf(s & 65535));
        } else {
            s(String.valueOf(s & 65535));
        }
    }
}
