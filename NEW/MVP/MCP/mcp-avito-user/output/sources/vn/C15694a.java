package Vn;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1PromoCategoryTreeItemsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"LVn/a;", "", "", "badgeText", "", "contacts", "enabledValue", "favorites", "iconURL", "views", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "d", "e", "f", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15694a {

    @com.google.gson.annotations.c("badgeText")
    @l
    private final String badgeText;

    @com.google.gson.annotations.c("contacts")
    @l
    private final Long contacts;

    @com.google.gson.annotations.c("enabledValue")
    @l
    private final Long enabledValue;

    @com.google.gson.annotations.c("favorites")
    @l
    private final Long favorites;

    @com.google.gson.annotations.c("iconURL")
    @l
    private final String iconURL;

    @com.google.gson.annotations.c("views")
    @l
    private final Long views;

    public C15694a(@l String str, @l Long l12, @l Long l13, @l Long l14, @l String str2, @l Long l15) {
        this.badgeText = str;
        this.contacts = l12;
        this.enabledValue = l13;
        this.favorites = l14;
        this.iconURL = str2;
        this.views = l15;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getContacts() {
        return this.contacts;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getEnabledValue() {
        return this.enabledValue;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getFavorites() {
        return this.favorites;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getIconURL() {
        return this.iconURL;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getViews() {
        return this.views;
    }
}
