package ls0;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiLastFiltersSavedTooltipV3Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lls0/b;", "", "", "", "filters", "Lls0/c;", "searchButton", "title", "<init>", "(Ljava/util/List;Lls0/c;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lls0/c;", "b", "()Lls0/c;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ls0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43826b {

    @com.google.gson.annotations.c("filters")
    @k
    private final List<String> filters;

    @com.google.gson.annotations.c("searchButton")
    @k
    private final C43827c searchButton;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C43826b(@k List<String> list, @k C43827c c43827c, @k String str) {
        this.filters = list;
        this.searchButton = c43827c;
        this.title = str;
    }

    @k
    public final List<String> a() {
        return this.filters;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C43827c getSearchButton() {
        return this.searchButton;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
