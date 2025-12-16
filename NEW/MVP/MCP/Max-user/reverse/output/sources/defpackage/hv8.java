package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class hv8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ hv8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                MediaBarWidget.A0(mediaBarWidget);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                yy7[] yy7VarArr = MediaBarWidget.c1;
                if (!mediaBarWidget.N0().v()) {
                    o6c o6cVarJ0 = mediaBarWidget.J0();
                    int i10 = o6c.v0;
                    o6cVarJ0.setHalfScreen(null);
                    break;
                } else {
                    mediaBarWidget.J0().k();
                    break;
                }
        }
    }
}
