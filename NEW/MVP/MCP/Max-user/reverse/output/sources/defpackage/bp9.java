package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class bp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bp9 bp9Var = (bp9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bp9 bp9Var = new bp9(continuation, this.X);
        bp9Var.o = obj;
        return bp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        fqf fqfVar = (fqf) this.o;
        int i = fqfVar.Y;
        qqg qqgVar = qqg.a;
        qqg qqgVar2 = null;
        MessageWriteWidget messageWriteWidget = this.X;
        if (i == 3) {
            yy7[] yy7VarArr = MessageWriteWidget.L0;
            no9 no9VarI0 = messageWriteWidget.I0();
            CharSequence charSequenceL = fqfVar.l();
            yy7[] yy7VarArr2 = no9.X0;
            no9VarI0.E(charSequenceL, false);
            messageWriteWidget.C0().setText(null);
            return qqgVar;
        }
        yy7[] yy7VarArr3 = MessageWriteWidget.L0;
        mqf mqfVarJ0 = messageWriteWidget.J0();
        mqfVarJ0.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fqfVar.l().toString());
        int i2 = aqf.o;
        cm6 cm6Var = mqfVarJ0.o;
        hqf hqfVar = new hqf(mqfVarJ0, 0);
        spannableStringBuilder.toString();
        spannableStringBuilder.setSpan(new aqf(cm6Var, fqfVar, hqfVar), 0, spannableStringBuilder.length(), 17);
        CharSequence charSequenceC = ((f7b) mqfVarJ0.z0.getValue()).c(spannableStringBuilder, new cj9(fqfVar.a, null, bj9.a, 0, spannableStringBuilder.length(), null), false, true);
        h79 h79Var = messageWriteWidget.J0().X;
        ik9 ik9VarC0 = messageWriteWidget.C0();
        h79Var.getClass();
        fk9 fk9Var = ik9VarC0.d;
        fk9 fk9Var2 = ik9VarC0.d;
        int iIntValue = ((Number) ik9VarC0.getMessagePosition().getValue()).intValue();
        CharSequence text = ik9VarC0.getText();
        SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
        aqf aqfVarX = spannableStringValueOf != null ? h79.x(spannableStringValueOf, iIntValue, fqfVar) : null;
        if (spannableStringValueOf != null && aqfVarX != null) {
            int spanStart = spannableStringValueOf.getSpanStart(aqfVarX);
            int spanEnd = spannableStringValueOf.getSpanEnd(aqfVarX);
            Editable text2 = fk9Var.getText();
            if (text2 != null) {
                text2.replace(spanStart, spanEnd, charSequenceC, 0, charSequenceC.length());
            }
            Editable text3 = fk9Var2.getText();
            if (text3 == null) {
                ik9VarC0.setText(" ");
            } else {
                text3.append((CharSequence) " ");
            }
            qqgVar2 = qqgVar;
        }
        if (qqgVar2 == null) {
            int length = fqfVar.o.length();
            Editable text4 = fk9Var.getText();
            if (text4 != null) {
                int iMax = Math.max(fk9Var.getSelectionStart(), 0);
                text4.replace(Math.max(iMax - length, 0), iMax, charSequenceC, 0, charSequenceC.length());
            }
            Editable text5 = fk9Var2.getText();
            if (text5 == null) {
                ik9VarC0.setText(" ");
                return qqgVar;
            }
            text5.append((CharSequence) " ");
        }
        return qqgVar;
    }
}
