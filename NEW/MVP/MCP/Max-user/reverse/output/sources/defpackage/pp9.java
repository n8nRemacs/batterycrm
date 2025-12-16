package defpackage;

import android.text.Editable;
import android.widget.EditText;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class pp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pp9 pp9Var = (pp9) l((y9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pp9 pp9Var = new pp9(continuation, this.X);
        pp9Var.o = obj;
        return pp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Editable text;
        v1a v1aVar = a93.s0;
        g8j.b(obj);
        y9 y9Var = (y9) this.o;
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        MessageWriteWidget messageWriteWidget = this.X;
        messageWriteWidget.C0().requestFocus();
        dp8 dp8Var = messageWriteWidget.D0;
        if (dp8Var != null) {
            EditText editText = dp8Var.a;
            int i = y9Var.a;
            int i2 = y9Var.b;
            String str = y9Var.c;
            if (str != null && (text = editText.getText()) != null && text.length() != 0) {
                b88[] b88VarArr = (b88[]) text.getSpans(i, i2, b88.class);
                if (b88VarArr != null && b88VarArr.length != 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= b88VarArr.length) {
                            break;
                        }
                        int i4 = i3 + 1;
                        try {
                            b88 b88Var = b88VarArr[i3];
                            int spanStart = text.getSpanStart(b88Var);
                            int spanEnd = text.getSpanEnd(b88Var);
                            if (spanStart == i && spanEnd == i2) {
                                text.removeSpan(b88Var);
                                ssi.j(text, str, i, i2, v1aVar.x(editText.getContext()).k().getText().j, null, 32);
                                break;
                            }
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                } else {
                    ssi.j(text, str, i, i2, v1aVar.x(editText.getContext()).k().getText().j, null, 32);
                }
            }
        }
        return qqg.a;
    }
}
