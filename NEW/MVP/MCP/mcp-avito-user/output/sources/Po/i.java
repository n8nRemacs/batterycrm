package PO;

import kotlin.Metadata;

/* compiled from: AppliesCreateV3Request.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LPO/i;", "", "", "context", "customFlowName", "", "disclaimerPDViewed", "fromPage", "", "vacancyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;D)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "getCustomFlowName", "Ljava/lang/Boolean;", "getDisclaimerPDViewed", "()Ljava/lang/Boolean;", "getFromPage", "D", "getVacancyId", "()D", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    @com.google.gson.annotations.c("context")
    @Y61.l
    private final String context;

    @com.google.gson.annotations.c("customFlowName")
    @Y61.l
    private final String customFlowName;

    @com.google.gson.annotations.c("disclaimerPDViewed")
    @Y61.l
    private final Boolean disclaimerPDViewed;

    @com.google.gson.annotations.c("fromPage")
    @Y61.k
    private final String fromPage;

    @com.google.gson.annotations.c("vacancyId")
    private final double vacancyId;

    public i(@Y61.l String str, @Y61.l String str2, @Y61.l Boolean bool, @Y61.k String str3, double d12) {
        this.context = str;
        this.customFlowName = str2;
        this.disclaimerPDViewed = bool;
        this.fromPage = str3;
        this.vacancyId = d12;
    }
}
