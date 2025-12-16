package defpackage;

import android.view.View;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class uc6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ uc6(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = FoldersPickerScreen.Z;
                gd6 gd6VarY0 = foldersPickerScreen.y0();
                gd6VarY0.getClass();
                svi.d(gd6VarY0.a, bia.a.plus(((q2b) gd6VarY0.d).b()), i84.c, new ed6(gd6VarY0, null));
                foldersPickerScreen.getRouter().C();
                break;
            default:
                yy7[] yy7VarArr2 = FoldersPickerScreen.Z;
                bsi.a(foldersPickerScreen);
                qa6 qa6Var = qa6.c;
                hs hsVar = foldersPickerScreen.b;
                yy7 yy7Var = FoldersPickerScreen.Z[0];
                long jLongValue = ((Number) hsVar.a(foldersPickerScreen)).longValue();
                qa6Var.p0().b(":settings/folder/create?chat_id=" + jLongValue, null);
                break;
        }
    }
}
