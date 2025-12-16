package defpackage;

import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class mq3 extends RecyclerView implements u6g, fm7 {
    public static final /* synthetic */ yy7[] b2 = {new z8a(mq3.class, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;"), u45.h(vid.a, mq3.class, "countCells", "getCountCells()I")};
    public boolean U1;
    public iq3 V1;
    public final kq3 W1;
    public cm6 X1;
    public final kq3 Y1;
    public em6 Z1;
    public final v5f a2;

    public mq3(Context context, int i) {
        super(context, null);
        this.U1 = true;
        jq3 jq3Var = jq3.SUCCESS;
        this.W1 = new kq3(this, 0);
        int i2 = 2;
        this.X1 = new ns2(context, i2);
        this.Y1 = new kq3(this, 1);
        this.a2 = new v5f(tfh.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        j(new y71(i2));
    }

    public static ArrayList G0(mq3 mq3Var) {
        mq3Var.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = mq3Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            lm7 lm7VarH0 = mq3Var.H0(i);
            if (lm7VarH0 != null) {
                arrayList.add(lm7VarH0);
            }
        }
        return arrayList;
    }

    private final lm7 getFirstEmptyInputController() {
        Object next;
        Iterator it = G0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j5f) ((lm7) next)).z().length() == 0) {
                break;
            }
        }
        return (lm7) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            lm7 lm7VarH0 = H0(i);
            if (lm7VarH0 != null) {
                j5f j5fVar = (j5f) lm7VarH0;
                hq3 hq3Var = j5fVar.G0;
                k5f k5fVar = j5fVar.H0;
                if (!z && ((Boolean) k5fVar.X.invoke()).booleanValue()) {
                    api.e(hq3Var);
                }
                hq3Var.setClickable(z);
                hq3Var.setFocusable(z);
                hq3Var.setFocusableInTouchMode(z);
            }
        }
    }

    public final lm7 H0(int i) {
        Object objM = M(i);
        if (objM instanceof lm7) {
            return (lm7) objM;
        }
        return null;
    }

    public final void I0(int i, String str) {
        int length;
        if (i < 0 || i > getCountCells() || (length = str.length()) < 0 || length > getCountCells()) {
            return;
        }
        int length2 = str.length();
        for (int i2 = i; i2 < length2; i2++) {
            int i3 = i2 - i;
            lm7 lm7VarH0 = H0(i2);
            if (lm7VarH0 != null) {
                ((j5f) lm7VarH0).A(String.valueOf(vmf.z(i3, str)));
            }
        }
    }

    public final boolean J0() {
        lm7 firstEmptyInputController = getFirstEmptyInputController();
        Boolean boolValueOf = firstEmptyInputController != null ? Boolean.valueOf(((j5f) firstEmptyInputController).G0.requestFocus()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void K0() {
        lm7 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null) {
            api.f(((j5f) firstEmptyInputController).G0);
        }
    }

    public final int getCountCells() {
        yy7 yy7Var = b2[1];
        return ((Number) this.Y1.b).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.U1;
    }

    public final iq3 getListener() {
        return this.V1;
    }

    public final em6 getOnAnimationEnded() {
        return this.Z1;
    }

    public final jq3 getState() {
        yy7 yy7Var = b2[0];
        return (jq3) this.W1.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        v5f v5fVar = this.a2;
        v5fVar.b();
        t9f t9fVar = v5fVar.d;
        yy7[] yy7VarArr = v5f.e;
        qt7 qt7Var = (qt7) t9fVar.D(v5fVar, yy7VarArr[1]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(v5fVar, yy7VarArr[1], null);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int iG = a93.s0.y(this).g(getState().a);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            lm7 lm7VarH0 = H0(i);
            if (lm7VarH0 != null) {
                hq3 hq3Var = ((j5f) lm7VarH0).G0;
                hq3 hq3Var2 = hq3Var != null ? hq3Var : null;
                if (hq3Var2 != null) {
                    hq3Var2.onThemeChanged(yebVar);
                }
                hq3Var.setTextColor(iG);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return J0();
    }

    public final void setCountCells(int i) {
        this.Y1.O(this, b2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.U1 = z;
    }

    public final void setKeyboardOpen(cm6 cm6Var) {
        this.X1 = cm6Var;
    }

    public final void setListener(iq3 iq3Var) {
        this.V1 = iq3Var;
    }

    public final void setOnAnimationEnded(em6 em6Var) {
        this.Z1 = em6Var;
    }

    public final void setSecure(boolean z) {
        phd adapter = getAdapter();
        k5f k5fVar = adapter instanceof k5f ? (k5f) adapter : null;
        if (k5fVar != null) {
            k5fVar.Y.O(k5fVar, k5f.Z[0], Boolean.valueOf(z));
        }
    }

    public final void setState(jq3 jq3Var) {
        this.W1.O(this, b2[0], jq3Var);
    }
}
