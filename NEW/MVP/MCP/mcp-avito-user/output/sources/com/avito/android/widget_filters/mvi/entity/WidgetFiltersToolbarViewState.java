package com.avito.android.widget_filters.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersToolbarViewState;", "", "a", "b", "NavigationButtonType", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersToolbarViewState {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f330066c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final WidgetFiltersToolbarViewState f330067d = new WidgetFiltersToolbarViewState("", new b(R.drawable.ic_close_24_black, NavigationButtonType.f330070b));

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f330068a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f330069b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersToolbarViewState$NavigationButtonType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigationButtonType {

        /* renamed from: b, reason: collision with root package name */
        public static final NavigationButtonType f330070b;

        /* renamed from: c, reason: collision with root package name */
        public static final NavigationButtonType f330071c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ NavigationButtonType[] f330072d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f330073e;

        static {
            NavigationButtonType navigationButtonType = new NavigationButtonType("CLOSE_SCREEN", 0);
            f330070b = navigationButtonType;
            NavigationButtonType navigationButtonType2 = new NavigationButtonType("EXPAND_PREVIOUS_WIDGET", 1);
            f330071c = navigationButtonType2;
            NavigationButtonType[] navigationButtonTypeArr = {navigationButtonType, navigationButtonType2};
            f330072d = navigationButtonTypeArr;
            f330073e = kotlin.enums.c.a(navigationButtonTypeArr);
        }

        public NavigationButtonType() {
            throw null;
        }

        public static NavigationButtonType valueOf(String str) {
            return (NavigationButtonType) Enum.valueOf(NavigationButtonType.class, str);
        }

        public static NavigationButtonType[] values() {
            return (NavigationButtonType[]) f330072d.clone();
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersToolbarViewState$a;", "", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WidgetFiltersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersToolbarViewState$b;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f330074a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final NavigationButtonType f330075b;

        public b(@InterfaceC42165v int i12, @k NavigationButtonType navigationButtonType) {
            this.f330074a = i12;
            this.f330075b = navigationButtonType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f330074a == bVar.f330074a && this.f330075b == bVar.f330075b;
        }

        public final int hashCode() {
            return this.f330075b.hashCode() + (Integer.hashCode(this.f330074a) * 31);
        }

        @k
        public final String toString() {
            return "NavigationButton(icon=" + this.f330074a + ", type=" + this.f330075b + ')';
        }
    }

    public WidgetFiltersToolbarViewState(@k String str, @k b bVar) {
        this.f330068a = str;
        this.f330069b = bVar;
    }

    public static WidgetFiltersToolbarViewState a(WidgetFiltersToolbarViewState widgetFiltersToolbarViewState, String str, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            str = widgetFiltersToolbarViewState.f330068a;
        }
        if ((i12 & 2) != 0) {
            bVar = widgetFiltersToolbarViewState.f330069b;
        }
        widgetFiltersToolbarViewState.getClass();
        return new WidgetFiltersToolbarViewState(str, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersToolbarViewState)) {
            return false;
        }
        WidgetFiltersToolbarViewState widgetFiltersToolbarViewState = (WidgetFiltersToolbarViewState) obj;
        return L.f(this.f330068a, widgetFiltersToolbarViewState.f330068a) && L.f(this.f330069b, widgetFiltersToolbarViewState.f330069b);
    }

    public final int hashCode() {
        return this.f330069b.hashCode() + (this.f330068a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "WidgetFiltersToolbarViewState(title=" + this.f330068a + ", navigationButton=" + this.f330069b + ')';
    }
}
