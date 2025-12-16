package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class zu9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MessagesListWidget c;

    public /* synthetic */ zu9(Bundle bundle, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = bundle;
        this.c = messagesListWidget;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        c47 c47Var;
        int i = this.a;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessagesListWidget.b1;
                long j = bundle.getLong("ARG_CHAT_ID");
                k18 k18Var = fq9.a;
                gq9 gq9Var = gq9.a;
                bwf bwfVarD = gq9Var.getAccessor().d(126);
                bwf bwfVarD2 = gq9Var.getAccessor().d(125);
                o80 o80Var = (o80) gq9Var.getAccessor().c(525);
                bwf bwfVarD3 = gq9Var.getAccessor().d(134);
                bwf bwfVarD4 = gq9Var.getAccessor().d(529);
                bwf bwfVarD5 = gq9Var.getAccessor().d(48);
                k18 k18Var2 = fq9.c;
                MessagesListWidget messagesListWidget = this.c;
                return new f1h(bwfVarD, bwfVarD2, o80Var, bwfVarD3, bwfVarD4, bwfVarD5, k18Var2, j, messagesListWidget.C0, new wu9(messagesListWidget, 2), new ts9(1, messagesListWidget, MessagesListWidget.class, "onMessageLongClick", "onMessageLongClick(J)V", 0, 1), gq9Var.getDispatchers(), messagesListWidget.getLifecycleScope());
            default:
                yy7[] yy7VarArr2 = MessagesListWidget.b1;
                long j2 = bundle.getLong("ARG_CHAT_ID");
                long j3 = bundle.getLong("ARG_LOAD_MARK");
                long j4 = bundle.getLong("ARG_LOAD_MESSAGE_ID");
                Object obj = bundle.get("ARG_HIGHLIGHTS");
                List list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = hd5.a;
                }
                cw9 cw9Var = new cw9(j2, j3, j4, list, bundle.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                gq9 gq9Var2 = gq9.a;
                kr9 kr9Var = (kr9) gq9Var2.getAccessor().c(537);
                rs4 rs4Var = rs4.REGULAR;
                w5 w5Var = kr9Var.a;
                int iOrdinal = rs4Var.ordinal();
                if (iOrdinal == 0) {
                    c47Var = qha.x0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c47Var = b6a.w0;
                }
                c47 c47Var2 = c47Var;
                Context context = (Context) w5Var.c(12);
                lzf lzfVar = (lzf) w5Var.c(8);
                bwf bwfVarD6 = w5Var.d(109);
                bwf bwfVarD7 = w5Var.d(138);
                bwf bwfVarD8 = w5Var.d(210);
                bwf bwfVarD9 = w5Var.d(521);
                bwf bwfVarD10 = w5Var.d(123);
                x79 x79Var = new x79();
                x79Var.d = j2;
                x79Var.a = rs4Var;
                x79Var.b = c47Var2;
                x79Var.c = new bwf(new es9(bwfVarD6, 28, x79Var));
                x79Var.o = new bwf(new da1(bwfVarD6, bwfVarD7, x79Var, 11));
                iv6 iv6Var = new iv6(19, vb9.e(j2, "MessagesListLoader#"));
                bwf bwfVar = new bwf(new qj2(context, w5Var, 3));
                bwf bwfVar2 = new bwf(new qj2(context, w5Var, 2));
                hx hxVar = new hx(j2, lzfVar, rs4Var, c47Var2, bwfVarD6, w5Var.d(9), bwfVarD9, bwfVarD7, w5Var.d(363), (l4e) w5Var.c(397), w5Var.d(122));
                xw xwVar = new xw(bwfVarD6, w5Var.d(387), j2, lzfVar, iv6Var, mwi.a(j2, (tw0) w5Var.c(49), lzfVar), bwfVar, bwfVar2, (a84) w5Var.c(84), new g2b(bwfVar, bwfVar2, bwfVarD8, bwfVarD10), x79Var, hxVar, new px(j2, rs4Var, (m1g) w5Var.c(45), new a3b(26, bwfVarD6), (qh2) w5Var.c(257), (k1a) w5Var.c(150), hxVar, (l4e) w5Var.c(397)), (so3) w5Var.c(488), 40, 15);
                k18 k18Var3 = fq9.a;
                bwf bwfVarD11 = gq9Var2.getAccessor().d(252);
                bwf bwfVarD12 = gq9Var2.getAccessor().d(109);
                sl7 sl7Var = new sl7((qi9) gq9Var2.getAccessor().c(143));
                bwf bwfVarD13 = gq9Var2.getAccessor().d(398);
                wo8 wo8Var = new wo8();
                wo8Var.a = j2;
                wo8Var.b = wo8.class.getName();
                wo8Var.c = bwfVarD11;
                wo8Var.d = bwfVarD12;
                wo8Var.X = sl7Var;
                wo8Var.o = bwfVarD13;
                MessagesListWidget messagesListWidget2 = this.c;
                return new vu9(cw9Var, (kj1) messagesListWidget2.w0.getValue(), xwVar, wo8Var, new i5i(new yu9(messagesListWidget2, 5)), messagesListWidget2.G0());
        }
    }
}
