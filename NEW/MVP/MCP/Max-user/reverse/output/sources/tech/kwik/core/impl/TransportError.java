package tech.kwik.core.impl;

import defpackage.utb;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes3.dex */
public class TransportError extends Exception {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public TransportError(int i) {
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "INTERNAL_ERROR";
                break;
            case 3:
                str = "CONNECTION_REFUSED";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "STREAM_LIMIT_ERROR";
                break;
            case 6:
                str = "STREAM_STATE_ERROR";
                break;
            case 7:
                str = "FINAL_SIZE_ERROR";
                break;
            case 8:
                str = "FRAME_ENCODING_ERROR";
                break;
            case 9:
                str = "TRANSPORT_PARAMETER_ERROR";
                break;
            case 10:
                str = "CONNECTION_ID_LIMIT_ERROR";
                break;
            case 11:
                str = "PROTOCOL_VIOLATION";
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                str = "INVALID_TOKEN";
                break;
            case 13:
                str = "APPLICATION_ERROR";
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                str = "CRYPTO_BUFFER_EXCEEDED";
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                str = "KEY_UPDATE_ERROR";
                break;
            case 16:
                str = "AEAD_LIMIT_REACHED";
                break;
            case LangUtils.HASH_SEED /* 17 */:
                str = "NO_VIABLE_PATH";
                break;
            case 18:
                str = "CRYPTO_ERROR";
                break;
            case 19:
                str = "VERSION_NEGOTIATION_ERROR";
                break;
            default:
                throw null;
        }
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "TransportError (" + utb.s(this.a) + ")";
    }

    public TransportError(int i, String str) {
        super(utb.s(i) + ": " + str);
        this.a = i;
    }
}
