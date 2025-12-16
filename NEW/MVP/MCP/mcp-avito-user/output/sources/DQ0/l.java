package dQ0;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: GetProfileAppliesToVacancyV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"LdQ0/l;", "", "LdQ0/m;", "action", "", "description", "LdQ0/o;", "icon", "", "id", "LdQ0/p;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LdQ0/m;Ljava/lang/String;LdQ0/o;JLdQ0/p;Ljava/lang/String;Ljava/lang/String;)V", "LdQ0/m;", "getAction", "()LdQ0/m;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "LdQ0/o;", "getIcon", "()LdQ0/o;", "J", "getId", "()J", "LdQ0/p;", "a", "()LdQ0/p;", "b", "c", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final m action;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final o icon;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.k
    private final p style;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final String uri;

    public l(@Y61.l m mVar, @Y61.l String str, @Y61.l o oVar, long j12, @Y61.k p pVar, @Y61.k String str2, @Y61.l String str3) {
        this.action = mVar;
        this.description = str;
        this.icon = oVar;
        this.id = j12;
        this.style = pVar;
        this.title = str2;
        this.uri = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final p getStyle() {
        return this.style;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
