package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class vad extends xfh {
    public final bwf B0;
    public final jve C0;
    public final gbd D0;
    public final tcf E0;
    public final o9d X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final w63 c;
    public final age d;
    public final tw0 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final bwf x0;
    public final int w0 = 1;
    public final boolean y0 = true;
    public final und z0 = new und(new lad(this, 0));
    public final n8a A0 = new n8a((Object) null);

    public vad(long j, w63 w63Var, age ageVar, tw0 tw0Var, o9d o9dVar, bwf bwfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9) {
        this.b = j;
        this.c = w63Var;
        this.d = ageVar;
        this.o = tw0Var;
        this.X = o9dVar;
        this.Y = k18Var3;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        this.t0 = k18Var;
        this.u0 = k18Var7;
        this.v0 = k18Var8;
        this.x0 = new bwf(new da1(this, k18Var, k18Var6, 14));
        this.B0 = new bwf(new fq(this, bwfVar, k18Var9, k18Var2));
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 4);
        this.C0 = jveVarB;
        this.D0 = new gbd(jveVarB);
        tcf tcfVarA = ucf.a(null);
        this.E0 = tcfVarA;
        svi.e(this.a, ((kl4) k18Var.getValue()).a, null, new nad(this, null), 2);
        tw0Var.d(this);
        gw0.w(gw0.u(new g56(new m11(20, obj.c(new d53(tcfVarA, 12))), new oad(this, null), 1), ((kl4) k18Var.getValue()).a), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.vad r26, defpackage.pad r27, defpackage.q44 r28) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vad.t(vad, pad, q44):java.lang.Object");
    }

    public static Drawable v(x8d x8dVar) {
        j7f j7fVar;
        Spanned spanned;
        CharSequence charSequence = x8dVar.a;
        int length = charSequence.length();
        try {
            spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, j7f.class) : null;
        j7f[] j7fVarArr = (j7f[]) spans;
        if (j7fVarArr == null || (j7fVar = (j7f) ys.w(j7fVarArr)) == null) {
            return null;
        }
        return j7fVar.b();
    }

    @vnf
    public final void onEvent(ti2 ti2Var) {
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "sdk:ReactionsViewModel", a9h.d(this.b, "onEvent: ChatLastReactionUpdatedEvent: chat.id = ", ", event.lastReactedMessageId = 0"), null);
        }
    }

    @vnf
    public final void onMessageDeleteEvent(q4a q4aVar) {
        if (q4aVar.b != this.b) {
            return;
        }
        Iterator it = q4aVar.o.iterator();
        while (it.hasNext()) {
            this.A0.a(((Long) it.next()).longValue());
        }
    }

    @Override // defpackage.xfh
    public final void s() {
        wqi.c("sdk:ReactionsViewModel", "onCleared", new Object[0]);
        try {
            this.o.f(this);
        } catch (Throwable unused) {
        }
        u();
    }

    public final void u() {
        wqi.c("sdk:ReactionsViewModel", "cancelChatSubscribeNotifObserving", new Object[0]);
        svi.e(this.a, bia.a.plus(((kl4) this.t0.getValue()).a), null, new qad(this, null), 2);
    }

    public final pb2 w() {
        return (pb2) this.c.j(this.b).a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o98 x(defpackage.xl9 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vad.x(xl9, boolean):o98");
    }

    public final boolean y() {
        pb2 pb2VarW;
        if (this.y0 && (pb2VarW = w()) != null) {
            return ((!pb2VarW.F() && !pb2VarW.V()) || pb2VarW.I() || pb2VarW.U()) ? false : true;
        }
        return false;
    }

    public final void z(pad padVar) {
        if (this.y0 && y()) {
            if (vmf.F(padVar.a)) {
                wqi.q("sdk:ReactionsViewModel", "updateSelfReaction: reaction is blank!", new Object[0]);
                return;
            }
            if (this.A0.d(padVar.c)) {
                return;
            }
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    x8d x8dVar = padVar.a;
                    l6bVar.c(lg8Var, "sdk:ReactionsViewModel", "updateSelfReaction: " + ((Object) x8dVar) + " for " + padVar.b, null);
                }
            }
            this.E0.m(null, new yh5(padVar));
        }
    }
}
