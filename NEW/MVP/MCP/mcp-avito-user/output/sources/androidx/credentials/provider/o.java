package androidx.credentials.provider;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallingAppInfo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o extends N implements Y41.l<Byte, CharSequence> {
    static {
        new o();
    }

    public o() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Byte b12) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b12.byteValue())}, 1));
    }
}
