package zb0;

import Y61.k;
import com.avito.android.util.C5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PhoneUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: zb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50541a {
    public static final boolean a(@k String str) {
        String strF = C5.f318570d.f(str, "");
        if (!C43066x.i0(strF, "7") && !C43066x.i0(strF, "8")) {
            throw new IllegalStateException("invalid phone number ".concat(str));
        }
        CharSequence charSequenceW = C43066x.w(strF);
        return C43066x.i0(charSequenceW, "9") || C43066x.i0(charSequenceW, "2");
    }
}
