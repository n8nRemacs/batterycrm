package hL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiVasAutoprolongV1Response.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LhL0/a;", "", "LhL0/d;", "actions", "", "externalId", "LhL0/e;", "navBar", "", "planningInfo", "price", "registryId", "LhL0/f;", "serviceSection", "title", "LhL0/g;", "toggleSection", "<init>", "(LhL0/d;JLhL0/e;Ljava/lang/String;JJLhL0/f;Ljava/lang/String;LhL0/g;)V", "LhL0/d;", "a", "()LhL0/d;", "J", "b", "()J", "LhL0/e;", "c", "()LhL0/e;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "LhL0/f;", "g", "()LhL0/f;", "h", "LhL0/g;", "i", "()LhL0/g;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40846a {

    @com.google.gson.annotations.c("actions")
    @k
    private final d actions;

    @com.google.gson.annotations.c("externalId")
    private final long externalId;

    @com.google.gson.annotations.c("navBar")
    @k
    private final e navBar;

    @com.google.gson.annotations.c("planningInfo")
    @l
    private final String planningInfo;

    @com.google.gson.annotations.c("price")
    private final long price;

    @com.google.gson.annotations.c("registryId")
    private final long registryId;

    @com.google.gson.annotations.c("serviceSection")
    @k
    private final f serviceSection;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("toggleSection")
    @l
    private final g toggleSection;

    public C40846a(@k d dVar, long j12, @k e eVar, @l String str, long j13, long j14, @k f fVar, @k String str2, @l g gVar) {
        this.actions = dVar;
        this.externalId = j12;
        this.navBar = eVar;
        this.planningInfo = str;
        this.price = j13;
        this.registryId = j14;
        this.serviceSection = fVar;
        this.title = str2;
        this.toggleSection = gVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final d getActions() {
        return this.actions;
    }

    /* renamed from: b, reason: from getter */
    public final long getExternalId() {
        return this.externalId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final e getNavBar() {
        return this.navBar;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getPlanningInfo() {
        return this.planningInfo;
    }

    /* renamed from: e, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    /* renamed from: f, reason: from getter */
    public final long getRegistryId() {
        return this.registryId;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final f getServiceSection() {
        return this.serviceSection;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final g getToggleSection() {
        return this.toggleSection;
    }
}
