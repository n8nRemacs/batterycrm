package ru.mts.biometry.api.entity.inn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InnData.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/api/entity/inn/InnData;", "", "", "inn", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getStatus", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InnData {

    @c("inn")
    @l
    private final String inn;

    @c("result")
    @l
    private final String status;

    public InnData(@l String str, @l String str2) {
        this.inn = str;
        this.status = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnData)) {
            return false;
        }
        InnData innData = (InnData) obj;
        return L.f(this.inn, innData.inn) && L.f(this.status, innData.status);
    }

    public final int hashCode() {
        String str = this.inn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InnData(inn=");
        sb2.append(this.inn);
        sb2.append(", status=");
        return C22026a.c(sb2, this.status, ')');
    }
}
