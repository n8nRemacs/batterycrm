package cQ0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LcQ0/r;", "", "LcQ0/d;", "button", "carouselEndBtn", "", "LcQ0/q;", "slots", "<init>", "(LcQ0/d;LcQ0/d;Ljava/util/List;)V", "LcQ0/d;", "a", "()LcQ0/d;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final C27088d button;

    @com.google.gson.annotations.c("carouselEndBtn")
    @Y61.l
    private final C27088d carouselEndBtn;

    @com.google.gson.annotations.c("slots")
    @Y61.l
    private final List<q> slots;

    public r(@Y61.l C27088d c27088d, @Y61.l C27088d c27088d2, @Y61.l List<q> list) {
        this.button = c27088d;
        this.carouselEndBtn = c27088d2;
        this.slots = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C27088d getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C27088d getCarouselEndBtn() {
        return this.carouselEndBtn;
    }

    @Y61.l
    public final List<q> c() {
        return this.slots;
    }
}
