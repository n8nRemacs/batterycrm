package defpackage;

import android.view.View;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* loaded from: classes2.dex */
public final class rdc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileDeletionInfoScreen b;

    public /* synthetic */ rdc(ProfileDeletionInfoScreen profileDeletionInfoScreen, int i) {
        this.a = i;
        this.b = profileDeletionInfoScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileDeletionInfoScreen profileDeletionInfoScreen = this.b;
                yy7[] yy7VarArr = ProfileDeletionInfoScreen.X;
                zdc zdcVar = (zdc) profileDeletionInfoScreen.c.getValue();
                x9f x9fVar = zdcVar.t0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    zdcVar.t0 = xfh.o(zdcVar, ((q2b) ((lzf) zdcVar.o.getValue())).b(), new ydc(zdcVar, null), 2);
                    break;
                }
                break;
            default:
                this.b.getRouter().C();
                break;
        }
    }
}
