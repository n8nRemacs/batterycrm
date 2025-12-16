package com.avito.android.ui.status_bar;

import Y41.r;
import android.view.View;
import android.view.ViewGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EdgeToEdgeFakeStatusBarOwner.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements r<Integer, Integer, Integer, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f304647l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f304648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, View view2) {
        super(4);
        this.f304647l = view;
        this.f304648m = view2;
    }

    @Override // Y41.r
    public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        View view = this.f304647l;
        view.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = iIntValue2;
        view.setLayoutParams(layoutParams);
        View view2 = this.f304648m;
        view2.setPadding(iIntValue, view2.getPaddingTop(), iIntValue3, iIntValue4);
        return G0.f406611a;
    }
}
