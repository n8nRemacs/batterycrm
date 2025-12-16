package com.avito.android.widget_filters.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState;", "", "ActionButtonType", "a", "b", "ResetButtonType", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersFooterViewState {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f329985j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final WidgetFiltersFooterViewState f329986k = new WidgetFiltersFooterViewState(ActionButtonType.f329996b, ResetButtonType.f330001b, "", "", "", b.d.f330011a, false, false, false);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ActionButtonType f329987a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ResetButtonType f329988b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f329989c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f329990d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f329991e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f329992f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f329993g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f329994h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f329995i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$ActionButtonType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionButtonType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionButtonType f329996b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionButtonType f329997c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionButtonType f329998d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionButtonType[] f329999e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f330000f;

        static {
            ActionButtonType actionButtonType = new ActionButtonType("NEXT", 0);
            f329996b = actionButtonType;
            ActionButtonType actionButtonType2 = new ActionButtonType("SEARCH", 1);
            f329997c = actionButtonType2;
            ActionButtonType actionButtonType3 = new ActionButtonType("LOCATION_SEARCH", 2);
            f329998d = actionButtonType3;
            ActionButtonType[] actionButtonTypeArr = {actionButtonType, actionButtonType2, actionButtonType3};
            f329999e = actionButtonTypeArr;
            f330000f = kotlin.enums.c.a(actionButtonTypeArr);
        }

        public ActionButtonType() {
            throw null;
        }

        public static ActionButtonType valueOf(String str) {
            return (ActionButtonType) Enum.valueOf(ActionButtonType.class, str);
        }

        public static ActionButtonType[] values() {
            return (ActionButtonType[]) f329999e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$ResetButtonType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResetButtonType {

        /* renamed from: b, reason: collision with root package name */
        public static final ResetButtonType f330001b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResetButtonType f330002c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ResetButtonType[] f330003d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f330004e;

        static {
            ResetButtonType resetButtonType = new ResetButtonType("RESET_ALL", 0);
            f330001b = resetButtonType;
            ResetButtonType resetButtonType2 = new ResetButtonType("RESET_DATES", 1);
            f330002c = resetButtonType2;
            ResetButtonType[] resetButtonTypeArr = {resetButtonType, resetButtonType2};
            f330003d = resetButtonTypeArr;
            f330004e = kotlin.enums.c.a(resetButtonTypeArr);
        }

        public ResetButtonType() {
            throw null;
        }

        public static ResetButtonType valueOf(String str) {
            return (ResetButtonType) Enum.valueOf(ResetButtonType.class, str);
        }

        public static ResetButtonType[] values() {
            return (ResetButtonType[]) f330003d.clone();
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b;", "", "a", "b", "c", "d", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$b;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$c;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$d;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: WidgetFiltersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Object f330005a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f330006b;

            public a(@k List<ItemChipable> list, @l Integer num) {
                this.f330005a = list;
                this.f330006b = num;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f330005a.equals(aVar.f330005a) && this.f330006b.equals(aVar.f330006b);
            }

            public final int hashCode() {
                return this.f330006b.hashCode() + (this.f330005a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FlexSearchOptions(items=");
                sb2.append(this.f330005a);
                sb2.append(", selectedIndex=");
                return s.j(sb2, this.f330006b, ')');
            }
        }

        /* compiled from: WidgetFiltersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$b;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState$b$b, reason: collision with other inner class name */
        public static final /* data */ class C10251b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Object f330007a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Integer f330008b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final PrintableText f330009c;

            public C10251b(@k List<ItemChipable> list, @l Integer num, @k PrintableText printableText) {
                this.f330007a = list;
                this.f330008b = num;
                this.f330009c = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10251b)) {
                    return false;
                }
                C10251b c10251b = (C10251b) obj;
                return this.f330007a.equals(c10251b.f330007a) && this.f330008b.equals(c10251b.f330008b) && this.f330009c.equals(c10251b.f330009c);
            }

            public final int hashCode() {
                return this.f330009c.hashCode() + ((this.f330008b.hashCode() + (this.f330007a.hashCode() * 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FlexSearchOptionsWithHint(items=");
                sb2.append(this.f330007a);
                sb2.append(", selectedIndex=");
                sb2.append(this.f330008b);
                sb2.append(", hintText=");
                return AK.c.m(sb2, this.f330009c, ')');
            }
        }

        /* compiled from: WidgetFiltersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$c;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f330010a;

            public c(@k PrintableText printableText) {
                this.f330010a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f330010a, ((c) obj).f330010a);
            }

            public final int hashCode() {
                return this.f330010a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("Hint(hintText="), this.f330010a, ')');
            }
        }

        /* compiled from: WidgetFiltersState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b$d;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersFooterViewState$b;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f330011a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1137687253;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    public WidgetFiltersFooterViewState(@k ActionButtonType actionButtonType, @k ResetButtonType resetButtonType, @l String str, @l String str2, @l String str3, @k b bVar, boolean z12, boolean z13, boolean z14) {
        this.f329987a = actionButtonType;
        this.f329988b = resetButtonType;
        this.f329989c = str;
        this.f329990d = str2;
        this.f329991e = str3;
        this.f329992f = bVar;
        this.f329993g = z12;
        this.f329994h = z13;
        this.f329995i = z14;
    }

    public static WidgetFiltersFooterViewState a(WidgetFiltersFooterViewState widgetFiltersFooterViewState, ActionButtonType actionButtonType, ResetButtonType resetButtonType, String str, String str2, String str3, b bVar, boolean z12, boolean z13, boolean z14, int i12) {
        ActionButtonType actionButtonType2 = (i12 & 1) != 0 ? widgetFiltersFooterViewState.f329987a : actionButtonType;
        ResetButtonType resetButtonType2 = (i12 & 2) != 0 ? widgetFiltersFooterViewState.f329988b : resetButtonType;
        String str4 = (i12 & 4) != 0 ? widgetFiltersFooterViewState.f329989c : str;
        String str5 = (i12 & 8) != 0 ? widgetFiltersFooterViewState.f329990d : str2;
        String str6 = (i12 & 16) != 0 ? widgetFiltersFooterViewState.f329991e : str3;
        b bVar2 = (i12 & 32) != 0 ? widgetFiltersFooterViewState.f329992f : bVar;
        boolean z15 = (i12 & 64) != 0 ? widgetFiltersFooterViewState.f329993g : z12;
        boolean z16 = (i12 & 128) != 0 ? widgetFiltersFooterViewState.f329994h : z13;
        boolean z17 = (i12 & 256) != 0 ? widgetFiltersFooterViewState.f329995i : z14;
        widgetFiltersFooterViewState.getClass();
        return new WidgetFiltersFooterViewState(actionButtonType2, resetButtonType2, str4, str5, str6, bVar2, z15, z16, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersFooterViewState)) {
            return false;
        }
        WidgetFiltersFooterViewState widgetFiltersFooterViewState = (WidgetFiltersFooterViewState) obj;
        return this.f329987a == widgetFiltersFooterViewState.f329987a && this.f329988b == widgetFiltersFooterViewState.f329988b && L.f(this.f329989c, widgetFiltersFooterViewState.f329989c) && L.f(this.f329990d, widgetFiltersFooterViewState.f329990d) && L.f(this.f329991e, widgetFiltersFooterViewState.f329991e) && L.f(this.f329992f, widgetFiltersFooterViewState.f329992f) && this.f329993g == widgetFiltersFooterViewState.f329993g && this.f329994h == widgetFiltersFooterViewState.f329994h && this.f329995i == widgetFiltersFooterViewState.f329995i;
    }

    public final int hashCode() {
        int iHashCode = (this.f329988b.hashCode() + (this.f329987a.hashCode() * 31)) * 31;
        String str = this.f329989c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f329990d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f329991e;
        return Boolean.hashCode(this.f329995i) + r.i(r.i((this.f329992f.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.f329993g), 31, this.f329994h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersFooterViewState(actionButtonType=");
        sb2.append(this.f329987a);
        sb2.append(", resetButtonType=");
        sb2.append(this.f329988b);
        sb2.append(", resetText=");
        sb2.append(this.f329989c);
        sb2.append(", nextText=");
        sb2.append(this.f329990d);
        sb2.append(", searchText=");
        sb2.append(this.f329991e);
        sb2.append(", topState=");
        sb2.append(this.f329992f);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f329993g);
        sb2.append(", isResetButtonVisible=");
        sb2.append(this.f329994h);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f329995i, ')');
    }
}
