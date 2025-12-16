package ga1;

import Aa1.d;
import E91.h;
import P91.c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ru.mts.biometry.sdk.feature.recognition.ui.camera.p;
import ru.mts.biometry.sdk.feature.recognition.ui.camera.z;

/* renamed from: ga1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40641a implements d {
    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        String str;
        h hVar = C91.a.f2018e.f3817c;
        if (hVar == null || (str = hVar.f3851a) == null) {
            str = "";
        }
        ru.mts.biometry.sdk.feature.document.intro.domain.d.f436438b.getClass();
        return c.a(str) != null ? new p() : new z();
    }

    @Override // Aa1.d
    public final int a() {
        return 1;
    }
}
