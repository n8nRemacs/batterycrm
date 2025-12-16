package xL0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiVasVisualV1Response.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"LxL0/a;", "", "LxL0/e;", "appliedServices", "LxL0/f;", "bblFooter", "", "checkoutContext", "LxL0/d;", "helpAction", "selectedActionTitle", "", "LxL0/h;", "services", "skipAction", "title", "<init>", "(LxL0/e;LxL0/f;Ljava/lang/String;LxL0/d;Ljava/lang/String;Ljava/util/List;LxL0/d;Ljava/lang/String;)V", "LxL0/e;", "a", "()LxL0/e;", "LxL0/f;", "b", "()LxL0/f;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LxL0/d;", "d", "()LxL0/d;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "h", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49858a {

    @com.google.gson.annotations.c("appliedServices")
    @l
    private final e appliedServices;

    @com.google.gson.annotations.c("bblFooter")
    @l
    private final f bblFooter;

    @com.google.gson.annotations.c("checkoutContext")
    @Y61.k
    private final String checkoutContext;

    @com.google.gson.annotations.c("helpAction")
    @Y61.k
    private final d helpAction;

    @com.google.gson.annotations.c("selectedActionTitle")
    @Y61.k
    private final String selectedActionTitle;

    @com.google.gson.annotations.c("services")
    @Y61.k
    private final List<h> services;

    @com.google.gson.annotations.c("skipAction")
    @Y61.k
    private final d skipAction;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C49858a(@l e eVar, @l f fVar, @Y61.k String str, @Y61.k d dVar, @Y61.k String str2, @Y61.k List<h> list, @Y61.k d dVar2, @Y61.k String str3) {
        this.appliedServices = eVar;
        this.bblFooter = fVar;
        this.checkoutContext = str;
        this.helpAction = dVar;
        this.selectedActionTitle = str2;
        this.services = list;
        this.skipAction = dVar2;
        this.title = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final e getAppliedServices() {
        return this.appliedServices;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final f getBblFooter() {
        return this.bblFooter;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getCheckoutContext() {
        return this.checkoutContext;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final d getHelpAction() {
        return this.helpAction;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getSelectedActionTitle() {
        return this.selectedActionTitle;
    }

    @Y61.k
    public final List<h> f() {
        return this.services;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final d getSkipAction() {
        return this.skipAction;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
