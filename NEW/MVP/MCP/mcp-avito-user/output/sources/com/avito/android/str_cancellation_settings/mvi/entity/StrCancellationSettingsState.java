package com.avito.android.str_cancellation_settings.mvi.entity;

import Ry0.h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import com.avito.android.str_cancellation_settings.mvi.entity.a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingType", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrCancellationSettingsState extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f288460o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final StrCancellationSettingsState f288461p;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final h f288462b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f288463c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f288464d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Date f288465e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f288466f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f288467g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f288468h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f288469i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f288470j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f288471k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LoadingType f288472l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final FromPageLabel f288473m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.str_cancellation_settings.mvi.entity.a f288474n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrCancellationSettingsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState$LoadingType;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f288475b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f288476c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f288477d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingType f288478e;

        /* renamed from: f, reason: collision with root package name */
        public static final LoadingType f288479f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f288480g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f288481h;

        static {
            LoadingType loadingType = new LoadingType("CORE_LOADING", 0);
            f288475b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOADED", 1);
            f288476c = loadingType2;
            LoadingType loadingType3 = new LoadingType("CORE_ERROR", 2);
            f288477d = loadingType3;
            LoadingType loadingType4 = new LoadingType("APPLY_LOADING", 3);
            f288478e = loadingType4;
            LoadingType loadingType5 = new LoadingType("APPLY_LOADED", 4);
            f288479f = loadingType5;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3, loadingType4, loadingType5};
            f288480g = loadingTypeArr;
            f288481h = c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f288480g.clone();
        }
    }

    /* compiled from: StrCancellationSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState$a;", "", "<init>", "()V", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        LoadingType loadingType = LoadingType.f288475b;
        com.avito.android.str_cancellation_settings.mvi.entity.a.f288482Y1.getClass();
        f288461p = new StrCancellationSettingsState(null, null, null, null, false, null, false, null, null, false, loadingType, null, a.C8674a.f288484b);
    }

    public StrCancellationSettingsState(@l h hVar, @l Long l12, @l Date date, @l Date date2, boolean z12, @l Integer num, boolean z13, @l String str, @l String str2, boolean z14, @k LoadingType loadingType, @l FromPageLabel fromPageLabel, @k com.avito.android.str_cancellation_settings.mvi.entity.a aVar) {
        this.f288462b = hVar;
        this.f288463c = l12;
        this.f288464d = date;
        this.f288465e = date2;
        this.f288466f = z12;
        this.f288467g = num;
        this.f288468h = z13;
        this.f288469i = str;
        this.f288470j = str2;
        this.f288471k = z14;
        this.f288472l = loadingType;
        this.f288473m = fromPageLabel;
        this.f288474n = aVar;
    }

    public static StrCancellationSettingsState a(StrCancellationSettingsState strCancellationSettingsState, h hVar, Long l12, Date date, Date date2, boolean z12, Integer num, boolean z13, String str, String str2, boolean z14, LoadingType loadingType, FromPageLabel fromPageLabel, com.avito.android.str_cancellation_settings.mvi.entity.a aVar, int i12) {
        h hVar2 = (i12 & 1) != 0 ? strCancellationSettingsState.f288462b : hVar;
        Long l13 = (i12 & 2) != 0 ? strCancellationSettingsState.f288463c : l12;
        Date date3 = (i12 & 4) != 0 ? strCancellationSettingsState.f288464d : date;
        Date date4 = (i12 & 8) != 0 ? strCancellationSettingsState.f288465e : date2;
        boolean z15 = (i12 & 16) != 0 ? strCancellationSettingsState.f288466f : z12;
        Integer num2 = (i12 & 32) != 0 ? strCancellationSettingsState.f288467g : num;
        boolean z16 = (i12 & 64) != 0 ? strCancellationSettingsState.f288468h : z13;
        String str3 = (i12 & 128) != 0 ? strCancellationSettingsState.f288469i : str;
        String str4 = (i12 & 256) != 0 ? strCancellationSettingsState.f288470j : str2;
        boolean z17 = (i12 & 512) != 0 ? strCancellationSettingsState.f288471k : z14;
        LoadingType loadingType2 = (i12 & 1024) != 0 ? strCancellationSettingsState.f288472l : loadingType;
        FromPageLabel fromPageLabel2 = (i12 & 2048) != 0 ? strCancellationSettingsState.f288473m : fromPageLabel;
        com.avito.android.str_cancellation_settings.mvi.entity.a aVar2 = (i12 & 4096) != 0 ? strCancellationSettingsState.f288474n : aVar;
        strCancellationSettingsState.getClass();
        return new StrCancellationSettingsState(hVar2, l13, date3, date4, z15, num2, z16, str3, str4, z17, loadingType2, fromPageLabel2, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrCancellationSettingsState)) {
            return false;
        }
        StrCancellationSettingsState strCancellationSettingsState = (StrCancellationSettingsState) obj;
        return L.f(this.f288462b, strCancellationSettingsState.f288462b) && L.f(this.f288463c, strCancellationSettingsState.f288463c) && L.f(this.f288464d, strCancellationSettingsState.f288464d) && L.f(this.f288465e, strCancellationSettingsState.f288465e) && this.f288466f == strCancellationSettingsState.f288466f && L.f(this.f288467g, strCancellationSettingsState.f288467g) && this.f288468h == strCancellationSettingsState.f288468h && L.f(this.f288469i, strCancellationSettingsState.f288469i) && L.f(this.f288470j, strCancellationSettingsState.f288470j) && this.f288471k == strCancellationSettingsState.f288471k && this.f288472l == strCancellationSettingsState.f288472l && this.f288473m == strCancellationSettingsState.f288473m && L.f(this.f288474n, strCancellationSettingsState.f288474n);
    }

    public final int hashCode() {
        h hVar = this.f288462b;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        Long l12 = this.f288463c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Date date = this.f288464d;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f288465e;
        int i12 = r.i((iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.f288466f);
        Integer num = this.f288467g;
        int i13 = r.i((i12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f288468h);
        String str = this.f288469i;
        int iHashCode4 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f288470j;
        int iHashCode5 = (this.f288472l.hashCode() + r.i((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f288471k)) * 31;
        FromPageLabel fromPageLabel = this.f288473m;
        return this.f288474n.hashCode() + ((iHashCode5 + (fromPageLabel != null ? fromPageLabel.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StrCancellationSettingsState(response=" + this.f288462b + ", itemId=" + this.f288463c + ", startDate=" + this.f288464d + ", endDate=" + this.f288465e + ", isFreeCancellationEnabled=" + this.f288466f + ", freeCancellationSelectedPeriodId=" + this.f288467g + ", isCancellationDiscountEnabled=" + this.f288468h + ", cancellationDiscountInputValue=" + this.f288469i + ", cancellationDiscountInputError=" + this.f288470j + ", isKeyboardVisible=" + this.f288471k + ", loadingType=" + this.f288472l + ", fromPageLabel=" + this.f288473m + ", viewState=" + this.f288474n + ')';
    }
}
