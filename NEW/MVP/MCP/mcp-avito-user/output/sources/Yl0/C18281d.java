package Yl0;

import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"LYl0/d;", "", "LYl0/a;", "description", "", "primaryActionTitle", "secondaryActionTitle", "", "showAdvertCounter", "title", "<init>", "(LYl0/a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "LYl0/a;", "a", "()LYl0/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Z", "d", "()Z", "e", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18281d {

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final C18278a description;

    @com.google.gson.annotations.c("primaryActionTitle")
    @Y61.k
    private final String primaryActionTitle;

    @com.google.gson.annotations.c("secondaryActionTitle")
    @Y61.k
    private final String secondaryActionTitle;

    @com.google.gson.annotations.c("showAdvertCounter")
    private final boolean showAdvertCounter;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C18281d(@Y61.k C18278a c18278a, @Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k String str3) {
        this.description = c18278a;
        this.primaryActionTitle = str;
        this.secondaryActionTitle = str2;
        this.showAdvertCounter = z12;
        this.title = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C18278a getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getPrimaryActionTitle() {
        return this.primaryActionTitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getSecondaryActionTitle() {
        return this.secondaryActionTitle;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getShowAdvertCounter() {
        return this.showAdvertCounter;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
