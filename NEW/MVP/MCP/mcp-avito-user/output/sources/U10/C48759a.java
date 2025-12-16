package u10;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: Api1MortgageCatalogCalculatorInitialValuesGetResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b)\u0010%R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lu10/a;", "", "Lu10/b;", "byCost", "Lu10/c;", "byPayment", "Lu10/k;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lu10/j;", "disclaimerV2", "", SearchParamsConverterKt.LOCATION_ID, "Lu10/g;", "primaryAction", "", "purposeId", "secondaryAction", "title", "<init>", "(Lu10/b;Lu10/c;Lu10/k;Lu10/j;JLu10/g;Ljava/lang/String;Lu10/g;Ljava/lang/String;)V", "Lu10/b;", "a", "()Lu10/b;", "Lu10/c;", "b", "()Lu10/c;", "Lu10/k;", "getDisclaimer", "()Lu10/k;", "Lu10/j;", "c", "()Lu10/j;", "J", "d", "()J", "Lu10/g;", "e", "()Lu10/g;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48759a {

    @com.google.gson.annotations.c("byCost")
    @Y61.k
    private final C48760b byCost;

    @com.google.gson.annotations.c("byPayment")
    @Y61.k
    private final C48761c byPayment;

    @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @Y61.k
    private final k disclaimer;

    @com.google.gson.annotations.c("disclaimerV2")
    @l
    private final j disclaimerV2;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("primaryAction")
    @Y61.k
    private final g primaryAction;

    @com.google.gson.annotations.c("purposeId")
    @Y61.k
    private final String purposeId;

    @com.google.gson.annotations.c("secondaryAction")
    @l
    private final g secondaryAction;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C48759a(@Y61.k C48760b c48760b, @Y61.k C48761c c48761c, @Y61.k k kVar, @l j jVar, long j12, @Y61.k g gVar, @Y61.k String str, @l g gVar2, @Y61.k String str2) {
        this.byCost = c48760b;
        this.byPayment = c48761c;
        this.disclaimer = kVar;
        this.disclaimerV2 = jVar;
        this.locationId = j12;
        this.primaryAction = gVar;
        this.purposeId = str;
        this.secondaryAction = gVar2;
        this.title = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C48760b getByCost() {
        return this.byCost;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C48761c getByPayment() {
        return this.byPayment;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final j getDisclaimerV2() {
        return this.disclaimerV2;
    }

    /* renamed from: d, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final g getPrimaryAction() {
        return this.primaryAction;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getPurposeId() {
        return this.purposeId;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final g getSecondaryAction() {
        return this.secondaryAction;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
