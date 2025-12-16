package DG;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: GetGigerSlotsV1Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"LDG/i;", "", "", AddressParameter.TYPE, "LDG/g;", "customerRulesWidget", "date", "endTime", "LDG/h;", "knowledgeWidget", "LDG/f;", "seller", "startTime", "title", "totalPrice", "<init>", "(Ljava/lang/String;LDG/g;Ljava/lang/String;Ljava/lang/String;LDG/h;LDG/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LDG/g;", "getCustomerRulesWidget", "()LDG/g;", "getDate", "b", "LDG/h;", "getKnowledgeWidget", "()LDG/h;", "LDG/f;", "c", "()LDG/f;", "d", "e", "f", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @Y61.k
    private final String address;

    @com.google.gson.annotations.c("customerRulesWidget")
    @Y61.l
    private final g customerRulesWidget;

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final String date;

    @com.google.gson.annotations.c("endTime")
    @Y61.k
    private final String endTime;

    @com.google.gson.annotations.c("knowledgeWidget")
    @Y61.l
    private final h knowledgeWidget;

    @com.google.gson.annotations.c("seller")
    @Y61.k
    private final f seller;

    @com.google.gson.annotations.c("startTime")
    @Y61.k
    private final String startTime;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("totalPrice")
    @Y61.k
    private final String totalPrice;

    public i(@Y61.k String str, @Y61.l g gVar, @Y61.k String str2, @Y61.k String str3, @Y61.l h hVar, @Y61.k f fVar, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6) {
        this.address = str;
        this.customerRulesWidget = gVar;
        this.date = str2;
        this.endTime = str3;
        this.knowledgeWidget = hVar;
        this.seller = fVar;
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
    public final f getSeller() {
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
