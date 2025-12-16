package Qb;

import com.adjust.sdk.Constants;
import com.avito.android.ai_assistant.generated.api.open_v_2.OkRespDataSuccessElementsItem2;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LQb/m;", "", "", "chatId", "", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/OkRespDataSuccessElementsItem2;", "elements", "LQb/c;", "fallbackMessage", "LQb/j;", Constants.REFERRER_API_META, "Lcom/avito/android/deep_linking/links/DeepLink;", "onCloseUxFeedback", "LQb/k;", "onCloseUxFeedbacks", "LQb/l;", "timestamps", "<init>", "(Ljava/lang/String;Ljava/util/List;LQb/c;LQb/j;Ljava/util/List;Ljava/util/List;LQb/l;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LQb/c;", "c", "()LQb/c;", "LQb/j;", "d", "()LQb/j;", "getOnCloseUxFeedback", "e", "LQb/l;", "f", "()LQb/l;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m {

    @com.google.gson.annotations.c("chatId")
    @Y61.k
    private final String chatId;

    @com.google.gson.annotations.c("elements")
    @Y61.l
    private final List<OkRespDataSuccessElementsItem2> elements;

    @com.google.gson.annotations.c("fallbackMessage")
    @Y61.l
    private final c fallbackMessage;

    @com.google.gson.annotations.c(Constants.REFERRER_API_META)
    @Y61.k
    private final j meta;

    @com.google.gson.annotations.c("onCloseUxFeedback")
    @Y61.l
    private final List<DeepLink> onCloseUxFeedback;

    @com.google.gson.annotations.c("onCloseUxFeedbacks")
    @Y61.l
    private final List<k> onCloseUxFeedbacks;

    @com.google.gson.annotations.c("timestamps")
    @Y61.k
    private final l timestamps;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k String str, @Y61.l List<? extends OkRespDataSuccessElementsItem2> list, @Y61.l c cVar, @Y61.k j jVar, @Y61.l List<? extends DeepLink> list2, @Y61.l List<k> list3, @Y61.k l lVar) {
        this.chatId = str;
        this.elements = list;
        this.fallbackMessage = cVar;
        this.meta = jVar;
        this.onCloseUxFeedback = list2;
        this.onCloseUxFeedbacks = list3;
        this.timestamps = lVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    @Y61.l
    public final List<OkRespDataSuccessElementsItem2> b() {
        return this.elements;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final c getFallbackMessage() {
        return this.fallbackMessage;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final j getMeta() {
        return this.meta;
    }

    @Y61.l
    public final List<k> e() {
        return this.onCloseUxFeedbacks;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final l getTimestamps() {
        return this.timestamps;
    }
}
