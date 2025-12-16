package defpackage;

import one.me.folders.edit.FolderEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class i96 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FolderEditScreen b;

    public /* synthetic */ i96(FolderEditScreen folderEditScreen, int i) {
        this.a = i;
        this.b = folderEditScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        FolderEditScreen folderEditScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = FolderEditScreen.Z;
                folderEditScreen.A0();
                jva onBackPressedDispatcher = folderEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr2 = FolderEditScreen.Z;
                folderEditScreen.z0().x();
                folderEditScreen.A0();
                break;
        }
        return qqgVar;
    }
}
