package eP;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ApiResumePackagePayCheckoutV1Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LeP/a;", "", "LeP/b;", "action", "LeP/c;", "legal", "LeP/i;", "service", "", "title", "<init>", "(LeP/b;LeP/c;LeP/i;Ljava/lang/String;)V", "LeP/b;", "a", "()LeP/b;", "LeP/c;", "b", "()LeP/c;", "LeP/i;", "c", "()LeP/i;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40033a {

    @com.google.gson.annotations.c("action")
    @k
    private final C40034b action;

    @com.google.gson.annotations.c("legal")
    @l
    private final C40035c legal;

    @com.google.gson.annotations.c("service")
    @k
    private final i service;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C40033a(@k C40034b c40034b, @l C40035c c40035c, @k i iVar, @k String str) {
        this.action = c40034b;
        this.legal = c40035c;
        this.service = iVar;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C40034b getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C40035c getLegal() {
        return this.legal;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final i getService() {
        return this.service;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
