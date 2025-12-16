package fW0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"LfW0/v;", "", "LfW0/w;", "views", "contact", "active", "spendings", "jobContacts", "calls", "clickPackages", "soldItems", "orderedItems", "<init>", "(LfW0/w;LfW0/w;LfW0/w;LfW0/w;LfW0/w;LfW0/w;LfW0/w;LfW0/w;LfW0/w;)V", "LfW0/w;", "getViews", "()LfW0/w;", "getContact", "getActive", "getSpendings", "getJobContacts", "getCalls", "getClickPackages", "getSoldItems", "getOrderedItems", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class v {

    @com.google.gson.annotations.c("active")
    @Y61.l
    private final w active;

    @com.google.gson.annotations.c("calls")
    @Y61.l
    private final w calls;

    @com.google.gson.annotations.c("clickPackages")
    @Y61.l
    private final w clickPackages;

    @com.google.gson.annotations.c("contacts")
    @Y61.l
    private final w contact;

    @com.google.gson.annotations.c("jobContacts")
    @Y61.l
    private final w jobContacts;

    @com.google.gson.annotations.c("orderedItems")
    @Y61.l
    private final w orderedItems;

    @com.google.gson.annotations.c("soldItems")
    @Y61.l
    private final w soldItems;

    @com.google.gson.annotations.c("spendings")
    @Y61.l
    private final w spendings;

    @com.google.gson.annotations.c("views")
    @Y61.l
    private final w views;

    public v(@Y61.l w wVar, @Y61.l w wVar2, @Y61.l w wVar3, @Y61.l w wVar4, @Y61.l w wVar5, @Y61.l w wVar6, @Y61.l w wVar7, @Y61.l w wVar8, @Y61.l w wVar9) {
        this.views = wVar;
        this.contact = wVar2;
        this.active = wVar3;
        this.spendings = wVar4;
        this.jobContacts = wVar5;
        this.calls = wVar6;
        this.clickPackages = wVar7;
        this.soldItems = wVar8;
        this.orderedItems = wVar9;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.views, vVar.views) && L.f(this.contact, vVar.contact) && L.f(this.active, vVar.active) && L.f(this.spendings, vVar.spendings) && L.f(this.jobContacts, vVar.jobContacts) && L.f(this.calls, vVar.calls) && L.f(this.clickPackages, vVar.clickPackages) && L.f(this.soldItems, vVar.soldItems) && L.f(this.orderedItems, vVar.orderedItems);
    }

    public final int hashCode() {
        w wVar = this.views;
        int iHashCode = (wVar == null ? 0 : wVar.hashCode()) * 31;
        w wVar2 = this.contact;
        int iHashCode2 = (iHashCode + (wVar2 == null ? 0 : wVar2.hashCode())) * 31;
        w wVar3 = this.active;
        int iHashCode3 = (iHashCode2 + (wVar3 == null ? 0 : wVar3.hashCode())) * 31;
        w wVar4 = this.spendings;
        int iHashCode4 = (iHashCode3 + (wVar4 == null ? 0 : wVar4.hashCode())) * 31;
        w wVar5 = this.jobContacts;
        int iHashCode5 = (iHashCode4 + (wVar5 == null ? 0 : wVar5.hashCode())) * 31;
        w wVar6 = this.calls;
        int iHashCode6 = (iHashCode5 + (wVar6 == null ? 0 : wVar6.hashCode())) * 31;
        w wVar7 = this.clickPackages;
        int iHashCode7 = (iHashCode6 + (wVar7 == null ? 0 : wVar7.hashCode())) * 31;
        w wVar8 = this.soldItems;
        int iHashCode8 = (iHashCode7 + (wVar8 == null ? 0 : wVar8.hashCode())) * 31;
        w wVar9 = this.orderedItems;
        return iHashCode8 + (wVar9 != null ? wVar9.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Legend(views=" + this.views + ", contact=" + this.contact + ", active=" + this.active + ", spendings=" + this.spendings + ", jobContacts=" + this.jobContacts + ", calls=" + this.calls + ", clickPackages=" + this.clickPackages + ", soldItems=" + this.soldItems + ", orderedItems=" + this.orderedItems + ')';
    }
}
