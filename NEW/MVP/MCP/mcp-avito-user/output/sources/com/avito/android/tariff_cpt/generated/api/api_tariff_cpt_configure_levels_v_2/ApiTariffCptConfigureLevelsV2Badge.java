package com.avito.android.tariff_cpt.generated.api.api_tariff_cpt_configure_levels_v_2;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiTariffCptConfigureLevelsV2Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge;", "", "Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge$BadgeStyle;", "badgeStyle", "", "title", "<init>", "(Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge$BadgeStyle;Ljava/lang/String;)V", "Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge$BadgeStyle;", "a", "()Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge$BadgeStyle;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "BadgeStyle", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApiTariffCptConfigureLevelsV2Badge {

    @c("badgeStyle")
    @k
    private final BadgeStyle badgeStyle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiTariffCptConfigureLevelsV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_cpt/generated/api/api_tariff_cpt_configure_levels_v_2/ApiTariffCptConfigureLevelsV2Badge$BadgeStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Red", "Black", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BadgeStyle {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final BadgeStyle Black;

        @c("red")
        public static final BadgeStyle Red;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BadgeStyle[] f298106b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f298107c;

        static {
            BadgeStyle badgeStyle = new BadgeStyle("Red", 0, "red");
            Red = badgeStyle;
            BadgeStyle badgeStyle2 = new BadgeStyle("Black", 1, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = badgeStyle2;
            BadgeStyle[] badgeStyleArr = {badgeStyle, badgeStyle2};
            f298106b = badgeStyleArr;
            f298107c = kotlin.enums.c.a(badgeStyleArr);
        }

        private BadgeStyle(String str, int i12, String str2) {
        }

        public static BadgeStyle valueOf(String str) {
            return (BadgeStyle) Enum.valueOf(BadgeStyle.class, str);
        }

        public static BadgeStyle[] values() {
            return (BadgeStyle[]) f298106b.clone();
        }
    }

    public ApiTariffCptConfigureLevelsV2Badge(@k BadgeStyle badgeStyle, @k String str) {
        this.badgeStyle = badgeStyle;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
