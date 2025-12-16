package uP;

import kotlin.Metadata;

/* compiled from: ApiGetFavoritesRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LuP/k;", "", "LuP/c;", "chipsFilter", "LuP/d;", "datetimeFilter", "LuP/h;", "intervalFilter", "LuP/i;", "multiselectFilter", "LuP/l;", "selectFilter", "", "slug", "LuP/m;", "switcherFilter", "<init>", "(LuP/c;LuP/d;LuP/h;LuP/i;LuP/l;Ljava/lang/String;LuP/m;)V", "LuP/c;", "a", "()LuP/c;", "LuP/d;", "b", "()LuP/d;", "LuP/h;", "c", "()LuP/h;", "LuP/i;", "d", "()LuP/i;", "LuP/l;", "e", "()LuP/l;", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "LuP/m;", "f", "()LuP/m;", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {

    @com.google.gson.annotations.c("chipsFilter")
    @Y61.l
    private final C48928c chipsFilter;

    @com.google.gson.annotations.c("datetimeFilter")
    @Y61.l
    private final C48929d datetimeFilter;

    @com.google.gson.annotations.c("intervalFilter")
    @Y61.l
    private final h intervalFilter;

    @com.google.gson.annotations.c("multiselectFilter")
    @Y61.l
    private final i multiselectFilter;

    @com.google.gson.annotations.c("selectFilter")
    @Y61.l
    private final l selectFilter;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("switcherFilter")
    @Y61.l
    private final m switcherFilter;

    public k(@Y61.l C48928c c48928c, @Y61.l C48929d c48929d, @Y61.l h hVar, @Y61.l i iVar, @Y61.l l lVar, @Y61.k String str, @Y61.l m mVar) {
        this.chipsFilter = c48928c;
        this.datetimeFilter = c48929d;
        this.intervalFilter = hVar;
        this.multiselectFilter = iVar;
        this.selectFilter = lVar;
        this.slug = str;
        this.switcherFilter = mVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C48928c getChipsFilter() {
        return this.chipsFilter;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C48929d getDatetimeFilter() {
        return this.datetimeFilter;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final h getIntervalFilter() {
        return this.intervalFilter;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final i getMultiselectFilter() {
        return this.multiselectFilter;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final l getSelectFilter() {
        return this.selectFilter;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final m getSwitcherFilter() {
        return this.switcherFilter;
    }
}
