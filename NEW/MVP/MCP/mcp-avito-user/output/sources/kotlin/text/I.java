package kotlin.text;

import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;

/* compiled from: StringNumberConversions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes8.dex */
class I extends H {
    @Y61.k
    public static final void a(@Y61.k String str) {
        throw new NumberFormatException(C22491k0.a('\'', "Invalid number format: '", str));
    }
}
