package com.avito.android.service_fee_conditions.generated.api.api_1_sf_conditions_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1SfConditionsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner$IconStyle;", "iconStyle", "", "text", "textIconName", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner$IconStyle;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner$IconStyle;", "b", "()Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner$IconStyle;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "IconStyle", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkResponseSuccessBanner {

    @c("description")
    @k
    private final AttributedText description;

    @c("iconStyle")
    @k
    private final IconStyle iconStyle;

    @c("text")
    @k
    private final String text;

    @c("textIconName")
    @k
    private final String textIconName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1SfConditionsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner$IconStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "Success", "Warning", "Danger", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconStyle {

        @c("danger")
        public static final IconStyle Danger;

        @c(Constants.NORMAL)
        public static final IconStyle Normal;

        @c("success")
        public static final IconStyle Success;

        @c(ConstraintKt.WARNING)
        public static final IconStyle Warning;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ IconStyle[] f278438b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f278439c;

        static {
            IconStyle iconStyle = new IconStyle("Normal", 0, Constants.NORMAL);
            Normal = iconStyle;
            IconStyle iconStyle2 = new IconStyle("Success", 1, "success");
            Success = iconStyle2;
            IconStyle iconStyle3 = new IconStyle("Warning", 2, ConstraintKt.WARNING);
            Warning = iconStyle3;
            IconStyle iconStyle4 = new IconStyle("Danger", 3, "danger");
            Danger = iconStyle4;
            IconStyle[] iconStyleArr = {iconStyle, iconStyle2, iconStyle3, iconStyle4};
            f278438b = iconStyleArr;
            f278439c = kotlin.enums.c.a(iconStyleArr);
        }

        private IconStyle(String str, int i12, String str2) {
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) f278438b.clone();
        }
    }

    public OkResponseSuccessBanner(@k AttributedText attributedText, @k IconStyle iconStyle, @k String str, @k String str2) {
        this.description = attributedText;
        this.iconStyle = iconStyle;
        this.text = str;
        this.textIconName = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final IconStyle getIconStyle() {
        return this.iconStyle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTextIconName() {
        return this.textIconName;
    }
}
