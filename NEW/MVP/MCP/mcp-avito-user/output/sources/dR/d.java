package dr;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.ApiButton;
import kotlin.Metadata;

/* compiled from: Api2CompetitorAnalyticsGeneralResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Ldr/d;", "", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButton;", "action", "", "bannerId", "", "closable", "", "description", "title", "<init>", "(Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButton;JZLjava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButton;", "a", "()Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/ApiButton;", "J", "b", "()J", "Z", "c", "()Z", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("action")
    @k
    private final ApiButton action;

    @com.google.gson.annotations.c("bannerId")
    private final long bannerId;

    @com.google.gson.annotations.c("closable")
    private final boolean closable;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public d(@k ApiButton apiButton, long j12, boolean z12, @k String str, @k String str2) {
        this.action = apiButton;
        this.bannerId = j12;
        this.closable = z12;
        this.description = str;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ApiButton getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final long getBannerId() {
        return this.bannerId;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getClosable() {
        return this.closable;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
