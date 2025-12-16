package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class my6 extends wgh {
    public final /* synthetic */ int a;
    public final WeakReference b;
    public int c;
    public int d;

    public my6(ry6 ry6Var) {
        this.a = 0;
        this.b = new WeakReference(ry6Var);
        this.c = 0;
        this.d = 0;
    }

    @Override // defpackage.wgh
    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.c = this.d;
                this.d = i;
                break;
            case 1:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    tabLayout.e1 = this.d;
                    break;
                }
                break;
            default:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    tabLayout2.e1 = this.d;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wgh
    public final void b(int i, float f, int i2) {
        boolean z;
        switch (this.a) {
            case 0:
                ry6 ry6Var = (ry6) this.b.get();
                if (ry6Var != null) {
                    try {
                        ry6.a(ry6Var.c.a, i);
                        ry6Var.c(i, f);
                        break;
                    } catch (IllegalArgumentException e) {
                        wqi.p(my6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
                        return;
                    }
                }
                break;
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    int i3 = this.d;
                    tabLayout.o(i, f, i3 != 2 || this.c == 1, (i3 == 2 && this.c == 0) ? false : true, false);
                    break;
                }
                break;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    int i4 = this.d;
                    boolean z2 = true;
                    if (i4 != 2 || this.c == 1) {
                        z = true;
                    } else {
                        z = true;
                        z2 = false;
                    }
                    if (i4 == 2 && this.c == 0) {
                        z = false;
                    }
                    tabLayout2.o(i, f, z2, z, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wgh
    public final void c(int i) {
        switch (this.a) {
            case 0:
                ry6 ry6Var = (ry6) this.b.get();
                try {
                    int i2 = this.d;
                    if (i2 != 0 && (i2 != 2 || this.c != 0)) {
                    }
                    if (ry6Var != null) {
                        ry6Var.setSelectedPageIndex(i);
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    wqi.p(my6.class.getName(), "updatePagesNumber error: " + e.getMessage(), e);
                    return;
                }
                break;
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i3 = this.d;
                    tabLayout.n(tabLayout.h(i), i3 == 0 || (i3 == 2 && this.c == 0));
                    break;
                }
                break;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null && tabLayout2.getSelectedTabPosition() != i && i < tabLayout2.getTabCount()) {
                    int i4 = this.d;
                    tabLayout2.n(tabLayout2.h(i), i4 == 0 || (i4 == 2 && this.c == 0));
                    break;
                }
                break;
        }
    }

    public my6(TabLayout tabLayout, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                break;
            default:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                break;
        }
    }
}
