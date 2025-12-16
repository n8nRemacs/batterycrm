package CM0;

import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: VerificationViewDisclaimerApiV4Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LCM0/f;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "body", "", "description", "errorIdPrefix", "refreshButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getBody", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getErrorIdPrefix", "getRefreshButton", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    @com.google.gson.annotations.c("body")
    @l
    private final AttributedText body;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("errorIdPrefix")
    @l
    private final String errorIdPrefix;

    @com.google.gson.annotations.c("refreshButton")
    @l
    private final String refreshButton;

    public f(@l AttributedText attributedText, @l String str, @l String str2, @l String str3) {
        this.body = attributedText;
        this.description = str;
        this.errorIdPrefix = str2;
        this.refreshButton = str3;
    }
}
