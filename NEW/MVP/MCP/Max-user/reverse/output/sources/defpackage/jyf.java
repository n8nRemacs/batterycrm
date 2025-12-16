package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jyf implements qgh {
    public final WeakReference a;
    public int b;
    public int c;

    public jyf(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void a(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            boolean z2 = true;
            if (i2 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i2 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.o(i, f, z2, z, false);
        }
    }
}
