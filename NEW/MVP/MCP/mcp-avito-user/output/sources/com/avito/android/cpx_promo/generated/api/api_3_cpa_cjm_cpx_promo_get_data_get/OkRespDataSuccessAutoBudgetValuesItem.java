package com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.gson.annotations.c;
import ds.s;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem;", "", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem$Id;", "id", "Lds/s;", "slider", "", "title", "<init>", "(Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem$Id;Lds/s;Ljava/lang/String;)V", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem$Id;", "a", "()Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem$Id;", "Lds/s;", "b", "()Lds/s;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Id", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkRespDataSuccessAutoBudgetValuesItem {

    @c("id")
    @k
    private final Id id;

    @c("slider")
    @k
    private final s slider;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessAutoBudgetValuesItem$Id;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Day", "Week", "Month", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Id {

        @c(SelectionType.TYPE_DAY)
        public static final Id Day;

        @c(SelectionType.TYPE_MONTH)
        public static final Id Month;

        @c("week")
        public static final Id Week;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Id[] f126882c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f126883d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f126884b;

        static {
            Id id2 = new Id("Day", 0, SelectionType.TYPE_DAY);
            Day = id2;
            Id id3 = new Id("Week", 1, "week");
            Week = id3;
            Id id4 = new Id("Month", 2, SelectionType.TYPE_MONTH);
            Month = id4;
            Id[] idArr = {id2, id3, id4};
            f126882c = idArr;
            f126883d = kotlin.enums.c.a(idArr);
        }

        private Id(String str, int i12, String str2) {
            this.f126884b = str2;
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) f126882c.clone();
        }
    }

    public OkRespDataSuccessAutoBudgetValuesItem(@k Id id2, @k s sVar, @k String str) {
        this.id = id2;
        this.slider = sVar;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Id getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final s getSlider() {
        return this.slider;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
