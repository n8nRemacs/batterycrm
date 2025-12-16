package bp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbp0/i;", "", "", "isEmployee", "", "offerLink", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    @com.google.gson.annotations.c("isEmployee")
    @l
    private final Boolean isEmployee;

    @com.google.gson.annotations.c("offerLink")
    @k
    private final String offerLink;

    public i(@l Boolean bool, @k String str) {
        this.isEmployee = bool;
        this.offerLink = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getOfferLink() {
        return this.offerLink;
    }
}
