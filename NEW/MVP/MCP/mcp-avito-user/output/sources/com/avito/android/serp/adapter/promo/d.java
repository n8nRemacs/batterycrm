package com.avito.android.serp.adapter.promo;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.promo.PromoHeaderItem;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PromoHeaderItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/promo/d;", "Lcom/avito/android/serp/adapter/promo/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* compiled from: PromoHeaderItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f270478a;

        static {
            int[] iArr = new int[PromoHeaderWidget.Edge.values().length];
            try {
                iArr[PromoHeaderWidget.Edge.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoHeaderWidget.Edge.FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoHeaderWidget.Edge.PIPKA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoHeaderWidget.Edge.PYRAMID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoHeaderWidget.Edge.ANTI_PYRAMID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f270478a = iArr;
        }
    }

    @Inject
    public d() {
    }

    public static DockingBadgeEdgeType b(PromoHeaderWidget.Edge edge) {
        int i12 = edge == null ? -1 : a.f270478a[edge.ordinal()];
        if (i12 == -1 || i12 == 1) {
            return DockingBadgeEdgeType.Square;
        }
        if (i12 == 2) {
            return DockingBadgeEdgeType.Flag;
        }
        if (i12 == 3) {
            return DockingBadgeEdgeType.Pipka;
        }
        if (i12 == 4) {
            return DockingBadgeEdgeType.Pyramid;
        }
        if (i12 == 5) {
            return DockingBadgeEdgeType.AntiPyramid;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.serp.adapter.promo.c
    @Y61.k
    public final PromoHeaderItem a(@Y61.k PromoHeaderWidget promoHeaderWidget, @Y61.l String str) {
        ArrayList arrayList;
        String string = UUID.randomUUID().toString();
        AttributedText title = promoHeaderWidget.getTitle();
        AttributedText subtitle = promoHeaderWidget.getSubtitle();
        PromoHeaderWidget.Button button = promoHeaderWidget.getButton();
        UniversalColor backgroundColor = promoHeaderWidget.getBackgroundColor();
        ToolbarConfig toolbarConfig = promoHeaderWidget.getToolbarConfig();
        Boolean resetStyleOnScroll = promoHeaderWidget.getResetStyleOnScroll();
        boolean zBooleanValue = resetStyleOnScroll != null ? resetStyleOnScroll.booleanValue() : false;
        List<PromoHeaderWidget.Image> images = promoHeaderWidget.getImages();
        List<PromoHeaderWidget.Badge> badges = promoHeaderWidget.getBadges();
        if (badges != null) {
            List<PromoHeaderWidget.Badge> list = badges;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (PromoHeaderWidget.Badge badge : list) {
                arrayList2.add(new PromoHeaderItem.BadgeData(badge.getTitle(), badge.getStyle().getBackgroundColor(), badge.getStyle().getTextColor(), b(badge.getStyle().getLeftEndType()), b(badge.getStyle().getRightEndType())));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Analytics analytics = promoHeaderWidget.getAnalytics();
        Settings settings = promoHeaderWidget.getSettings();
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (str != null) {
            dVar.put("mcid", str);
        }
        return new PromoHeaderItem(title, subtitle, button, backgroundColor, toolbarConfig, zBooleanValue, images, arrayList, string, analytics, dVar.b(), settings);
    }
}
