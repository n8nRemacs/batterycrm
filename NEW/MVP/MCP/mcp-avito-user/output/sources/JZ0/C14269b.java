package Jz0;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersCalendarBookingsPostResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJz0/b;", "", "", "bookingId", "LJz0/c;", DateRangeParameter.TYPE, "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LJz0/d;", "tagInfo", "<init>", "(Ljava/lang/String;LJz0/c;Lcom/avito/android/deep_linking/links/DeepLink;LJz0/d;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LJz0/c;", "b", "()LJz0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LJz0/d;", "d", "()LJz0/d;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14269b {

    @com.google.gson.annotations.c("bookingId")
    @k
    private final String bookingId;

    @com.google.gson.annotations.c(DateRangeParameter.TYPE)
    @k
    private final c dateRange;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("tagInfo")
    @k
    private final d tagInfo;

    public C14269b(@k String str, @k c cVar, @k DeepLink deepLink, @k d dVar) {
        this.bookingId = str;
        this.dateRange = cVar;
        this.deeplink = deepLink;
        this.tagInfo = dVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final c getDateRange() {
        return this.dateRange;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final d getTagInfo() {
        return this.tagInfo;
    }
}
