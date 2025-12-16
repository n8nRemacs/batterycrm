package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final /* synthetic */ class zpc implements vva, frf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zpc(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        SharedPreferences.Editor editorEdit = a7j.b(this.b).edit();
        editorEdit.putBoolean("proxy_retention", this.c);
        editorEdit.apply();
    }

    @Override // defpackage.frf
    public Object get() {
        switch (this.a) {
            case 1:
                return l6g.g(this.b, this.c, true);
            case 2:
                return l6g.o(this.b, false, this.c);
            case 3:
                return l6g.o(this.b, true, this.c);
            default:
                return l6g.r(this.b, this.c);
        }
    }
}
