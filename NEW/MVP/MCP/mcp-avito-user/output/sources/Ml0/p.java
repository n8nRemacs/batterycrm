package ml0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lml0/p;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "Lml0/b;", "cncData", "", "cptToken", "Lml0/e;", "dbsData", "Lml0/h;", "deliveryData", "Lml0/m;", "includingFeeWidget", "titleSlotId", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lml0/b;Ljava/lang/String;Lml0/e;Lml0/h;Lml0/m;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lml0/b;", "b", "()Lml0/b;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lml0/e;", "d", "()Lml0/e;", "Lml0/h;", "e", "()Lml0/h;", "Lml0/m;", "f", "()Lml0/m;", "g", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {

    @com.google.gson.annotations.c("agreement")
    @Y61.l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("cncData")
    @Y61.l
    private final C44095b cncData;

    @com.google.gson.annotations.c("cptToken")
    @Y61.l
    private final String cptToken;

    @com.google.gson.annotations.c("dbsData")
    @Y61.l
    private final e dbsData;

    @com.google.gson.annotations.c("deliveryData")
    @Y61.l
    private final h deliveryData;

    @com.google.gson.annotations.c("includingFeeWidget")
    @Y61.l
    private final m includingFeeWidget;

    @com.google.gson.annotations.c("titleSlotId")
    @Y61.k
    private final String titleSlotId;

    public p(@Y61.l AttributedText attributedText, @Y61.l C44095b c44095b, @Y61.l String str, @Y61.l e eVar, @Y61.l h hVar, @Y61.l m mVar, @Y61.k String str2) {
        this.agreement = attributedText;
        this.cncData = c44095b;
        this.cptToken = str;
        this.dbsData = eVar;
        this.deliveryData = hVar;
        this.includingFeeWidget = mVar;
        this.titleSlotId = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C44095b getCncData() {
        return this.cncData;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getCptToken() {
        return this.cptToken;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final e getDbsData() {
        return this.dbsData;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final h getDeliveryData() {
        return this.deliveryData;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final m getIncludingFeeWidget() {
        return this.includingFeeWidget;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitleSlotId() {
        return this.titleSlotId;
    }
}
