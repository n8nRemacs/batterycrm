package defpackage;

import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ox3 implements sm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ox3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aqf aqfVarX;
        int i = this.a;
        qqg qqgVar = qqg.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                xx3 xx3Var = (xx3) obj4;
                long jLongValue = ((Long) obj).longValue();
                View view = (View) obj2;
                px3 px3Var = (px3) ((b0i) obj3).X;
                if (!xx3Var.u0) {
                    if (xx3Var.X == null) {
                        px3Var.i(jLongValue, view);
                        break;
                    } else {
                        px3Var.d(jLongValue);
                        break;
                    }
                } else {
                    px3Var.S();
                    break;
                }
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj4;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj3;
                List list = (List) obj;
                List list2 = (List) obj2;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                if (list2.size() > list.size()) {
                    recyclerView.x0(list2.size() - 1);
                }
                if (!mediaBarWidget.E0().y0 && list.isEmpty() && !list2.isEmpty()) {
                    LinearLayout linearLayoutD0 = mediaBarWidget.D0();
                    if (linearLayoutD0.isLaidOut() && !linearLayoutD0.isLayoutRequested()) {
                        MediaBarWidget.A0(mediaBarWidget);
                        break;
                    } else {
                        linearLayoutD0.addOnLayoutChangeListener(new hv8(mediaBarWidget, 0));
                        break;
                    }
                }
                break;
            case 2:
                mqf mqfVar = (mqf) obj4;
                View view2 = (View) obj;
                fqf fqfVar = (fqf) obj2;
                yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                h79 h79Var = mqfVar.X;
                ik9 ik9VarC0 = ((MessageWriteWidget) obj3).C0();
                h79Var.getClass();
                CharSequence text = ik9VarC0.getText();
                SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
                int iIntValue = ((Number) ik9VarC0.getMessagePosition().getValue()).intValue();
                if (spannableStringValueOf != null && (aqfVarX = h79.x(spannableStringValueOf, iIntValue, fqfVar)) != null) {
                    yy7[] yy7VarArr3 = MessageWriteWidget.L0;
                    mqfVar.J0.setValue(new zpf(view2, fqfVar));
                    ik9VarC0.post(new l30(ik9VarC0, spannableStringValueOf.getSpanEnd(aqfVarX), 13));
                    break;
                }
                break;
            default:
                yzh yzhVar = (yzh) obj3;
                ((Long) obj).getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xzh xzhVar = ((zzh) obj4).E0;
                vzh vzhVar = xzhVar instanceof vzh ? (vzh) xzhVar : null;
                if (vzhVar != null) {
                    yzhVar.b(vzhVar, zBooleanValue);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
