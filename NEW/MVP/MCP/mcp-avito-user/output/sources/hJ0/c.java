package Hj0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.autoteka.model.AutotekaLink;
import com.avito.android.remote.autoteka.model.AutotekaMiniReport;
import com.avito.android.remote.autoteka.model.AutotekaPreviewStatus;
import com.avito.android.remote.autoteka.model.DiscountBlock;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"LHj0/c;", "LHj0/d;", "LHj0/a;", "Lcom/avito/android/remote/autoteka/model/AutotekaPreviewStatus;", "status", "", "delay", "", "autotekaX", "LHj0/b;", "previewData", "Lcom/avito/android/remote/autoteka/model/AutotekaLink;", "reportExampleLink", "Lcom/avito/android/remote/autoteka/model/DiscountBlock;", "discountBlock", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "purchaseAction", "Lcom/avito/android/remote/autoteka/model/AutotekaMiniReport;", "miniReport", "<init>", "(Lcom/avito/android/remote/autoteka/model/AutotekaPreviewStatus;Ljava/lang/Long;Ljava/lang/String;LHj0/b;Lcom/avito/android/remote/autoteka/model/AutotekaLink;Lcom/avito/android/remote/autoteka/model/DiscountBlock;Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;Lcom/avito/android/remote/autoteka/model/AutotekaMiniReport;)V", "Lcom/avito/android/remote/autoteka/model/AutotekaPreviewStatus;", "i", "()Lcom/avito/android/remote/autoteka/model/AutotekaPreviewStatus;", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LHj0/b;", "f", "()LHj0/b;", "Lcom/avito/android/remote/autoteka/model/AutotekaLink;", "h", "()Lcom/avito/android/remote/autoteka/model/AutotekaLink;", "Lcom/avito/android/remote/autoteka/model/DiscountBlock;", "d", "()Lcom/avito/android/remote/autoteka/model/DiscountBlock;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "g", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "Lcom/avito/android/remote/autoteka/model/AutotekaMiniReport;", "e", "()Lcom/avito/android/remote/autoteka/model/AutotekaMiniReport;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class c implements d, InterfaceC13998a {

    @com.google.gson.annotations.c("x")
    @l
    private final String autotekaX;

    @com.google.gson.annotations.c("retryAfterMs")
    @l
    private final Long delay;

    @com.google.gson.annotations.c("discount")
    @l
    private final DiscountBlock discountBlock;

    @com.google.gson.annotations.c("miniReport")
    @l
    private final AutotekaMiniReport miniReport;

    @com.google.gson.annotations.c(MessageSuggest.PREVIEW)
    @l
    private final b previewData;

    @com.google.gson.annotations.c("autotekaPurchaseAction")
    @l
    private final AutotekaPurchaseAction purchaseAction;

    @com.google.gson.annotations.c("reportExampleUrl")
    @l
    private final AutotekaLink reportExampleLink;

    @com.google.gson.annotations.c("status")
    @k
    private final AutotekaPreviewStatus status;

    public c(@k AutotekaPreviewStatus autotekaPreviewStatus, @l Long l12, @l String str, @l b bVar, @l AutotekaLink autotekaLink, @l DiscountBlock discountBlock, @l AutotekaPurchaseAction autotekaPurchaseAction, @l AutotekaMiniReport autotekaMiniReport) {
        this.status = autotekaPreviewStatus;
        this.delay = l12;
        this.autotekaX = str;
        this.previewData = bVar;
        this.reportExampleLink = autotekaLink;
        this.discountBlock = discountBlock;
        this.purchaseAction = autotekaPurchaseAction;
        this.miniReport = autotekaMiniReport;
    }

    @Override // Hj0.InterfaceC13998a
    @l
    /* renamed from: a, reason: from getter */
    public final Long getDelay() {
        return this.delay;
    }

    @Override // Hj0.d
    /* renamed from: b, reason: from getter */
    public final AutotekaPreviewStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DiscountBlock getDiscountBlock() {
        return this.discountBlock;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AutotekaMiniReport getMiniReport() {
        return this.miniReport;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.status == cVar.status && L.f(this.delay, cVar.delay) && L.f(this.autotekaX, cVar.autotekaX) && L.f(this.previewData, cVar.previewData) && L.f(this.reportExampleLink, cVar.reportExampleLink) && L.f(this.discountBlock, cVar.discountBlock) && L.f(this.purchaseAction, cVar.purchaseAction) && L.f(this.miniReport, cVar.miniReport);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final b getPreviewData() {
        return this.previewData;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AutotekaPurchaseAction getPurchaseAction() {
        return this.purchaseAction;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final AutotekaLink getReportExampleLink() {
        return this.reportExampleLink;
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Long l12 = this.delay;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.autotekaX;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.previewData;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AutotekaLink autotekaLink = this.reportExampleLink;
        int iHashCode5 = (iHashCode4 + (autotekaLink == null ? 0 : autotekaLink.hashCode())) * 31;
        DiscountBlock discountBlock = this.discountBlock;
        int iHashCode6 = (iHashCode5 + (discountBlock == null ? 0 : discountBlock.hashCode())) * 31;
        AutotekaPurchaseAction autotekaPurchaseAction = this.purchaseAction;
        int iHashCode7 = (iHashCode6 + (autotekaPurchaseAction == null ? 0 : autotekaPurchaseAction.hashCode())) * 31;
        AutotekaMiniReport autotekaMiniReport = this.miniReport;
        return iHashCode7 + (autotekaMiniReport != null ? autotekaMiniReport.hashCode() : 0);
    }

    @k
    public final AutotekaPreviewStatus i() {
        return this.status;
    }

    @k
    public final String toString() {
        return "AutotekaPreviewResponse(status=" + this.status + ", delay=" + this.delay + ", autotekaX=" + this.autotekaX + ", previewData=" + this.previewData + ", reportExampleLink=" + this.reportExampleLink + ", discountBlock=" + this.discountBlock + ", purchaseAction=" + this.purchaseAction + ", miniReport=" + this.miniReport + ')';
    }
}
