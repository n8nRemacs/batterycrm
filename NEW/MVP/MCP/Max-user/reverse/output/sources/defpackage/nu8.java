package defpackage;

import android.os.Handler;
import android.view.View;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class nu8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i6c callback;
        int i9 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                o6c o6cVar = (o6c) obj2;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj;
                yy7[] yy7VarArr = MediaBarWidget.c1;
                if (i4 != i8 && (callback = o6cVar.getCallback()) != null) {
                    callback.m(mediaBarWidget.F0().getTop());
                    break;
                }
                break;
            default:
                Handler handler = (Handler) obj2;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed((Runnable) ((uid) obj).a, 300L);
                break;
        }
    }
}
