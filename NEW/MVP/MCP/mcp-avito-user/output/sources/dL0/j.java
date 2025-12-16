package Dl0;

import kotlin.Metadata;

/* compiled from: MainShortVideosOnAppV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LDl0/j;", "", "", "isShop", "", "name", "LDl0/k;", "rating", "userKey", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;LDl0/k;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LDl0/k;", "b", "()LDl0/k;", "c", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @com.google.gson.annotations.c("isShop")
    @Y61.l
    private final Boolean isShop;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("rating")
    @Y61.l
    private final k rating;

    @com.google.gson.annotations.c("userKey")
    @Y61.l
    private final String userKey;

    public j(@Y61.l Boolean bool, @Y61.l String str, @Y61.l k kVar, @Y61.l String str2) {
        this.isShop = bool;
        this.name = str;
        this.rating = kVar;
        this.userKey = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final k getRating() {
        return this.rating;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getUserKey() {
        return this.userKey;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
    }
}
