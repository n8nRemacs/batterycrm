package zk0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddCarToGarageResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzk0/a;", "", "", "code", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito-discouraged_avito-api_spare-parts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C50580a {

    @com.google.gson.annotations.c("code")
    @l
    private final Integer code;

    @com.google.gson.annotations.c("message")
    @l
    private final String message;

    public C50580a(@l Integer num, @l String str) {
        this.code = num;
        this.message = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50580a)) {
            return false;
        }
        C50580a c50580a = (C50580a) obj;
        return L.f(this.code, c50580a.code) && L.f(this.message, c50580a.message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddCarToGarageError(code=");
        sb2.append(this.code);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }
}
