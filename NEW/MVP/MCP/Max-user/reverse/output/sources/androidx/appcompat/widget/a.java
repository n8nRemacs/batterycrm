package androidx.appcompat.widget;

import defpackage.eqf;
import defpackage.qb4;

/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ e a;

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb4 qb4Var = this.a.mSuggestionsAdapter;
        if (qb4Var instanceof eqf) {
            qb4Var.b(null);
        }
    }
}
