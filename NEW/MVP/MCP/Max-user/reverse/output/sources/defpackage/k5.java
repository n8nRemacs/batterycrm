package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class k5 implements pmb {
    public final Object a;

    public /* synthetic */ k5(Object obj) {
        this.a = obj;
    }

    public static k5 a(int i, int i2, int i3) {
        return new k5(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    @Override // defpackage.pmb
    public Object d() {
        return this.a;
    }

    @Override // defpackage.pmb
    public boolean q() {
        return true;
    }

    @Override // defpackage.pmb
    public Object t() {
        return this.a;
    }
}
