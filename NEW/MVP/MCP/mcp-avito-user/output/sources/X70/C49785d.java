package x70;

import Y61.k;
import android.content.Context;
import android.text.SpannableString;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import x70.AbstractC49786e;

/* compiled from: PhoneReverificationTextSourceFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx70/d;", "Lx70/c;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x70.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49785d implements InterfaceC49784c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f442246b;

    public C49785d(@k Context context) {
        this.f442246b = context;
    }

    @k
    public final CharSequence a(@k AbstractC49786e abstractC49786e) {
        boolean z12 = abstractC49786e instanceof AbstractC49786e.a;
        Context context = this.f442246b;
        if (!z12) {
            if (abstractC49786e instanceof AbstractC49786e.b) {
                return ((AbstractC49786e.b) abstractC49786e).f442249a.k0(context);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC49786e.a aVar = (AbstractC49786e.a) abstractC49786e;
        String strK0 = aVar.f442247a.k0(context);
        String str = aVar.f442248b;
        int I12 = C43066x.I(strK0, str, 0, false, 6);
        int length = str.length() + I12;
        int iJ2 = C35835l0.j(R.attr.textHeadingSmall, context);
        if (I12 < 0 || iJ2 < 0) {
            return strK0;
        }
        SpannableString spannableString = new SpannableString(strK0);
        spannableString.setSpan(new OK0.a(context, iJ2), I12, length, 33);
        return spannableString;
    }
}
