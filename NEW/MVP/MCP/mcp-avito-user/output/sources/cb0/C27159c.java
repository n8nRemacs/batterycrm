package cb0;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ServicesSellerTypeOptionsListResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcb0/c;", "", "", "buttonTitle", "closeButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27159c {

    @com.google.gson.annotations.c("buttonTitle")
    @k
    private final String buttonTitle;

    @com.google.gson.annotations.c("closeButtonTitle")
    @k
    private final String closeButtonTitle;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C27159c(@k String str, @k String str2, @k AttributedText attributedText, @k String str3) {
        this.buttonTitle = str;
        this.closeButtonTitle = str2;
        this.subtitle = attributedText;
        this.title = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getCloseButtonTitle() {
        return this.closeButtonTitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
