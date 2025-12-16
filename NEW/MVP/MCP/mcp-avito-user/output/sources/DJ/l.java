package DJ;

import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import xQ0.k;

/* compiled from: AvCallsTerminateReason.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l {
    @Y61.k
    public static final AvCallsTerminateReason a(@Y61.k xQ0.k kVar) {
        if (kVar instanceof k.e) {
            return AvCallsTerminateReason.Hangup.INSTANCE;
        }
        if (kVar instanceof k.b) {
            return AvCallsTerminateReason.Busy.INSTANCE;
        }
        if (kVar instanceof k.h) {
            return AvCallsTerminateReason.Reject.INSTANCE;
        }
        if (kVar instanceof k.a) {
            return AvCallsTerminateReason.AnswerTimeout.INSTANCE;
        }
        if (kVar instanceof k.g) {
            return AvCallsTerminateReason.NoMicAccess.INSTANCE;
        }
        if (kVar instanceof k.d) {
            return AvCallsTerminateReason.ConnectTimeout.INSTANCE;
        }
        if (kVar instanceof k.i) {
            return AvCallsTerminateReason.ServerError.INSTANCE;
        }
        if (kVar instanceof k.f) {
            return AvCallsTerminateReason.InternalError.INSTANCE;
        }
        if (kVar instanceof k.j) {
            return new AvCallsTerminateReason.Unknown(((k.j) kVar).f442504b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
