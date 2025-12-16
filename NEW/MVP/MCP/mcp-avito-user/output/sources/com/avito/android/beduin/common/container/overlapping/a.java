package com.avito.android.beduin.common.container.overlapping;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.container.overlapping.BeduinOverlappingContainerModel;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinOverlappingContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/overlapping/a;", "Lej/a;", "Lcom/avito/android/beduin/common/container/overlapping/BeduinOverlappingContainerModel;", "Lcom/avito/android/beduin/common/container/overlapping/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinOverlappingContainerModel, g> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinOverlappingContainerModel f103158e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Wh.c f103159f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f103160g = C42727D.b(LazyThreadSafetyMode.f406616d, new C3094a());

    /* compiled from: BeduinOverlappingContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LYh/c;", "invoke", "()LYh/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.container.overlapping.a$a, reason: collision with other inner class name */
    public static final class C3094a extends N implements Y41.a<Yh.c> {
        public C3094a() {
            super(0);
        }

        @Override // Y41.a
        public final Yh.c invoke() {
            return new Yh.c(a.this.f103159f);
        }
    }

    public a(@k BeduinOverlappingContainerModel beduinOverlappingContainerModel, @k Wh.c cVar) {
        this.f103158e = beduinOverlappingContainerModel;
        this.f103159f = cVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103158e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        f fVar = new f(viewGroup.getContext());
        fVar.f103168d = BeduinOverlappingContainerModel.Alignment.CENTER;
        fVar.setId(View.generateViewId());
        fVar.setLayoutParams(layoutParams);
        I.b(fVar);
        return new g(fVar, this.f103159f);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinOverlappingContainerModel beduinOverlappingContainerModel = (BeduinOverlappingContainerModel) beduinModel;
        if ((beduinOverlappingContainerModel.equals(BeduinOverlappingContainerModel.copy$default(this.f103158e, null, null, null, null, null, beduinOverlappingContainerModel.getChildren(), null, null, 223, null)) ? beduinOverlappingContainerModel : null) != null) {
            return ((Yh.c) this.f103160g.getValue()).a(this.f103158e.getChildren(), beduinOverlappingContainerModel.getChildren());
        }
        return null;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        g gVar = (g) interfaceC40116e;
        BeduinOverlappingContainerModel beduinOverlappingContainerModel = this.f103158e;
        String id2 = beduinOverlappingContainerModel.getF102944b();
        f fVar = gVar.f103170b;
        fVar.setTag(id2);
        I.c(fVar, beduinOverlappingContainerModel.getBackground(), false);
        I.e(fVar, beduinOverlappingContainerModel.getPadding());
        J.b(fVar, beduinOverlappingContainerModel.getMargin());
        com.avito.android.beduin.common.container.componentsPool.e.c(gVar.f103171c, beduinOverlappingContainerModel.getChildren(), new b(this), null, 12);
        Integer overlapPadding = beduinOverlappingContainerModel.getOverlapPadding();
        int iB2 = y6.b(overlapPadding != null ? overlapPadding.intValue() : 0);
        if (fVar.f103166b != iB2) {
            fVar.f103166b = iB2;
            fVar.requestLayout();
        }
        BeduinOverlappingContainerModel.Alignment alignment = beduinOverlappingContainerModel.getAlignment();
        if (alignment == null) {
            alignment = BeduinOverlappingContainerModel.Alignment.CENTER;
        }
        if (fVar.f103168d != alignment) {
            fVar.f103168d = alignment;
            fVar.requestLayout();
        }
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        G0 g02;
        Object next;
        g gVar = (g) interfaceC40116e;
        Iterator it = list.iterator();
        while (true) {
            g02 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof Yh.b) {
                    break;
                }
            }
        }
        if (!(next instanceof Yh.b)) {
            next = null;
        }
        Yh.b bVar = (Yh.b) next;
        if (bVar != null) {
            com.avito.android.beduin.common.container.componentsPool.e.a(gVar.f103171c, bVar, new c(this));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            m(gVar);
        }
    }
}
