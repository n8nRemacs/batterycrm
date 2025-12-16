package defpackage;

import android.view.View;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class kgc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ kgc(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ProfileEditScreen profileEditScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ProfileEditScreen.x0;
                b95 b95Var = profileEditScreen.z0().b;
                if (b95Var.d()) {
                    b95Var.k();
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr2 = ProfileEditScreen.x0;
                profileEditScreen.z0().w();
                break;
        }
    }
}
