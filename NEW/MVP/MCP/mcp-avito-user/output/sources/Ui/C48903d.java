package uI;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Suggestion.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_historical-suggests_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48903d {
    public static final boolean a(@k C48901b c48901b, @l AddressParameter.Value value) {
        AddressParameter.Value.PublishValueSellerAddressData addressData;
        Long l12 = c48901b.f439883e;
        if (l12 != null) {
            if (((value == null || (addressData = value.getAddressData()) == null) ? null : addressData.getId()) != null) {
                String string = l12.toString();
                AddressParameter.Value.PublishValueSellerAddressData addressData2 = value.getAddressData();
                return L.f(string, addressData2 != null ? addressData2.getId() : null);
            }
        }
        return b(c48901b).equals(value);
    }

    @k
    public static final AddressParameter.Value b(@k C48901b c48901b) {
        C48902c c48902c = c48901b.f439881c;
        double d12 = c48902c != null ? c48902c.f439888a : 0.0d;
        double d13 = c48902c != null ? c48902c.f439889b : 0.0d;
        String strA = c48901b.a();
        Long l12 = c48901b.f439883e;
        return new AddressParameter.Value(d12, d13, strA, c48901b.f439882d, l12 != null ? new AddressParameter.Value.PublishValueSellerAddressData(null, l12.toString(), null, "", "") : null);
    }
}
