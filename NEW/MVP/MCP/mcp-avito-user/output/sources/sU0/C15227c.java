package Su0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: OrdersApi2Response.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LSu0/c;", "", "", "hasReloadButton", "", "message", "", "LSu0/f;", "onInitActions", "status", "LSu0/l;", "tabs", "title", "LSu0/s;", "toolbar", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LSu0/s;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "f", "LSu0/s;", "g", "()LSu0/s;", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Su0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15227c {

    @com.google.gson.annotations.c("hasReloadButton")
    @Y61.l
    private final Boolean hasReloadButton;

    @com.google.gson.annotations.c("message")
    @Y61.l
    private final String message;

    @com.google.gson.annotations.c("onInitActions")
    @Y61.l
    private final List<C15230f> onInitActions;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final String status;

    @com.google.gson.annotations.c("tabs")
    @Y61.l
    private final List<C15236l> tabs;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("toolbar")
    @Y61.l
    private final s toolbar;

    public C15227c(@Y61.l Boolean bool, @Y61.l String str, @Y61.l List<C15230f> list, @Y61.l String str2, @Y61.l List<C15236l> list2, @Y61.l String str3, @Y61.l s sVar) {
        this.hasReloadButton = bool;
        this.message = str;
        this.onInitActions = list;
        this.status = str2;
        this.tabs = list2;
        this.title = str3;
        this.toolbar = sVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Boolean getHasReloadButton() {
        return this.hasReloadButton;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Y61.l
    public final List<C15230f> c() {
        return this.onInitActions;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Y61.l
    public final List<C15236l> e() {
        return this.tabs;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final s getToolbar() {
        return this.toolbar;
    }
}
