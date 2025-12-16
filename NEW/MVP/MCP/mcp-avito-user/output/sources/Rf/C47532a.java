package rF;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiLocationDistrictsV3Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LrF/a;", "", "", "LrF/b;", "districts", "LrF/c;", "regions", "", "shouldShowNewUI", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47532a {

    @com.google.gson.annotations.c("districts")
    @k
    private final List<C47533b> districts;

    @com.google.gson.annotations.c("regions")
    @l
    private final List<C47534c> regions;

    @com.google.gson.annotations.c("shouldShowNewUI")
    @l
    private final Boolean shouldShowNewUI;

    public C47532a(@k List<C47533b> list, @l List<C47534c> list2, @l Boolean bool) {
        this.districts = list;
        this.regions = list2;
        this.shouldShowNewUI = bool;
    }

    @k
    public final List<C47533b> a() {
        return this.districts;
    }

    @l
    public final List<C47534c> b() {
        return this.regions;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getShouldShowNewUI() {
        return this.shouldShowNewUI;
    }
}
