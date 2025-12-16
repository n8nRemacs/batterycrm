package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class i2i implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ i2i(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(Widget.viewBinding$lambda$7(widget, (View) obj));
            default:
                int i2 = xz7.a;
                Context context = widget.getContext();
                tcf tcfVar = xz7.e;
                e4i e4iVar = ((g4i) obj).a;
                int i3 = e4iVar.f(8).d - e4iVar.f(7).d;
                if (xz7.c != i3) {
                    wqi.c(xz7.class.getName(), "insets changed keyboard height=" + i3, new Object[0]);
                    if (xz7.b(i3)) {
                        String str = 1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape";
                        xz7.b.d(i3, str);
                        SharedPreferences sharedPreferences = xz7.d;
                        if (sharedPreferences == null) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
                        }
                        if (xz7.d == null) {
                            xz7.d = sharedPreferences;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putInt(str, i3);
                        editorEdit.apply();
                    }
                    if (xz7.b(i3)) {
                        tcfVar.m(null, Boolean.TRUE);
                    } else if (xz7.b(xz7.c)) {
                        tcfVar.m(null, Boolean.FALSE);
                    }
                    xz7.c = i3;
                }
                return qqg.a;
        }
    }
}
