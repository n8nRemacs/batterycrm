package KZ;

import kotlin.Metadata;

/* compiled from: ApplicationRealtyObjectDetailsItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LKZ/D;", "LKZ/p;", "", "id", "LKZ/T;", "isAvitoItem", "LKZ/N;", "details", "<init>", "(Ljava/lang/String;LKZ/T;LKZ/N;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LKZ/T;", "d", "()LKZ/T;", "LKZ/N;", "b", "()LKZ/N;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class D implements InterfaceC14286p {

    @com.google.gson.annotations.c("details")
    @Y61.k
    private final N details;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("isAvitoItem")
    @Y61.k
    private final T isAvitoItem;

    public D(@Y61.k String str, @Y61.k T t12, @Y61.k N n12) {
        this.id = str;
        this.isAvitoItem = t12;
        this.details = n12;
    }

    public static D a(D d12, T t12, N n12, int i12) {
        String str = d12.id;
        if ((i12 & 2) != 0) {
            t12 = d12.isAvitoItem;
        }
        return new D(str, t12, n12);
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final N getDetails() {
        return this.details;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final T getIsAvitoItem() {
        return this.isAvitoItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d12 = (D) obj;
        return kotlin.jvm.internal.L.f(this.id, d12.id) && kotlin.jvm.internal.L.f(this.isAvitoItem, d12.isAvitoItem) && kotlin.jvm.internal.L.f(this.details, d12.details);
    }

    public final int hashCode() {
        return this.details.hashCode() + ((this.isAvitoItem.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationRealtyObjectDetailsItemValue(id=" + this.id + ", isAvitoItem=" + this.isAvitoItem + ", details=" + this.details + ')';
    }
}
