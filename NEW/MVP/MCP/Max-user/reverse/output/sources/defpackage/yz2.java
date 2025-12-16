package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class yz2 extends sm implements j1g, tsb {
    public final int X;
    public final String Y;
    public final boolean Z;
    public final long d;
    public final long o;
    public final String s0;
    public final Map t0;
    public final String u0;
    public final String v0;
    public final n10 w0;
    public final Long x0;
    public final boolean y0;
    public final long z0;

    public yz2(long j, long j2, long j3, int i, String str, boolean z, String str2, Map map, String str3, String str4, n10 n10Var, Long l, boolean z2, long j4) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = i;
        this.Y = str;
        this.Z = z;
        this.s0 = str2;
        this.t0 = map;
        this.u0 = str3;
        this.v0 = str4;
        this.w0 = n10Var;
        this.x0 = l;
        this.y0 = z2;
        this.z0 = j4;
    }

    @Override // defpackage.tsb
    public final int c() {
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM == null) {
            return 3;
        }
        rf2 rf2Var = pb2VarM.b;
        if (rf2Var.a != 0) {
            return 1;
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return !rf2Var.e(((w4e) ((pb3) tmVar.f.getValue())).s()) ? 2 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        zz2 zz2Var = (zz2) l0gVar;
        if (zz2Var.c != null) {
            s();
            l().m0(Collections.singletonList(zz2Var.c));
        }
        k().c(new a03(this.a));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (!qaj.c(pzfVar.b)) {
            s();
            if (this.u0 != null || this.v0 != null || this.x0 != null || this.s0 != null) {
                f();
            }
            j().f(this.o);
        }
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatUpdate chatUpdate = new Tasks.ChatUpdate();
        chatUpdate.requestId = this.a;
        chatUpdate.chatId = this.d;
        chatUpdate.chatServerId = this.o;
        String str = this.u0;
        if (str != null) {
            chatUpdate.theme = str;
        } else {
            chatUpdate.themeIsNull = true;
        }
        String str2 = this.v0;
        if (str2 != null) {
            chatUpdate.photoToken = str2;
        } else {
            chatUpdate.photoTokenIsNull = true;
        }
        n10 n10Var = this.w0;
        if (n10Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = n10Var.b;
            rect.top = n10Var.c;
            rect.right = n10Var.d;
            rect.bottom = n10Var.e;
            chatUpdate.crop = rect;
        }
        Long l = this.x0;
        if (l != null) {
            chatUpdate.pinMessageId = l.longValue();
        } else {
            chatUpdate.pinMessageIdIsNull = true;
        }
        chatUpdate.notifyPin = this.y0;
        String str3 = this.s0;
        if (str3 != null) {
            chatUpdate.description = str3;
        } else {
            chatUpdate.descriptionIsNull = true;
        }
        return fl9.toByteArray(chatUpdate);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.x0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        Long l = this.x0;
        if (l != null && l.longValue() == -1) {
            l = 0L;
        }
        Long l2 = l;
        int i = this.X;
        return new fh2(this.o, i != 0 ? az1.v(i) != 0 ? 3 : 2 : 0, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, l2, this.y0, this.z0);
    }

    public final void s() {
        String str = this.v0;
        long j = this.d;
        if (str != null) {
            l().g0(j, bf2.b);
        }
        if (this.u0 != null) {
            l().g0(j, bf2.a);
        }
        if (this.x0 != null) {
            l().g0(j, bf2.d);
        }
    }
}
