package com.avito.android.cpx_promo.generated.api.api_3_cpa_cjm_cpx_promo_get_data_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector;", "", "", "isVisible", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector$SelectedType;", "selectedType", "", "subtitleAuto", "subtitleManual", "Lds/k;", "title", "<init>", "(ZLcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector$SelectedType;Ljava/lang/String;Ljava/lang/String;Lds/k;)V", "Z", "e", "()Z", "Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector$SelectedType;", "a", "()Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector$SelectedType;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lds/k;", "d", "()Lds/k;", "SelectedType", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkRespDataSuccessBidSelector {

    @c("isVisible")
    private final boolean isVisible;

    @c("selectedType")
    @k
    private final SelectedType selectedType;

    @c("subtitleAuto")
    @k
    private final String subtitleAuto;

    @c("subtitleManual")
    @k
    private final String subtitleManual;

    @c("title")
    @k
    private final ds.k title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cpx_promo/generated/api/api_3_cpa_cjm_cpx_promo_get_data_get/OkRespDataSuccessBidSelector$SelectedType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Auto", "Manual", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectedType {

        @c("auto")
        public static final SelectedType Auto;

        @c("manual")
        public static final SelectedType Manual;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SelectedType[] f126885b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f126886c;

        static {
            SelectedType selectedType = new SelectedType("Auto", 0, "auto");
            Auto = selectedType;
            SelectedType selectedType2 = new SelectedType("Manual", 1, "manual");
            Manual = selectedType2;
            SelectedType[] selectedTypeArr = {selectedType, selectedType2};
            f126885b = selectedTypeArr;
            f126886c = kotlin.enums.c.a(selectedTypeArr);
        }

        private SelectedType(String str, int i12, String str2) {
        }

        public static SelectedType valueOf(String str) {
            return (SelectedType) Enum.valueOf(SelectedType.class, str);
        }

        public static SelectedType[] values() {
            return (SelectedType[]) f126885b.clone();
        }
    }

    public OkRespDataSuccessBidSelector(boolean z12, @k SelectedType selectedType, @k String str, @k String str2, @k ds.k kVar) {
        this.isVisible = z12;
        this.selectedType = selectedType;
        this.subtitleAuto = str;
        this.subtitleManual = str2;
        this.title = kVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final SelectedType getSelectedType() {
        return this.selectedType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSubtitleAuto() {
        return this.subtitleAuto;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitleManual() {
        return this.subtitleManual;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final ds.k getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }
}
