package defpackage;

import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class o2i implements k18 {
    public xfh a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;

    public o2i(Widget widget, Class cls) {
        this.b = widget;
        this.c = cls;
    }

    @Override // defpackage.k18
    public final boolean e() {
        return this.a != null;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        xfh xfhVar = this.a;
        if (xfhVar != null) {
            return xfhVar;
        }
        xfh xfhVarA = this.b.getViewModelStore().a(this.c);
        if (xfhVarA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = xfhVarA;
        return xfhVarA;
    }
}
