package Rb;

import com.adjust.sdk.Constants;
import com.avito.android.ai_assistant.generated.api.send_v_2.OkRespDataSuccessElementsItem2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SendV2Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LRb/m;", "", "", "Lcom/avito/android/ai_assistant/generated/api/send_v_2/OkRespDataSuccessElementsItem2;", "elements", "LRb/c;", "fallbackMessage", "LRb/k;", Constants.REFERRER_API_META, "LRb/l;", "timestamps", "<init>", "(Ljava/util/List;LRb/c;LRb/k;LRb/l;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LRb/c;", "b", "()LRb/c;", "LRb/k;", "c", "()LRb/k;", "LRb/l;", "d", "()LRb/l;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    @com.google.gson.annotations.c("elements")
    @Y61.k
    private final List<OkRespDataSuccessElementsItem2> elements;

    @com.google.gson.annotations.c("fallbackMessage")
    @Y61.l
    private final c fallbackMessage;

    @com.google.gson.annotations.c(Constants.REFERRER_API_META)
    @Y61.k
    private final k meta;

    @com.google.gson.annotations.c("timestamps")
    @Y61.k
    private final l timestamps;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k List<? extends OkRespDataSuccessElementsItem2> list, @Y61.l c cVar, @Y61.k k kVar, @Y61.k l lVar) {
        this.elements = list;
        this.fallbackMessage = cVar;
        this.meta = kVar;
        this.timestamps = lVar;
    }

    @Y61.k
    public final List<OkRespDataSuccessElementsItem2> a() {
        return this.elements;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final c getFallbackMessage() {
        return this.fallbackMessage;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final k getMeta() {
        return this.meta;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final l getTimestamps() {
        return this.timestamps;
    }
}
