package K91;

import android.os.Bundle;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class m extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9320l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ru.mts.biometry.sdk.feature.address.ui.o oVar) {
        super(2);
        this.f9320l = oVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        Bundle bundle = (Bundle) obj2;
        A a12 = (A) this.f9320l.f436423i0.getValue();
        String string2 = bundle.getString("shortAddress");
        if (string2 != null && (string = bundle.getString("fullAddress")) != null) {
            String string3 = bundle.getString("house");
            String string4 = bundle.getString("region");
            String string5 = bundle.getString("city");
            int i12 = bundle.getInt("index");
            a12.f9300L.setValue(new q(new I91.d(string2, string, string5, bundle.getString(DistrictParameter.TYPE), string3, bundle.getString("block"), Integer.valueOf(i12), bundle.getString("numberFlat"), string4, bundle.getString("street"))));
        }
        return G0.f406611a;
    }
}
