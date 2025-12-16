package PQ;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: VacancyCallActionV3Request.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LPQ/d;", "", "", "context", "", "disclaimerPDViewed", "fromPage", "", "vacancyId", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;J)V", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getDisclaimerPDViewed", "()Ljava/lang/Boolean;", "getFromPage", "J", "getVacancyId", "()J", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    @com.google.gson.annotations.c("context")
    @l
    private final String context;

    @com.google.gson.annotations.c("disclaimerPDViewed")
    @l
    private final Boolean disclaimerPDViewed;

    @com.google.gson.annotations.c("fromPage")
    @k
    private final String fromPage;

    @com.google.gson.annotations.c("vacancyId")
    private final long vacancyId;

    public d(@l String str, @l Boolean bool, @k String str2, long j12) {
        this.context = str;
        this.disclaimerPDViewed = bool;
        this.fromPage = str2;
        this.vacancyId = j12;
    }
}
