package da;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VacancyMarketSalaryWidgetApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lda/a;", "", "", "description", "", "rangeFrom", "rangeTo", "salaryFrom", "salaryTo", "title", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "d", "e", "f", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: da.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C39687a {

    @c("description")
    @l
    private final String description;

    @c("rangeFrom")
    @l
    private final Long rangeFrom;

    @c("rangeTo")
    @l
    private final Long rangeTo;

    @c("salaryFrom")
    @l
    private final Long salaryFrom;

    @c("salaryTo")
    @l
    private final Long salaryTo;

    @c("title")
    @l
    private final String title;

    public C39687a(@l String str, @l Long l12, @l Long l13, @l Long l14, @l Long l15, @l String str2) {
        this.description = str;
        this.rangeFrom = l12;
        this.rangeTo = l13;
        this.salaryFrom = l14;
        this.salaryTo = l15;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getRangeFrom() {
        return this.rangeFrom;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getRangeTo() {
        return this.rangeTo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getSalaryFrom() {
        return this.salaryFrom;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Long getSalaryTo() {
        return this.salaryTo;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
