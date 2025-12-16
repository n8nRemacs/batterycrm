package cg;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetDetailedSpecsGroupsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcg/b;", "", "", "Lcg/a;", "groups", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27188b {

    @com.google.gson.annotations.c("groups")
    @l
    private final List<C27187a> groups;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C27188b(@l List<C27187a> list, @l String str) {
        this.groups = list;
        this.title = str;
    }

    @l
    public final List<C27187a> a() {
        return this.groups;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
