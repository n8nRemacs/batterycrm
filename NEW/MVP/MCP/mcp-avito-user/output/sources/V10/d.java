package v10;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorOffersGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lv10/d;", "", "Lv10/f;", "description", "Lv10/i;", MessageSuggest.PREVIEW, "", "type", "<init>", "(Lv10/f;Lv10/i;Ljava/lang/String;)V", "Lv10/f;", "a", "()Lv10/f;", "Lv10/i;", "b", "()Lv10/i;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final f description;

    @com.google.gson.annotations.c(MessageSuggest.PREVIEW)
    @Y61.k
    private final i preview;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final String type;

    public d(@Y61.k f fVar, @Y61.k i iVar, @Y61.k String str) {
        this.description = fVar;
        this.preview = iVar;
        this.type = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final f getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final i getPreview() {
        return this.preview;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
