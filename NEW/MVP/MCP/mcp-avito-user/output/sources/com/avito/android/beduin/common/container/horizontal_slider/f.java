package com.avito.android.beduin.common.container.horizontal_slider;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerPaginatorStyle;
import com.avito.android.beduin.common.form.transforms.ChangePageTransform;
import com.avito.android.beduin.common.utils.C28814j;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin.common.utils.result.b;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinHorizontalSliderContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/f;", "LWh/a;", "Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerModel;", "Lcom/avito/android/beduin/common/container/horizontal_slider/l;", "Lcom/avito/android/beduin/common/utils/result/b;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC15764a<BeduinHorizontalSliderContainerModel, l> implements com.avito.android.beduin.common.utils.result.b {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final lj.e f103099f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f103100g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BeduinHorizontalSliderContainerModel f103101h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25654c f103102i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Th.a f103103j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C28814j f103104k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final AbstractC35201t f103105l;

    /* compiled from: BeduinHorizontalSliderContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/f$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f103106a = Collections.singletonList("horizontalSliderContainer");

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinModel> f103107b = BeduinHorizontalSliderContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<? extends BeduinModel> S() {
            return this.f103107b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return this.f103106a;
        }
    }

    /* compiled from: BeduinHorizontalSliderContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103108a;

        static {
            int[] iArr = new int[HorizontalSliderChildLayoutMode.values().length];
            try {
                iArr[HorizontalSliderChildLayoutMode.BY_CONTENT_SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f103108a = iArr;
        }
    }

    public f(@Y61.k lj.e eVar, @Y61.k InterfaceC15523b interfaceC15523b, @Y61.k BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel, @Y61.k C25654c c25654c, @Y61.k Th.a aVar, @Y61.k C28814j c28814j, @Y61.k AbstractC35201t abstractC35201t) {
        this.f103099f = eVar;
        this.f103100g = interfaceC15523b;
        this.f103101h = beduinHorizontalSliderContainerModel;
        this.f103102i = c25654c;
        this.f103103j = aVar;
        this.f103104k = c28814j;
        this.f103105l = abstractC35201t;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f103101h;
    }

    @Override // com.avito.android.beduin.common.utils.result.b
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final C28814j getF19023k() {
        return this.f103104k;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = (BeduinHorizontalSliderContainerModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinHorizontalSliderContainerChange[] beduinHorizontalSliderContainerChangeArrValues = BeduinHorizontalSliderContainerChange.values();
        if (beduinHorizontalSliderContainerChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinHorizontalSliderContainerChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinHorizontalSliderContainerChangeArrValues));
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel2 = this.f103101h;
        if (!L.f(fVar.invoke(beduinHorizontalSliderContainerModel2), fVar.invoke(beduinHorizontalSliderContainerModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinHorizontalSliderContainerChange beduinHorizontalSliderContainerChange : beduinHorizontalSliderContainerChangeArrValues) {
            if (!L.f(beduinHorizontalSliderContainerChange.b().invoke(beduinHorizontalSliderContainerModel2), beduinHorizontalSliderContainerChange.b().invoke(beduinHorizontalSliderContainerModel))) {
                arrayList.add(beduinHorizontalSliderContainerChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        l lVar = new l(viewGroup.getContext(), this.f103105l);
        lVar.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        lVar.setLayoutParams(layoutParams);
        I.b(lVar);
        return lVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) throws Resources.NotFoundException {
        l lVar = (l) view;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        h hVar = new h(this, lVar);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(hVar, list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof e.b)) {
                q(lVar);
                return;
            }
        }
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f103100g;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f103102i;
    }

    @Override // Wh.AbstractC15764a
    @Y61.k
    /* renamed from: x, reason: from getter */
    public final lj.e getF19019g() {
        return this.f103099f;
    }

    @Override // com.avito.android.beduin.common.component.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void q(@Y61.k l lVar) throws Resources.NotFoundException {
        Integer left;
        Integer right;
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = this.f103101h;
        lVar.setTag(beduinHorizontalSliderContainerModel.getF100853b());
        I.c(lVar, beduinHorizontalSliderContainerModel.getBackground(), O2.a(beduinHorizontalSliderContainerModel.getActions()));
        I.e(lVar.getRecycler(), beduinHorizontalSliderContainerModel.getPadding());
        BeduinContainerIndent padding = beduinHorizontalSliderContainerModel.getPadding();
        if (padding != null && (right = padding.getRight()) != null) {
            int iB2 = y6.b(right.intValue());
            Integer interItemSpacing = beduinHorizontalSliderContainerModel.getInterItemSpacing();
            if (interItemSpacing != null) {
                D6.f(lVar.getRecycler(), 0, 0, Math.max(0, iB2 - y6.b(interItemSpacing.intValue())), 0, 11);
            }
        }
        J.b(lVar, beduinHorizontalSliderContainerModel.getMargin());
        lVar.setListener(new g(this, beduinHorizontalSliderContainerModel));
        List<BeduinModel> children = beduinHorizontalSliderContainerModel.getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        List<BeduinModel> list = children;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(u((BeduinModel) it.next()));
        }
        HorizontalSliderChildLayoutMode layoutMode = beduinHorizontalSliderContainerModel.getLayoutMode();
        int iB3 = -1;
        if ((layoutMode == null ? -1 : b.f103108a[layoutMode.ordinal()]) == 1) {
            Integer itemWidth = beduinHorizontalSliderContainerModel.getItemWidth();
            iB3 = itemWidth != null ? y6.b(itemWidth.intValue()) : -2;
        }
        int i12 = iB3;
        Integer interItemSpacing2 = beduinHorizontalSliderContainerModel.getInterItemSpacing();
        int iB4 = interItemSpacing2 != null ? y6.b(interItemSpacing2.intValue()) : 0;
        BeduinContainerIndent padding2 = beduinHorizontalSliderContainerModel.getPadding();
        int iD2 = (padding2 == null || (left = padding2.getLeft()) == null) ? 0 : y6.d(left.intValue());
        boolean zIsPagingEnabled = beduinHorizontalSliderContainerModel.isPagingEnabled();
        boolean zF2 = L.f(beduinHorizontalSliderContainerModel.getScrollToPositionWithLeftAlign(), Boolean.TRUE);
        boolean z12 = beduinHorizontalSliderContainerModel.isPagingEnabled() && beduinHorizontalSliderContainerModel.getAlignLastItemLeftValue();
        Integer initialPageIndex = beduinHorizontalSliderContainerModel.getInitialPageIndex();
        HashMap<y, Parcelable> map = this.f103103j.f15825a;
        y.f103550a.getClass();
        lVar.b(arrayList, iB4, zIsPagingEnabled, zF2, iD2, z12, i12, false, initialPageIndex, map.get(y.c.a(beduinHorizontalSliderContainerModel)));
        if (beduinHorizontalSliderContainerModel.getCurrentPageIndex() == null && this.f103105l.C().invoke().booleanValue()) {
            String id2 = beduinHorizontalSliderContainerModel.getF100853b();
            Integer initialPageIndex2 = beduinHorizontalSliderContainerModel.getInitialPageIndex();
            com.avito.android.beduin_shared.model.utils.j.a(this.f103099f, id2, new ChangePageTransform(initialPageIndex2 != null ? initialPageIndex2.intValue() : 0));
        }
        boolean z13 = beduinHorizontalSliderContainerModel.getPaginatorStyle() != null;
        BeduinBannerGalleryContainerPaginatorStyle paginatorStyle = beduinHorizontalSliderContainerModel.getPaginatorStyle();
        if (paginatorStyle == null) {
            paginatorStyle = BeduinBannerGalleryContainerPaginatorStyle.NORMAL_WHITE;
        }
        lVar.f(paginatorStyle.a(), z13);
        com.avito.android.beduin.common.component.j.a(lVar, beduinHorizontalSliderContainerModel.getActions(), this.f103100g);
        b.a.a(this, lVar, arrayList, i12);
    }
}
