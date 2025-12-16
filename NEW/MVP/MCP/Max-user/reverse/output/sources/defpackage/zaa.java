package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class zaa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eba b;

    public /* synthetic */ zaa(eba ebaVar, int i) {
        this.a = i;
        this.b = ebaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.j(new dk0(26));
                break;
            default:
                this.b.j(new dk0(29));
                break;
        }
    }
}
