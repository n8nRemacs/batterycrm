package com.avito.android.beduin.common.component.imagesRow;

import Y61.k;
import android.view.ViewGroup;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.serp.NoTouchEventRecyclerView;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinImagesRowComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/b;", "Lej/a;", "Lcom/avito/android/beduin/common/component/imagesRow/BeduinImagesRowModel;", "Lcom/avito/android/beduin/common/component/imagesRow/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40112a<BeduinImagesRowModel, g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinImagesRowModel f101475e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Wh.c f101476f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f101477g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101478h = true;

    public b(@k BeduinImagesRowModel beduinImagesRowModel, @k Wh.c cVar, @k f fVar) {
        this.f101475e = beduinImagesRowModel;
        this.f101476f = cVar;
        this.f101477g = fVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101475e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        NoTouchEventRecyclerView noTouchEventRecyclerView = new NoTouchEventRecyclerView(viewGroup.getContext(), null, 0, 6, null);
        noTouchEventRecyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new g(noTouchEventRecyclerView);
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102207l() {
        return this.f101478h;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        g gVar = (g) interfaceC40116e;
        NoTouchEventRecyclerView noTouchEventRecyclerView = gVar.f101483b;
        ViewGroup.LayoutParams layoutParams = noTouchEventRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        BeduinImagesRowModel beduinImagesRowModel = this.f101475e;
        marginLayoutParams.height = y6.b(beduinImagesRowModel.getHeight());
        noTouchEventRecyclerView.setLayoutParams(marginLayoutParams);
        I.e(noTouchEventRecyclerView, beduinImagesRowModel.getPadding());
        J.b(noTouchEventRecyclerView, beduinImagesRowModel.getMargin());
        D6.l(true, noTouchEventRecyclerView, new a(this, noTouchEventRecyclerView, gVar));
    }
}
