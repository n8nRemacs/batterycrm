package v10;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lv10/i;", "", "Lv10/s;", "limitsFailure", "Lv10/j;", "nothingFound", "", VoiceInfo.STATE, "Lv10/k;", "success", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lv10/s;Lv10/j;Ljava/lang/String;Lv10/k;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lv10/s;", "a", "()Lv10/s;", "Lv10/j;", "b", "()Lv10/j;", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "Lv10/k;", "c", "()Lv10/k;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    @com.google.gson.annotations.c("limitsFailure")
    @Y61.l
    private final s limitsFailure;

    @com.google.gson.annotations.c("nothingFound")
    @Y61.l
    private final j nothingFound;

    @com.google.gson.annotations.c(VoiceInfo.STATE)
    @Y61.k
    private final String state;

    @com.google.gson.annotations.c("success")
    @Y61.l
    private final k success;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public i(@Y61.l s sVar, @Y61.l j jVar, @Y61.k String str, @Y61.l k kVar, @Y61.k AttributedText attributedText) {
        this.limitsFailure = sVar;
        this.nothingFound = jVar;
        this.state = str;
        this.success = kVar;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final s getLimitsFailure() {
        return this.limitsFailure;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final j getNothingFound() {
        return this.nothingFound;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final k getSuccess() {
        return this.success;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
