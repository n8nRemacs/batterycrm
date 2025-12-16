package eP;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ApiResumePackagePayCheckoutV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"LeP/j;", "", "", "id", "", "price", "priceValue", "size", "title", "<init>", "(JLjava/lang/String;JJLjava/lang/String;)V", "J", "a", "()J", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("price")
    @k
    private final String price;

    @com.google.gson.annotations.c("priceValue")
    private final long priceValue;

    @com.google.gson.annotations.c("size")
    private final long size;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public j(long j12, @k String str, long j13, long j14, @k String str2) {
        this.id = j12;
        this.price = str;
        this.priceValue = j13;
        this.size = j14;
        this.title = str2;
    }

    /* renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: c, reason: from getter */
    public final long getPriceValue() {
        return this.priceValue;
    }

    /* renamed from: d, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
