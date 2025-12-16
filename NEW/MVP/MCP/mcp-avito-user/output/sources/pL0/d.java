package Pl0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV4Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"LPl0/d;", "", "", "LPl0/g;", "groupings", "", "groupingsExpandText", "", "groupingsLimitCount", "", "showTitleImage", "subtitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "e", "f", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

    @com.google.gson.annotations.c("groupings")
    @l
    private final List<g> groupings;

    @com.google.gson.annotations.c("groupingsExpandText")
    @l
    private final String groupingsExpandText;

    @com.google.gson.annotations.c("groupingsLimitCount")
    @l
    private final Long groupingsLimitCount;

    @com.google.gson.annotations.c("showTitleImage")
    @l
    private final Boolean showTitleImage;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public d(@l List<g> list, @l String str, @l Long l12, @l Boolean bool, @l String str2, @k String str3) {
        this.groupings = list;
        this.groupingsExpandText = str;
        this.groupingsLimitCount = l12;
        this.showTitleImage = bool;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    public final List<g> a() {
        return this.groupings;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getGroupingsExpandText() {
        return this.groupingsExpandText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getGroupingsLimitCount() {
        return this.groupingsLimitCount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getShowTitleImage() {
        return this.showTitleImage;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
