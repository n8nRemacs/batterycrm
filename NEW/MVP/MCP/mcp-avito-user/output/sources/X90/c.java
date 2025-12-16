package x90;

import kotlin.Metadata;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx90/c;", "", "Lx90/b;", "accepted", "performed", "Lx90/d;", "period", "<init>", "(Lx90/b;Lx90/b;Lx90/d;)V", "Lx90/b;", "a", "()Lx90/b;", "b", "Lx90/d;", "c", "()Lx90/d;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    @com.google.gson.annotations.c("accepted")
    @Y61.k
    private final b accepted;

    @com.google.gson.annotations.c("performed")
    @Y61.k
    private final b performed;

    @com.google.gson.annotations.c("period")
    @Y61.k
    private final d period;

    public c(@Y61.k b bVar, @Y61.k b bVar2, @Y61.k d dVar) {
        this.accepted = bVar;
        this.performed = bVar2;
        this.period = dVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final b getAccepted() {
        return this.accepted;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final b getPerformed() {
        return this.performed;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final d getPeriod() {
        return this.period;
    }
}
