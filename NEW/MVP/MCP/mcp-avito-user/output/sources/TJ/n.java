package tJ;

import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.avcalls.call.models.TerminateReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AvCallsTerminateReason.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {
    @Y61.k
    public static final AvCallsTerminateReason a(@Y61.k TerminateReason terminateReason) {
        if (terminateReason instanceof TerminateReason.Hangup) {
            return AvCallsTerminateReason.Hangup.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.Busy) {
            return AvCallsTerminateReason.Busy.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.Reject) {
            return AvCallsTerminateReason.Reject.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.AnswerTimeout) {
            return AvCallsTerminateReason.AnswerTimeout.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.NoMicAccess) {
            return AvCallsTerminateReason.NoMicAccess.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.ConnectTimeout) {
            return AvCallsTerminateReason.ConnectTimeout.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.ServerError) {
            return AvCallsTerminateReason.ServerError.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.InternalError) {
            return AvCallsTerminateReason.InternalError.INSTANCE;
        }
        if (terminateReason instanceof TerminateReason.Unknown) {
            return new AvCallsTerminateReason.Unknown(terminateReason.getReason());
        }
        throw new NoWhenBranchMatchedException();
    }
}
