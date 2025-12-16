package Xh;

import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import Y61.k;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import bi.C25654c;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerModel;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerPaginatorStyle;
import com.avito.android.beduin.common.container.horizontal_slider.l;
import com.avito.android.beduin.common.utils.C28814j;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin.common.utils.result.b;
import com.avito.android.beduin.common.utils.y;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBannerGalleryContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"LXh/a;", "LWh/a;", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerModel;", "Lcom/avito/android/beduin/common/container/horizontal_slider/l;", "Lcom/avito/android/beduin/common/utils/result/b;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17008a extends AbstractC15764a<BeduinBannerGalleryContainerModel, l> implements com.avito.android.beduin.common.utils.result.b {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Th.a f19018f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f19019g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f19020h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BeduinBannerGalleryContainerModel f19021i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C25654c f19022j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C28814j f19023k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final AbstractC35201t f19024l;

    /* compiled from: BeduinBannerGalleryContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXh/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xh.a$a, reason: collision with other inner class name */
    public static final class C1346a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f19025a = Collections.singletonList("bannerGallery");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f19026b = BeduinBannerGalleryContainerModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f19026b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f19025a;
        }
    }

    public C17008a(@k Th.a aVar, @k lj.e eVar, @k InterfaceC15523b interfaceC15523b, @k BeduinBannerGalleryContainerModel beduinBannerGalleryContainerModel, @k C25654c c25654c, @k C28814j c28814j, @k AbstractC35201t abstractC35201t) {
        this.f19018f = aVar;
        this.f19019g = eVar;
        this.f19020h = interfaceC15523b;
        this.f19021i = beduinBannerGalleryContainerModel;
        this.f19022j = c25654c;
        this.f19023k = c28814j;
        this.f19024l = abstractC35201t;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f19021i;
    }

    @Override // com.avito.android.beduin.common.utils.result.b
    @k
    /* renamed from: g, reason: from getter */
    public final C28814j getF103104k() {
        return this.f19023k;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        l lVar = new l(viewGroup.getContext(), this.f19024l);
        lVar.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        lVar.setLayoutParams(layoutParams);
        I.b(lVar);
        return lVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws Resources.NotFoundException {
        Integer left;
        l lVar = (l) view;
        BeduinBannerGalleryContainerModel beduinBannerGalleryContainerModel = this.f19021i;
        lVar.setTag(beduinBannerGalleryContainerModel.getF100853b());
        I.c(lVar, beduinBannerGalleryContainerModel.getBackground(), O2.a(beduinBannerGalleryContainerModel.getActions()));
        I.e(lVar.getRecycler(), beduinBannerGalleryContainerModel.getPadding());
        J.b(lVar, beduinBannerGalleryContainerModel.getMargin());
        BeduinBannerGalleryContainerPaginatorStyle paginatorStyle = beduinBannerGalleryContainerModel.getPaginatorStyle();
        if (paginatorStyle == null) {
            paginatorStyle = BeduinBannerGalleryContainerPaginatorStyle.NORMAL_WHITE;
        }
        lVar.f(paginatorStyle.a(), true);
        lVar.setListener(new C17009b(this, lVar));
        List<BeduinModel> children = beduinBannerGalleryContainerModel.getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = u((BeduinModel) it.next());
            if (abstractC40112aU != null) {
                arrayList.add(abstractC40112aU);
            }
        }
        Integer interItemSpacing = beduinBannerGalleryContainerModel.getInterItemSpacing();
        int iB2 = interItemSpacing != null ? y6.b(interItemSpacing.intValue()) : 0;
        BeduinContainerIndent padding = beduinBannerGalleryContainerModel.getPadding();
        int iB3 = (padding == null || (left = padding.getLeft()) == null) ? 0 : y6.b(left.intValue());
        boolean zIsInfinite = beduinBannerGalleryContainerModel.isInfinite();
        HashMap<y, Parcelable> map = this.f19018f.f15825a;
        y.f103550a.getClass();
        lVar.b(arrayList, iB2, true, false, iB3, false, -1, zIsInfinite, 0, map.get(y.c.a(beduinBannerGalleryContainerModel)));
        j.a(lVar, beduinBannerGalleryContainerModel.getActions(), this.f19020h);
        if (beduinBannerGalleryContainerModel.getAutoScrollInterval() > 0) {
            lVar.d(beduinBannerGalleryContainerModel.getAutoScrollInterval());
        }
        b.a.a(this, lVar, arrayList, -1);
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f19020h;
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f19022j;
    }

    @Override // Wh.AbstractC15764a
    @k
    /* renamed from: x, reason: from getter */
    public final lj.e getF102219g() {
        return this.f19019g;
    }
}
