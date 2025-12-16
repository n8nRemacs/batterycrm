package jP;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiApplyActionV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LjP/e;", "", "", "itemId", "", "location", "title", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    @com.google.gson.annotations.c("itemId")
    @l
    private final Long itemId;

    @com.google.gson.annotations.c("location")
    @k
    private final String location;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@l Long l12, @k String str, @k String str2) {
        this.itemId = l12;
        this.location = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getItemId() {
        return this.itemId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
