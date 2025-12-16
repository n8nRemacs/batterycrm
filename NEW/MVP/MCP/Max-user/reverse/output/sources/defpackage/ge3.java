package defpackage;

import android.content.Context;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class ge3 extends bi9 {
    public final /* synthetic */ int U0;
    public final em6 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge3(Context context, ts9 ts9Var, int i) {
        super(context, new fe3(context));
        this.U0 = i;
        switch (i) {
            case 1:
                super(context, new le3(context));
                this.V0 = ts9Var;
                break;
            case 2:
                super(context, new q2f(context));
                this.V0 = ts9Var;
                break;
            case 3:
                super(context, new r2f(context));
                this.V0 = ts9Var;
                break;
            default:
                this.V0 = ts9Var;
                break;
        }
    }

    @Override // defpackage.bi9
    public final void L(MessageModel messageModel) {
        switch (this.U0) {
            case 0:
                m00 m00Var = messageModel.t0.b;
                ae3 ae3Var = m00Var instanceof ae3 ? (ae3) m00Var : null;
                if (ae3Var != null) {
                    fe3 fe3Var = (fe3) this.I0;
                    fe3Var.setModel(ae3Var);
                    fe3Var.setOnFinalImageSetCallback(new uv1(this, ae3Var, messageModel, 1));
                    break;
                }
                break;
            case 1:
                m00 m00Var2 = messageModel.t0.b;
                ae3 ae3Var2 = m00Var2 instanceof ae3 ? (ae3) m00Var2 : null;
                if (ae3Var2 != null) {
                    le3 le3Var = (le3) this.I0;
                    le3Var.setModel(ae3Var2);
                    le3Var.setOnFinalImageSetCallback(new uv1(this, ae3Var2, messageModel, 2));
                    break;
                }
                break;
            case 2:
                m00 m00Var3 = messageModel.t0.b;
                n2f n2fVar = m00Var3 instanceof n2f ? (n2f) m00Var3 : null;
                if (n2fVar != null) {
                    q2f q2fVar = (q2f) this.I0;
                    q2fVar.setModel(n2fVar);
                    q2fVar.y0.setOnFinalImageSetCallback(new da1(this, n2fVar, messageModel, 16));
                    break;
                }
                break;
            default:
                m00 m00Var4 = messageModel.t0.b;
                n2f n2fVar2 = m00Var4 instanceof n2f ? (n2f) m00Var4 : null;
                if (n2fVar2 != null) {
                    r2f r2fVar = (r2f) this.I0;
                    r2fVar.setModel(n2fVar2);
                    r2fVar.E0.setOnFinalImageSetCallback(new da1(this, n2fVar2, messageModel, 17));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bi9
    public void M(yt0 yt0Var) {
        switch (this.U0) {
            case 1:
                ((le3) this.I0).y(yt0Var);
                break;
            case 3:
                ((r2f) this.I0).y(yt0Var);
                break;
        }
    }

    @Override // defpackage.bi9
    public final void N(th3 th3Var) {
        switch (this.U0) {
            case 0:
                fe3 fe3Var = (fe3) this.I0;
                fe3Var.f(th3Var);
                fe3Var.x0.j();
                break;
            case 1:
                le3 le3Var = (le3) this.I0;
                le3Var.z(th3Var);
                le3Var.D0.j();
                break;
            case 2:
                ((q2f) this.I0).f(th3Var);
                break;
            default:
                ((r2f) this.I0).z(th3Var);
                break;
        }
    }
}
