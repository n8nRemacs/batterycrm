package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: PagerSnapStartHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/H2;", "Landroidx/recyclerview/widget/J;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class H2 extends androidx.recyclerview.widget.J {

    /* renamed from: f, reason: collision with root package name */
    public int f368093f = com.yandex.div.internal.util.p.a(8);

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.recyclerview.widget.I f368094g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.recyclerview.widget.I f368095h;

    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    @Y61.k
    public final int[] c(@Y61.k RecyclerView.m mVar, @Y61.k View view) {
        int[] iArr = new int[2];
        androidx.recyclerview.widget.I iC2 = null;
        if (mVar.I()) {
            androidx.recyclerview.widget.I i12 = this.f368095h;
            if (i12 != null && kotlin.jvm.internal.L.f(i12.f53676a, mVar)) {
                iC2 = i12;
            }
            if (iC2 == null) {
                iC2 = androidx.recyclerview.widget.I.a(mVar);
                this.f368095h = iC2;
            }
            iC2.f53676a.getClass();
            iArr[0] = iC2.g(view) - (RecyclerView.m.t0(view) == 0 ? iC2.m() : this.f368093f / 2);
        } else if (mVar.J()) {
            androidx.recyclerview.widget.I i13 = this.f368094g;
            if (i13 != null && kotlin.jvm.internal.L.f(i13.f53676a, mVar)) {
                iC2 = i13;
            }
            if (iC2 == null) {
                iC2 = androidx.recyclerview.widget.I.c(mVar);
                this.f368094g = iC2;
            }
            iC2.f53676a.getClass();
            iArr[1] = iC2.g(view) - (RecyclerView.m.t0(view) == 0 ? iC2.m() : this.f368093f / 2);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    public final int g(@Y61.k RecyclerView.m mVar, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int iH1 = linearLayoutManager.H1();
        if (iH1 != -1) {
            return iH1;
        }
        int iM1 = linearLayoutManager.M1();
        if (iM1 == linearLayoutManager.K1()) {
            if (iM1 != -1) {
                return iM1;
            }
            return 0;
        }
        if (linearLayoutManager.f53690r != 0) {
            i12 = i13;
        }
        return i12 >= 0 ? iM1 : iM1 - 1;
    }
}
