package XE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1TravelOnboardingGetResponse.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LXE0/a;", "", "LXE0/g;", "analyticsInfo", "LXE0/c;", "buttons", "LXE0/d;", "conditionsBlock", "LXE0/h;", "disclaimerBlock", "LXE0/i;", "headerBlock", "<init>", "(LXE0/g;LXE0/c;LXE0/d;LXE0/h;LXE0/i;)V", "LXE0/g;", "a", "()LXE0/g;", "LXE0/c;", "b", "()LXE0/c;", "LXE0/d;", "c", "()LXE0/d;", "LXE0/h;", "d", "()LXE0/h;", "LXE0/i;", "e", "()LXE0/i;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c("analyticsInfo")
    @k
    private final g analyticsInfo;

    @com.google.gson.annotations.c("buttons")
    @k
    private final c buttons;

    @com.google.gson.annotations.c("conditionsBlock")
    @l
    private final d conditionsBlock;

    @com.google.gson.annotations.c("disclaimerBlock")
    @l
    private final h disclaimerBlock;

    @com.google.gson.annotations.c("headerBlock")
    @l
    private final i headerBlock;

    public a(@k g gVar, @k c cVar, @l d dVar, @l h hVar, @l i iVar) {
        this.analyticsInfo = gVar;
        this.buttons = cVar;
        this.conditionsBlock = dVar;
        this.disclaimerBlock = hVar;
        this.headerBlock = iVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final g getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final c getButtons() {
        return this.buttons;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final d getConditionsBlock() {
        return this.conditionsBlock;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final h getDisclaimerBlock() {
        return this.disclaimerBlock;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final i getHeaderBlock() {
        return this.headerBlock;
    }
}
