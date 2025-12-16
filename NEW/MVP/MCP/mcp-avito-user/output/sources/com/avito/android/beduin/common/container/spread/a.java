package com.avito.android.beduin.common.container.spread;

import Ui.InterfaceC15523b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.container.spread.BeduinSpreadLayout;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSpreadContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/a;", "Lej/a;", "Lcom/avito/android/beduin/common/container/spread/BeduinSpreadContainerModel;", "Lcom/avito/android/beduin/common/container/spread/n;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinSpreadContainerModel, n> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinSpreadContainerModel f103190e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f103191f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Wh.c f103192g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Yh.c f103193h;

    /* compiled from: BeduinSpreadContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.spread.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3096a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103194a;

        static {
            int[] iArr = new int[BeduinContainerPriority.values().length];
            try {
                iArr[BeduinContainerPriority.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinContainerPriority.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103194a = iArr;
        }
    }

    public a(@Y61.k BeduinSpreadContainerModel beduinSpreadContainerModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k Wh.c cVar, @Y61.k Yh.c cVar2) {
        this.f103190e = beduinSpreadContainerModel;
        this.f103191f = interfaceC15523b;
        this.f103192g = cVar;
        this.f103193h = cVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103190e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinSpreadLayout beduinSpreadLayout = new BeduinSpreadLayout(viewGroup.getContext(), null, 0, 6, null);
        beduinSpreadLayout.setId(R.id.beduin_spread_container);
        beduinSpreadLayout.setLayoutParams(layoutParams);
        I.b(beduinSpreadLayout);
        return new n(beduinSpreadLayout, this.f103192g);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinSpreadContainerModel beduinSpreadContainerModel = (BeduinSpreadContainerModel) beduinModel;
        if ((beduinSpreadContainerModel.equals(BeduinSpreadContainerModel.copy$default(this.f103190e, null, null, null, null, null, null, null, null, null, null, beduinSpreadContainerModel.getLeftChildren(), beduinSpreadContainerModel.getRightChildren(), null, null, 13311, null)) ? beduinSpreadContainerModel : null) == null) {
            return null;
        }
        BeduinSpreadContainerModel beduinSpreadContainerModel2 = this.f103190e;
        List<BeduinModel> leftChildren = beduinSpreadContainerModel2.getLeftChildren();
        List<BeduinModel> leftChildren2 = beduinSpreadContainerModel.getLeftChildren();
        Yh.c cVar = this.f103193h;
        return new k(cVar.a(leftChildren, leftChildren2), cVar.a(beduinSpreadContainerModel2.getRightChildren(), beduinSpreadContainerModel.getRightChildren()));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        BeduinSpreadLayout.Priority priority;
        n nVar = (n) interfaceC40116e;
        BeduinSpreadContainerModel beduinSpreadContainerModel = this.f103190e;
        String f100853b = beduinSpreadContainerModel.getId();
        BeduinSpreadLayout beduinSpreadLayout = nVar.f103212b;
        beduinSpreadLayout.setTag(f100853b);
        I.c(beduinSpreadLayout, beduinSpreadContainerModel.getBackground(), O2.a(beduinSpreadContainerModel.getActions()));
        I.e(beduinSpreadLayout, beduinSpreadContainerModel.getPadding());
        J.b(beduinSpreadLayout, beduinSpreadContainerModel.getMargin());
        Drawable drawableH = null;
        com.avito.android.beduin.common.container.componentsPool.e.c(nVar.f103213c, beduinSpreadContainerModel.getLeftChildren(), new b(this), null, 12);
        com.avito.android.beduin.common.container.componentsPool.e.c(nVar.f103214d, beduinSpreadContainerModel.getRightChildren(), new c(this), null, 12);
        Integer interItemSpacing = beduinSpreadContainerModel.getInterItemSpacing();
        beduinSpreadLayout.setItemSpacingPx(interItemSpacing != null ? y6.b(interItemSpacing.intValue()) : 0);
        BeduinContainerPriority priority2 = beduinSpreadContainerModel.getPriority();
        int i12 = priority2 == null ? -1 : C3096a.f103194a[priority2.ordinal()];
        if (i12 == -1) {
            priority = BeduinSpreadLayout.Priority.f103185b;
        } else if (i12 != 1) {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            priority = BeduinSpreadLayout.Priority.f103185b;
        } else {
            priority = BeduinSpreadLayout.Priority.f103186c;
        }
        beduinSpreadLayout.setPriority(priority);
        Alignment alignment = beduinSpreadContainerModel.getAlignment();
        if (alignment == null) {
            alignment = Alignment.SPREAD;
        }
        beduinSpreadLayout.setAlignment(alignment);
        VerticalAlignment verticalAlignment = beduinSpreadContainerModel.getVerticalAlignment();
        if (verticalAlignment == null) {
            verticalAlignment = VerticalAlignment.TOP;
        }
        beduinSpreadLayout.setVerticalAlignment(verticalAlignment);
        List<BeduinAction> actions = beduinSpreadContainerModel.getActions();
        InterfaceC15523b<BeduinAction> interfaceC15523b = this.f103191f;
        com.avito.android.beduin.common.component.j.a(beduinSpreadLayout, actions, interfaceC15523b);
        com.avito.android.beduin.common.component.j.a(beduinSpreadLayout.getLeftPart(), beduinSpreadContainerModel.getOnLeftChildrenTapActions(), interfaceC15523b);
        m leftPart = beduinSpreadLayout.getLeftPart();
        Context context = beduinSpreadLayout.getContext();
        List<BeduinAction> onLeftChildrenTapActions = beduinSpreadContainerModel.getOnLeftChildrenTapActions();
        leftPart.setForeground((onLeftChildrenTapActions == null || onLeftChildrenTapActions.isEmpty()) ? null : C35835l0.h(android.R.attr.selectableItemBackground, context));
        com.avito.android.beduin.common.component.j.a(beduinSpreadLayout.getRightPart(), beduinSpreadContainerModel.getOnRightChildrenTapActions(), interfaceC15523b);
        m rightPart = beduinSpreadLayout.getRightPart();
        Context context2 = beduinSpreadLayout.getContext();
        List<BeduinAction> onRightChildrenTapActions = beduinSpreadContainerModel.getOnRightChildrenTapActions();
        if (onRightChildrenTapActions != null && !onRightChildrenTapActions.isEmpty()) {
            drawableH = C35835l0.h(android.R.attr.selectableItemBackground, context2);
        }
        rightPart.setForeground(drawableH);
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        n nVar = (n) interfaceC40116e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof k) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            m(nVar);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            com.avito.android.beduin.common.container.componentsPool.e.a(nVar.f103213c, kVar.f103204a, new d(this));
            e eVar = new e(this);
            com.avito.android.beduin.common.container.componentsPool.e.a(nVar.f103214d, kVar.f103205b, eVar);
        }
    }
}
