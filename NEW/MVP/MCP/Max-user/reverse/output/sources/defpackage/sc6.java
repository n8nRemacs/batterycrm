package defpackage;

import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class sc6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FoldersPickerScreen b;

    public /* synthetic */ sc6(FoldersPickerScreen foldersPickerScreen, int i) {
        this.a = i;
        this.b = foldersPickerScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        FoldersPickerScreen foldersPickerScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = FoldersPickerScreen.Z;
                hs hsVar = foldersPickerScreen.b;
                yy7 yy7Var = FoldersPickerScreen.Z[0];
                return new gd6(((Number) hsVar.a(foldersPickerScreen)).longValue());
            default:
                yy7[] yy7VarArr2 = FoldersPickerScreen.Z;
                x3b x3bVar = new x3b(foldersPickerScreen.getContext());
                x3bVar.setClipChildren(false);
                x3bVar.setIcon(yud.P);
                x3bVar.setTitle(new n5g(f5b.o));
                x3bVar.f(x3bVar.getContext().getString(f5b.l), new uc6(foldersPickerScreen, 1));
                return x3bVar;
        }
    }
}
