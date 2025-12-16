package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ oo9(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [ep8, zq0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ep8, zq0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [ep8, lmf] */
    /* JADX WARN: Type inference failed for: r12v6, types: [c2a, ep8] */
    /* JADX WARN: Type inference failed for: r12v7, types: [ep8, lmf] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v23, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    @Override // defpackage.cm6
    public final Object invoke() {
        ?? string;
        int i = this.a;
        int i2 = 8;
        int i3 = 3;
        int i4 = 2;
        ArrayList arrayList = null;
        ?? r4 = 0;
        boolean z = false;
        z = false;
        z = false;
        int i5 = 1;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MessageWriteWidget.L0;
                return new bl8(o6i.a.getAccessor().d(8), ((Boolean) messageWriteWidget.J0.getValue()).booleanValue(), messageWriteWidget.getContext(), new oo9(messageWriteWidget, i5));
            case 1:
                dp8 dp8Var = messageWriteWidget.D0;
                if (dp8Var != null) {
                    boolean zC = dp8Var.c();
                    zo8.c.getClass();
                    LinkedHashSet linkedHashSet = zo8.o;
                    arrayList = new ArrayList();
                    for (Object obj : linkedHashSet) {
                        if (((zo8) obj).a != s0d.markdown_quote || zC) {
                            arrayList.add(obj);
                        }
                    }
                }
                return arrayList == null ? hd5.a : arrayList;
            case 2:
                yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                return a93.s0.z(messageWriteWidget.getContext()).c;
            case 3:
                yy7[] yy7VarArr3 = MessageWriteWidget.L0;
                if (((cl8) messageWriteWidget.D0().X.getValue()).b != 1) {
                    bl8 bl8VarD0 = messageWriteWidget.D0();
                    tcf tcfVar = bl8VarD0.X;
                    int iV = az1.v(((cl8) tcfVar.getValue()).b);
                    if (iV != 0) {
                        if (iV != 1) {
                            if (iV != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bl8.t(bl8VarD0, 1);
                        } else if (bl8VarD0.b) {
                            List list = ((cl8) tcfVar.getValue()).a;
                            if (list.isEmpty()) {
                                Iterable<zo8> iterable = (Iterable) bl8VarD0.d.invoke();
                                ArrayList arrayList2 = new ArrayList(we3.q(iterable, 10));
                                for (zo8 zo8Var : iterable) {
                                    int i6 = zo8Var.a;
                                    Context context = bl8VarD0.c;
                                    int iOrdinal = zo8Var.ordinal();
                                    int i7 = zo8Var.b;
                                    switch (iOrdinal) {
                                        case 0:
                                            string = context.getString(i7);
                                            break;
                                        case 1:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            usi.e(string, new p17(1.0f), 0, string.length(), 33);
                                            break;
                                        case 2:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            new zq0(0).a(string, 0, string.length());
                                            break;
                                        case 3:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            new zq0(1).a(string, 0, string.length());
                                            break;
                                        case 4:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            new lmf(1).a(string, 0, string.length());
                                            break;
                                        case 5:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            new c2a().a(string, 0, string.length());
                                            break;
                                        case 6:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            new lmf(0).a(string, 0, string.length());
                                            break;
                                        case 7:
                                            string = context.getString(i7);
                                            break;
                                        case 8:
                                            string = context.getString(i7);
                                            break;
                                        case 9:
                                            string = SpannableString.valueOf(context.getString(i7));
                                            ssi.k(string, 0, string.length());
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    arrayList2.add(new hl8(i6, string));
                                }
                                list = arrayList2;
                            }
                            xfh.o(bl8VarD0, ((q2b) ((lzf) bl8VarD0.o.getValue())).a(), new al8(bl8VarD0, list, 3, null), 2);
                        }
                    }
                } else {
                    no9.B(messageWriteWidget.I0(), false, 3);
                }
                return qqg.a;
            case 4:
                return Boolean.valueOf(((sxg) messageWriteWidget.Y.getValue()).g.getBoolean("app.messages.send.by.enter", false));
            case 5:
                yy7[] yy7VarArr4 = MessageWriteWidget.L0;
                muc mucVar = new muc(messageWriteWidget.getContext());
                mucVar.setLayoutParams(new ViewGroup.LayoutParams(-1, kti.d(52 * vw4.d().getDisplayMetrics().density)));
                mucVar.setEndIconDrawable(r34.b(mucVar.getContext(), yud.w).mutate());
                mucVar.setEndIconClickListener(new ro9(messageWriteWidget, z ? 1 : 0));
                tqi.c(new er(i3, (Continuation) (r4 == true ? 1 : 0), i2), mucVar);
                if (!mucVar.isLaidOut() || mucVar.isLayoutRequested()) {
                    mucVar.addOnLayoutChangeListener(new es0(mucVar, messageWriteWidget));
                } else if (b6g.c(mucVar.getTitleView())) {
                    MessageWriteWidget.N0(mucVar, true);
                }
                return mucVar;
            case 6:
                yy7[] yy7VarArr5 = MessageWriteWidget.L0;
                return new dl8((ScheduledExecutorService) ((g4b) o6i.a.getAccessor().c(56)).n.getValue(), new po9(messageWriteWidget, i4));
            case 7:
                yy7[] yy7VarArr6 = MessageWriteWidget.L0;
                gu5 gu5Var = (gu5) ((rt5) messageWriteWidget.t0.getValue());
                if (((Boolean) gu5Var.y.D(gu5Var, gu5.S[12])).booleanValue() && Build.VERSION.SDK_INT <= 30 && ((Boolean) vzg.a.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                yy7[] yy7VarArr7 = MessageWriteWidget.L0;
                return a93.s0.z(messageWriteWidget.getContext()).c;
        }
    }
}
