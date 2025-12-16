package z90;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0004\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz90/B;", "", "", "isAvailable", "isEnabled", "", ConstraintKt.WARNING, "Lcom/avito/android/remote/model/text/AttributedText;", "warningAttr", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getWarning", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getWarningAttr", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class B {

    @com.google.gson.annotations.c("isAvailable")
    @Y61.l
    private final Boolean isAvailable;

    @com.google.gson.annotations.c("isEnabled")
    @Y61.l
    private final Boolean isEnabled;

    @com.google.gson.annotations.c(ConstraintKt.WARNING)
    @Y61.l
    private final String warning;

    @com.google.gson.annotations.c("warningAttr")
    @Y61.l
    private final AttributedText warningAttr;

    public B(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str, @Y61.l AttributedText attributedText) {
        this.isAvailable = bool;
        this.isEnabled = bool2;
        this.warning = str;
        this.warningAttr = attributedText;
    }
}
