package defpackage;

import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class sa1 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ sa1(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yy7[] yy7VarArr = CallHistoryScreen.D0;
                ca1.c.p0().b(":call-contact", null);
                break;
            case 1:
                yy7[] yy7VarArr2 = MediaKeyboardWidget.B0;
                uz7.c.p0().b(":stickers/settings", null);
                break;
            case 2:
                break;
            default:
                yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
                break;
        }
    }
}
