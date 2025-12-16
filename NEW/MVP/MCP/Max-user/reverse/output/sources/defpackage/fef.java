package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public abstract class fef {
    public static hg8 a(byte[] bArr) {
        try {
            Protos.LogEvent logEvent = (Protos.LogEvent) fl9.mergeFrom(new Protos.LogEvent(), bArr);
            long j = logEvent.time;
            String str = logEvent.type;
            String str2 = logEvent.event;
            byte[] bArr2 = logEvent.params;
            return new hg8(logEvent.userId, logEvent.sessionId, j, str, str2, bArr2 != null ? (Map) efi.b(bArr2) : new us(0));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new RuntimeException(e);
        }
    }
}
