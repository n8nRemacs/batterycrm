package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class v40 implements q30 {
    public boolean X;
    public final t40 Y;
    public final l7a a;
    public final vpc b;
    public final bwf c;
    public final r30 d;
    public boolean o;

    public v40(Context context, l7a l7aVar, vpc vpcVar) {
        this.a = l7aVar;
        this.b = vpcVar;
        bwf bwfVarD = w40.a.getAccessor().d(15);
        this.c = new bwf(new o40(context, 3));
        this.d = new r30(context, this);
        kce kceVar = new kce(4, this);
        this.Y = new t40(this);
        bwf bwfVar = new bwf(new i6(12, this));
        ((b8a) l7aVar).b(kceVar);
        ((hw1) ((tv1) bwfVarD.getValue())).e((u40) bwfVar.getValue());
    }

    public static final boolean c(v40 v40Var) {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) v40Var.c.getValue()).getDevices(2)) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void e(v40 v40Var) {
        r30 r30Var = v40Var.d;
        if (((b8a) v40Var.a).H0) {
            r30Var.r(1, 4);
            v40Var.g();
            return;
        }
        r30Var.q();
        vpc vpcVar = v40Var.b;
        if (v40Var.o) {
            v40Var.o = false;
            vpcVar.b();
            vpcVar.h.remove(v40Var.Y);
        }
    }

    @Override // defpackage.q30
    public final float a() {
        return ((b8a) this.a).J0;
    }

    @Override // defpackage.q30
    public final void b(float f) {
    }

    @Override // defpackage.q30
    public final boolean d() {
        return ((b8a) this.a).H0;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final void f(long j, long j2, String str, String str2, String str3, String str4) {
        b8a b8aVar = (b8a) this.a;
        k7a k7aVarL = b8aVar.l();
        Object obj = k7aVarL != null ? k7aVarL.c.get("MediaMetadata.Extra.MESSAGE_ID") : null;
        Long l = obj instanceof Long ? (Long) obj : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue == j2 && b8aVar.I0) {
            b8aVar.s();
            return;
        }
        if (jLongValue == j2 && b8aVar.H0) {
            b8aVar.o();
        } else if (jLongValue == j2 && b8aVar.G0) {
            b8aVar.p();
        } else {
            svi.e(b8aVar.Z, ((q2b) b8aVar.b).b(), null, new v7a(new h7a(j, j2, str, str2, str3, str4), b8aVar, null), 2);
        }
    }

    public final void g() {
        if (this.X && !this.o && ((b8a) this.a).H0) {
            this.o = true;
            vpc vpcVar = this.b;
            vpcVar.a();
            vpcVar.h.add(this.Y);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.d.p(i);
    }

    @Override // defpackage.q30
    public final void pause() {
        l7a l7aVar = this.a;
        if (((b8a) l7aVar).m()) {
            return;
        }
        ((b8a) l7aVar).o();
    }

    @Override // defpackage.q30
    public final void play() {
        l7a l7aVar = this.a;
        if (((b8a) l7aVar).m()) {
            return;
        }
        this.d.r(1, 4);
        ((b8a) l7aVar).p();
    }
}
