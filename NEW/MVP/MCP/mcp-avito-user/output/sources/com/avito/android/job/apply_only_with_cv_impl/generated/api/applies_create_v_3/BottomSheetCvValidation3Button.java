package com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button;", "", "", "needDraft", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button$Style;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/Boolean;", "getNeedDraft", "()Ljava/lang/Boolean;", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button$Style;", "getStyle", "()Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button$Style;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Style", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomSheetCvValidation3Button {

    @c("needDraft")
    @l
    private final Boolean needDraft;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppliesCreateV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/BottomSheetCvValidation3Button$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("primary")
        public static final Style Primary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f173950b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f173951c;

        static {
            Style style = new Style("Primary", 0, "primary");
            Primary = style;
            Style[] styleArr = {style};
            f173950b = styleArr;
            f173951c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f173950b.clone();
        }
    }

    public BottomSheetCvValidation3Button(@l Boolean bool, @k Style style, @k String str, @l DeepLink deepLink) {
        this.needDraft = bool;
        this.style = style;
        this.title = str;
        this.uri = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
