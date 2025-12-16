package okhttp3.internal.ws;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* compiled from: WebSocketExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", PluralsKeys.OTHER, "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @f
    @l
    public final Integer clientMaxWindowBits;

    @f
    public final boolean clientNoContextTakeover;

    @f
    public final boolean perMessageDeflate;

    @f
    @l
    public final Integer serverMaxWindowBits;

    @f
    public final boolean serverNoContextTakeover;

    @f
    public final boolean unknownValues;

    /* compiled from: WebSocketExtensions.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final WebSocketExtensions parse(@k Headers responseHeaders) {
            int size = responseHeaders.size();
            boolean z12 = false;
            Integer numY0 = null;
            boolean z13 = false;
            Integer numY02 = null;
            boolean z14 = false;
            boolean z15 = false;
            for (int i12 = 0; i12 < size; i12++) {
                if (C43066x.C(responseHeaders.name(i12), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = responseHeaders.value(i12);
                    int i13 = 0;
                    while (i13 < strValue.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i13, 0, 4, (Object) null);
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i13, iDelimiterOffset$default);
                        String strTrimSubstring = Util.trimSubstring(strValue, i13, iDelimiterOffset);
                        int i14 = iDelimiterOffset + 1;
                        if (C43066x.C(strTrimSubstring, "permessage-deflate", true)) {
                            if (z12) {
                                z15 = true;
                            }
                            i13 = i14;
                            while (i13 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, ';', i13, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i13, iDelimiterOffset2);
                                String strTrimSubstring2 = Util.trimSubstring(strValue, i13, iDelimiterOffset3);
                                String strY = iDelimiterOffset3 < iDelimiterOffset2 ? C43066x.Y(Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2), "\"", "\"") : null;
                                i13 = iDelimiterOffset2 + 1;
                                if (C43066x.C(strTrimSubstring2, "client_max_window_bits", true)) {
                                    if (numY0 != null) {
                                        z15 = true;
                                    }
                                    numY0 = strY != null ? C43066x.y0(strY) : null;
                                    if (numY0 == null) {
                                        z15 = true;
                                    }
                                } else if (C43066x.C(strTrimSubstring2, "client_no_context_takeover", true)) {
                                    if (z13) {
                                        z15 = true;
                                    }
                                    if (strY != null) {
                                        z15 = true;
                                    }
                                    z13 = true;
                                } else if (C43066x.C(strTrimSubstring2, "server_max_window_bits", true)) {
                                    if (numY02 != null) {
                                        z15 = true;
                                    }
                                    numY02 = strY != null ? C43066x.y0(strY) : null;
                                    if (numY02 == null) {
                                        z15 = true;
                                    }
                                } else if (C43066x.C(strTrimSubstring2, "server_no_context_takeover", true)) {
                                    if (z14) {
                                        z15 = true;
                                    }
                                    if (strY != null) {
                                        z15 = true;
                                    }
                                    z14 = true;
                                } else {
                                    z15 = true;
                                }
                            }
                            z12 = true;
                        } else {
                            i13 = i14;
                            z15 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z12, numY0, z13, numY02, z14, z15);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z12, Integer num, boolean z13, Integer num2, boolean z14, boolean z15, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = webSocketExtensions.perMessageDeflate;
        }
        if ((i12 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i12 & 4) != 0) {
            z13 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z16 = z13;
        if ((i12 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i12 & 16) != 0) {
            z14 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z17 = z14;
        if ((i12 & 32) != 0) {
            z15 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z12, num3, z16, num4, z17, z15);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    @k
    public final WebSocketExtensions copy(boolean perMessageDeflate, @l Integer clientMaxWindowBits, boolean clientNoContextTakeover, @l Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && L.f(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && L.f(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z12 = this.perMessageDeflate;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i13 = r22;
        if (r22 != 0) {
            i13 = 1;
        }
        int i14 = (iHashCode + i13) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i15 = r23;
        if (r23 != 0) {
            i15 = 1;
        }
        int i16 = (iHashCode2 + i15) * 31;
        boolean z13 = this.unknownValues;
        return i16 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.perMessageDeflate);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.clientMaxWindowBits);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.clientNoContextTakeover);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.serverMaxWindowBits);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.serverNoContextTakeover);
        sb2.append(", unknownValues=");
        return r.x(sb2, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z12, @l Integer num, boolean z13, @l Integer num2, boolean z14, boolean z15) {
        this.perMessageDeflate = z12;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z13;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z14;
        this.unknownValues = z15;
    }

    public /* synthetic */ WebSocketExtensions(boolean z12, Integer num, boolean z13, Integer num2, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? false : z13, (i12 & 8) == 0 ? num2 : null, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15);
    }
}
