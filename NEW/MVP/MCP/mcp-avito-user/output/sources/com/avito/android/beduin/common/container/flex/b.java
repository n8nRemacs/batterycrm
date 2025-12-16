package com.avito.android.beduin.common.container.flex;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.model.Layout;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.google.android.flexbox.FlexboxLayout;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFlexContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/b;", "Lej/a;", "Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel;", "Lcom/avito/android/beduin/common/container/flex/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40112a<BeduinFlexContainerModel, g> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f103042k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final List<String> f103043l = Collections.singletonList("flexContainer");

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final Class<BeduinFlexContainerModel> f103044m = BeduinFlexContainerModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinFlexContainerModel f103045e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103046f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Wh.c f103047g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Yh.c f103048h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f103049i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public ViewGroup.LayoutParams f103050j;

    /* compiled from: BeduinFlexContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/b$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinFlexContainerModel> S() {
            return b.f103044m;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return b.f103043l;
        }

        public a() {
        }
    }

    public b(@k BeduinFlexContainerModel beduinFlexContainerModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k Wh.c cVar, @k Yh.c cVar2, boolean z12) {
        this.f103045e = beduinFlexContainerModel;
        this.f103046f = interfaceC15523b;
        this.f103047g = cVar;
        this.f103048h = cVar2;
        this.f103049i = z12;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103045e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        FlexboxLayout flexboxLayout = new FlexboxLayout(viewGroup.getContext(), null);
        flexboxLayout.setId(View.generateViewId());
        flexboxLayout.setFlexWrap(1);
        Layout layout = this.f103045e.getLayout();
        Layout.ContentMode contentModeC = layout != null ? layout.getContentMode() : null;
        layoutParams.width = contentModeC != null ? contentModeC.f101775b : Layout.ContentMode.FILL_PARENT.f101775b;
        this.f103050j = layoutParams;
        flexboxLayout.setLayoutParams(layoutParams);
        I.b(flexboxLayout);
        return new g(flexboxLayout, this.f103047g);
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinFlexContainerModel beduinFlexContainerModel = (BeduinFlexContainerModel) beduinModel;
        if (!this.f103049i) {
            return null;
        }
        List<BeduinModel> children = beduinFlexContainerModel.getChildren();
        BeduinFlexContainerModel beduinFlexContainerModel2 = this.f103045e;
        if ((beduinFlexContainerModel.equals(BeduinFlexContainerModel.a(beduinFlexContainerModel2, null, null, children, 2047)) ? beduinFlexContainerModel : null) != null) {
            return this.f103048h.a(beduinFlexContainerModel2.getChildren(), beduinFlexContainerModel.getChildren());
        }
        return null;
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        Object next;
        g gVar = (g) interfaceC40116e;
        if (!this.f103049i) {
            m(gVar);
            return;
        }
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
        if (bVar != null) {
            com.avito.android.beduin.common.container.componentsPool.e.a(gVar.f103058c, bVar, d.f103052l);
        } else {
            m(gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @Override // ej.AbstractC40112a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(@Y61.k com.avito.android.beduin.common.container.flex.g r8) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.container.flex.b.m(com.avito.android.beduin.common.container.flex.g):void");
    }
}
