package Ht0;

import Y61.l;
import kotlin.Metadata;

/* compiled from: Api2BookingFormResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LHt0/f;", "", "", "landscapeUrl", "portraitUrl", "tabletPortraitUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    @com.google.gson.annotations.c("landscapeUrl")
    @l
    private final String landscapeUrl;

    @com.google.gson.annotations.c("portraitUrl")
    @l
    private final String portraitUrl;

    @com.google.gson.annotations.c("tabletPortraitUrl")
    @l
    private final String tabletPortraitUrl;

    public f(@l String str, @l String str2, @l String str3) {
        this.landscapeUrl = str;
        this.portraitUrl = str2;
        this.tabletPortraitUrl = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getLandscapeUrl() {
        return this.landscapeUrl;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPortraitUrl() {
        return this.portraitUrl;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTabletPortraitUrl() {
        return this.tabletPortraitUrl;
    }
}
