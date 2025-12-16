package com.avito.android.promo;

import Y61.k;
import Y61.l;
import com.avito.android.S2;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.PersistableSerpItem;
import is0.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: PromoWidgetItem.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/promo/PromoWidgetItem;", "Lcom/avito/android/lib/util/groupable_item/a;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "ViewType", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PromoWidgetItem extends com.avito.android.lib.util.groupable_item.a, PersistableSerpItem, S2, h, InterfaceC47435a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromoWidgetItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo/PromoWidgetItem$ViewType;", "", "a", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewType {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f231612b;

        /* renamed from: c, reason: collision with root package name */
        public static final ViewType f231613c;

        /* renamed from: d, reason: collision with root package name */
        public static final ViewType f231614d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ViewType[] f231615e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231616f;

        /* compiled from: PromoWidgetItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/promo/PromoWidgetItem$ViewType$a;", "", "<init>", "()V", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            ViewType viewType = new ViewType("MINI", 0);
            f231613c = viewType;
            ViewType viewType2 = new ViewType("DEFAULT", 1);
            f231614d = viewType2;
            ViewType[] viewTypeArr = {viewType, viewType2};
            f231615e = viewTypeArr;
            f231616f = c.a(viewTypeArr);
            f231612b = new a(null);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) f231615e.clone();
        }
    }

    /* compiled from: PromoWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    boolean I4();

    @k
    String J4(@k PromoAction promoAction);

    @l
    List<PromoAction> getActions();

    @l
    PromoAnalyticParams getAnalyticParams();

    @l
    Analytics getAnalytics();

    @l
    String getImage();

    @l
    String getPromoId();

    @k
    PromoStyle getStyle();

    @l
    String getText();

    @k
    String getTitle();

    @l
    ViewType getView();

    @l
    MovableImage p4();
}
