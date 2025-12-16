package wG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;

/* compiled from: TransactionUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LwG0/b;", "Lmx0/a;", "", "trxID", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_universal-transaction_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49504b implements InterfaceC44149a {

    @c("trxID")
    @k
    private final String trxID;

    public C49504b(@k String str) {
        this.trxID = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTrxID() {
        return this.trxID;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49504b) && L.f(this.trxID, ((C49504b) obj).trxID);
    }

    public final int hashCode() {
        return this.trxID.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TransactionUpdateEvent(trxID="), this.trxID, ')');
    }
}
