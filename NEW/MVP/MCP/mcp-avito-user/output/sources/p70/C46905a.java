package p70;

import Y61.k;
import com.avito.android.common.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HyphenPhoneFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp70/a;", "Lcom/avito/android/common/l;", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C46905a implements l {
    @Override // com.avito.android.common.l
    @k
    public final com.avito.android.common.k a(@k com.avito.android.common.k kVar) {
        CharSequence charSequence = kVar.f123766a;
        if (charSequence.length() == 0 || charSequence.length() == 0) {
            return kVar;
        }
        StringBuilder sb2 = new StringBuilder(13);
        int i12 = 0;
        int i13 = kVar.f123767b;
        int i14 = kVar.f123768c;
        int i15 = i13;
        int i16 = 0;
        while (i12 < charSequence.length()) {
            if (i16 > 12) {
                if (i12 >= Integer.MAX_VALUE) {
                    break;
                }
                if (Character.isDigit(charSequence.charAt(i12))) {
                    sb2.append(charSequence.charAt(i12));
                }
            } else if ("ddd ddd-dd-dd".charAt(i16) == 'd') {
                if (Character.isDigit(charSequence.charAt(i12))) {
                    sb2.append(charSequence.charAt(i12));
                    i16++;
                } else {
                    i12++;
                    if (i16 < i15) {
                        i15--;
                    }
                    if (i16 < i14) {
                        i14--;
                    }
                }
            } else if (charSequence.charAt(i12) == "ddd ddd-dd-dd".charAt(i16)) {
                sb2.append(charSequence.charAt(i12));
                i16++;
            } else {
                sb2.append("ddd ddd-dd-dd".charAt(i16));
                i16++;
                if (i16 <= i15) {
                    i15++;
                }
                if (i16 <= i14) {
                    i14++;
                }
            }
            i12++;
        }
        return new com.avito.android.common.k(i15, i14, sb2.toString());
    }
}
