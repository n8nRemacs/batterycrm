package RX;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Api1MandatoryVerificationPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"LRX/a;", "", "LRX/f;", "button", "", "description", "", "isComplete", "title", "verificationFailedMessage", "verificationRequiredMessage", "<init>", "(LRX/f;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LRX/f;", "a", "()LRX/f;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "f", "()Z", "c", "d", "e", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    @com.google.gson.annotations.c("button")
    @l
    private final f button;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("isComplete")
    private final boolean isComplete;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("verificationFailedMessage")
    @l
    private final String verificationFailedMessage;

    @com.google.gson.annotations.c("verificationRequiredMessage")
    @k
    private final String verificationRequiredMessage;

    public a(@l f fVar, @k String str, boolean z12, @k String str2, @l String str3, @k String str4) {
        this.button = fVar;
        this.description = str;
        this.isComplete = z12;
        this.title = str2;
        this.verificationFailedMessage = str3;
        this.verificationRequiredMessage = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getButton() {
        return this.button;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getVerificationFailedMessage() {
        return this.verificationFailedMessage;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getVerificationRequiredMessage() {
        return this.verificationRequiredMessage;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }
}
