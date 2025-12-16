package To;

import Y61.k;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.code_check_public.model.Phone;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Phone.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-check_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    @k
    public static final String a(@k String str) {
        String strK = H.k("^(\\+7|7)|([^0-9])", str, "");
        Parcelable.Creator<Phone> creator = Phone.CREATOR;
        return strK;
    }
}
