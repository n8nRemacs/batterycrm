package wP;

import kotlin.Metadata;

/* compiled from: ApiPaidCvGetCvsRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LwP/j;", "", "LwP/c;", "chipsFilter", "LwP/d;", "datetimeFilter", "LwP/g;", "intervalFilter", "LwP/h;", "multiselectFilter", "LwP/l;", "selectFilter", "", "slug", "LwP/m;", "switcherFilter", "<init>", "(LwP/c;LwP/d;LwP/g;LwP/h;LwP/l;Ljava/lang/String;LwP/m;)V", "LwP/c;", "a", "()LwP/c;", "LwP/d;", "b", "()LwP/d;", "LwP/g;", "c", "()LwP/g;", "LwP/h;", "d", "()LwP/h;", "LwP/l;", "e", "()LwP/l;", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "LwP/m;", "f", "()LwP/m;", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    @com.google.gson.annotations.c("chipsFilter")
    @Y61.l
    private final C49548c chipsFilter;

    @com.google.gson.annotations.c("datetimeFilter")
    @Y61.l
    private final d datetimeFilter;

    @com.google.gson.annotations.c("intervalFilter")
    @Y61.l
    private final g intervalFilter;

    @com.google.gson.annotations.c("multiselectFilter")
    @Y61.l
    private final h multiselectFilter;

    @com.google.gson.annotations.c("selectFilter")
    @Y61.l
    private final l selectFilter;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("switcherFilter")
    @Y61.l
    private final m switcherFilter;

    public j(@Y61.l C49548c c49548c, @Y61.l d dVar, @Y61.l g gVar, @Y61.l h hVar, @Y61.l l lVar, @Y61.k String str, @Y61.l m mVar) {
        this.chipsFilter = c49548c;
        this.datetimeFilter = dVar;
        this.intervalFilter = gVar;
        this.multiselectFilter = hVar;
        this.selectFilter = lVar;
        this.slug = str;
        this.switcherFilter = mVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C49548c getChipsFilter() {
        return this.chipsFilter;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final d getDatetimeFilter() {
        return this.datetimeFilter;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getIntervalFilter() {
        return this.intervalFilter;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final h getMultiselectFilter() {
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
