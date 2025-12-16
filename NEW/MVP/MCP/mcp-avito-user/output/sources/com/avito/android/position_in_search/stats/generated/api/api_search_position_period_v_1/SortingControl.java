package com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl$Direction;", "direction", "", "slug", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl$Direction;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl$Direction;", "b", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl$Direction;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Direction", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SortingControl {

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("direction")
    @k
    private final Direction direction;

    @c("slug")
    @k
    private final String slug;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiSearchPositionPeriodV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/SortingControl$Direction;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Asc", "Desc", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        @c("asc")
        public static final Direction Asc;

        @c("desc")
        public static final Direction Desc;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f220351b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f220352c;

        static {
            Direction direction = new Direction("Asc", 0, "asc");
            Asc = direction;
            Direction direction2 = new Direction("Desc", 1, "desc");
            Desc = direction2;
            Direction[] directionArr = {direction, direction2};
            f220351b = directionArr;
            f220352c = kotlin.enums.c.a(directionArr);
        }

        private Direction(String str, int i12, String str2) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f220351b.clone();
        }
    }

    public SortingControl(@k DeepLink deepLink, @k Direction direction, @k String str, @k String str2) {
        this.deepLink = deepLink;
        this.direction = direction;
        this.slug = str;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
