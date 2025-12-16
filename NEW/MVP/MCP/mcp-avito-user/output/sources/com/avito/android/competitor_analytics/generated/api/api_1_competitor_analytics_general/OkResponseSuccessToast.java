package com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast;", "", "", "buttonTitle", "message", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast$Style;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast$Style;", "c", "()Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast$Style;", "Style", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OkResponseSuccessToast {

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("message")
    @k
    private final String message;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1CompetitorAnalyticsGeneralResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_1_competitor_analytics_general/OkResponseSuccessToast$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Error", "Info", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("error")
        public static final Style Error;

        @c(RequestReviewResultKt.INFO_TYPE)
        public static final Style Info;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f124364b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f124365c;

        static {
            Style style = new Style("Error", 0, "error");
            Error = style;
            Style style2 = new Style("Info", 1, RequestReviewResultKt.INFO_TYPE);
            Info = style2;
            Style[] styleArr = {style, style2};
            f124364b = styleArr;
            f124365c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f124364b.clone();
        }
    }

    public OkResponseSuccessToast(@l String str, @k String str2, @k Style style) {
        this.buttonTitle = str;
        this.message = str2;
        this.style = style;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }
}
