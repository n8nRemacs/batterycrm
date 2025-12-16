package com.avito.android.ui.fragments;

import Y61.k;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC23487e;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: OnBackPressedListener.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bottom-navigation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    public static final boolean a(@k BaseFragment baseFragment) {
        InterfaceC23487e interfaceC23487eB = C35966w1.b(baseFragment);
        c cVar = interfaceC23487eB instanceof c ? (c) interfaceC23487eB : null;
        if (cVar != null) {
            return cVar.i0();
        }
        return false;
    }

    public static final void b(@k ActivityC22955m activityC22955m, @k FragmentManager fragmentManager, @k Y41.a aVar) {
        activityC22955m.getF21241d().a(activityC22955m, new d(fragmentManager, aVar));
    }
}
