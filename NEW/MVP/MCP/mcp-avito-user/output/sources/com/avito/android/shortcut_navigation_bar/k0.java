package com.avito.android.shortcut_navigation_bar;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Shortcuts;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Layout;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.shortcut_navigation_bar.adapter.CollapsedShortcutItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: ShortcutNavigationItemConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/k0;", "Lcom/avito/android/shortcut_navigation_bar/j0;", "<init>", "()V", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k0 implements j0 {

    /* compiled from: ShortcutNavigationItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f283421a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Shortcut.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Select.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.SectionedMultiselect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.Calendar.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.NumericRange.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WidgetType.Checkbox.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WidgetType.RadioSelect.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WidgetType.Location.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WidgetType.AvitoBlackCategoryNodes.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WidgetType.ProfileCategoryNodes.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WidgetType.CategoryNodes.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f283421a = iArr;
        }
    }

    @Inject
    public k0() {
    }

    public static ShortcutNavigationItem e(Filter filter, int i12, DeepLink deepLink) {
        DeepLink noMatchLink;
        Filter.Config config;
        DeepLink noMatchLink2;
        Filter.Config config2;
        Filter.Config config3;
        Filter.Widget widget = filter.getWidget();
        InlineFilterValue value = null;
        deeplink = null;
        DeepLink deeplink = null;
        multiThemeIcon = null;
        Filter.MultiThemeIcon multiThemeIcon = null;
        if ((widget == null || (config3 = widget.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config3.isNdProfSearch(), Boolean.TRUE)) {
            String strValueOf = String.valueOf(i12);
            String title = filter.getTitle();
            String str = title == null ? "" : title;
            Filter.Widget widget2 = filter.getWidget();
            if (widget2 != null && (config2 = widget2.getConfig()) != null) {
                deeplink = config2.getDeeplink();
            }
            return new ShortcutNavigationItemImpl(strValueOf, str, deeplink, filter.getId(), false, null, null, null, 224, null);
        }
        Filter.Widget widget3 = filter.getWidget();
        WidgetType type = widget3 != null ? widget3.getType() : null;
        switch (type == null ? -1 : a.f283421a[type.ordinal()]) {
            case 1:
                String strValueOf2 = String.valueOf(i12);
                String id2 = filter.getId();
                String title2 = filter.getTitle();
                String str2 = title2 == null ? "" : title2;
                InlineFilterValue value2 = filter.getValue();
                InlineFilterValue.InlineFilterShortcutValue inlineFilterShortcutValue = value2 instanceof InlineFilterValue.InlineFilterShortcutValue ? (InlineFilterValue.InlineFilterShortcutValue) value2 : null;
                if (inlineFilterShortcutValue == null || (noMatchLink = inlineFilterShortcutValue.getDeepLink()) == null) {
                    noMatchLink = new NoMatchLink();
                }
                DeepLink deepLink2 = noMatchLink;
                InlineFilterValue value3 = filter.getValue();
                InlineFilterValue.InlineFilterShortcutValue inlineFilterShortcutValue2 = value3 instanceof InlineFilterValue.InlineFilterShortcutValue ? (InlineFilterValue.InlineFilterShortcutValue) value3 : null;
                UniversalImage image = inlineFilterShortcutValue2 != null ? inlineFilterShortcutValue2.getImage() : null;
                Filter.Widget widget4 = filter.getWidget();
                if (widget4 != null && (config = widget4.getConfig()) != null) {
                    multiThemeIcon = config.getMultiThemeIcon();
                }
                return new ShortcutNavigationItemImpl(strValueOf2, str2, deepLink2, id2, false, image, null, multiThemeIcon, 64, null);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                value = filter.getValue();
                break;
            case 10:
            case 11:
            case 12:
                String strValueOf3 = String.valueOf(i12);
                String title3 = filter.getTitle();
                String str3 = title3 == null ? "" : title3;
                InlineFilterValue value4 = filter.getValue();
                InlineFilterValue.InlineCategoryNodesValue inlineCategoryNodesValue = value4 instanceof InlineFilterValue.InlineCategoryNodesValue ? (InlineFilterValue.InlineCategoryNodesValue) value4 : null;
                if (inlineCategoryNodesValue == null || (noMatchLink2 = inlineCategoryNodesValue.getLink()) == null) {
                    noMatchLink2 = new NoMatchLink();
                }
                DeepLink deepLink3 = noMatchLink2;
                String displayTitle = filter.getDisplayTitle();
                String str4 = (displayTitle == null && (displayTitle = filter.getTitle()) == null) ? "" : displayTitle;
                InlineFilterValue value5 = filter.getValue();
                String id3 = filter.getId();
                return new CollapsedShortcutItem(strValueOf3, str3, deepLink3, false, id3 == null ? "" : id3, value5, filter, str4);
        }
        InlineFilterValue inlineFilterValue = value;
        String strValueOf4 = String.valueOf(i12);
        String id4 = filter.getId();
        String str5 = id4 == null ? "" : id4;
        String displayTitle2 = filter.getDisplayTitle();
        return new InlineFilterNavigationItem(strValueOf4, str5, inlineFilterValue, (displayTitle2 == null && (displayTitle2 = filter.getTitle()) == null) ? "" : displayTitle2, deepLink, filter, filter.getDisplayTitle(), false, false, 384, null);
    }

    @Override // com.avito.android.shortcut_navigation_bar.j0
    @Y61.k
    public final List<z0> a(@Y61.l List<Tab> list) {
        if (list == null) {
            return C42784z0.f406748b;
        }
        List<Tab> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            DeepLink deepLink = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Tab tab = (Tab) obj;
            String title = tab.getTitle();
            Tab.TabValue value = tab.getValue();
            if (value != null) {
                deepLink = value.getDeepLink();
            }
            arrayList.add(new z0(title, deepLink, tab.getSelected(), tab.getBadgeText(), tab.getBadgeShowId(), tab.getBadgeShowCount(), String.valueOf(i12)));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.shortcut_navigation_bar.j0
    @Y61.k
    public final List<ShortcutNavigationItem> b(@Y61.l Shortcuts shortcuts) {
        List<Action> list;
        if (shortcuts == null || (list = shortcuts.getList()) == null) {
            return C42784z0.f406748b;
        }
        List<Action> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Action action = (Action) obj;
            arrayList.add(new ShortcutNavigationItemImpl(String.valueOf(i12), action.getTitle(), action.getDeepLink(), null, false, action.getImage(), action.isAllCategoriesItem(), null, 136, null));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.shortcut_navigation_bar.j0
    @Y61.k
    public final ShortcutNavigationItem c(@Y61.k Filter filter, int i12, @Y61.k DeepLink deepLink) {
        return e(filter, i12, deepLink);
    }

    @Override // com.avito.android.shortcut_navigation_bar.j0
    @Y61.k
    public final List<ShortcutNavigationItem> d(@Y61.l InlineFilters inlineFilters) {
        DeepLink noMatchLink;
        Result result;
        List<Filter> filters;
        Result result2;
        if (inlineFilters == null || (result2 = inlineFilters.getResult()) == null || (noMatchLink = result2.getUri()) == null) {
            noMatchLink = new NoMatchLink();
        }
        if (inlineFilters == null || (result = inlineFilters.getResult()) == null || (filters = result.getFilters()) == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = filters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Filter filter = (Filter) next;
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Group) {
                Filter.Widget widget2 = filter.getWidget();
                if ((widget2 != null ? widget2.getLayout() : null) == Layout.Hidden) {
                }
            }
            arrayList.add(next);
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(e((Filter) next2, i12, noMatchLink));
            i12 = i13;
        }
        return arrayList2;
    }
}
