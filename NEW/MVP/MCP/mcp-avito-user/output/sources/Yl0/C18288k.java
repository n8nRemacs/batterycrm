package Yl0;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LYl0/k;", "", "LYl0/e;", "actionsInfo", "", "LYl0/l;", "list", "", "nextPageOffset", "", "totalCount", "<init>", "(LYl0/e;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "LYl0/e;", "a", "()LYl0/e;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yl0.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18288k {

    @com.google.gson.annotations.c("actionsInfo")
    @Y61.l
    private final C18282e actionsInfo;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<InterfaceC18289l> list;

    @com.google.gson.annotations.c("nextPageOffset")
    @Y61.l
    private final String nextPageOffset;

    @com.google.gson.annotations.c("totalCount")
    @Y61.l
    private final Long totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public C18288k(@Y61.l C18282e c18282e, @Y61.k List<? extends InterfaceC18289l> list, @Y61.l String str, @Y61.l Long l12) {
        this.actionsInfo = c18282e;
        this.list = list;
        this.nextPageOffset = str;
        this.totalCount = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C18282e getActionsInfo() {
        return this.actionsInfo;
    }

    @Y61.k
    public final List<InterfaceC18289l> b() {
        return this.list;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getNextPageOffset() {
        return this.nextPageOffset;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getTotalCount() {
        return this.totalCount;
    }
}
