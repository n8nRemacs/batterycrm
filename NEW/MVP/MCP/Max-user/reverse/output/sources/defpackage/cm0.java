package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class cm0 implements yl {
    public static final Uri c = wm.a("batch.executeV2");
    public final lm[] a;
    public final a3b b;

    public cm0(lm[] lmVarArr) {
        this.a = lmVarArr;
        this.b = new a3b(4, lmVarArr);
    }

    @Override // defpackage.yl
    public final ul getConfigExtractor() {
        return rha.d;
    }

    @Override // defpackage.yl
    public final ox7 getOkParser() {
        return this.b;
    }

    @Override // defpackage.hm
    public final int getPriority() {
        int i = 1;
        for (lm lmVar : this.a) {
            int priority = lmVar.b.getPriority();
            if (i < priority) {
                i = priority;
            }
        }
        return i;
    }

    @Override // defpackage.hm
    public final nm getScope() {
        lm[] lmVarArr = this.a;
        int length = lmVarArr.length;
        nm nmVar = nm.a;
        if (length == 0) {
            return nmVar;
        }
        if (length == 1) {
            return lmVarArr[0].b.getScope();
        }
        for (lm lmVar : lmVarArr) {
            nm scope = lmVar.b.getScope();
            if (nmVar.compareTo(scope) < 0) {
                nmVar = scope;
            }
            if (lmVar.b.getScopeAfter() != om.a) {
                return nmVar;
            }
        }
        return nmVar;
    }

    @Override // defpackage.yl
    public final om getScopeAfter() {
        lm[] lmVarArr = this.a;
        int length = lmVarArr.length;
        om omVar = om.a;
        if (length == 0) {
            return omVar;
        }
        if (length == 1) {
            return lmVarArr[0].b.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            om scopeAfter = lmVarArr[i].b.getScopeAfter();
            if (scopeAfter != omVar) {
                return scopeAfter;
            }
        }
        return omVar;
    }

    @Override // defpackage.hm
    public final Uri getUri() {
        return c;
    }

    @Override // defpackage.hm
    public final boolean shouldGzip() {
        for (lm lmVar : this.a) {
            if (lmVar.b.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hm
    public final boolean shouldPost() {
        return true;
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) {
        gy7Var.b0("methods");
        gy7Var.r();
        for (lm lmVar : this.a) {
            yl ylVar = lmVar.b;
            gy7Var.p();
            gy7Var.b0(lmVar.c);
            gy7Var.p();
            if (ylVar.willWriteParams()) {
                gy7Var.b0("params");
                gy7Var.p();
                ylVar.writeParams(gy7Var);
                gy7Var.n();
            }
            if (ylVar.willWriteSupplyParams()) {
                gy7Var.b0("supplyParams");
                gy7Var.p();
                ylVar.writeSupplyParams(gy7Var);
                gy7Var.n();
            }
            gy7Var.n();
            gy7Var.n();
        }
        gy7Var.q();
    }
}
