package cQ0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LcQ0/k;", "", "LcQ0/f;", "moreButton", "", "LcQ0/g;", "motivations", "<init>", "(LcQ0/f;Ljava/util/List;)V", "LcQ0/f;", "a", "()LcQ0/f;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    @com.google.gson.annotations.c("moreButton")
    @Y61.l
    private final f moreButton;

    @com.google.gson.annotations.c("motivations")
    @Y61.l
    private final List<g> motivations;

    public k(@Y61.l f fVar, @Y61.l List<g> list) {
        this.moreButton = fVar;
        this.motivations = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final f getMoreButton() {
        return this.moreButton;
    }

    @Y61.l
    public final List<g> b() {
        return this.motivations;
    }
}
