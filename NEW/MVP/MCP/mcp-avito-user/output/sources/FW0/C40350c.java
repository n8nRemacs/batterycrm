package fW0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamics.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b'\u0010\"R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b(\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b)\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b*\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b.\u0010\"R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b\u0016\u00103R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b4\u0010\u001f¨\u00065"}, d2 = {"LfW0/c;", "", "Ljava/util/Date;", "date", "", "dateTitle", "", "views", "contact", "active", "spendings", "jobContacts", "calls", "clickPackages", "orderedItems", "soldItems", "Lcom/avito/android/deep_linking/links/DeepLink;", "vas", "vasBonuses", "", "vasCount", "", "isWeekend", "xLabel", "<init>", "(Ljava/util/Date;Ljava/lang/String;FFFFFFFFFLcom/avito/android/deep_linking/links/DeepLink;FIZLjava/lang/String;)V", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "Ljava/lang/String;", "getDateTitle", "()Ljava/lang/String;", "F", "getViews", "()F", "getContact", "getActive", "getSpendings", "getJobContacts", "getCalls", "getClickPackages", "getOrderedItems", "getSoldItems", "Lcom/avito/android/deep_linking/links/DeepLink;", "getVas", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getVasBonuses", "I", "getVasCount", "()I", "Z", "()Z", "getXLabel", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40350c {

    @com.google.gson.annotations.c("active")
    private final float active;

    @com.google.gson.annotations.c("calls")
    private final float calls;

    @com.google.gson.annotations.c("clickPackages")
    private final float clickPackages;

    @com.google.gson.annotations.c("contacts")
    private final float contact;

    @com.google.gson.annotations.c("date")
    @Y61.k
    private final Date date;

    @com.google.gson.annotations.c("dateTitle")
    @Y61.k
    private final String dateTitle;

    @com.google.gson.annotations.c("isWeekend")
    private final boolean isWeekend;

    @com.google.gson.annotations.c("jobContacts")
    private final float jobContacts;

    @com.google.gson.annotations.c("orderedItems")
    private final float orderedItems;

    @com.google.gson.annotations.c("soldItems")
    private final float soldItems;

    @com.google.gson.annotations.c("spendings")
    private final float spendings;

    @com.google.gson.annotations.c("vas")
    @Y61.k
    private final DeepLink vas;

    @com.google.gson.annotations.c("vasBonuses")
    private final float vasBonuses;

    @com.google.gson.annotations.c("vasCount")
    private final int vasCount;

    @com.google.gson.annotations.c("views")
    private final float views;

    @com.google.gson.annotations.c("xLabel")
    @Y61.l
    private final String xLabel;

    public C40350c(@Y61.k Date date, @Y61.k String str, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, @Y61.k DeepLink deepLink, float f23, int i12, boolean z12, @Y61.l String str2) {
        this.date = date;
        this.dateTitle = str;
        this.views = f12;
        this.contact = f13;
        this.active = f14;
        this.spendings = f15;
        this.jobContacts = f16;
        this.calls = f17;
        this.clickPackages = f18;
        this.orderedItems = f19;
        this.soldItems = f22;
        this.vas = deepLink;
        this.vasBonuses = f23;
        this.vasCount = i12;
        this.isWeekend = z12;
        this.xLabel = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40350c)) {
            return false;
        }
        C40350c c40350c = (C40350c) obj;
        return L.f(this.date, c40350c.date) && L.f(this.dateTitle, c40350c.dateTitle) && Float.compare(this.views, c40350c.views) == 0 && Float.compare(this.contact, c40350c.contact) == 0 && Float.compare(this.active, c40350c.active) == 0 && Float.compare(this.spendings, c40350c.spendings) == 0 && Float.compare(this.jobContacts, c40350c.jobContacts) == 0 && Float.compare(this.calls, c40350c.calls) == 0 && Float.compare(this.clickPackages, c40350c.clickPackages) == 0 && Float.compare(this.orderedItems, c40350c.orderedItems) == 0 && Float.compare(this.soldItems, c40350c.soldItems) == 0 && L.f(this.vas, c40350c.vas) && Float.compare(this.vasBonuses, c40350c.vasBonuses) == 0 && this.vasCount == c40350c.vasCount && this.isWeekend == c40350c.isWeekend && L.f(this.xLabel, c40350c.xLabel);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.vasCount, androidx.appcompat.app.r.d(this.vasBonuses, com.avito.android.actions_sheet.a.e(this.vas, androidx.appcompat.app.r.d(this.soldItems, androidx.appcompat.app.r.d(this.orderedItems, androidx.appcompat.app.r.d(this.clickPackages, androidx.appcompat.app.r.d(this.calls, androidx.appcompat.app.r.d(this.jobContacts, androidx.appcompat.app.r.d(this.spendings, androidx.appcompat.app.r.d(this.active, androidx.appcompat.app.r.d(this.contact, androidx.appcompat.app.r.d(this.views, H.d(this.date.hashCode() * 31, 31, this.dateTitle), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.isWeekend);
        String str = this.xLabel;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartItem(date=");
        sb2.append(this.date);
        sb2.append(", dateTitle=");
        sb2.append(this.dateTitle);
        sb2.append(", views=");
        sb2.append(this.views);
        sb2.append(", contact=");
        sb2.append(this.contact);
        sb2.append(", active=");
        sb2.append(this.active);
        sb2.append(", spendings=");
        sb2.append(this.spendings);
        sb2.append(", jobContacts=");
        sb2.append(this.jobContacts);
        sb2.append(", calls=");
        sb2.append(this.calls);
        sb2.append(", clickPackages=");
        sb2.append(this.clickPackages);
        sb2.append(", orderedItems=");
        sb2.append(this.orderedItems);
        sb2.append(", soldItems=");
        sb2.append(this.soldItems);
        sb2.append(", vas=");
        sb2.append(this.vas);
        sb2.append(", vasBonuses=");
        sb2.append(this.vasBonuses);
        sb2.append(", vasCount=");
        sb2.append(this.vasCount);
        sb2.append(", isWeekend=");
        sb2.append(this.isWeekend);
        sb2.append(", xLabel=");
        return C22026a.c(sb2, this.xLabel, ')');
    }
}
