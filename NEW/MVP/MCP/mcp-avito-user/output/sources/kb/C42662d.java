package kb;

import Y61.l;
import kotlin.Metadata;

/* compiled from: ViewsStat.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkb/d;", "", "", "views", "vasViews", "contacts", "favorites", "<init>", "(ILjava/lang/Integer;II)V", "I", "d", "()I", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "a", "b", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kb.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C42662d {

    @com.google.gson.annotations.c("contacts")
    private final int contacts;

    @com.google.gson.annotations.c("favorites")
    private final int favorites;

    @com.google.gson.annotations.c("vasViews")
    @l
    private final Integer vasViews;

    @com.google.gson.annotations.c("views")
    private final int views;

    public C42662d(int i12, @l Integer num, int i13, int i14) {
        this.views = i12;
        this.vasViews = num;
        this.contacts = i13;
        this.favorites = i14;
    }

    /* renamed from: a, reason: from getter */
    public final int getContacts() {
        return this.contacts;
    }

    /* renamed from: b, reason: from getter */
    public final int getFavorites() {
        return this.favorites;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getVasViews() {
        return this.vasViews;
    }

    /* renamed from: d, reason: from getter */
    public final int getViews() {
        return this.views;
    }
}
