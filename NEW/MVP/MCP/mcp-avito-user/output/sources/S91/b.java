package S91;

import Aa1.d;
import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import ru.mts.biometry.sdk.feature.documentResult.ui.h;
import ru.mts.biometry.sdk.feature.documentResult.ui.o;
import ru.mts.biometry.sdk.feature.recognition.ui.result.g;

/* loaded from: classes9.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final z91.d f14838a;

    public b(z91.d dVar) {
        this.f14838a = dVar;
    }

    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        Fragment hVar;
        E91.d dVar = C91.a.f2018e.f3819e;
        z91.d dVar2 = this.f14838a;
        boolean z12 = dVar != null && L.f(dVar.f3826b, "rus") && L.f(dVar.f3825a, "Passport") && dVar2.f443904b;
        if (C91.a.f2018e.f3819e == null) {
            return new g();
        }
        int i13 = a.f14837a[dVar2.f443906d.ordinal()];
        if (i13 == 1) {
            h.f436451k0.getClass();
            hVar = new h();
            hVar.setArguments(C22777e.b(new Q("innRequired", Boolean.valueOf(z12))));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o.f436456l0.getClass();
            hVar = new o();
            hVar.setArguments(C22777e.b(new Q("innRequired", Boolean.valueOf(z12))));
        }
        return hVar;
    }

    @Override // Aa1.d
    public final int a() {
        return 1;
    }
}
