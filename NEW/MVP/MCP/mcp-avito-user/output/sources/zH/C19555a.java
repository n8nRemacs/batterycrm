package Zh;

import A91.p;
import Ui.InterfaceC15523b;
import Wh.AbstractC15764a;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.C25654c;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.container.promo_block.RoundEdges;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.deprecated_design.f;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.e;

/* compiled from: BeduinPromoBlockContainer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LZh/a;", "LWh/a;", "Lcom/avito/android/beduin/common/container/promo_block/BeduinPromoBlockModel;", "Lcom/avito/android/lib/design/banner/Banner;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19555a extends AbstractC15764a<BeduinPromoBlockModel, Banner> {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C1445a f20375j = new C1445a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final List<String> f20376k = Collections.singletonList("promoBlock");

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final Class<BeduinPromoBlockModel> f20377l = BeduinPromoBlockModel.class;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinPromoBlockModel f20378f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25654c f20379g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f20380h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e f20381i;

    /* compiled from: BeduinPromoBlockContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh.a$a, reason: collision with other inner class name */
    public static final class C1445a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C1445a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinPromoBlockModel> S() {
            return C19555a.f20377l;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return C19555a.f20376k;
        }

        public C1445a() {
        }
    }

    public C19555a(@k BeduinPromoBlockModel beduinPromoBlockModel, @k C25654c c25654c, @k InterfaceC15523b interfaceC15523b, @k e eVar) {
        this.f20378f = beduinPromoBlockModel;
        this.f20379g = c25654c;
        this.f20380h = interfaceC15523b;
        this.f20381i = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f20378f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinPromoBlockModel beduinPromoBlockModel = (BeduinPromoBlockModel) beduinModel;
        if (!L.f(BeduinPromoBlockModel.copy$default(this.f20378f, null, null, null, null, null, null, null, null, null, false, beduinPromoBlockModel.getRoundEdges(), null, 3071, null), beduinPromoBlockModel)) {
            return null;
        }
        C19558d.f20384c.getClass();
        C19558d c19558d = new C19558d((RoundEdges) C28805a.a(beduinPromoBlockModel.getRoundEdges(), this.f20378f.getRoundEdges()));
        if (c19558d.f20386b) {
            return null;
        }
        return c19558d;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Banner banner = new Banner(new ContextThemeWrapper(viewGroup.getContext(), f.b(R.style.Theme_DesignSystem_Legacy, this.f20378f.getTheme())), null, 0, 0, 14, null);
        banner.setId(View.generateViewId());
        layoutParams.width = -1;
        layoutParams.height = -2;
        banner.setLayoutParams(layoutParams);
        return banner;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) throws Resources.NotFoundException {
        Banner banner = (Banner) view;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C19558d) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C19558d)) {
            obj = null;
        }
        C19558d c19558d = (C19558d) obj;
        if (c19558d != null) {
            RoundEdges roundEdges = c19558d.f20385a;
            if (roundEdges != null) {
                boolean z12 = true;
                boolean z13 = roundEdges == RoundEdges.TOP || roundEdges == RoundEdges.ALL;
                if (roundEdges != RoundEdges.BOTTOM && roundEdges != RoundEdges.ALL) {
                    z12 = false;
                }
                banner.Tz(z13, z12);
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            q(banner);
        }
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC15523b<BeduinAction> v() {
        return this.f20380h;
    }

    @Override // Wh.AbstractC15764a
    @k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w() {
        return this.f20379g;
    }

    @Override // Wh.AbstractC15764a
    @k
    /* renamed from: x, reason: from getter */
    public final e getF102202g() {
        return this.f20381i;
    }

    @Override // com.avito.android.beduin.common.component.h
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void q(@k Banner banner) throws Resources.NotFoundException {
        BeduinPromoBlockModel beduinPromoBlockModel = this.f20378f;
        banner.setTitle(beduinPromoBlockModel.getTitle());
        banner.setCloseButtonVisible(beduinPromoBlockModel.getCloseable());
        RoundEdges roundEdges = beduinPromoBlockModel.getRoundEdges();
        if (roundEdges == null) {
            roundEdges = RoundEdges.ALL;
        }
        roundEdges.getClass();
        banner.Tz(roundEdges == RoundEdges.TOP || roundEdges == RoundEdges.ALL, roundEdges == RoundEdges.BOTTOM || roundEdges == RoundEdges.ALL);
        Context context = banner.getContext();
        String style = beduinPromoBlockModel.getStyle();
        if (style == null) {
            style = "";
        }
        banner.setAppearance(com.avito.android.lib.util.f.s(com.avito.android.lib.util.f.b(style), context));
        banner.setCloseButtonListener(new p(this, 21));
        List<BeduinModel> children = beduinPromoBlockModel.getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        List<BeduinModel> list = children;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(u((BeduinModel) it.next()));
        }
        if (arrayList.size() == 1) {
            AbstractC40112a abstractC40112a = (AbstractC40112a) C42745f0.E(arrayList);
            ViewGroup container = banner.getContainer();
            if (container != null) {
                InterfaceC40116e interfaceC40116eI = abstractC40112a.i(container, new ViewGroup.LayoutParams(-1, -2));
                banner.setContentView(interfaceC40116eI.getF101723b());
                abstractC40112a.m(interfaceC40116eI);
            }
        } else {
            LinearLayout linearLayout = new LinearLayout(banner.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setClipChildren(false);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC40112a abstractC40112a2 = (AbstractC40112a) it2.next();
                InterfaceC40116e interfaceC40116eI2 = abstractC40112a2.i(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                linearLayout.addView(interfaceC40116eI2.getF101723b());
                abstractC40112a2.m(interfaceC40116eI2);
                arrayList2.add(G0.f406611a);
            }
            banner.setContentView(linearLayout);
        }
        J.b(banner, beduinPromoBlockModel.getMargin());
        BeduinContainerIndent padding = beduinPromoBlockModel.getPadding();
        if (padding != null) {
            banner.l(Integer.valueOf(y6.b(padding.getLeftIndent())), Integer.valueOf(y6.b(padding.getTopIndent())), Integer.valueOf(y6.b(padding.getRightIndent())), Integer.valueOf(y6.b(padding.getBottomIndent())));
        }
    }
}
