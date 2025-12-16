package com.avito.android.beduin.common.container.equalwidth;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.O2;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinEqualWidthContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/a;", "Lej/a;", "Lcom/avito/android/beduin/common/container/equalwidth/BeduinEqualWidthContainerModel;", "Lcom/avito/android/beduin/common/container/equalwidth/h;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinEqualWidthContainerModel, h> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinEqualWidthContainerModel f103021e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103022f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Wh.c f103023g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Yh.c f103024h;

    /* compiled from: BeduinEqualWidthContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.equalwidth.a$a, reason: collision with other inner class name */
    public static final class C3092a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f103025a = Collections.singletonList("equalWidthContainer");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f103026b = BeduinEqualWidthContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f103026b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f103025a;
        }
    }

    /* compiled from: BeduinEqualWidthContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103027a;

        static {
            int[] iArr = new int[LayoutMode.values().length];
            try {
                iArr[LayoutMode.FILL_HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutMode.BY_CONTENT_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103027a = iArr;
        }
    }

    public a(@k BeduinEqualWidthContainerModel beduinEqualWidthContainerModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k Wh.c cVar, @k Yh.c cVar2) {
        this.f103021e = beduinEqualWidthContainerModel;
        this.f103022f = interfaceC15523b;
        this.f103023g = cVar;
        this.f103024h = cVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103021e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        g gVar = new g(viewGroup.getContext());
        gVar.childrenLayoutParamsHeight = -2;
        gVar.setId(R.id.beduin_equal_width_container);
        gVar.setLayoutParams(layoutParams);
        gVar.setOrientation(0);
        I.b(gVar);
        LayoutMode layoutMode = this.f103021e.getLayoutMode();
        gVar.setChildrenLayoutParamsHeight((layoutMode == null ? -1 : b.f103027a[layoutMode.ordinal()]) == 1 ? -1 : -2);
        return new h(gVar, this.f103023g);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinEqualWidthContainerModel beduinEqualWidthContainerModel = (BeduinEqualWidthContainerModel) beduinModel;
        if ((beduinEqualWidthContainerModel.equals(BeduinEqualWidthContainerModel.copy$default(this.f103021e, null, null, null, null, null, beduinEqualWidthContainerModel.getChildren(), null, null, null, 479, null)) ? beduinEqualWidthContainerModel : null) != null) {
            return this.f103024h.a(this.f103021e.getChildren(), beduinEqualWidthContainerModel.getChildren());
        }
        return null;
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        h hVar = (h) interfaceC40116e;
        BeduinEqualWidthContainerModel beduinEqualWidthContainerModel = this.f103021e;
        String f100853b = beduinEqualWidthContainerModel.getF102944b();
        g gVar = hVar.f103033b;
        gVar.setTag(f100853b);
        I.c(gVar, beduinEqualWidthContainerModel.getBackground(), O2.a(beduinEqualWidthContainerModel.getActions()));
        I.e(gVar, beduinEqualWidthContainerModel.getPadding());
        J.b(gVar, beduinEqualWidthContainerModel.getMargin());
        com.avito.android.beduin.common.container.componentsPool.e.c(hVar.f103034c, beduinEqualWidthContainerModel.getChildren(), new com.avito.android.beduin.common.container.equalwidth.b(this), null, 12);
        Integer interItemSpacing = beduinEqualWidthContainerModel.getInterItemSpacing();
        gVar.setInterItemSpacing(interItemSpacing != null ? interItemSpacing.intValue() : 0);
        j.a(gVar, beduinEqualWidthContainerModel.getActions(), this.f103022f);
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        Object next;
        h hVar = (h) interfaceC40116e;
        Iterator it = list.iterator();
        while (true) {
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
        Yh.b bVar = (Yh.b) (next instanceof Yh.b ? next : null);
        if (bVar == null) {
            m(hVar);
            return;
        }
        com.avito.android.beduin.common.container.componentsPool.e.a(hVar.f103034c, bVar, new c(this));
        Integer interItemSpacing = this.f103021e.getInterItemSpacing();
        hVar.f103033b.setInterItemSpacing(interItemSpacing != null ? interItemSpacing.intValue() : 0);
    }
}
