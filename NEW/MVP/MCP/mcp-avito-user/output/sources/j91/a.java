package J91;

import A91.f;
import A91.g;
import Aa1.d;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import ru.mts.biometry.sdk.feature.address.ui.o;

/* loaded from: classes9.dex */
public final class a implements d {
    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        return i12 == 0 ? new o() : f.a(new g(R.string.sdk_bio_title_passport_address, Integer.valueOf(R.string.sdk_bio_registration_error_title), Integer.valueOf(R.attr.sdkBioIcError), 474));
    }

    @Override // Aa1.d
    public final int a() {
        return 1;
    }
}
