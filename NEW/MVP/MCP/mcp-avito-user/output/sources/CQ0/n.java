package cQ0;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"LcQ0/n;", "", "", AddressParameter.TYPE, "date", "endTime", "LcQ0/m;", "knowledgeWidget", "LcQ0/l;", "seller", "startTime", "title", "totalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LcQ0/m;LcQ0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getDate", "b", "LcQ0/m;", "getKnowledgeWidget", "()LcQ0/m;", "LcQ0/l;", "c", "()LcQ0/l;", "d", "e", "f", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @Y61.k
    private final String address;

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final String date;

    @com.google.gson.annotations.c("endTime")
    @Y61.k
    private final String endTime;

    @com.google.gson.annotations.c("knowledgeWidget")
    @Y61.l
    private final m knowledgeWidget;

    @com.google.gson.annotations.c("seller")
    @Y61.k
    private final l seller;

    @com.google.gson.annotations.c("startTime")
    @Y61.k
    private final String startTime;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("totalPrice")
    @Y61.k
    private final String totalPrice;

    public n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l m mVar, @Y61.k l lVar, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6) {
        this.address = str;
        this.date = str2;
        this.endTime = str3;
        this.knowledgeWidget = mVar;
        this.seller = lVar;
        this.startTime = str4;
        this.title = str5;
        this.totalPrice = str6;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final l getSeller() {
        return this.seller;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }
}
