package Yl0;

import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LYl0/N;", "", "LYl0/U;", "contacts", "favorites", "views", "LYl0/O;", "viewsToContactsConversion", "<init>", "(LYl0/U;LYl0/U;LYl0/U;LYl0/O;)V", "LYl0/U;", "a", "()LYl0/U;", "b", "c", "LYl0/O;", "d", "()LYl0/O;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class N {

    @com.google.gson.annotations.c("contacts")
    @Y61.l
    private final U contacts;

    @com.google.gson.annotations.c("favorites")
    @Y61.l
    private final U favorites;

    @com.google.gson.annotations.c("views")
    @Y61.l
    private final U views;

    @com.google.gson.annotations.c("viewsToContactsConversion")
    @Y61.l
    private final O viewsToContactsConversion;

    public N(@Y61.l U u12, @Y61.l U u13, @Y61.l U u14, @Y61.l O o12) {
        this.contacts = u12;
        this.favorites = u13;
        this.views = u14;
        this.viewsToContactsConversion = o12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final U getContacts() {
        return this.contacts;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final U getFavorites() {
        return this.favorites;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final U getViews() {
        return this.views;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final O getViewsToContactsConversion() {
        return this.viewsToContactsConversion;
    }
}
