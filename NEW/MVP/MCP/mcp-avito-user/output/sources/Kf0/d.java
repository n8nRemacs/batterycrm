package kF0;

import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2StrBookingPaymentTypesGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LkF0/d;", "", "", "childRows", "", "defaultCollapsed", "", "hint", "id", "LkF0/b;", "item", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;LkF0/b;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getId", "LkF0/b;", "d", "()LkF0/b;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("childRows")
    @l
    private final List<d> childRows;

    @com.google.gson.annotations.c("defaultCollapsed")
    @l
    private final Boolean defaultCollapsed;

    @com.google.gson.annotations.c("hint")
    @l
    private final String hint;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("item")
    @Y61.k
    private final b item;

    public d(@l List<d> list, @l Boolean bool, @l String str, @Y61.k String str2, @Y61.k b bVar) {
        this.childRows = list;
        this.defaultCollapsed = bool;
        this.hint = str;
        this.id = str2;
        this.item = bVar;
    }

    @l
    public final List<d> a() {
        return this.childRows;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getDefaultCollapsed() {
        return this.defaultCollapsed;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final b getItem() {
        return this.item;
    }
}
