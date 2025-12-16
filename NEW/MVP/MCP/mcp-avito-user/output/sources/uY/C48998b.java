package uY;

import Y61.k;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import kotlin.Metadata;

/* compiled from: Api2NewDevelopmentsCatalogBuildingsByDevelopmentIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LuY/b;", "", "", "buildingId", "LuY/c;", RequestReviewResultKt.INFO_TYPE, "<init>", "(JLuY/c;)V", "J", "a", "()J", "LuY/c;", "b", "()LuY/c;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48998b {

    @com.google.gson.annotations.c("buildingId")
    private final long buildingId;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final C48999c info;

    public C48998b(long j12, @k C48999c c48999c) {
        this.buildingId = j12;
        this.info = c48999c;
    }

    /* renamed from: a, reason: from getter */
    public final long getBuildingId() {
        return this.buildingId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C48999c getInfo() {
        return this.info;
    }
}
