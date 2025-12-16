package zk0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddCarToGarageResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzk0/b;", "", "", "isSuccess", "Lzk0/a;", "error", "<init>", "(ZLzk0/a;)V", "Z", "b", "()Z", "Lzk0/a;", "a", "()Lzk0/a;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zk0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C50581b {

    @com.google.gson.annotations.c("error")
    @l
    private final C50580a error;

    @com.google.gson.annotations.c("ok")
    private final boolean isSuccess;

    public C50581b(boolean z12, @l C50580a c50580a) {
        this.isSuccess = z12;
        this.error = c50580a;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C50580a getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50581b)) {
            return false;
        }
        C50581b c50581b = (C50581b) obj;
        return this.isSuccess == c50581b.isSuccess && L.f(this.error, c50581b.error);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess) * 31;
        C50580a c50580a = this.error;
        return iHashCode + (c50580a == null ? 0 : c50580a.hashCode());
    }

    @k
    public final String toString() {
        return "AddCarToGarageResponse(isSuccess=" + this.isSuccess + ", error=" + this.error + ')';
    }
}
