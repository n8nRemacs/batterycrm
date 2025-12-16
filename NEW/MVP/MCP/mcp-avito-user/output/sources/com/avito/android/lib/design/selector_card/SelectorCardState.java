package com.avito.android.lib.design.selector_card;

import androidx.compose.runtime.C22026a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardState;", "", "Border", "Indicator", "Status", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SelectorCardState {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Status f180369a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Indicator f180370b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Border f180371c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f180372d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f180373e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final a f180374f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f180375g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardState$Border;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Border {

        /* renamed from: b, reason: collision with root package name */
        public static final Border f180376b;

        /* renamed from: c, reason: collision with root package name */
        public static final Border f180377c;

        /* renamed from: d, reason: collision with root package name */
        public static final Border f180378d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Border[] f180379e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180380f;

        static {
            Border border = new Border("NONE", 0);
            f180376b = border;
            Border border2 = new Border("BORDER", 1);
            f180377c = border2;
            Border border3 = new Border("BORDER_WITH_INDICATOR", 2);
            f180378d = border3;
            Border[] borderArr = {border, border2, border3};
            f180379e = borderArr;
            f180380f = kotlin.enums.c.a(borderArr);
        }

        public Border() {
            throw null;
        }

        public static Border valueOf(String str) {
            return (Border) Enum.valueOf(Border.class, str);
        }

        public static Border[] values() {
            return (Border[]) f180379e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardState$Indicator;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Indicator {

        /* renamed from: b, reason: collision with root package name */
        public static final Indicator f180381b;

        /* renamed from: c, reason: collision with root package name */
        public static final Indicator f180382c;

        /* renamed from: d, reason: collision with root package name */
        public static final Indicator f180383d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Indicator[] f180384e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180385f;

        static {
            Indicator indicator = new Indicator("NONE", 0);
            f180381b = indicator;
            Indicator indicator2 = new Indicator("CHECKMARK", 1);
            f180382c = indicator2;
            Indicator indicator3 = new Indicator("SWITCHER", 2);
            f180383d = indicator3;
            Indicator[] indicatorArr = {indicator, indicator2, indicator3};
            f180384e = indicatorArr;
            f180385f = kotlin.enums.c.a(indicatorArr);
        }

        public Indicator() {
            throw null;
        }

        public static Indicator valueOf(String str) {
            return (Indicator) Enum.valueOf(Indicator.class, str);
        }

        public static Indicator[] values() {
            return (Indicator[]) f180384e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardState$Status;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f180386b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f180387c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f180388d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180389e;

        static {
            Status status = new Status("NORMAL", 0);
            f180386b = status;
            Status status2 = new Status("ERROR", 1);
            f180387c = status2;
            Status[] statusArr = {status, status2};
            f180388d = statusArr;
            f180389e = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f180388d.clone();
        }
    }

    /* compiled from: SelectorCardState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardState$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f180390a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f180391b;

        public a(@Y61.k String str, @Y61.l String str2) {
            this.f180390a = str;
            this.f180391b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f180390a, aVar.f180390a) && L.f(this.f180391b, aVar.f180391b);
        }

        public final int hashCode() {
            int iHashCode = this.f180390a.hashCode() * 31;
            String str = this.f180391b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextContent(title=");
            sb2.append(this.f180390a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f180391b, ')');
        }
    }

    public SelectorCardState(@Y61.k Status status, @Y61.k Indicator indicator, @Y61.k Border border, boolean z12, boolean z13, @Y61.l a aVar, @Y61.l Y41.a<G0> aVar2) {
        this.f180369a = status;
        this.f180370b = indicator;
        this.f180371c = border;
        this.f180372d = z12;
        this.f180373e = z13;
        this.f180374f = aVar;
        this.f180375g = aVar2;
    }

    public static SelectorCardState a(SelectorCardState selectorCardState, Status status, Indicator indicator, Border border, boolean z12, boolean z13, Y41.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            status = selectorCardState.f180369a;
        }
        Status status2 = status;
        if ((i12 & 2) != 0) {
            indicator = selectorCardState.f180370b;
        }
        Indicator indicator2 = indicator;
        if ((i12 & 4) != 0) {
            border = selectorCardState.f180371c;
        }
        Border border2 = border;
        if ((i12 & 8) != 0) {
            z12 = selectorCardState.f180372d;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            z13 = selectorCardState.f180373e;
        }
        boolean z15 = z13;
        a aVar2 = selectorCardState.f180374f;
        if ((i12 & 64) != 0) {
            aVar = selectorCardState.f180375g;
        }
        selectorCardState.getClass();
        return new SelectorCardState(status2, indicator2, border2, z14, z15, aVar2, aVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectorCardState)) {
            return false;
        }
        SelectorCardState selectorCardState = (SelectorCardState) obj;
        return this.f180369a == selectorCardState.f180369a && this.f180370b == selectorCardState.f180370b && this.f180371c == selectorCardState.f180371c && this.f180372d == selectorCardState.f180372d && this.f180373e == selectorCardState.f180373e && L.f(this.f180374f, selectorCardState.f180374f) && L.f(this.f180375g, selectorCardState.f180375g);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f180371c.hashCode() + ((this.f180370b.hashCode() + (this.f180369a.hashCode() * 31)) * 31)) * 31, 31, this.f180372d), 31, this.f180373e);
        a aVar = this.f180374f;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f180375g;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardState(status=");
        sb2.append(this.f180369a);
        sb2.append(", indicatorType=");
        sb2.append(this.f180370b);
        sb2.append(", borderType=");
        sb2.append(this.f180371c);
        sb2.append(", enabled=");
        sb2.append(this.f180372d);
        sb2.append(", selected=");
        sb2.append(this.f180373e);
        sb2.append(", textContent=");
        sb2.append(this.f180374f);
        sb2.append(", onSelect=");
        return androidx.appcompat.app.r.v(sb2, this.f180375g, ')');
    }

    public /* synthetic */ SelectorCardState(Status status, Indicator indicator, Border border, boolean z12, boolean z13, a aVar, Y41.a aVar2, int i12, C42822w c42822w) {
        this(status, indicator, border, z12, z13, (i12 & 32) != 0 ? null : aVar, (i12 & 64) != 0 ? null : aVar2);
    }
}
