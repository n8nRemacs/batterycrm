package ru.avito.messenger.internal.entity.jsonrpc;

import AK.c;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerJsonRpcParsingException.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/entity/jsonrpc/MessengerJsonRpcParsingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerJsonRpcParsingException extends Exception {
    public MessengerJsonRpcParsingException() {
        this(null, null, null, null, null, 31, null);
    }

    public MessengerJsonRpcParsingException(String str, Throwable th2, String str2, String str3, String str4, int i12, C42822w c42822w) {
        String strK;
        str = (i12 & 1) != 0 ? null : str;
        th2 = (i12 & 2) != 0 ? null : th2;
        str2 = (i12 & 4) != 0 ? null : str2;
        str3 = (i12 & 8) != 0 ? null : str3;
        str4 = (i12 & 16) != 0 ? null : str4;
        StringBuilder sb2 = new StringBuilder("Error (");
        String str5 = "";
        m.p(sb2, (str4 == null || (strK = c.k("method=", str4, ", ")) == null) ? "" : strK, "requestId=", str2, ", rpcId=");
        sb2.append(str3);
        sb2.append(") ");
        sb2.append(str);
        sb2.append(' ');
        if (th2 != null) {
            String str6 = th2.getClass().getName() + " : " + th2.getMessage();
            if (str6 != null) {
                str5 = str6;
            }
        }
        sb2.append(str5);
        super(sb2.toString(), th2);
    }
}
