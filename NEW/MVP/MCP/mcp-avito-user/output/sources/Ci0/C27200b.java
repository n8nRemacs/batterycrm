package ci0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxBuildingsByBuildingIdSectionsBySectionIdCheckerboardSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lci0/b;", "", "", "floor", "", "Lci0/c;", "lots", "<init>", "(JLjava/util/List;)V", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ci0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27200b {

    @com.google.gson.annotations.c("floor")
    private final long floor;

    @com.google.gson.annotations.c("lots")
    @k
    private final List<C27201c> lots;

    public C27200b(long j12, @k List<C27201c> list) {
        this.floor = j12;
        this.lots = list;
    }

    /* renamed from: a, reason: from getter */
    public final long getFloor() {
        return this.floor;
    }

    @k
    public final List<C27201c> b() {
        return this.lots;
    }
}
