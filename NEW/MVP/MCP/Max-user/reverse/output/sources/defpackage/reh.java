package defpackage;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class reh extends mn8 {
    public final /* synthetic */ int o;

    public reh(int i, Class cls, int i2, int i3, int i4) {
        this.o = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.mn8
    public final Object c(View view) {
        switch (this.o) {
            case 0:
                return Boolean.valueOf(afh.d(view));
            case 1:
                return afh.b(view);
            case 2:
                return cfh.b(view);
            default:
                return Boolean.valueOf(afh.c(view));
        }
    }

    @Override // defpackage.mn8
    public final void d(View view, Object obj) {
        switch (this.o) {
            case 0:
                afh.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                afh.h(view, (CharSequence) obj);
                break;
            case 2:
                cfh.e(view, (CharSequence) obj);
                break;
            default:
                afh.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.mn8
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.o) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
