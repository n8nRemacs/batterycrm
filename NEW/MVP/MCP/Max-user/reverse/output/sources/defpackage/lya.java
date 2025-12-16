package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class lya implements ui8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ lya(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.ui8
    public final void c() {
        switch (this.a) {
            case 0:
                dh4 dh4Var = (dh4) a93.s0.x((Context) this.b.c(12)).d;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((bwf) dh4Var.a).getValue()).edit();
                lha.a.getClass();
                kha khaVar = kha.b;
                dh4Var.c = khaVar;
                editorEdit.putString("nightmode", wha.s(khaVar));
                editorEdit.putString("themename", h5b.d.a);
                editorEdit.apply();
                break;
            default:
                ((cb3) this.b.c(174)).a();
                break;
        }
    }
}
