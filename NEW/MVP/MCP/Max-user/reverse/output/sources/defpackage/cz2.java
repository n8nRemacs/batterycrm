package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class cz2 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ cz2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.C0().G0 = vmf.c0((String) obj).toString();
                break;
            default:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                sn0 sn0Var = chatTitleIconScreen.w0;
                sn0 sn0Var2 = chatTitleIconScreen.t0;
                yy7[] yy7VarArr2 = ChatTitleIconScreen.z0;
                yy7 yy7Var = yy7VarArr2[3];
                constraintLayout.addView((TextView) sn0Var2.getValue());
                constraintLayout.addView(ChatTitleIconScreen.y0(chatTitleIconScreen));
                constraintLayout.addView(chatTitleIconScreen.z0());
                int i2 = 0;
                if (chatTitleIconScreen.B0() == raf.c) {
                    yy7 yy7Var2 = yy7VarArr2[6];
                    gu4 gu4Var = (gu4) sn0Var.getValue();
                    cz2 cz2Var = new cz2(chatTitleIconScreen, i2);
                    w3b w3bVar = gu4Var.s0;
                    li1 li1Var = new li1(cz2Var, 1, gu4Var);
                    w3bVar.addTextChangedListener(li1Var);
                    chatTitleIconScreen.x0 = new eu4(gu4Var, li1Var);
                    yy7 yy7Var3 = yy7VarArr2[6];
                    constraintLayout.addView((gu4) sn0Var.getValue());
                }
                ut3 ut3VarG = l5j.g(constraintLayout);
                yy7 yy7Var4 = yy7VarArr2[3];
                int id = ((TextView) sn0Var2.getValue()).getId();
                sn0 sn0Var3 = chatTitleIconScreen.s0;
                yy7 yy7Var5 = yy7VarArr2[2];
                ut3VarG.d(id, 3, ((yfb) sn0Var3.getValue()).getId(), 4);
                az1.q(16, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
                ut3VarG.d(id, 6, 0, 6);
                ut3VarG.d(id, 7, 0, 7);
                int id2 = ChatTitleIconScreen.y0(chatTitleIconScreen).getId();
                yy7 yy7Var6 = yy7VarArr2[3];
                ut3VarG.d(id2, 3, ((TextView) sn0Var2.getValue()).getId(), 4);
                float f = 24;
                az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
                ut3VarG.d(id2, 6, 0, 6);
                ut3VarG.d(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.z0().getId();
                ut3VarG.d(id3, 3, ChatTitleIconScreen.y0(chatTitleIconScreen).getId(), 4);
                az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
                ut3VarG.d(id3, 6, 0, 6);
                ut3VarG.d(id3, 7, 0, 7);
                yy7 yy7Var7 = yy7VarArr2[6];
                int id4 = ((gu4) sn0Var.getValue()).getId();
                ut3VarG.d(id4, 3, chatTitleIconScreen.z0().getId(), 4);
                az1.q(8, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
                ut3VarG.d(id4, 6, 0, 6);
                ut3VarG.d(id4, 7, 0, 7);
                ut3VarG.a(constraintLayout);
                break;
        }
        return qqgVar;
    }
}
