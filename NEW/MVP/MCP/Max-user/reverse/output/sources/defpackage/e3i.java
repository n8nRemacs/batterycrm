package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class e3i {
    public final c9a a = new c9a(1);
    public final c9a b = new c9a(1);

    public final xfh a(Class cls) {
        String strH = wy1.h("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        c9a c9aVar = this.a;
        xfh xfhVar = (xfh) c9aVar.f(strH);
        if (cls.isInstance(xfhVar)) {
            Object objCast = cls.cast(xfhVar);
            if (objCast != null) {
                return (xfh) objCast;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        wfh wfhVar = (wfh) this.b.f(strH);
        if (wfhVar == null) {
            Log.e("WidgetViewModelStore", "Wrong usage of ViewModelStore - trying to access ViewModel without adding its Factory");
            return null;
        }
        xfh xfhVarA = wfhVar.a(cls);
        c9aVar.m(strH, xfhVarA);
        return xfhVarA;
    }
}
