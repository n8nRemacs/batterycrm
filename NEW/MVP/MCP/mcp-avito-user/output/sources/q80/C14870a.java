package Q80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1.ApiButtonOptional;
import kotlin.Metadata;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LQ80/a;", "", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ApiButtonOptional;", "button", "", "closable", "", "description", "id", "title", "<init>", "(Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ApiButtonOptional;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ApiButtonOptional;", "a", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ApiButtonOptional;", "Z", "b", "()Z", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Q80.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14870a {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final ApiButtonOptional button;

    @com.google.gson.annotations.c("closable")
    private final boolean closable;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14870a(@Y61.l ApiButtonOptional apiButtonOptional, boolean z12, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.button = apiButtonOptional;
        this.closable = z12;
        this.description = str;
        this.id = str2;
        this.title = str3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ApiButtonOptional getButton() {
        return this.button;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getClosable() {
        return this.closable;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
