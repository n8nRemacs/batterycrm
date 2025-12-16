package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AbstractJsonLexer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/o;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43464o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43464o f413116a = new C43464o();

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final char[] f413117b = new char[117];

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final byte[] f413118c = new byte[WebSocketProtocol.PAYLOAD_SHORT];

    static {
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        f413116a.getClass();
        while (true) {
            byte[] bArr = f413118c;
            if (i12 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i12] = 127;
            i12++;
        }
    }

    public static void a(char c12, int i12) {
        if (c12 != 'u') {
            f413117b[c12] = (char) i12;
        }
    }
}
