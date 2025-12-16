package Wg;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: BlockPair.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWg/a;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C15760a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final byte[] f18002a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final byte[] f18003b;

    public C15760a(@k byte[] bArr, @k byte[] bArr2) {
        this.f18002a = bArr;
        this.f18003b = bArr2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C15760a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C15760a c15760a = (C15760a) obj;
        return Arrays.equals(this.f18002a, c15760a.f18002a) && Arrays.equals(this.f18003b, c15760a.f18003b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18003b) + (Arrays.hashCode(this.f18002a) * 31);
    }

    @k
    public final String toString() {
        return "BlockPair(dataBytes=" + Arrays.toString(this.f18002a) + ", errorCorrectionBytes=" + Arrays.toString(this.f18003b) + ')';
    }
}
