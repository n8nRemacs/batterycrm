package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class wx6 extends bxe {
    public final /* synthetic */ int e;

    public /* synthetic */ wx6(int i) {
        this.e = i;
    }

    @Override // defpackage.bxe
    public final int a(View view, int i, int i2) {
        switch (this.e) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                if (view.getVisibility() == 8) {
                    return 0;
                }
                int baseline = view.getBaseline();
                if (baseline == -1) {
                    return Integer.MIN_VALUE;
                }
                return baseline;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // defpackage.bxe
    public cy6 b() {
        switch (this.e) {
            case 4:
                return new yx6();
            default:
                return super.b();
        }
    }

    @Override // defpackage.bxe
    public final String c() {
        switch (this.e) {
            case 0:
                return "UNDEFINED";
            case 1:
                return "LEADING";
            case 2:
                return "TRAILING";
            case 3:
                return "CENTER";
            case 4:
                return "BASELINE";
            default:
                return "FILL";
        }
    }

    @Override // defpackage.bxe
    public final int e(View view, int i) {
        switch (this.e) {
            case 0:
                return Integer.MIN_VALUE;
            case 1:
                return 0;
            case 2:
                return i;
            case 3:
                return i >> 1;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override // defpackage.bxe
    public int h(int i, int i2) {
        switch (this.e) {
            case 5:
                return i2;
            default:
                return i;
        }
    }
}
