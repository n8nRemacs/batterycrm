package yJ;

import Y61.l;
import com.avito.avcalls.logger.LogSeverity;
import com.avito.avcalls.logger.b;
import com.avito.avcalls.logger.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import yJ.C50121b;

/* compiled from: LoggableImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyJ/a;", "Lorg/webrtc/Loggable;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50120a implements Loggable {
    @Override // org.webrtc.Loggable
    public final void onLogMessage(@l String str, @l Logging.Severity severity, @l String str2) {
        LogSeverity logSeverity;
        if (str == null) {
            return;
        }
        com.avito.avcalls.logger.b.INSTANCE.getClass();
        f fVar = b.Companion.f332946b;
        if (fVar != null) {
            if (str2 == null) {
                str2 = "DEFAULT";
            }
            C50121b c50121b = C50121b.f443025a;
            if (severity == null) {
                severity = Logging.Severity.LS_INFO;
            }
            c50121b.getClass();
            int i12 = C50121b.a.f443026a[severity.ordinal()];
            if (i12 == 1) {
                logSeverity = LogSeverity.f332936c;
            } else if (i12 == 2) {
                logSeverity = LogSeverity.f332937d;
            } else if (i12 == 3) {
                logSeverity = LogSeverity.f332938e;
            } else if (i12 == 4) {
                logSeverity = LogSeverity.f332939f;
            } else {
                if (i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                logSeverity = LogSeverity.f332940g;
            }
            fVar.a(str2, logSeverity, str);
        }
    }
}
