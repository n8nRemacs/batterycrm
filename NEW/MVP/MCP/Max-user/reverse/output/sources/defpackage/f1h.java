package defpackage;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class f1h extends bid {
    public final long a;
    public final jr9 b;
    public final wu9 c;
    public final ts9 d;
    public RecyclerView f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final float s;
    public boolean t;
    public final fj2 u;
    public final String e = f1h.class.getName();
    public final Rect m = new Rect();
    public final n8a n = new n8a((Object) null);
    public final n8a o = new n8a((Object) null);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f1h(defpackage.k18 r15, defpackage.k18 r16, defpackage.o80 r17, defpackage.k18 r18, defpackage.k18 r19, defpackage.k18 r20, defpackage.k18 r21, long r22, defpackage.jr9 r24, defpackage.wu9 r25, defpackage.ts9 r26, defpackage.lzf r27, defpackage.v38 r28) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1h.<init>(k18, k18, o80, k18, k18, k18, k18, long, jr9, wu9, ts9, lzf, v38):void");
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        f(recyclerView, false);
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lz lzVar;
        lg8 lg8Var = lg8.d;
        this.f = recyclerView;
        if (this.p) {
            LinearLayoutManager linearLayoutManagerE = x7j.e(recyclerView);
            int iX0 = linearLayoutManagerE != null ? linearLayoutManagerE.X0() : -1;
            int iZ0 = linearLayoutManagerE != null ? linearLayoutManagerE.Z0() : -1;
            if (iX0 == -1 || iZ0 == -1) {
                String str = this.e;
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, wy1.g("Player autoplay. Can't start fetch because invalid positions, first:", iX0, ", last:", iZ0, "."), null);
                    return;
                }
                return;
            }
            if (iX0 <= iZ0) {
                int i3 = iX0;
                while (true) {
                    mid midVarM = recyclerView.M(i3);
                    if (midVarM == null) {
                        String str2 = this.e;
                        l6b l6bVar2 = wqi.a;
                        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                            StringBuilder sbK = wy1.k("Player autoplay. Can't find viewHolder for fetch, pos:", i3, ", firstPos:", iX0, "|lastPos:");
                            sbK.append(iZ0);
                            l6bVar2.c(lg8Var, str2, sbK.toString(), null);
                        }
                    } else if (midVarM instanceof bi9) {
                        bi9 bi9Var = (bi9) midVarM;
                        if (bi9Var.I0 instanceof qdh) {
                            MessageModel messageModelE = this.b.e(bi9Var.J0);
                            m00 m00Var = (messageModelE == null || (lzVar = messageModelE.t0) == null) ? null : lzVar.b;
                            v0h v0hVar = m00Var instanceof v0h ? (v0h) m00Var : null;
                            if (v0hVar != null) {
                                if (!v0hVar.a()) {
                                    String str3 = this.e;
                                    l6b l6bVar3 = wqi.a;
                                    if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                                        l6bVar3.c(lg8Var, str3, a9h.d(messageModelE.a, "Player autoplay. Don't fetch video for videoAttach, msgId:", " because it's not ready to autoplay"), null);
                                    }
                                } else if (v0hVar instanceof b5h) {
                                    this.o.a(((b5h) v0hVar).a);
                                } else {
                                    this.n.a(v0hVar.j());
                                }
                            }
                        }
                    }
                    if (i3 == iZ0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (this.o.j()) {
                i6h i6hVar = (i6h) this.j.getValue();
                long j = this.a;
                List listUnmodifiableList = Collections.unmodifiableList(dsi.h(this.o));
                i6hVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listUnmodifiableList) {
                    if (i6hVar.k.add(i6h.c(j, ((Number) obj).longValue()))) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    svi.e(i6hVar.j, null, null, new e6h(i6hVar, listUnmodifiableList, arrayList, j, null), 3);
                }
                this.o.c();
            }
            if (this.n.j()) {
                s3h s3hVar = (s3h) this.h.getValue();
                svi.e(s3hVar.m, null, null, new p3h(Collections.unmodifiableList(dsi.h(this.n)), s3hVar, this.a, null), 3);
                this.n.c();
            }
        }
    }

    public final void c(cbh cbhVar, String str) {
        qdh qdhVar;
        cbhVar.clear();
        ((k4c) this.g.getValue()).a(cbhVar);
        d1h d1hVar = (d1h) this.u.e(str);
        if (d1hVar == null || (qdhVar = (qdh) d1hVar.X.get()) == null) {
            return;
        }
        qdhVar.w();
    }

    public final void d() {
        String str = this.e;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Player autoplay. onMediaProcessingStarted.", null);
            }
        }
        this.t = true;
        if (((r4c) this.i.getValue()).a) {
            return;
        }
        this.u.i(-1);
    }

    public final void e(qdh qdhVar, final d1h d1hVar, m00 m00Var, MessageModel messageModel, final cbh cbhVar, final g2h g2hVar) {
        boolean z = (messageModel.w0 == null && messageModel.x0 == null && (messageModel.H0 == null || (messageModel.K0 & (-2080374787)) == 0)) ? false : true;
        long j = messageModel.a;
        k18 k18Var = this.k;
        qdhVar.p(d1hVar, m00Var, j, z, !((gu5) ((rt5) k18Var.getValue())).r());
        qdhVar.setVideoClickListener(new sm6() { // from class: w0h
            @Override // defpackage.sm6
            public final Object invoke(Object obj, Object obj2) {
                Object a1hVar;
                f1h f1hVar = this.a;
                d1h d1hVar2 = d1hVar;
                cbh cbhVar2 = cbhVar;
                g2h g2hVar2 = g2hVar;
                m00 m00Var2 = (m00) obj;
                long jLongValue = ((Long) obj2).longValue();
                String str = d1hVar2.a;
                if (m00Var2 instanceof b5h) {
                    String str2 = f1hVar.e;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            int iG = f1hVar.u.g();
                            boolean zD = cbhVar2.d();
                            StringBuilder sbN = ho7.n("Player autoplay. stop autoplay to start a video message, \n                                |msgId:", jLongValue, ", \n                                |attachId:", str);
                            sbN.append("\n                                |states count:");
                            sbN.append(iG);
                            sbN.append("\n                                |playing:");
                            sbN.append(zD);
                            l6bVar.c(lg8Var, str2, wmf.e(sbN.toString()), null);
                        }
                    }
                    f1hVar.c(cbhVar2, str);
                    a1hVar = new b1h(jLongValue, (b5h) m00Var2);
                } else {
                    a1hVar = new a1h(jLongValue, str, m00Var2, cbhVar2.e(), m00Var2 instanceof n2f ? 0L : cbhVar2.getDuration(), g2hVar2.g());
                }
                f1hVar.c.invoke(a1hVar);
                return qqg.a;
            }
        });
        if (((gu5) ((rt5) k18Var.getValue())).r()) {
            cbhVar.X(new iu6(qdhVar, cbhVar, 1));
        }
        qdhVar.setVideoLongClickListener(new qk(26, this));
        cbhVar.Q(true);
        cbhVar.b(0.0f);
        cbhVar.I0(g2hVar, true, bbh.BUBBLE, (16 & 8) != 0 ? 1 : 4, (16 & 16) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(androidx.recyclerview.widget.RecyclerView r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1h.f(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }
}
