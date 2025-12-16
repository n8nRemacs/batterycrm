package com.avito.android.widget_filters.mvi.entity;

import NP0.q;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "ShowToast", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$b;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$c;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$d;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$e;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$f;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$g;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$h;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$i;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$ShowToast;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WidgetFiltersOneTimeEvent {

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$ShowToast;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "ToastAnchorType", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f330050a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f330051b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ToastAnchorType f330052c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WidgetFiltersOneTimeEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$ShowToast$ToastAnchorType;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ToastAnchorType {

            /* renamed from: b, reason: collision with root package name */
            public static final ToastAnchorType f330053b;

            /* renamed from: c, reason: collision with root package name */
            public static final ToastAnchorType f330054c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ ToastAnchorType[] f330055d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f330056e;

            static {
                ToastAnchorType toastAnchorType = new ToastAnchorType("TOOLBAR", 0);
                f330053b = toastAnchorType;
                ToastAnchorType toastAnchorType2 = new ToastAnchorType("FOOTER", 1);
                f330054c = toastAnchorType2;
                ToastAnchorType[] toastAnchorTypeArr = {toastAnchorType, toastAnchorType2};
                f330055d = toastAnchorTypeArr;
                f330056e = kotlin.enums.c.a(toastAnchorTypeArr);
            }

            public ToastAnchorType() {
                throw null;
            }

            public static ToastAnchorType valueOf(String str) {
                return (ToastAnchorType) Enum.valueOf(ToastAnchorType.class, str);
            }

            public static ToastAnchorType[] values() {
                return (ToastAnchorType[]) f330055d.clone();
            }
        }

        public ShowToast(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar, @k ToastAnchorType toastAnchorType) {
            this.f330050a = printableText;
            this.f330051b = fVar;
            this.f330052c = toastAnchorType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f330050a, showToast.f330050a) && L.f(this.f330051b, showToast.f330051b) && this.f330052c == showToast.f330052c;
        }

        public final int hashCode() {
            return this.f330052c.hashCode() + ((this.f330051b.hashCode() + (this.f330050a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f330050a + ", type=" + this.f330051b + ", anchor=" + this.f330052c + ')';
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f330057a;

        public a(boolean z12) {
            this.f330057a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f330057a == ((a) obj).f330057a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f330057a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ClearFocus(shouldClear="), this.f330057a, ')');
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$b;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f330058a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1351592442;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$c;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f330059a;

        public c(@l DeepLink deepLink) {
            this.f330059a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f330059a, ((c) obj).f330059a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f330059a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleApplyRedirect(deeplink="), this.f330059a, ')');
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$d;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ItemsSearchLink f330060a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f330061b;

        public d(@l ItemsSearchLink itemsSearchLink, @l String str) {
            this.f330060a = itemsSearchLink;
            this.f330061b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f330060a.equals(dVar.f330060a) && L.f(this.f330061b, dVar.f330061b);
        }

        public final int hashCode() {
            int iHashCode = this.f330060a.hashCode() * 31;
            String str = this.f330061b;
            return Boolean.hashCode(true) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleClarifySearch(deeplink=");
            sb2.append(this.f330060a);
            sb2.append(", updatedLocationId=");
            return AK.c.s(sb2, this.f330061b, ", resetArea=true)");
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$e;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements WidgetFiltersOneTimeEvent {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "HideKeyboard(shouldHide=true)";
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$f;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f330062a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1187968168;
        }

        @k
        public final String toString() {
            return "RequestLocationInputFocus";
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$g;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f330063a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1735331173;
        }

        @k
        public final String toString() {
            return "ResetSelectedDates";
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$h;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f330064a;

        public h(int i12) {
            this.f330064a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f330064a == ((h) obj).f330064a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f330064a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f330064a, ')');
        }
    }

    /* compiled from: WidgetFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent$i;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersOneTimeEvent;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements WidgetFiltersOneTimeEvent {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final q f330065a;

        public i(@k q qVar) {
            this.f330065a = qVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f330065a, ((i) obj).f330065a);
        }

        public final int hashCode() {
            return this.f330065a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboarding=" + this.f330065a + ')';
        }
    }
}
