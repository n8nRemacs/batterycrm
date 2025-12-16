package Ik0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ApicoNotificationSearchResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001BR\u0012\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR-\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"LIk0/a;", "", "", "", "LX41/o;", "analyticParams", "", "date", "description", "id", "", "isRead", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/util/Map;JLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Z", "g", "()Z", "e", "f", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ik0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C14122a {

    @com.google.gson.annotations.c("analyticParams")
    @l
    private final Map<String, Object> analyticParams;

    @com.google.gson.annotations.c("date")
    private final long date;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isRead")
    private final boolean isRead;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    public C14122a(@l Map<String, Object> map, long j12, @k String str, @k String str2, boolean z12, @k String str3, @k String str4) {
        this.analyticParams = map;
        this.date = j12;
        this.description = str;
        this.id = str2;
        this.isRead = z12;
        this.title = str3;
        this.uri = str4;
    }

    @l
    public final Map<String, Object> a() {
        return this.analyticParams;
    }

    /* renamed from: b, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }
}
