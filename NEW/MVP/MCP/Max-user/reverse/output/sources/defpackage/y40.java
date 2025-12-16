package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class y40 extends bi9 {
    public final /* synthetic */ int U0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y40(Context context, ViewGroup viewGroup, int i) {
        super(context, viewGroup);
        this.U0 = i;
    }

    @Override // defpackage.bi9, defpackage.d2f
    public void E() {
        switch (this.U0) {
            case 0:
                s40 s40Var = (s40) this.I0;
                s40Var.removeOnAttachStateChangeListener(s40Var.R0);
                x9f x9fVar = s40Var.Q0;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                s40Var.Q0 = null;
                break;
            case 5:
                ((ww5) this.I0).D();
                break;
            case 10:
                x3f x3fVar = (x3f) this.I0;
                x3fVar.removeOnAttachStateChangeListener(x3fVar.N0);
                x9f x9fVar2 = x3fVar.O0;
                if (x9fVar2 != null) {
                    x9fVar2.cancel((CancellationException) null);
                }
                x3fVar.O0 = null;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                v6h v6hVar = (v6h) this.I0;
                v6hVar.removeOnAttachStateChangeListener(v6hVar.G0);
                x9f x9fVar3 = v6hVar.I0;
                if (x9fVar3 != null) {
                    x9fVar3.cancel((CancellationException) null);
                }
                v6hVar.I0 = null;
                x9f x9fVar4 = v6hVar.J0;
                if (x9fVar4 != null) {
                    x9fVar4.cancel((CancellationException) null);
                }
                v6hVar.J0 = null;
                break;
        }
    }

    @Override // defpackage.bi9
    public void L(MessageModel messageModel) {
        r40 r40Var;
        r40 r40Var2;
        rk rkVar;
        switch (this.U0) {
            case 0:
                m00 m00Var = messageModel.t0.b;
                m40 m40Var = m00Var instanceof m40 ? (m40) m00Var : null;
                if (m40Var != null) {
                    boolean zA = du0.a(messageModel.K0 & 2080374784);
                    s40 s40Var = (s40) this.I0;
                    s40Var.F0 = zA;
                    s40Var.N0 = Long.valueOf(m40Var.b);
                    long j = m40Var.i;
                    s40Var.O0 = Long.valueOf(j);
                    s40Var.P0 = m40Var.c;
                    b70 b70Var = s40Var.D0;
                    b70Var.setIncomingMessage(s40Var.F0);
                    b70Var.b(j, m40Var.g);
                    s40Var.E0.setText(m40Var.h);
                    f8j.d(s40Var.v0, 300L, new n40(s40Var, m40Var, 1));
                    s40Var.R0 = new r40(s40Var, 0, m40Var);
                    if (s40Var.isAttachedToWindow() && (r40Var = s40Var.R0) != null) {
                        r40Var.onViewAttachedToWindow(s40Var);
                    }
                    s40Var.addOnAttachStateChangeListener(s40Var.R0);
                    s40Var.requestLayout();
                    break;
                }
                break;
            case 2:
                m00 m00Var2 = messageModel.t0.b;
                u21 u21Var = m00Var2 instanceof u21 ? (u21) m00Var2 : null;
                if (u21Var != null) {
                    ((uf1) this.I0).b(u21Var);
                    break;
                }
                break;
            case 3:
                m00 m00Var3 = messageModel.t0.b;
                ru3 ru3Var = m00Var3 instanceof ru3 ? (ru3) m00Var3 : null;
                if (ru3Var != null) {
                    ((wz3) this.I0).f(ru3Var);
                    break;
                }
                break;
            case 5:
                m00 m00Var4 = messageModel.t0.b;
                hv5 hv5Var = m00Var4 instanceof hv5 ? (hv5) m00Var4 : null;
                if (hv5Var != null) {
                    ((ww5) this.I0).setFileInfo(hv5Var);
                    break;
                }
                break;
            case 6:
                m00 m00Var5 = messageModel.t0.b;
                jr6 jr6Var = m00Var5 instanceof jr6 ? (jr6) m00Var5 : null;
                if (jr6Var != null) {
                    ((kr6) this.I0).b(jr6Var, du0.a(messageModel.K0 & 2080374784));
                    break;
                }
                break;
            case 7:
                m00 m00Var6 = messageModel.t0.b;
                kte kteVar = m00Var6 instanceof kte ? (kte) m00Var6 : null;
                if (kteVar != null) {
                    ((wue) this.I0).o(kteVar, du0.a(messageModel.K0 & 2080374784));
                    break;
                }
                break;
            case 8:
                m00 m00Var7 = messageModel.t0.b;
                bff bffVar = m00Var7 instanceof bff ? (bff) m00Var7 : null;
                if (bffVar != null) {
                    ViewParent viewParent = this.I0;
                    zef zefVar = viewParent instanceof zef ? (zef) viewParent : null;
                    if (zefVar != null) {
                        zefVar.a(bffVar.a);
                    }
                    dff dffVar = viewParent instanceof dff ? (dff) viewParent : null;
                    if (dffVar != null) {
                        dffVar.setIncomingAlignment(messageModel.F0);
                        break;
                    }
                }
                break;
            case 10:
                m00 m00Var8 = messageModel.t0.b;
                s3f s3fVar = m00Var8 instanceof s3f ? (s3f) m00Var8 : null;
                if (s3fVar != null) {
                    x3f x3fVar = (x3f) this.I0;
                    x3fVar.setModel(s3fVar);
                    x3fVar.N0 = new r40(x3fVar, 13, s3fVar);
                    if (x3fVar.isAttachedToWindow() && (r40Var2 = x3fVar.N0) != null) {
                        r40Var2.onViewAttachedToWindow(x3fVar);
                    }
                    x3fVar.addOnAttachStateChangeListener(x3fVar.N0);
                    break;
                }
                break;
            case 11:
                final rsg rsgVar = (rsg) this.I0;
                final long j2 = messageModel.a;
                f8j.d(rsgVar.D0, 300L, new View.OnClickListener() { // from class: qsg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rsgVar.B0.invoke(new xp9(j2));
                    }
                });
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                m00 m00Var9 = messageModel.t0.b;
                b5h b5hVar = m00Var9 instanceof b5h ? (b5h) m00Var9 : null;
                if (b5hVar != null) {
                    ((v6h) this.I0).v(b5hVar, messageModel.F0);
                    break;
                }
                break;
            case 13:
                m00 m00Var10 = messageModel.t0.b;
                s3f s3fVar2 = m00Var10 instanceof s3f ? (s3f) m00Var10 : null;
                if (s3fVar2 != null) {
                    v3f v3fVar = (v3f) this.I0;
                    v3fVar.setModel(s3fVar2);
                    v3fVar.F0 = new rk(8, v3fVar);
                    if (v3fVar.isAttachedToWindow() && (rkVar = v3fVar.F0) != null) {
                        rkVar.onViewAttachedToWindow(v3fVar);
                    }
                    v3fVar.addOnAttachStateChangeListener(v3fVar.F0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bi9
    public void M(yt0 yt0Var) {
        switch (this.U0) {
            case 0:
                ((s40) this.I0).c(yt0Var);
                break;
            case 2:
                ((uf1) this.I0).a(yt0Var);
                break;
            case 3:
                ((wz3) this.I0).c(yt0Var);
                break;
            case 4:
                ((g34) this.I0).a(yt0Var);
                break;
            case 5:
                ((ww5) this.I0).C(yt0Var);
                break;
            case 6:
                ((kr6) this.I0).c(yt0Var);
                break;
            case 7:
                ((wue) this.I0).n(yt0Var);
                break;
            case 9:
                ((x4g) this.I0).y(yt0Var);
                break;
            case 10:
                ((x3f) this.I0).y(yt0Var);
                break;
            case 11:
                ((rsg) this.I0).y(yt0Var);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, k18] */
    @Override // defpackage.bi9
    public void N(th3 th3Var) {
        switch (this.U0) {
            case 0:
                ((s40) this.I0).B0.setBackgroundColor(th3Var.b.g);
                break;
            case 1:
                ViewGroup viewGroup = this.I0;
                cn0 cn0Var = viewGroup instanceof cn0 ? (cn0) viewGroup : null;
                if (cn0Var != null) {
                    if4 if4Var = cn0Var.o;
                    int i = th3Var.g.a;
                    if4Var.setTextColor$message_list_release(i);
                    if4Var.setDateViewStatusColor(i);
                    if4Var.setBackgroundColor(th3Var.b.g);
                    break;
                }
                break;
            case 5:
                ((ww5) this.I0).z(th3Var);
                break;
            case 7:
                ?? r0 = ((wue) this.I0).G0;
                if (r0.e()) {
                    ImageView imageView = (ImageView) r0.getValue();
                    kg3 kg3Var = th3Var.b;
                    imageView.setBackgroundTintList(ColorStateList.valueOf(1543503872));
                    imageView.setImageTintList(ColorStateList.valueOf(-1));
                    break;
                }
                break;
            case 8:
                ViewGroup viewGroup2 = this.I0;
                dff dffVar = viewGroup2 instanceof dff ? (dff) viewGroup2 : null;
                if (dffVar != null) {
                    if4 if4Var2 = dffVar.s0;
                    int i2 = th3Var.g.a;
                    if4Var2.setTextColor$message_list_release(i2);
                    if4Var2.setDateViewStatusColor(i2);
                    if4Var2.setBackgroundColor(th3Var.b.g);
                    break;
                }
                break;
            case 9:
                ((x4g) this.I0).z(th3Var);
                break;
            case 10:
                x3f x3fVar = (x3f) this.I0;
                x3fVar.E0.onThemeChanged(a93.s0.x(x3fVar.getContext()).k());
                x3fVar.z(th3Var);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((v6h) this.I0).x(th3Var);
                break;
            case 13:
                v3f v3fVar = (v3f) this.I0;
                v3fVar.f(th3Var);
                v3fVar.y0.onThemeChanged(a93.s0.x(v3fVar.getContext()).k());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(Context context, ts9 ts9Var) {
        super(context, new rsg(context, ts9Var));
        this.U0 = 11;
    }
}
