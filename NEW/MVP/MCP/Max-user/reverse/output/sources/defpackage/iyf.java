package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class iyf {
    public int a;
    public View b;
    public TabLayout c;
    public kyf d;

    public final void a() {
        TabLayout tabLayout = this.c;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.n(this, true);
    }
}
