package com.avito.android.fees_methods.generated.api.api_1_fees_by_package_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1FeesByPackageGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton;", "", "Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton$Style;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton$Style;", "a", "()Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton$Style;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Style", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OkResponseSuccessButton {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1FeesByPackageGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("primary")
        public static final Style Primary;

        @c("secondary")
        public static final Style Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f157947b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f157948c;

        static {
            Style style = new Style("Primary", 0, "primary");
            Primary = style;
            Style style2 = new Style("Secondary", 1, "secondary");
            Secondary = style2;
            Style[] styleArr = {style, style2};
            f157947b = styleArr;
            f157948c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f157947b.clone();
        }
    }

    public OkResponseSuccessButton(@k Style style, @k String str, @k DeepLink deepLink) {
        this.style = style;
        this.title = str;
        this.uri = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
