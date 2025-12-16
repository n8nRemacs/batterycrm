package com.avito.android.avl_entry.impl.util;

import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ShortVideosSnapHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/util/c;", "Landroidx/recyclerview/widget/J;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends J {
    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    @l
    public final View f(@l RecyclerView.m mVar) {
        LinearLayoutManager linearLayoutManager = mVar instanceof LinearLayoutManager ? (LinearLayoutManager) mVar : null;
        if (linearLayoutManager == null) {
            return super.f(mVar);
        }
        int iH1 = linearLayoutManager.H1();
        if (iH1 == -1) {
            iH1 = linearLayoutManager.K1();
        }
        int iL1 = linearLayoutManager.L1();
        if (iL1 == -1) {
            iL1 = linearLayoutManager.M1();
        }
        int iO02 = ((LinearLayoutManager) mVar).o0() - 1;
        return iH1 == 0 ? linearLayoutManager.Z(0) : iL1 == iO02 ? linearLayoutManager.Z(iO02) : super.f(linearLayoutManager);
    }
}
