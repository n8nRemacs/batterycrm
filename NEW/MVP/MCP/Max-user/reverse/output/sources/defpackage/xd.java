package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class xd extends Handler {
    public static final xd a = new xd();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = wd.a;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strZ = (String) wd.b.get(loggerName);
        if (strZ == null) {
            strZ = vmf.Z(23, loggerName);
        }
        if (Log.isLoggable(strZ, i)) {
            if (thrown != null) {
                StringBuilder sbO = ho7.o(message, "\n");
                sbO.append(Log.getStackTraceString(thrown));
                message = sbO.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iC = vmf.C(message, '\n', i2, 4);
                if (iC == -1) {
                    iC = length;
                }
                while (true) {
                    iMin = Math.min(iC, i2 + q0f.CLOSE_SOCKET_CODE_TIMEOUT);
                    Log.println(i, strZ, message.substring(i2, iMin));
                    if (iMin >= iC) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
