package kP;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiGetFiltersV5Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LkP/h;", "", "", "id", "", "LkP/f;", "options", "LkP/g;", "selectedOption", "title", "LkP/m;", "widget", "<init>", "(Ljava/lang/String;Ljava/util/List;LkP/g;Ljava/lang/String;LkP/m;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LkP/g;", "c", "()LkP/g;", "d", "LkP/m;", "e", "()LkP/m;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("options")
    @Y61.l
    private final List<f> options;

    @com.google.gson.annotations.c("selectedOption")
    @Y61.l
    private final g selectedOption;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("widget")
    @Y61.k
    private final m widget;

    public h(@Y61.k String str, @Y61.l List<f> list, @Y61.l g gVar, @Y61.k String str2, @Y61.k m mVar) {
        this.id = str;
        this.options = list;
        this.selectedOption = gVar;
        this.title = str2;
        this.widget = mVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<f> b() {
        return this.options;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getSelectedOption() {
        return this.selectedOption;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final m getWidget() {
        return this.widget;
    }
}
