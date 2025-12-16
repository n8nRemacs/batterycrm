package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* loaded from: classes2.dex */
public final class orb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PermissionBottomSheet b;
    public final /* synthetic */ PermissionBottomSheet c;

    public /* synthetic */ orb(PermissionBottomSheet permissionBottomSheet, PermissionBottomSheet permissionBottomSheet2, int i) {
        this.a = i;
        this.b = permissionBottomSheet;
        this.c = permissionBottomSheet2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.O0 = true;
                this.c.E0(true);
                return;
            default:
                this.b.O0 = true;
                PermissionBottomSheet permissionBottomSheet = this.c;
                qsb qsbVar = (qsb) permissionBottomSheet.C0.getValue();
                c54 targetController = permissionBottomSheet.getTargetController();
                Widget widget = targetController instanceof Widget ? (Widget) targetController : null;
                if (widget == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                s2i s2iVar = new s2i(widget, 1);
                hs hsVar = permissionBottomSheet.J0;
                yy7[] yy7VarArr = PermissionBottomSheet.P0;
                yy7 yy7Var = yy7VarArr[6];
                String[] strArr = (String[]) hsVar.a(permissionBottomSheet);
                if (strArr == null) {
                    strArr = new String[0];
                }
                hs hsVar2 = permissionBottomSheet.K0;
                yy7 yy7Var2 = yy7VarArr[7];
                qsbVar.j(s2iVar, strArr, ((Number) hsVar2.a(permissionBottomSheet)).intValue());
                permissionBottomSheet.E0(true);
                return;
        }
    }
}
