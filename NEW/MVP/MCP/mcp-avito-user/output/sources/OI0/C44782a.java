package oi0;

import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxSuggestLocationPostResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Loi0/a;", "", "", "Loi0/b;", "recentLocations", "suggestLocations", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oi0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44782a {

    @c("recentLocations")
    @l
    private final List<C44783b> recentLocations;

    @c("suggestLocations")
    @l
    private final List<C44783b> suggestLocations;

    public C44782a(@l List<C44783b> list, @l List<C44783b> list2) {
        this.recentLocations = list;
        this.suggestLocations = list2;
    }

    @l
    public final List<C44783b> a() {
        return this.recentLocations;
    }

    @l
    public final List<C44783b> b() {
        return this.suggestLocations;
    }
}
