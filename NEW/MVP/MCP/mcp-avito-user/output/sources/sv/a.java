package SV;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GravitySnapHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSV/a;", "Landroidx/recyclerview/widget/A;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a extends A {

    /* renamed from: f, reason: collision with root package name */
    public final int f15032f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15033g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public I f15034h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public I f15035i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final int[] f15036j;

    public /* synthetic */ a(int i12, int i13, int i14, C42822w c42822w) {
        this(i12, (i14 & 2) != 0 ? 0 : i13);
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @k
    public int[] c(@k RecyclerView.m mVar, @k View view) {
        int i12;
        int iD2;
        int i13;
        int iD3;
        int i14;
        boolean zI2 = mVar.I();
        int i15 = this.f15033g;
        int i16 = this.f15032f;
        int i17 = 0;
        if (zI2) {
            if (i16 == 8388611) {
                I iA2 = this.f15035i;
                if (iA2 == null) {
                    iA2 = I.a(mVar);
                }
                this.f15035i = iA2;
                iD3 = iA2.g(view);
                i14 = iA2.m();
            } else {
                I iA3 = this.f15035i;
                if (iA3 == null) {
                    iA3 = I.a(mVar);
                }
                this.f15035i = iA3;
                iD3 = iA3.d(view);
                i14 = iA3.i();
            }
            i12 = (iD3 - i14) - i15;
        } else {
            i12 = 0;
        }
        int[] iArr = this.f15036j;
        iArr[0] = i12;
        if (mVar.J()) {
            if (i16 == 48) {
                I iC2 = this.f15034h;
                if (iC2 == null) {
                    iC2 = I.c(mVar);
                }
                this.f15034h = iC2;
                iD2 = iC2.g(view);
                i13 = iC2.m();
            } else {
                I iC3 = this.f15034h;
                if (iC3 == null) {
                    iC3 = I.c(mVar);
                }
                this.f15034h = iC3;
                iD2 = iC3.d(view);
                i13 = iC3.i();
            }
            i17 = (iD2 - i13) - i15;
        }
        iArr[1] = i17;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    @l
    public final View f(@k RecyclerView.m mVar) {
        if (!(mVar instanceof LinearLayoutManager)) {
            return null;
        }
        int i12 = this.f15032f;
        if (i12 == 48) {
            I iC2 = this.f15034h;
            if (iC2 == null) {
                iC2 = I.c(mVar);
            }
            this.f15034h = iC2;
            return n(mVar, iC2, true);
        }
        if (i12 == 80) {
            I iC3 = this.f15034h;
            if (iC3 == null) {
                iC3 = I.c(mVar);
            }
            this.f15034h = iC3;
            return n(mVar, iC3, false);
        }
        if (i12 == 8388611) {
            I iA2 = this.f15035i;
            if (iA2 == null) {
                iA2 = I.a(mVar);
            }
            this.f15035i = iA2;
            return n(mVar, iA2, true);
        }
        if (i12 != 8388613) {
            return null;
        }
        I iA3 = this.f15035i;
        if (iA3 == null) {
            iA3 = I.a(mVar);
        }
        this.f15035i = iA3;
        return n(mVar, iA3, false);
    }

    public int m(@k LinearLayoutManager linearLayoutManager, @k I i12) {
        return linearLayoutManager.K1();
    }

    public final View n(RecyclerView.m mVar, I i12, boolean z12) {
        View viewZ;
        float fN2;
        boolean z13;
        View viewZ2;
        if (!(mVar instanceof LinearLayoutManager)) {
            return null;
        }
        if (z12) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
            int iM2 = m(linearLayoutManager, i12);
            if (iM2 == -1) {
                return null;
            }
            viewZ = mVar.Z(iM2);
            fN2 = o(viewZ, i12);
            z13 = linearLayoutManager.L1() == mVar.o0() - 1;
            viewZ2 = mVar.Z(iM2 + 1);
        } else {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) mVar;
            int iM1 = linearLayoutManager2.M1();
            if (iM1 == -1) {
                return null;
            }
            viewZ = mVar.Z(iM1);
            fN2 = (i12.n() - i12.g(viewZ)) / i12.e(viewZ);
            z13 = linearLayoutManager2.H1() == 0;
            viewZ2 = mVar.Z(iM1 - 1);
        }
        if (fN2 > 0.5f && !z13) {
            return viewZ;
        }
        if (z13) {
            return null;
        }
        return viewZ2;
    }

    public float o(@l View view, @k I i12) {
        return (i12.d(view) - this.f15033g) / i12.e(view);
    }

    public a(int i12, int i13) {
        this.f15032f = i12;
        this.f15033g = i13;
        this.f15036j = new int[2];
        if (i12 != 8388611 && i12 != 8388613 && i12 != 80 && i12 != 48) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP constants");
        }
    }
}
