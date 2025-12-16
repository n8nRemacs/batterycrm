package CE;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get.OkResponseSuccessOkBarCurrentProgress;
import com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get.OkResponseSuccessOkBarDescription;
import kotlin.Metadata;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LCE/g;", "", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarCurrentProgress;", "currentProgress", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription;", "description", "", "title", "<init>", "(Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarCurrentProgress;Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription;Ljava/lang/String;)V", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarCurrentProgress;", "a", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarCurrentProgress;", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription;", "b", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/OkResponseSuccessOkBarDescription;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g {

    @com.google.gson.annotations.c("currentProgress")
    @Y61.k
    private final OkResponseSuccessOkBarCurrentProgress currentProgress;

    @com.google.gson.annotations.c("description")
    @l
    private final OkResponseSuccessOkBarDescription description;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public g(@Y61.k OkResponseSuccessOkBarCurrentProgress okResponseSuccessOkBarCurrentProgress, @l OkResponseSuccessOkBarDescription okResponseSuccessOkBarDescription, @l String str) {
        this.currentProgress = okResponseSuccessOkBarCurrentProgress;
        this.description = okResponseSuccessOkBarDescription;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final OkResponseSuccessOkBarCurrentProgress getCurrentProgress() {
        return this.currentProgress;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final OkResponseSuccessOkBarDescription getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
