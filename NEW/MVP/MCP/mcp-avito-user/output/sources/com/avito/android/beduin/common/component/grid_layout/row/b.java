package com.avito.android.beduin.common.component.grid_layout.row;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.C25654c;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: BeduinGridLayoutRowContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_layout/row/b;", "LWh/a;", "Lcom/avito/android/beduin/common/component/grid_layout/row/BeduinGridLayoutRowContainerModel;", "Landroid/widget/LinearLayout;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC15764a<BeduinGridLayoutRowContainerModel, LinearLayout> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f101368k = {m0.f406844a.f(new a0("beduinBoundData", "getBeduinBoundData(Landroid/widget/LinearLayout;)Lcom/avito/android/beduin/common/component/grid_layout/row/BeduinGridLayoutRowContainerBoundData;", b.class))};

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f101369f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101370g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BeduinGridLayoutRowContainerModel f101371h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25654c f101372i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a f101373j = new a();

    public b(@k lj.e eVar, @k InterfaceC15523b interfaceC15523b, @k BeduinGridLayoutRowContainerModel beduinGridLayoutRowContainerModel, @k C25654c c25654c) {
        this.f101369f = eVar;
        this.f101370g = interfaceC15523b;
        this.f101371h = beduinGridLayoutRowContainerModel;
        this.f101372i = c25654c;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101371h;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setId(View.generateViewId());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        I.b(linearLayout);
        c cVar = new c(null, 1, null);
        this.f101373j.setValue(linearLayout, f101368k[0], cVar);
        return linearLayout;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        InterfaceC40116e interfaceC40116e;
        LinearLayout linearLayout = (LinearLayout) view;
        BeduinGridLayoutRowContainerModel beduinGridLayoutRowContainerModel = this.f101371h;
        linearLayout.setTag(beduinGridLayoutRowContainerModel.getId());
        I.c(linearLayout, beduinGridLayoutRowContainerModel.getBackground(), false);
        I.e(linearLayout, beduinGridLayoutRowContainerModel.getPadding());
        J.b(linearLayout, beduinGridLayoutRowContainerModel.getMargin());
        List<BeduinModel> children = beduinGridLayoutRowContainerModel.getChildren();
        if (children != null) {
            int i12 = 0;
            for (Object obj : children) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = u((BeduinModel) obj);
                List<f<?>> list = ((c) this.f101373j.getValue(linearLayout, f101368k[0])).f101374a;
                f fVar = (f) C42745f0.K(i12, list);
                View childAt = linearLayout.getChildAt(i12);
                FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
                if (!L.f(fVar != null ? fVar.f101377a : null, abstractC40112aU.getClass()) || frameLayout == null || frameLayout.getChildCount() <= 0) {
                    InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(linearLayout, new FrameLayout.LayoutParams(-1, -2, 17));
                    frameLayout = new FrameLayout(linearLayout.getContext(), null);
                    frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    frameLayout.addView(interfaceC40116eI.getF101723b());
                    I.b(frameLayout);
                    f<?> fVar2 = new f<>(abstractC40112aU.getClass(), interfaceC40116eI);
                    if (i12 < list.size()) {
                        list.set(i12, fVar2);
                    } else {
                        list.add(fVar2);
                    }
                    if (i12 < linearLayout.getChildCount()) {
                        linearLayout.addView(frameLayout, i12);
                    } else {
                        linearLayout.addView(frameLayout);
                    }
                    interfaceC40116e = interfaceC40116eI;
                } else {
                    interfaceC40116e = fVar.f101378b;
                }
                FrameLayout frameLayout2 = frameLayout;
                Integer interItemSpacing = beduinGridLayoutRowContainerModel.getInterItemSpacing();
                if (interItemSpacing != null) {
                    int iIntValue = interItemSpacing.intValue();
                    if (i12 != 0) {
                        D6.c(frameLayout2, Integer.valueOf(y6.b(iIntValue)), null, null, null, 14);
                    }
                }
                abstractC40112aU.m(interfaceC40116e);
                i12 = i13;
            }
        }
        int childCount = linearLayout.getChildCount();
        List<BeduinModel> children2 = beduinGridLayoutRowContainerModel.getChildren();
        int size = childCount - (children2 != null ? children2.size() : 0);
        if (size > 0) {
            linearLayout.removeViews(linearLayout.getChildCount() - size, size);
        }
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f101370g;
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f101372i;
    }

    @Override // Wh.AbstractC15764a
    @k
    /* renamed from: x, reason: from getter */
    public final lj.e getF102202g() {
        return this.f101369f;
    }
}
