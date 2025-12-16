package dP;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiResumeCurrentPackageV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"LdP/a;", "", "LdP/b;", "balance", "LdP/c;", "buyAction", "", "id", "", "subtitle", "LdP/d;", "switchPaymentAction", "title", "<init>", "(LdP/b;LdP/c;Ljava/lang/Long;Ljava/lang/String;LdP/d;Ljava/lang/String;)V", "LdP/b;", "a", "()LdP/b;", "LdP/c;", "b", "()LdP/c;", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LdP/d;", "e", "()LdP/d;", "f", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39610a {

    @com.google.gson.annotations.c("balance")
    @l
    private final C39611b balance;

    @com.google.gson.annotations.c("buyAction")
    @k
    private final C39612c buyAction;

    @com.google.gson.annotations.c("id")
    @l
    private final Long id;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("switchPaymentAction")
    @l
    private final C39613d switchPaymentAction;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C39610a(@l C39611b c39611b, @k C39612c c39612c, @l Long l12, @l String str, @l C39613d c39613d, @k String str2) {
        this.balance = c39611b;
        this.buyAction = c39612c;
        this.id = l12;
        this.subtitle = str;
        this.switchPaymentAction = c39613d;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C39611b getBalance() {
        return this.balance;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C39612c getBuyAction() {
        return this.buyAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C39613d getSwitchPaymentAction() {
        return this.switchPaymentAction;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
