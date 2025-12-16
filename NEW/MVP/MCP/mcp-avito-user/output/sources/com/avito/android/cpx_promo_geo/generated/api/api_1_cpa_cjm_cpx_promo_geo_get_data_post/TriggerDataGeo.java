package com.avito.android.cpx_promo_geo.generated.api.api_1_cpa_cjm_cpx_promo_geo_get_data_post;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo;", "", "Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo$Color;", "color", "", "subtitle", "title", "<init>", "(Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo$Color;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo$Color;", "a", "()Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo$Color;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Color", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TriggerDataGeo {

    @c("color")
    @k
    private final Color color;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/cpx_promo_geo/generated/api/api_1_cpa_cjm_cpx_promo_geo_get_data_post/TriggerDataGeo$Color;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Green", "Yellow", "Red", "Gray", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        @c("gray")
        public static final Color Gray;

        @c("green")
        public static final Color Green;

        @c("red")
        public static final Color Red;

        @c("yellow")
        public static final Color Yellow;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Color[] f127782b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f127783c;

        static {
            Color color = new Color("Green", 0, "green");
            Green = color;
            Color color2 = new Color("Yellow", 1, "yellow");
            Yellow = color2;
            Color color3 = new Color("Red", 2, "red");
            Red = color3;
            Color color4 = new Color("Gray", 3, "gray");
            Gray = color4;
            Color[] colorArr = {color, color2, color3, color4};
            f127782b = colorArr;
            f127783c = kotlin.enums.c.a(colorArr);
        }

        private Color(String str, int i12, String str2) {
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f127782b.clone();
        }
    }

    public TriggerDataGeo(@k Color color, @k String str, @k String str2) {
        this.color = color;
        this.subtitle = str;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
