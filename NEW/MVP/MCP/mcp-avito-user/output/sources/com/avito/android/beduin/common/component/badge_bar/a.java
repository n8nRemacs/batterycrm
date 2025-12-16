package com.avito.android.beduin.common.component.badge_bar;

import Ui.InterfaceC15523b;
import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.form.transforms.BadgeBarExpandTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.component.advert_badge_bar.AdvertBadgeBar;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.UniversalColor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.d;
import lj.e;

/* compiled from: BeduinBadgeBarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/badge_bar/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarModel;", "Lcom/avito/android/component/advert_badge_bar/AdvertBadgeBar;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinBadgeBarModel, AdvertBadgeBar> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C3023a f100681i = new C3023a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final List<String> f100682j = Collections.singletonList(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final Class<BeduinBadgeBarModel> f100683k = BeduinBadgeBarModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f100684e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100685f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinBadgeBarModel f100686g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100687h;

    /* compiled from: BeduinBadgeBarComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/badge_bar/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.badge_bar.a$a, reason: collision with other inner class name */
    public static final class C3023a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3023a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinBadgeBarModel> S() {
            return a.f100683k;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f100682j;
        }

        public C3023a() {
        }
    }

    /* compiled from: BeduinBadgeBarComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;", "badgeItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_badge_bar/badge/BadgeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<BadgeItem, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBadgeBarModel f100688l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f100689m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinBadgeBarModel beduinBadgeBarModel, a aVar) {
            super(1);
            this.f100688l = beduinBadgeBarModel;
            this.f100689m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(BadgeItem badgeItem) {
            Object next;
            List<BeduinAction> onTapActions;
            BadgeItem badgeItem2 = badgeItem;
            Iterator<T> it = this.f100688l.getItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BeduinBadgeBarItem) next).getId() == badgeItem2.f124944c) {
                    break;
                }
            }
            BeduinBadgeBarItem beduinBadgeBarItem = (BeduinBadgeBarItem) next;
            if (beduinBadgeBarItem != null && (onTapActions = beduinBadgeBarItem.getOnTapActions()) != null) {
                InterfaceC15523b<BeduinAction> interfaceC15523b = this.f100689m.f100685f;
                Iterator<T> it2 = onTapActions.iterator();
                while (it2.hasNext()) {
                    interfaceC15523b.o((BeduinAction) it2.next());
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinBadgeBarComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBadgeBarModel f100690l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f100691m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BeduinBadgeBarModel beduinBadgeBarModel, a aVar) {
            super(0);
            this.f100690l = beduinBadgeBarModel;
            this.f100691m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            BeduinBadgeBarModel beduinBadgeBarModel = this.f100690l;
            List<BeduinAction> onExpandActions = beduinBadgeBarModel.getOnExpandActions();
            a aVar = this.f100691m;
            if (onExpandActions != null) {
                InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f100685f;
                Iterator<T> it = onExpandActions.iterator();
                while (it.hasNext()) {
                    interfaceC15523b.o((BeduinAction) it.next());
                }
            }
            aVar.f100684e.h(new d.h(beduinBadgeBarModel, beduinBadgeBarModel.apply(new BadgeBarExpandTransform(!beduinBadgeBarModel.isExpanded()))));
            return G0.f406611a;
        }
    }

    public a(@k e eVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinBadgeBarModel beduinBadgeBarModel, boolean z12) {
        this.f100684e = eVar;
        this.f100685f = interfaceC15523b;
        this.f100686g = beduinBadgeBarModel;
        this.f100687h = z12;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100686g;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        return (BeduinBadgeBarModel) beduinModel;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        AdvertBadgeBar advertBadgeBar = new AdvertBadgeBar(viewGroup.getContext(), null, 0, R.style.BeduinBadgeBar, 6, null);
        advertBadgeBar.setId(View.generateViewId());
        advertBadgeBar.setBadgeType(AdvertBadgeBar.BadgeType.f124937c);
        advertBadgeBar.setCancelImageLoadingOnDetach(this.f100687h);
        advertBadgeBar.setLayoutParams(layoutParams);
        return advertBadgeBar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        u((AdvertBadgeBar) view, this.f100686g);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        AdvertBadgeBar advertBadgeBar = (AdvertBadgeBar) view;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof BeduinBadgeBarModel) {
                obj = obj2;
            }
        }
        BeduinBadgeBarModel beduinBadgeBarModel = (BeduinBadgeBarModel) (obj instanceof BeduinBadgeBarModel ? obj : null);
        if (beduinBadgeBarModel == null) {
            u(advertBadgeBar, this.f100686g);
        } else {
            u(advertBadgeBar, beduinBadgeBarModel);
        }
    }

    public final void u(AdvertBadgeBar advertBadgeBar, BeduinBadgeBarModel beduinBadgeBarModel) {
        UniversalColor universalColor;
        UniversalColor universalColor2;
        UniversalColor textColor;
        advertBadgeBar.setTag(beduinBadgeBarModel.getF100853b());
        List<BeduinBadgeBarItem> items = beduinBadgeBarModel.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        for (BeduinBadgeBarItem beduinBadgeBarItem : items) {
            BeduinBadgeBarItemStyle itemStyle = beduinBadgeBarModel.getItemStyle();
            String strValueOf = String.valueOf(beduinBadgeBarItem.getId());
            int id2 = beduinBadgeBarItem.getId();
            String title = beduinBadgeBarItem.getTitle();
            BeduinBadgeBarItemStyle style = beduinBadgeBarItem.getStyle();
            if (style != null && (backgroundColor = style.getBackgroundColor()) != null) {
                universalColor = backgroundColor;
            } else if (itemStyle != null) {
                UniversalColor backgroundColor = itemStyle.getBackgroundColor();
                universalColor = backgroundColor;
            } else {
                universalColor = null;
            }
            BeduinBadgeBarItemStyle style2 = beduinBadgeBarItem.getStyle();
            if (style2 != null && (highlightedColor = style2.getHighlightedColor()) != null) {
                universalColor2 = highlightedColor;
            } else if (itemStyle != null) {
                UniversalColor highlightedColor = itemStyle.getHighlightedColor();
                universalColor2 = highlightedColor;
            } else {
                universalColor2 = null;
            }
            BeduinBadgeBarItemStyle style3 = beduinBadgeBarItem.getStyle();
            arrayList.add(new BadgeItem(strValueOf, id2, title, "", universalColor, universalColor2, (style3 == null || (textColor = style3.getTextColor()) == null) ? itemStyle != null ? itemStyle.getTextColor() : null : textColor, 1, 1, beduinBadgeBarItem.getImage(), null, false, false, null, 15360, null));
        }
        Integer preloadCount = beduinBadgeBarModel.getPreloadCount();
        advertBadgeBar.b(preloadCount != null ? preloadCount.intValue() : beduinBadgeBarModel.getItems().size(), advertBadgeBar.getContext().getString(R.string.badge_bar_extend_text), arrayList);
        advertBadgeBar.setExpanded(beduinBadgeBarModel.isExpanded());
        advertBadgeBar.setOnBadgeClickListener(new b(beduinBadgeBarModel, this));
        advertBadgeBar.setExpandButtonClickListener(new c(beduinBadgeBarModel, this));
    }
}
