package v70;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GetApiPhoneProtectionInfoBannerResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lv70/b;", "", "Lv70/c;", "moreDetails", "", "text", "title", "<init>", "(Lv70/c;Ljava/lang/String;Ljava/lang/String;)V", "Lv70/c;", "a", "()Lv70/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    @com.google.gson.annotations.c("moreDetails")
    @l
    private final c moreDetails;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@l c cVar, @k String str, @k String str2) {
        this.moreDetails = cVar;
        this.text = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getMoreDetails() {
        return this.moreDetails;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
