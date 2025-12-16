package com.avito.android.beduin.common.container.horizontal_slider;

import android.view.View;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinBaseHorizontalSliderLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroid/view/View;", "<anonymous parameter 0>", "", "position", "Lkotlin/G0;", "invoke", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseHorizontalSliderLayout<Object> f103098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout) {
        super(2);
        this.f103098l = beduinBaseHorizontalSliderLayout;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        G0 g02;
        int iIntValue = num.intValue();
        int[] iArr = new int[2];
        BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout = this.f103098l;
        View viewZ = beduinBaseHorizontalSliderLayout.f103061c.Z(iIntValue);
        if (viewZ != null) {
            viewZ.getLocationInWindow(iArr);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            beduinBaseHorizontalSliderLayout.recycler.D0(iArr[0] - beduinBaseHorizontalSliderLayout.f103072n, 0, null);
        }
        return G0.f406611a;
    }
}
