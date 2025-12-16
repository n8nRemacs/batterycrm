package Ol0;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetPartCompatibilitiesApiV3Response.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BY\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"LOl0/c;", "", "", "LOl0/e;", "groupings", "", "groupingsExpandText", "", "groupingsLimitCount", "", "showTitleImage", "LOl0/f;", "specifications", "subtitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "getSpecifications", "e", "f", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    @com.google.gson.annotations.c("groupings")
    @l
    private final List<e> groupings;

    @com.google.gson.annotations.c("groupingsExpandText")
    @l
    private final String groupingsExpandText;

    @com.google.gson.annotations.c("groupingsLimitCount")
    @l
    private final Long groupingsLimitCount;

    @com.google.gson.annotations.c("showTitleImage")
    @l
    private final Boolean showTitleImage;

    @com.google.gson.annotations.c("specifications")
    @l
    private final List<f> specifications;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public c(@l List<e> list, @l String str, @l Long l12, @l Boolean bool, @l List<f> list2, @l String str2, @l String str3) {
        this.groupings = list;
        this.groupingsExpandText = str;
        this.groupingsLimitCount = l12;
        this.showTitleImage = bool;
        this.specifications = list2;
        this.subtitle = str2;
        this.title = str3;
    }

    @l
    public final List<e> a() {
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

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
