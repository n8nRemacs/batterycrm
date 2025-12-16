package com.avito.android.calltracking;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.calltracking.CalltrackingFragment;
import kotlin.Metadata;

/* compiled from: CalltrackingActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/a;", "Landroidx/fragment/app/F;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29273a extends androidx.fragment.app.F {
    @Override // androidx.viewpager.widget.a
    public final int c() {
        return CalltrackingScreenType.values().length;
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        CalltrackingFragment.a aVar = CalltrackingFragment.f113554s0;
        CalltrackingScreenType calltrackingScreenType = CalltrackingScreenType.f113562b;
        if (i12 != 0) {
            calltrackingScreenType = CalltrackingScreenType.f113563c;
        }
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("extra_screen_type", calltrackingScreenType.name());
        CalltrackingFragment calltrackingFragment = new CalltrackingFragment();
        calltrackingFragment.setArguments(bundle);
        return calltrackingFragment;
    }
}
