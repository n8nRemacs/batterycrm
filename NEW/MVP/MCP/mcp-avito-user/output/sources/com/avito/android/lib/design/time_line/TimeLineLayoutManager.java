package com.avito.android.lib.design.time_line;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TimeLineLayoutManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/TimeLineLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimeLineLayoutManager extends LinearLayoutManager {

    /* compiled from: TimeLineLayoutManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TimeLineItemWidthType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeLineItemWidthType timeLineItemWidthType = TimeLineItemWidthType.f180959c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        h2(nVarA0);
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n b0(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        h2(nVar);
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @Y61.k
    public final RecyclerView.n c0(@Y61.l ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        h2(nVarC0);
        return nVarC0;
    }

    public final void h2(RecyclerView.n nVar) {
        int i12;
        int paddingStart = (this.f53850p - getPaddingStart()) - getPaddingEnd();
        t tVar = t.f181043a;
        int iO02 = o0();
        tVar.getClass();
        int iOrdinal = (iO02 == 2 ? TimeLineItemWidthType.f180959c : TimeLineItemWidthType.f180960d).ordinal();
        if (iOrdinal == 0) {
            i12 = paddingStart / 2;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = paddingStart / 3;
        }
        ((ViewGroup.MarginLayoutParams) nVar).width = i12;
    }
}
