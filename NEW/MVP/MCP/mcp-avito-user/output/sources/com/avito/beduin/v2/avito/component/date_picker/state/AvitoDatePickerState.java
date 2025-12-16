package com.avito.beduin.v2.avito.component.date_picker.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDatePickerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "b", "DatePickerDisableDatesOption", "c", "d", "e", "f", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoDatePickerState implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<x> f334150a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ET0.a<x> f334151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ET0.a<x> f334152c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ST0.d f334153d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f334154e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final c f334155f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f334156g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f334157h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f334158i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final DatePickerDisableDatesOption f334159j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ST0.d f334160k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.l<ST0.d, G0> f334161l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Y41.l<List<x>, G0> f334162m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<k> f334163n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f334164o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334165p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334166q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f334167r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f334168s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$DatePickerDisableDatesOption;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DatePickerDisableDatesOption {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ DatePickerDisableDatesOption[] f334169b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334170c;

        static {
            DatePickerDisableDatesOption[] datePickerDisableDatesOptionArr = {new DatePickerDisableDatesOption("DependsOnRangeWithPastDisabled", 0), new DatePickerDisableDatesOption("DependsOnRangeWithFutureDisabled", 1), new DatePickerDisableDatesOption("DependsOnRangeWithPastAndFutureDisabled", 2), new DatePickerDisableDatesOption("DependsOnRange", 3)};
            f334169b = datePickerDisableDatesOptionArr;
            f334170c = kotlin.enums.c.a(datePickerDisableDatesOptionArr);
        }

        public DatePickerDisableDatesOption() {
            throw null;
        }

        public static DatePickerDisableDatesOption valueOf(String str) {
            return (DatePickerDisableDatesOption) Enum.valueOf(DatePickerDisableDatesOption.class, str);
        }

        public static DatePickerDisableDatesOption[] values() {
            return (DatePickerDisableDatesOption[]) f334169b.clone();
        }
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$a;", "", "<init>", "()V", "", "DATE_INTERVAL_KEY", "Ljava/lang/String;", "MULTIPLE_DATES_KEY", "SINGLE_DATE_KEY", "SINGLE_OR_INTERVAL_KEY", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$b;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f334171a;

        public b(@Y61.l Integer num) {
            this.f334171a = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f334171a, ((b) obj).f334171a);
        }

        public final int hashCode() {
            Integer num = this.f334171a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("DateInterval(minDays="), this.f334171a, ')');
        }
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$b;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$d;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$e;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$f;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$d;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f334172a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 858060434;
        }

        @Y61.k
        public final String toString() {
            return "MultipleDates";
        }
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$e;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f334173a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1000081159;
        }

        @Y61.k
        public final String toString() {
            return "SingleDate";
        }
    }

    /* compiled from: AvitoDatePickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$f;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f334174a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1089678113;
        }

        @Y61.k
        public final String toString() {
            return "SingleOrIntervalDate";
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoDatePickerState(@Y61.k ET0.a<x> aVar, @Y61.k ET0.a<x> aVar2, @Y61.k ET0.a<x> aVar3, @Y61.l ST0.d dVar, @Y61.l Integer num, @Y61.l c cVar, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l DatePickerDisableDatesOption datePickerDisableDatesOption, @Y61.l ST0.d dVar2, @Y61.l Y41.l<? super ST0.d, G0> lVar, @Y61.l Y41.l<? super List<x>, G0> lVar2, @Y61.k com.avito.beduin.v2.theme.l<k> lVar3, boolean z12, @Y61.l Y41.a<G0> aVar4, @Y61.l Y41.a<G0> aVar5, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar2, @Y61.l String str) {
        this.f334150a = aVar;
        this.f334151b = aVar2;
        this.f334152c = aVar3;
        this.f334153d = dVar;
        this.f334154e = num;
        this.f334155f = cVar;
        this.f334156g = bool;
        this.f334157h = bool2;
        this.f334158i = bool3;
        this.f334159j = datePickerDisableDatesOption;
        this.f334160k = dVar2;
        this.f334161l = lVar;
        this.f334162m = lVar2;
        this.f334163n = lVar3;
        this.f334164o = z12;
        this.f334165p = aVar4;
        this.f334166q = aVar5;
        this.f334167r = cVar2;
        this.f334168s = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334165p;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334166q;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f334167r;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoDatePickerState)) {
            return false;
        }
        AvitoDatePickerState avitoDatePickerState = (AvitoDatePickerState) obj;
        return L.f(this.f334150a, avitoDatePickerState.f334150a) && L.f(this.f334151b, avitoDatePickerState.f334151b) && L.f(this.f334152c, avitoDatePickerState.f334152c) && L.f(this.f334153d, avitoDatePickerState.f334153d) && L.f(this.f334154e, avitoDatePickerState.f334154e) && L.f(this.f334155f, avitoDatePickerState.f334155f) && L.f(this.f334156g, avitoDatePickerState.f334156g) && L.f(this.f334157h, avitoDatePickerState.f334157h) && L.f(this.f334158i, avitoDatePickerState.f334158i) && this.f334159j == avitoDatePickerState.f334159j && L.f(this.f334160k, avitoDatePickerState.f334160k) && L.f(this.f334161l, avitoDatePickerState.f334161l) && L.f(this.f334162m, avitoDatePickerState.f334162m) && L.f(this.f334163n, avitoDatePickerState.f334163n) && this.f334164o == avitoDatePickerState.f334164o && L.f(this.f334165p, avitoDatePickerState.f334165p) && L.f(this.f334166q, avitoDatePickerState.f334166q) && L.f(this.f334167r, avitoDatePickerState.f334167r) && L.f(this.f334168s, avitoDatePickerState.f334168s);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334168s() {
        return this.f334168s;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334164o() {
        return this.f334164o;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f334152c.f4014b, androidx.compose.ui.graphics.colorspace.e.g(this.f334151b.f4014b, this.f334150a.f4014b.hashCode() * 31, 31), 31);
        ST0.d dVar = this.f334153d;
        int iHashCode = (iG2 + (dVar == null ? 0 : dVar.f14989a.hashCode())) * 31;
        Integer num = this.f334154e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.f334155f;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Boolean bool = this.f334156g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f334157h;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f334158i;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DatePickerDisableDatesOption datePickerDisableDatesOption = this.f334159j;
        int iHashCode7 = (iHashCode6 + (datePickerDisableDatesOption == null ? 0 : datePickerDisableDatesOption.hashCode())) * 31;
        ST0.d dVar2 = this.f334160k;
        int iHashCode8 = (iHashCode7 + (dVar2 == null ? 0 : dVar2.f14989a.hashCode())) * 31;
        Y41.l<ST0.d, G0> lVar = this.f334161l;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<List<x>, G0> lVar2 = this.f334162m;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334163n, (iHashCode9 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31, 31), 31, this.f334164o);
        Y41.a<G0> aVar = this.f334165p;
        int iHashCode10 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334166q;
        int iHashCode11 = (Arrays.hashCode(this.f334167r.f336915a) + ((iHashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31;
        String str = this.f334168s;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDatePickerState(selectedDates=");
        sb2.append(this.f334150a);
        sb2.append(", specialDates=");
        sb2.append(this.f334151b);
        sb2.append(", disabledDates=");
        sb2.append(this.f334152c);
        sb2.append(", initialMonthMillis=");
        sb2.append(this.f334153d);
        sb2.append(", countOfDisplayedMonths=");
        sb2.append(this.f334154e);
        sb2.append(", selectionType=");
        sb2.append(this.f334155f);
        sb2.append(", highlightWeekend=");
        sb2.append(this.f334156g);
        sb2.append(", enableBackgroundForDisabledDates=");
        sb2.append(this.f334157h);
        sb2.append(", isLoading=");
        sb2.append(this.f334158i);
        sb2.append(", disableDatesOption=");
        sb2.append(this.f334159j);
        sb2.append(", initialDisplayedMonthMillis=");
        sb2.append(this.f334160k);
        sb2.append(", onSpecialDateClicked=");
        sb2.append(this.f334161l);
        sb2.append(", onSelectedDatesChange=");
        sb2.append(this.f334162m);
        sb2.append(", style=");
        sb2.append(this.f334163n);
        sb2.append(", visible=");
        sb2.append(this.f334164o);
        sb2.append(", onShow=");
        sb2.append(this.f334165p);
        sb2.append(", onHide=");
        sb2.append(this.f334166q);
        sb2.append(", markers=");
        sb2.append(this.f334167r);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334168s, ')');
    }
}
