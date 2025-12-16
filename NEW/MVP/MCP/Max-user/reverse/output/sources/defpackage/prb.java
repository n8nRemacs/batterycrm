package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* loaded from: classes2.dex */
public final class prb implements View.OnClickListener {
    public final /* synthetic */ PermissionBottomSheet a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ PermissionBottomSheet c;

    public prb(PermissionBottomSheet permissionBottomSheet, LinearLayout linearLayout, PermissionBottomSheet permissionBottomSheet2) {
        this.a = permissionBottomSheet;
        this.b = linearLayout;
        this.c = permissionBottomSheet2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PermissionBottomSheet permissionBottomSheet = this.c;
        this.a.O0 = true;
        LinearLayout linearLayout = this.b;
        try {
            hs hsVar = permissionBottomSheet.F0;
            yy7 yy7Var = PermissionBottomSheet.P0[2];
            Intent intent = (Intent) hsVar.a(permissionBottomSheet);
            if (intent == null) {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", linearLayout.getContext().getPackageName(), null));
            }
            permissionBottomSheet.startActivity(intent);
        } catch (Throwable unused) {
        }
        permissionBottomSheet.E0(true);
    }
}
