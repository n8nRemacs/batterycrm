package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class mt8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ mt8(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MediaBarPermissionWidget.Y;
                mediaBarPermissionWidget.y0();
                break;
            case 1:
                yy7[] yy7VarArr2 = MediaBarPermissionWidget.Y;
                mediaBarPermissionWidget.y0();
                break;
            default:
                yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                mediaBarPermissionWidget.y0();
                break;
        }
    }
}
