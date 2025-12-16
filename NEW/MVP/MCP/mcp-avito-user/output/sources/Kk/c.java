package KK;

import Y61.k;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiLong;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import kotlin.Metadata;
import nt.f;

/* compiled from: ToPriceStringUI.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    @k
    public static final IacPiiString a(@k IacPiiLong iacPiiLong, @k f fVar) {
        return new IacPiiString(iacPiiLong.getValue() != 0 ? fVar.a((int) iacPiiLong.getValue()) : "");
    }
}
