package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class fi1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fi1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                gf1 gf1Var = (gf1) obj2;
                w3b w3bVar = (w3b) obj;
                yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                if (view instanceof EditText) {
                    EditText editText = (EditText) view;
                    if (motionEvent.getX() >= editText.getWidth() - editText.getTotalPaddingRight()) {
                        if (motionEvent.getAction() == 1) {
                            gf1Var.invoke(w3bVar);
                            break;
                        }
                    }
                }
                break;
            case 1:
                fn5 fn5Var = (fn5) obj2;
                l04 l04Var = (l04) obj;
                SpannableString text = fn5Var.getText();
                if (text != null) {
                    bb3 bb3Var = l04Var.b;
                    Layout textLayout = fn5Var.getTextLayout();
                    bb3Var.getClass();
                    if (motionEvent.getAction() == 0) {
                        bb3Var.d = new i5i(new WeakReference(view), textLayout);
                        bb3Var.e = text;
                    }
                    break;
                }
                break;
            case 2:
                yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                ((jx0) obj2).invoke(motionEvent);
                break;
            case 3:
                Chip chip = (Chip) obj2;
                pr0 pr0Var = (pr0) obj;
                if (motionEvent.getAction() == 1) {
                    if (motionEvent.getX() <= chip.getChipStartPadding() + (chip.getChipIcon() != null ? r7.getIntrinsicWidth() : 0)) {
                        pr0Var.invoke();
                        break;
                    }
                }
                break;
            default:
                zff zffVar = (zff) obj2;
                em6 em6Var = (em6) obj;
                h8e h8eVar = zffVar.I0;
                f8e f8eVar = h8eVar instanceof f8e ? (f8e) h8eVar : null;
                if (motionEvent.getAction() == 0 && f8eVar != null && f8eVar.X && em6Var != null) {
                    em6Var.invoke(zffVar);
                    break;
                }
                break;
        }
        return false;
    }
}
