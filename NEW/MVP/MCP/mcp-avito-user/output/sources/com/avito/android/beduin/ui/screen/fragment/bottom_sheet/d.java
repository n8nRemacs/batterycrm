package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import Y41.r;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.J0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "start", "top", "end", "bottom", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements r<Integer, Integer, Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Guideline f104182l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScreenFragment f104183m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Guideline guideline, BottomSheetScreenFragment bottomSheetScreenFragment) {
        super(4);
        this.f104182l = guideline;
        this.f104183m = bottomSheetScreenFragment;
    }

    @Override // Y41.r
    public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        this.f104182l.setGuidelineBegin(iIntValue2);
        BottomSheetScreenFragment bottomSheetScreenFragment = this.f104183m;
        View viewRequireView = bottomSheetScreenFragment.requireView();
        viewRequireView.setPadding(iIntValue, viewRequireView.getPaddingTop(), iIntValue3, viewRequireView.getPaddingBottom());
        bottomSheetScreenFragment.f104163M0 = iIntValue4;
        J0 j02 = J0.f44939b;
        return G0.f406611a;
    }
}
