package W91;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.u;
import ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j;

/* loaded from: classes9.dex */
public final class a implements Aa1.d {
    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        E91.a aVar = C91.a.f2018e.f3821g;
        return (aVar == null || !aVar.f3813e) ? new j() : new u();
    }

    @Override // Aa1.d
    public final int a() {
        return 1;
    }
}
