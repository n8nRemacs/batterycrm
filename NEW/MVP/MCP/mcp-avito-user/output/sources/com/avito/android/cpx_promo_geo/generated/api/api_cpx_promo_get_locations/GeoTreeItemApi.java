package com.avito.android.cpx_promo_geo.generated.api.api_cpx_promo_get_locations;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiCpxPromoGetLocationsResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi;", "", "Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi$CheckboxState;", "checkboxState", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "haveChildren", "", SearchParamsConverterKt.LOCATION_ID, "", "title", "<init>", "(Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi$CheckboxState;Ljava/util/List;ZJLjava/lang/String;)V", "Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi$CheckboxState;", "a", "()Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi$CheckboxState;", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Z", "getHaveChildren", "()Z", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "CheckboxState", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeoTreeItemApi {

    @c("checkboxState")
    @k
    private final CheckboxState checkboxState;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @k
    private final List<GeoTreeItemApi> children;

    @c("haveChildren")
    private final boolean haveChildren;

    @c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiCpxPromoGetLocationsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/cpx_promo_geo/generated/api/api_cpx_promo_get_locations/GeoTreeItemApi$CheckboxState;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FullSelected", "PartialSelected", "NotSelected", "IsHome", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CheckboxState {

        @c("fullSelected")
        public static final CheckboxState FullSelected;

        @c("isHome")
        public static final CheckboxState IsHome;

        @c("notSelected")
        public static final CheckboxState NotSelected;

        @c("partialSelected")
        public static final CheckboxState PartialSelected;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ CheckboxState[] f127784b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f127785c;

        static {
            CheckboxState checkboxState = new CheckboxState("FullSelected", 0, "fullSelected");
            FullSelected = checkboxState;
            CheckboxState checkboxState2 = new CheckboxState("PartialSelected", 1, "partialSelected");
            PartialSelected = checkboxState2;
            CheckboxState checkboxState3 = new CheckboxState("NotSelected", 2, "notSelected");
            NotSelected = checkboxState3;
            CheckboxState checkboxState4 = new CheckboxState("IsHome", 3, "isHome");
            IsHome = checkboxState4;
            CheckboxState[] checkboxStateArr = {checkboxState, checkboxState2, checkboxState3, checkboxState4};
            f127784b = checkboxStateArr;
            f127785c = kotlin.enums.c.a(checkboxStateArr);
        }

        private CheckboxState(String str, int i12, String str2) {
        }

        public static CheckboxState valueOf(String str) {
            return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
        }

        public static CheckboxState[] values() {
            return (CheckboxState[]) f127784b.clone();
        }
    }

    public GeoTreeItemApi(@k CheckboxState checkboxState, @k List<GeoTreeItemApi> list, boolean z12, long j12, @k String str) {
        this.checkboxState = checkboxState;
        this.children = list;
        this.haveChildren = z12;
        this.locationId = j12;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final CheckboxState getCheckboxState() {
        return this.checkboxState;
    }

    /* renamed from: b, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
