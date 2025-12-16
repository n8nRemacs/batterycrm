package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: IncomeInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/IncomeInfo;", "", "title", "", "attributedText", "Lcom/avito/android/remote/model/text/AttributedText;", "confirmTitle", "image", "Lcom/avito/android/remote/model/Image;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getConfirmTitle", "()Ljava/lang/String;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getTitle", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IncomeInfo {

    @c("attributedText")
    @k
    private final AttributedText attributedText;

    @c("confirmTitle")
    @k
    private final String confirmTitle;

    @c("image")
    @k
    private final Image image;

    @c("title")
    @k
    private final String title;

    public IncomeInfo(@k String str, @k AttributedText attributedText, @k String str2, @k Image image) {
        this.title = str;
        this.attributedText = attributedText;
        this.confirmTitle = str2;
        this.image = image;
    }

    @k
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @k
    public final String getConfirmTitle() {
        return this.confirmTitle;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }
}
