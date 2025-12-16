package kl0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiPublishSellerAddressListResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lkl0/a;", "", "", "Lkl0/b;", "addresses", "", "emptyValueErrorMessage", "esid", "loadErrorText", "", "needSearch", "searchErrorText", "searchPlaceholder", "validationErrorText", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/String;", "getEmptyValueErrorMessage", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "e", "f", "g", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42710a {

    @com.google.gson.annotations.c("addresses")
    @k
    private final List<C42711b> addresses;

    @com.google.gson.annotations.c("emptyValueErrorMessage")
    @l
    private final String emptyValueErrorMessage;

    @com.google.gson.annotations.c("esid")
    @l
    private final String esid;

    @com.google.gson.annotations.c("loadErrorText")
    @l
    private final String loadErrorText;

    @com.google.gson.annotations.c("needSearch")
    @l
    private final Boolean needSearch;

    @com.google.gson.annotations.c("searchErrorText")
    @l
    private final String searchErrorText;

    @com.google.gson.annotations.c("searchPlaceholder")
    @l
    private final String searchPlaceholder;

    @com.google.gson.annotations.c("validationErrorText")
    @l
    private final String validationErrorText;

    public C42710a(@k List<C42711b> list, @l String str, @l String str2, @l String str3, @l Boolean bool, @l String str4, @l String str5, @l String str6) {
        this.addresses = list;
        this.emptyValueErrorMessage = str;
        this.esid = str2;
        this.loadErrorText = str3;
        this.needSearch = bool;
        this.searchErrorText = str4;
        this.searchPlaceholder = str5;
        this.validationErrorText = str6;
    }

    @k
    public final List<C42711b> a() {
        return this.addresses;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getEsid() {
        return this.esid;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getLoadErrorText() {
        return this.loadErrorText;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getNeedSearch() {
        return this.needSearch;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSearchErrorText() {
        return this.searchErrorText;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getValidationErrorText() {
        return this.validationErrorText;
    }
}
