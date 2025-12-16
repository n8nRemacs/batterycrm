package com.avito.android.gig.status_doc_public.generated.api.get_medical_status;

import XG.a;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: GetMedicalStatusResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction;", "", "LXG/a;", "event", "Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LXG/a;Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction$Style;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LXG/a;", "a", "()LXG/a;", "Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction$Style;", "b", "()Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction$Style;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Style", "_avito_gig_status-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMedicalStatusRespAction {

    @c("event")
    @l
    private final a event;

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
    /* compiled from: GetMedicalStatusResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/status_doc_public/generated/api/get_medical_status/GetMedicalStatusRespAction$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "Primary", "_avito_gig_status-doc_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("default")
        public static final Style Default;

        @c("primary")
        public static final Style Primary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f159509b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f159510c;

        static {
            Style style = new Style("Default", 0, "default");
            Default = style;
            Style style2 = new Style("Primary", 1, "primary");
            Primary = style2;
            Style[] styleArr = {style, style2};
            f159509b = styleArr;
            f159510c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f159509b.clone();
        }
    }

    public GetMedicalStatusRespAction(@l a aVar, @k Style style, @k String str, @k DeepLink deepLink) {
        this.event = aVar;
        this.style = style;
        this.title = str;
        this.uri = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final a getEvent() {
        return this.event;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
