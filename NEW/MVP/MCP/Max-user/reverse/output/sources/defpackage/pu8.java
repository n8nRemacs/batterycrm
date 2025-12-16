package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class pu8 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ pu8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Object value;
        l00 l00Var;
        int i = this.a;
        qqg qqgVar = qqg.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MediaBarWidget.c1;
                tcf tcfVar = mediaBarWidget.N0().s0;
                do {
                    value = tcfVar.getValue();
                    int iOrdinal = ((l00) value).ordinal();
                    if (iOrdinal == 0) {
                        l00Var = l00.b;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l00Var = l00.a;
                    }
                } while (!tcfVar.c(value, l00Var));
                return qqgVar;
            case 1:
                mediaBarWidget.o.f.j = (CharSequence) obj;
                return qqgVar;
            default:
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                mediaBarWidget.J0().j(true);
                return qqgVar;
        }
    }
}
