package Yl0;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"LYl0/F;", "", "LYl0/j;", "backgroundColor", "", "priceType", "subtitle", "title", "titleColor", ContextActionHandler.Link.URL, "<init>", "(LYl0/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LYl0/j;Ljava/lang/String;)V", "LYl0/j;", "a", "()LYl0/j;", "Ljava/lang/String;", "getPriceType", "()Ljava/lang/String;", "getSubtitle", "b", "c", "getUrl", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F {

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final C18287j backgroundColor;

    @com.google.gson.annotations.c("priceType")
    @Y61.l
    private final String priceType;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleColor")
    @Y61.l
    private final C18287j titleColor;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final String url;

    public F(@Y61.l C18287j c18287j, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l C18287j c18287j2, @Y61.l String str4) {
        this.backgroundColor = c18287j;
        this.priceType = str;
        this.subtitle = str2;
        this.title = str3;
        this.titleColor = c18287j2;
        this.url = str4;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C18287j getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C18287j getTitleColor() {
        return this.titleColor;
    }
}
