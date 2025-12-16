package zF;

import Y61.k;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ShiftApplyInfoV3Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"LzF/f;", "", "", AddressParameter.TYPE, "date", "endTime", "LzF/c;", "seller", "startTime", "title", "totalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LzF/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "LzF/c;", "d", "()LzF/c;", "e", "f", "g", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final String address;

    @com.google.gson.annotations.c("date")
    @k
    private final String date;

    @com.google.gson.annotations.c("endTime")
    @k
    private final String endTime;

    @com.google.gson.annotations.c("seller")
    @k
    private final C50454c seller;

    @com.google.gson.annotations.c("startTime")
    @k
    private final String startTime;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("totalPrice")
    @k
    private final String totalPrice;

    public f(@k String str, @k String str2, @k String str3, @k C50454c c50454c, @k String str4, @k String str5, @k String str6) {
        this.address = str;
        this.date = str2;
        this.endTime = str3;
        this.seller = c50454c;
        this.startTime = str4;
        this.title = str5;
        this.totalPrice = str6;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final C50454c getSeller() {
        return this.seller;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }
}
