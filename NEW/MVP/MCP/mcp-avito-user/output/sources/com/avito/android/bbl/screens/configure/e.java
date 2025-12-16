package com.avito.android.bbl.screens.configure;

import Y61.k;
import Zx.C19616a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.bbl.screens.configure.deeplink.BblConfigureLink;
import com.avito.android.bbl.screens.configure.v2.BblConfigureV2Fragment;
import com.avito.android.bbl.screens.configure.v4.ui.BblConfigureV4Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: BblConfigureFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/e;", "LA50/b;", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureLink;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements A50.b<BblConfigureLink> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C19616a f99184a;

    public e(@k C19616a c19616a) {
        this.f99184a = c19616a;
    }

    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        C19616a c19616a = this.f99184a;
        c19616a.getClass();
        n<Object>[] nVarArr = C19616a.f20576q;
        n<Object> nVar = nVarArr[12];
        boolean zBooleanValue = ((Boolean) c19616a.f20589n.a().invoke()).booleanValue();
        String str = ((BblConfigureLink) deepLink).f99126b;
        if (zBooleanValue) {
            BblConfigureV4Fragment.f99514s0.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("context", str);
            BblConfigureV4Fragment bblConfigureV4Fragment = new BblConfigureV4Fragment();
            bblConfigureV4Fragment.setArguments(bundle);
            return bblConfigureV4Fragment;
        }
        n<Object> nVar2 = nVarArr[0];
        if (((Boolean) c19616a.f20577b.a().invoke()).booleanValue()) {
            BblConfigureV2Fragment.f99264C0.getClass();
            return BblConfigureV2Fragment.a.a(str);
        }
        BblConfigureFragment.f99091E0.getClass();
        BblConfigureFragment bblConfigureFragment = new BblConfigureFragment();
        C35966w1.a(bblConfigureFragment, -1, new b(str));
        return bblConfigureFragment;
    }
}
