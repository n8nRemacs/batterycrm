package wn;

import Y61.l;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import kotlin.Metadata;

/* compiled from: Stepper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-snippet-actions_abstract"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: wn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49654a {
    @l
    public static final PrintableText a(int i12, int i13) {
        if (i12 > i13) {
            return b.b(R.plurals.stepper_error_message, i13, Integer.valueOf(i13));
        }
        return null;
    }
}
