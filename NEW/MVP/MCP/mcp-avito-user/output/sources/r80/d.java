package R80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_v_1.ApiButtonOptional;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LR80/d;", "", "LR80/a;", "item", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_v_1/ApiButtonOptional;", "leftButton", "rightButton", "<init>", "(LR80/a;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_v_1/ApiButtonOptional;Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_v_1/ApiButtonOptional;)V", "LR80/a;", "a", "()LR80/a;", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_v_1/ApiButtonOptional;", "b", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_v_1/ApiButtonOptional;", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    @com.google.gson.annotations.c("item")
    @k
    private final a item;

    @com.google.gson.annotations.c("leftButton")
    @l
    private final ApiButtonOptional leftButton;

    @com.google.gson.annotations.c("rightButton")
    @l
    private final ApiButtonOptional rightButton;

    public d(@k a aVar, @l ApiButtonOptional apiButtonOptional, @l ApiButtonOptional apiButtonOptional2) {
        this.item = aVar;
        this.leftButton = apiButtonOptional;
        this.rightButton = apiButtonOptional2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getItem() {
        return this.item;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiButtonOptional getLeftButton() {
        return this.leftButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ApiButtonOptional getRightButton() {
        return this.rightButton;
    }
}
