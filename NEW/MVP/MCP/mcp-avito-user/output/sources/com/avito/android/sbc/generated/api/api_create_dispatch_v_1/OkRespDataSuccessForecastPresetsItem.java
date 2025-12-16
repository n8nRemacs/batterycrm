package com.avito.android.sbc.generated.api.api_create_dispatch_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bp0.f;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiCreateDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem;", "", "Lbp0/f;", "audience", "", "budget", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem$ForecastType;", "forecastType", "", "isDefault", "ttlDays", "<init>", "(Lbp0/f;JLcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem$ForecastType;ZJ)V", "Lbp0/f;", "a", "()Lbp0/f;", "J", "b", "()J", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem$ForecastType;", "c", "()Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem$ForecastType;", "Z", "e", "()Z", "d", "ForecastType", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkRespDataSuccessForecastPresetsItem {

    @c("audience")
    @k
    private final f audience;

    @c("budget")
    private final long budget;

    @c("forecastType")
    @l
    private final ForecastType forecastType;

    @c("isDefault")
    private final boolean isDefault;

    @c("ttlDays")
    private final long ttlDays;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiCreateDispatchV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/OkRespDataSuccessForecastPresetsItem$ForecastType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Base", "Custom", "Preferred", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ForecastType {

        @c("base")
        public static final ForecastType Base;

        @c("custom")
        public static final ForecastType Custom;

        @c("preferred")
        public static final ForecastType Preferred;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ForecastType[] f260169b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f260170c;

        static {
            ForecastType forecastType = new ForecastType("Base", 0, "base");
            Base = forecastType;
            ForecastType forecastType2 = new ForecastType("Custom", 1, "custom");
            Custom = forecastType2;
            ForecastType forecastType3 = new ForecastType("Preferred", 2, "preferred");
            Preferred = forecastType3;
            ForecastType[] forecastTypeArr = {forecastType, forecastType2, forecastType3};
            f260169b = forecastTypeArr;
            f260170c = kotlin.enums.c.a(forecastTypeArr);
        }

        private ForecastType(String str, int i12, String str2) {
        }

        public static ForecastType valueOf(String str) {
            return (ForecastType) Enum.valueOf(ForecastType.class, str);
        }

        public static ForecastType[] values() {
            return (ForecastType[]) f260169b.clone();
        }
    }

    public OkRespDataSuccessForecastPresetsItem(@k f fVar, long j12, @l ForecastType forecastType, boolean z12, long j13) {
        this.audience = fVar;
        this.budget = j12;
        this.forecastType = forecastType;
        this.isDefault = z12;
        this.ttlDays = j13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final f getAudience() {
        return this.audience;
    }

    /* renamed from: b, reason: from getter */
    public final long getBudget() {
        return this.budget;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ForecastType getForecastType() {
        return this.forecastType;
    }

    /* renamed from: d, reason: from getter */
    public final long getTtlDays() {
        return this.ttlDays;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }
}
