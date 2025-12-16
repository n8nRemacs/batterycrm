package com.avito.android.serp.adapter.witcher;

import android.os.Parcelable;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.WitcherElement;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.serp.adapter.H0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import com.avito.android.serp.adapter.witcher.Appearance;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherElementConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/g;", "Lcom/avito/android/serp/adapter/witcher/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34888g implements InterfaceC34887f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34904z0 f273854a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H0 f273855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f273856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f273857d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final n1 f273858e;

    /* compiled from: WitcherElementConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.witcher.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f273859a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f273860b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f273861c;

        static {
            int[] iArr = new int[WitcherElement.SelectionType.values().length];
            try {
                iArr[WitcherElement.SelectionType.SCROLLABLE_CLICKABLE_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f273859a = iArr;
            int[] iArr2 = new int[WitcherElement.WidgetType.values().length];
            try {
                iArr2[WitcherElement.WidgetType.EXTERNAL_ROOT_CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[WitcherElement.WidgetType.INNER_ROOT_CONTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WitcherElement.WidgetType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WitcherElement.WidgetType.SUBTITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WitcherElement.WidgetType.CONTENT_CONTAINER.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WitcherElement.WidgetType.BUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            f273860b = iArr2;
            int[] iArr3 = new int[WitcherElement.AnalyticsMode.values().length];
            try {
                iArr3[WitcherElement.AnalyticsMode.REAL_ESTATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            f273861c = iArr3;
        }
    }

    public C34888g(@Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar, @Y61.k T t12, @Y61.k InterfaceC34904z0 interfaceC34904z0, @Y61.k H0 h02, @Y61.k n1 n1Var) {
        this.f273854a = interfaceC34904z0;
        this.f273855b = h02;
        this.f273856c = fVar;
        this.f273857d = t12;
        this.f273858e = n1Var;
    }

    @Override // com.avito.android.serp.adapter.witcher.InterfaceC34887f
    @Y61.k
    public final WitcherItem a(@Y61.k WitcherElement witcherElement, boolean z12) {
        WitcherItem.Action action;
        ArrayList arrayList;
        int i12;
        int i13;
        WidgetType widgetType;
        Appearance.Margins margins;
        Appearance.Paddings paddings;
        List<SerpElement> items = witcherElement.getItems();
        if (items == null) {
            items = C42784z0.f406748b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = items.iterator();
        while (true) {
            Parcelable parcelableA = null;
            if (!it.hasNext()) {
                break;
            }
            SerpElement serpElement = (SerpElement) it.next();
            if (serpElement instanceof SerpAdvert) {
                parcelableA = InterfaceC34904z0.a.a(this.f273854a, (SerpAdvert) serpElement, false, false, SerpDisplayType.Grid, null, 0, null, null, false, 2036);
            } else if (serpElement instanceof SerpDevelopment) {
                parcelableA = this.f273855b.a((SerpDevelopment) serpElement, SerpDisplayType.Grid);
            } else if (serpElement instanceof ConstructorAdvertNetworkModel) {
                SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
                ConstructorAdvertItem constructorAdvertItemA = this.f273856c.a((ConstructorAdvertNetworkModel) serpElement, serpDisplayType, false, "", -1, "", null);
                if (constructorAdvertItemA != null) {
                    parcelableA = com.avito.android.serp.adapter.constructor.z.a(constructorAdvertItemA, serpDisplayType);
                }
            }
            if (parcelableA != null) {
                arrayList2.add(parcelableA);
            }
        }
        this.f273858e.b(arrayList2);
        this.f273857d.b(arrayList2);
        String titleText = witcherElement.getTitleText();
        if ((titleText == null || titleText.length() == 0) && (titleText = witcherElement.getTitle()) == null) {
            titleText = "";
        }
        String str = titleText;
        String subtitleText = witcherElement.getSubtitleText();
        WitcherElement.SelectionType selectionType = witcherElement.getSelectionType();
        WitcherSelectionType witcherSelectionType = (selectionType == null ? -1 : a.f273859a[selectionType.ordinal()]) == 1 ? WitcherSelectionType.f273835d : WitcherSelectionType.f273836e;
        ButtonAction action2 = witcherElement.getAction();
        String title = action2 != null ? action2.getTitle() : null;
        ButtonAction action3 = witcherElement.getAction();
        DeepLink deeplink = action3 != null ? action3.getDeeplink() : null;
        String legacyActionTitle = witcherElement.getLegacyActionTitle();
        DeepLink legacyActionLink = witcherElement.getLegacyActionLink();
        if (title == null || deeplink == null) {
            action = (legacyActionTitle == null || legacyActionLink == null) ? null : new WitcherItem.Action(legacyActionTitle, legacyActionLink, null);
        } else {
            ButtonAction action4 = witcherElement.getAction();
            action = new WitcherItem.Action(title, deeplink, action4 != null ? action4.getStyle() : null);
        }
        Boolean wrapAction = witcherElement.getWrapAction();
        boolean zBooleanValue = wrapAction != null ? wrapAction.booleanValue() : false;
        List<WitcherElement.WidgetIndents> widgetsIndents = witcherElement.getWidgetsIndents();
        if (widgetsIndents != null) {
            List<WitcherElement.WidgetIndents> list = widgetsIndents;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (WitcherElement.WidgetIndents widgetIndents : list) {
                switch (a.f273860b[widgetIndents.getWidgetType().ordinal()]) {
                    case 1:
                        widgetType = WidgetType.f273803b;
                        break;
                    case 2:
                        widgetType = WidgetType.f273804c;
                        break;
                    case 3:
                        widgetType = WidgetType.f273805d;
                        break;
                    case 4:
                        widgetType = WidgetType.f273806e;
                        break;
                    case 5:
                        widgetType = WidgetType.f273807f;
                        break;
                    case 6:
                        widgetType = WidgetType.f273808g;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                WitcherElement.Indents margins2 = widgetIndents.getMargins();
                if (margins2 != null) {
                    Integer top = margins2.getTop();
                    int iB2 = top != null ? y6.b(top.intValue()) : -1;
                    Integer bottom = margins2.getBottom();
                    int iB3 = bottom != null ? y6.b(bottom.intValue()) : -1;
                    Integer start = margins2.getStart();
                    int iB4 = start != null ? y6.b(start.intValue()) : -1;
                    Integer end = margins2.getEnd();
                    margins = new Appearance.Margins(iB2, iB3, iB4, end != null ? y6.b(end.intValue()) : -1);
                } else {
                    margins = null;
                }
                WitcherElement.Indents paddings2 = widgetIndents.getPaddings();
                if (paddings2 != null) {
                    Integer top2 = paddings2.getTop();
                    int iB5 = top2 != null ? y6.b(top2.intValue()) : -1;
                    Integer bottom2 = paddings2.getBottom();
                    int iB6 = bottom2 != null ? y6.b(bottom2.intValue()) : -1;
                    Integer start2 = paddings2.getStart();
                    int iB7 = start2 != null ? y6.b(start2.intValue()) : -1;
                    Integer end2 = paddings2.getEnd();
                    paddings = new Appearance.Paddings(iB5, iB6, iB7, end2 != null ? y6.b(end2.intValue()) : -1);
                } else {
                    paddings = null;
                }
                arrayList3.add(new WidgetIndents(widgetType, margins, paddings));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        WitcherElement.AnalyticsMode analyticsMode = witcherElement.getAnalyticsMode();
        if (analyticsMode == null) {
            i13 = 1;
            i12 = -1;
        } else {
            i12 = a.f273861c[analyticsMode.ordinal()];
            i13 = 1;
        }
        return new WitcherItem(null, 6, z12, witcherSelectionType, arrayList2, str, subtitleText, action, zBooleanValue, arrayList, i12 == i13 ? WitcherItem.AnalyticsMode.f273831b : WitcherItem.AnalyticsMode.f273832c, null, witcherElement.getAnalytics(), witcherElement.getSettings(), 2049, null);
    }

    @Override // com.avito.android.favorites.InterfaceC30669j0
    @Y61.k
    public final WitcherItem b(@Y61.k WitcherElement witcherElement) {
        return a(witcherElement, false);
    }
}
