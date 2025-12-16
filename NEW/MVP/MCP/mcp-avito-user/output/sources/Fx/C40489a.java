package fx;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api3NdTrxSearchParamsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lfx/a;", "", "Lfx/h;", "commissionPromoBanner", "", "Lfx/j;", "locations", "Lfx/k;", "navigation", "Lfx/l;", "searchFilters", "", "showCommissionPromoBanner", "userLocation", "userVerificationPassed", "<init>", "(Lfx/h;Ljava/util/List;Lfx/k;Lfx/l;ZLfx/j;Ljava/lang/Boolean;)V", "Lfx/h;", "a", "()Lfx/h;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lfx/k;", "getNavigation", "()Lfx/k;", "Lfx/l;", "getSearchFilters", "()Lfx/l;", "Z", "getShowCommissionPromoBanner", "()Z", "Lfx/j;", "c", "()Lfx/j;", "Ljava/lang/Boolean;", "getUserVerificationPassed", "()Ljava/lang/Boolean;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40489a {

    @com.google.gson.annotations.c("commissionPromoBanner")
    @Y61.l
    private final h commissionPromoBanner;

    @com.google.gson.annotations.c("locations")
    @Y61.l
    private final List<j> locations;

    @com.google.gson.annotations.c("navigation")
    @Y61.l
    private final k navigation;

    @com.google.gson.annotations.c("searchFilters")
    @Y61.l
    private final l searchFilters;

    @com.google.gson.annotations.c("showCommissionPromoBanner")
    private final boolean showCommissionPromoBanner;

    @com.google.gson.annotations.c("userLocation")
    @Y61.l
    private final j userLocation;

    @com.google.gson.annotations.c("userVerificationPassed")
    @Y61.l
    private final Boolean userVerificationPassed;

    public C40489a(@Y61.l h hVar, @Y61.l List<j> list, @Y61.l k kVar, @Y61.l l lVar, boolean z12, @Y61.l j jVar, @Y61.l Boolean bool) {
        this.commissionPromoBanner = hVar;
        this.locations = list;
        this.navigation = kVar;
        this.searchFilters = lVar;
        this.showCommissionPromoBanner = z12;
        this.userLocation = jVar;
        this.userVerificationPassed = bool;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final h getCommissionPromoBanner() {
        return this.commissionPromoBanner;
    }

    @Y61.l
    public final List<j> b() {
        return this.locations;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final j getUserLocation() {
        return this.userLocation;
    }
}
