package Xw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search_impl.generated.api.api_1_nd_trx_mortgage_list_post.MortgageApplicationView;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxMortgageListPostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LXw/a;", "", "", "Lcom/avito/android/developments_agency_search_impl/generated/api/api_1_nd_trx_mortgage_list_post/MortgageApplicationView;", "applications", "LXw/f;", "pageSummary", "<init>", "(Ljava/util/List;LXw/f;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LXw/f;", "b", "()LXw/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17054a {

    @com.google.gson.annotations.c("applications")
    @k
    private final List<MortgageApplicationView> applications;

    @com.google.gson.annotations.c("pageSummary")
    @k
    private final f pageSummary;

    public C17054a(@k List<MortgageApplicationView> list, @k f fVar) {
        this.applications = list;
        this.pageSummary = fVar;
    }

    @k
    public final List<MortgageApplicationView> a() {
        return this.applications;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final f getPageSummary() {
        return this.pageSummary;
    }
}
