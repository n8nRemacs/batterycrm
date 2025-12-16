package com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiSearchPositionPeriodV1Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortDirection;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Asc", "Desc", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SortDirection {

    @c("asc")
    public static final SortDirection Asc;

    @c("desc")
    public static final SortDirection Desc;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SortDirection[] f220348c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f220349d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220350b;

    static {
        SortDirection sortDirection = new SortDirection("Asc", 0, "asc");
        Asc = sortDirection;
        SortDirection sortDirection2 = new SortDirection("Desc", 1, "desc");
        Desc = sortDirection2;
        SortDirection[] sortDirectionArr = {sortDirection, sortDirection2};
        f220348c = sortDirectionArr;
        f220349d = kotlin.enums.c.a(sortDirectionArr);
    }

    private SortDirection(String str, int i12, String str2) {
        this.f220350b = str2;
    }

    public static SortDirection valueOf(String str) {
        return (SortDirection) Enum.valueOf(SortDirection.class, str);
    }

    public static SortDirection[] values() {
        return (SortDirection[]) f220348c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f220350b.toString();
    }
}
