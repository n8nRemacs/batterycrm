package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ro9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ ro9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MessageWriteWidget messageWriteWidget = this.b;
                int i = messageWriteWidget.K0;
                if (i == 0) {
                    return;
                }
                no9 no9VarI0 = messageWriteWidget.I0();
                CharSequence charSequence = (CharSequence) messageWriteWidget.C0().getMessageState().getValue();
                Integer num = (Integer) messageWriteWidget.C0().getMessagePosition().getValue();
                no9VarI0.getClass();
                int iV = az1.v(i);
                if (iV == 0) {
                    no9.F(no9VarI0, null, null, null, 14);
                    return;
                }
                if (iV == 1) {
                    no9VarI0.O0.m(null, new qn9(charSequence, num));
                    no9VarI0.G(null);
                    return;
                } else {
                    if (iV != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xfh.r(no9VarI0.y0, new xn9());
                    return;
                }
            default:
                MessageWriteWidget messageWriteWidget2 = this.b;
                messageWriteWidget2.X.f.j = messageWriteWidget2.C0().getText();
                xfh.r(messageWriteWidget2.I0().y0, yn9.a);
                return;
        }
    }
}
