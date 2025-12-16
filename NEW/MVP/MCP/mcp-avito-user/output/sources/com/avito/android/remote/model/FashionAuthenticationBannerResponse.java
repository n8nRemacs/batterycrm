package com.avito.android.remote.model;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: FashionAuthenticationBannerResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/FashionAuthenticationBannerResponse;", "", "title", "", "text", "Lcom/avito/android/remote/model/text/AttributedText;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "getStyle", "()Ljava/lang/String;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FashionAuthenticationBannerResponse {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @l
    private final AttributedText text;

    @c("title")
    @l
    private final String title;

    public FashionAuthenticationBannerResponse(@l String str, @l AttributedText attributedText, @l String str2) {
        this.title = str;
        this.text = attributedText;
        this.style = str2;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }
}
