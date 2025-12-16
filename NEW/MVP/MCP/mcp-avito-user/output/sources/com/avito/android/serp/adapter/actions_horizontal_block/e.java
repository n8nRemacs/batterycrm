package com.avito.android.serp.adapter.actions_horizontal_block;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.serp.adapter.actions_horizontal_block.Action;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ActionsHorizontalBlockItem.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: ActionsHorizontalBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[InlineAction.Predefined.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineAction.Predefined.State state = InlineAction.Predefined.State.f283118b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineAction.Predefined.State state2 = InlineAction.Predefined.State.f283118b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Y61.k
    public static final Action a(@Y61.k Filter filter) {
        Action inlineFilter;
        Filter.Config config;
        Filter.Config config2;
        Filter.Config config3;
        Filter.Config config4;
        Filter.Config config5;
        Filter.Widget widget = filter.getWidget();
        String icon = null;
        if ((widget != null ? widget.getType() : null) == WidgetType.SearchSubscription) {
            Filter.Widget widget2 = filter.getWidget();
            String icon2 = (widget2 == null || (config5 = widget2.getConfig()) == null) ? null : config5.getIcon();
            Filter.Widget widget3 = filter.getWidget();
            String iconOn = (widget3 == null || (config4 = widget3.getConfig()) == null) ? null : config4.getIconOn();
            Filter.Widget widget4 = filter.getWidget();
            String customTitle = (widget4 == null || (config3 = widget4.getConfig()) == null) ? null : config3.getCustomTitle();
            if (customTitle == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Filter.Widget widget5 = filter.getWidget();
            if (widget5 != null && (config2 = widget5.getConfig()) != null) {
                icon = config2.getCustomTitleOn();
            }
            String str = icon;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            inlineFilter = new Action.Predefined(icon2, iconOn, customTitle, str, null, null, Action.Predefined.Type.f268652b, Action.Predefined.State.f268648c, 16, null);
        } else {
            Filter.Widget widget6 = filter.getWidget();
            if (widget6 != null && (config = widget6.getConfig()) != null) {
                icon = config.getIcon();
            }
            String displayTitle = filter.getDisplayTitle();
            if (displayTitle == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String id2 = filter.getId();
            if (id2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            inlineFilter = new Action.InlineFilter(icon, displayTitle, id2);
        }
        return inlineFilter;
    }

    @Y61.k
    public static final Action.Predefined.State b(@Y61.k InlineAction.Predefined.State state) {
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return Action.Predefined.State.f268647b;
        }
        if (iOrdinal == 1) {
            return Action.Predefined.State.f268648c;
        }
        if (iOrdinal == 2) {
            return Action.Predefined.State.f268649d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
