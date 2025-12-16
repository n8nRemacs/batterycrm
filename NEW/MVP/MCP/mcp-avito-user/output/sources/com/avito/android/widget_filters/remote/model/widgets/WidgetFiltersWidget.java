package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: WidgetFiltersWidget.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersWidget;", "Landroid/os/Parcelable;", "WidgetType", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersCategoryWidget;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersDatesWidget;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersGuestsWidget;", "Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersLocationWidget;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WidgetFiltersWidget extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetFiltersWidget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/WidgetFiltersWidget$WidgetType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WidgetType {

        /* renamed from: c, reason: collision with root package name */
        public static final WidgetType f330263c;

        /* renamed from: d, reason: collision with root package name */
        public static final WidgetType f330264d;

        /* renamed from: e, reason: collision with root package name */
        public static final WidgetType f330265e;

        /* renamed from: f, reason: collision with root package name */
        public static final WidgetType f330266f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ WidgetType[] f330267g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a f330268h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f330269b;

        static {
            WidgetType widgetType = new WidgetType("LOCATION", 0, "locationWidget");
            f330263c = widgetType;
            WidgetType widgetType2 = new WidgetType("DATES", 1, "datesWidget");
            f330264d = widgetType2;
            WidgetType widgetType3 = new WidgetType("GUESTS", 2, "guestsWidget");
            f330265e = widgetType3;
            WidgetType widgetType4 = new WidgetType("CATEGORY", 3, "categoryWidget");
            f330266f = widgetType4;
            WidgetType[] widgetTypeArr = {widgetType, widgetType2, widgetType3, widgetType4};
            f330267g = widgetTypeArr;
            f330268h = c.a(widgetTypeArr);
        }

        public WidgetType(String str, int i12, String str2) {
            this.f330269b = str2;
        }

        public static WidgetType valueOf(String str) {
            return (WidgetType) Enum.valueOf(WidgetType.class, str);
        }

        public static WidgetType[] values() {
            return (WidgetType[]) f330267g.clone();
        }
    }

    @k
    WidgetType getType();

    @l
    Boolean isEnabled();

    @l
    Boolean o0();
}
