package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class kq3 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mq3 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kq3(mq3 mq3Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.d = mq3Var;
                super(12, (Object) 0);
                break;
            default:
                jq3 jq3Var = jq3.NORMAL;
                this.d = mq3Var;
                super(12, jq3Var);
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                mq3 mq3Var = this.d;
                v5f v5fVar = mq3Var.a2;
                if (fni.a(obj, obj2)) {
                    return;
                }
                jq3 jq3Var = (jq3) obj2;
                int iG = a93.s0.y(mq3Var).g(jq3Var.a);
                int iOrdinal = jq3Var.ordinal();
                i84 i84Var = i84.b;
                if (iOrdinal == 0) {
                    mq3Var.setInputsEnabled(false);
                    ArrayList arrayListG0 = mq3.G0(mq3Var);
                    lq3 lq3Var = new lq3(mq3Var, jq3Var, 0);
                    v5fVar.getClass();
                    x38 x38Var = v5fVar.a;
                    x9f x9fVarE = svi.e(x38Var, null, i84Var, new s5f(arrayListG0, lq3Var, v5fVar, new o5f(v5fVar, iG, 0), null), 1);
                    t9f t9fVar = v5fVar.d;
                    yy7[] yy7VarArr = v5f.e;
                    t9fVar.O(v5fVar, yy7VarArr[1], x9fVarE);
                    v5fVar.c.O(v5fVar, yy7VarArr[0], svi.e(x38Var, null, i84Var, new u5f(arrayListG0, v5fVar, new bzb(2, v5fVar, v5f.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 10), null), 1));
                    return;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mq3Var.setInputsEnabled(true);
                    ArrayList arrayListG02 = mq3.G0(mq3Var);
                    lq3 lq3Var2 = new lq3(mq3Var, jq3Var, 2);
                    v5fVar.b();
                    v5fVar.d.O(v5fVar, v5f.e[1], svi.e(v5fVar.a, null, i84Var, new q5f(arrayListG02, lq3Var2, new os1(v5fVar, iG), 300L, null), 1));
                    return;
                }
                mq3Var.setInputsEnabled(!mq3Var.getDisableInputsForError());
                if (Build.VERSION.SDK_INT >= 30) {
                    uog.i(mq3Var, q07.REJECT);
                }
                ArrayList arrayListG03 = mq3.G0(mq3Var);
                lq3 lq3Var3 = new lq3(mq3Var, jq3Var, 1);
                v5fVar.b();
                m8f m8fVar = new m8f(mq3Var, m8f.p);
                n8f n8fVar = new n8f(0.0f);
                n8fVar.b(1500.0f);
                n8fVar.a(0.2f);
                m8fVar.m = n8fVar;
                m8fVar.a = 3000.0f;
                m8fVar.g();
                v5fVar.d.O(v5fVar, v5f.e[1], svi.e(v5fVar.a, null, i84Var, new q5f(arrayListG03, lq3Var3, new o5f(v5fVar, iG, 1), 200L, null), 1));
                return;
            default:
                if (fni.a(obj, obj2)) {
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                mq3 mq3Var2 = this.d;
                mq3Var2.setAdapter(new k5f(iIntValue, mq3Var2, new yo3(4, mq3Var2)));
                return;
        }
    }
}
