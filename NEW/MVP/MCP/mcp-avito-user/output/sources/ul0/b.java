package Ul0;

import Y61.k;
import com.avito.android.remote.model.Navigation;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ApiSendFaqSellerSurveyRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B8\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR+\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"LUl0/b;", "", "", "", "LX41/o;", "answers", "", "categoryId", "itemId", Navigation.MICRO_CATEGORY_ID, "<init>", "(Ljava/util/Map;JJJ)V", "Ljava/util/Map;", "getAnswers", "()Ljava/util/Map;", "J", "getCategoryId", "()J", "getItemId", "getMicrocategoryId", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    @com.google.gson.annotations.c("answers")
    @k
    private final Map<String, Object> answers;

    @com.google.gson.annotations.c("categoryId")
    private final long categoryId;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c(Navigation.MICRO_CATEGORY_ID)
    private final long microcategoryId;

    public b(@k Map<String, Object> map, long j12, long j13, long j14) {
        this.answers = map;
        this.categoryId = j12;
        this.itemId = j13;
        this.microcategoryId = j14;
    }
}
