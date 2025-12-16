package Zt0;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2ProfileTransactionsResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"LZt0/a;", "", "LZt0/b;", "action", "LZt0/c;", "allTransactions", "", "badgeTitle", "blockType", "", "LZt0/d;", "items", "subtitle", "<init>", "(LZt0/b;LZt0/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "LZt0/b;", "a", "()LZt0/b;", "LZt0/c;", "b", "()LZt0/c;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getBlockType", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19606a {

    @com.google.gson.annotations.c("action")
    @l
    private final C19607b action;

    @com.google.gson.annotations.c("allTransactions")
    @l
    private final C19608c allTransactions;

    @com.google.gson.annotations.c("badgeTitle")
    @l
    private final String badgeTitle;

    @com.google.gson.annotations.c("blockType")
    @k
    private final String blockType;

    @com.google.gson.annotations.c("items")
    @k
    private final List<C19609d> items;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    public C19606a(@l C19607b c19607b, @l C19608c c19608c, @l String str, @k String str2, @k List<C19609d> list, @l String str3) {
        this.action = c19607b;
        this.allTransactions = c19608c;
        this.badgeTitle = str;
        this.blockType = str2;
        this.items = list;
        this.subtitle = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C19607b getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C19608c getAllTransactions() {
        return this.allTransactions;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getBadgeTitle() {
        return this.badgeTitle;
    }

    @k
    public final List<C19609d> d() {
        return this.items;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }
}
