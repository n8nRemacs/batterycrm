package hP0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: WalletPinCreationResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LhP0/j;", "", "LhP0/g;", "firstError", "secondError", "<init>", "(LhP0/g;LhP0/g;)V", "LhP0/g;", "a", "()LhP0/g;", "b", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {

    @com.google.gson.annotations.c("first_error")
    @Y61.l
    private final g firstError;

    @com.google.gson.annotations.c("second_error")
    @Y61.l
    private final g secondError;

    public j(@Y61.l g gVar, @Y61.l g gVar2) {
        this.firstError = gVar;
        this.secondError = gVar2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final g getFirstError() {
        return this.firstError;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final g getSecondError() {
        return this.secondError;
    }
}
