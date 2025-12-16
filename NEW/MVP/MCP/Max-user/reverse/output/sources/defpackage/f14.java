package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class f14 extends th0 {
    public final /* synthetic */ int a;
    public final o00 b;
    public final ps3 c;
    public final em6 d;

    public f14(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new o00(12);
                this.d = new d73(10);
                this.c = new ps3(8);
                break;
            case 2:
                this.b = new o00(12);
                this.d = new dga(2);
                this.c = new ps3(8);
                break;
            default:
                this.b = new o00(12);
                this.d = new d73(9);
                this.c = new ps3(8);
                break;
        }
    }

    @Override // defpackage.th0
    public final Comparator a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.th0
    public final em6 b() {
        switch (this.a) {
            case 0:
                return (d73) this.d;
            case 1:
                return (d73) this.d;
            default:
                return (dga) this.d;
        }
    }

    @Override // defpackage.th0
    public final cm6 c() {
        switch (this.a) {
        }
        return this.c;
    }
}
