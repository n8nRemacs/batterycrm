package Oh0;

import com.avito.android.re_agent_landing.generated.api.get_agent_profile_landing_api.Action;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetAgentProfileLandingApiResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LOh0/j;", "", "Lcom/avito/android/re_agent_landing/generated/api/get_agent_profile_landing_api/Action;", "action", "", "LOh0/i;", "faqList", "", "faqTitle", "LOh0/l;", "infoBlocks", "LOh0/m;", "topBlock", "<init>", "(Lcom/avito/android/re_agent_landing/generated/api/get_agent_profile_landing_api/Action;Ljava/util/List;Ljava/lang/String;Ljava/util/List;LOh0/m;)V", "Lcom/avito/android/re_agent_landing/generated/api/get_agent_profile_landing_api/Action;", "a", "()Lcom/avito/android/re_agent_landing/generated/api/get_agent_profile_landing_api/Action;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "LOh0/m;", "e", "()LOh0/m;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final Action action;

    @com.google.gson.annotations.c("faqList")
    @Y61.k
    private final List<i> faqList;

    @com.google.gson.annotations.c("faqTitle")
    @Y61.k
    private final String faqTitle;

    @com.google.gson.annotations.c("infoBlocks")
    @Y61.k
    private final List<l> infoBlocks;

    @com.google.gson.annotations.c("topBlock")
    @Y61.k
    private final m topBlock;

    public j(@Y61.k Action action, @Y61.k List<i> list, @Y61.k String str, @Y61.k List<l> list2, @Y61.k m mVar) {
        this.action = action;
        this.faqList = list;
        this.faqTitle = str;
        this.infoBlocks = list2;
        this.topBlock = mVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @Y61.k
    public final List<i> b() {
        return this.faqList;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getFaqTitle() {
        return this.faqTitle;
    }

    @Y61.k
    public final List<l> d() {
        return this.infoBlocks;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final m getTopBlock() {
        return this.topBlock;
    }
}
