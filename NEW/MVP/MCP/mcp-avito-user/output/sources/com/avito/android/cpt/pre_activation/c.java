package com.avito.android.cpt.pre_activation;

import Y41.l;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.avito.android.cpt.pre_activation.PreActivationFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PreActivationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class c extends H implements l<Bundle, G0> {
    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        PreActivationFragment preActivationFragment = (PreActivationFragment) this.receiver;
        PreActivationFragment.a aVar = PreActivationFragment.f126667m0;
        FragmentManager parentFragmentManager = preActivationFragment.getParentFragmentManager();
        String tag = preActivationFragment.getTag();
        if (tag == null) {
            tag = "";
        }
        parentFragmentManager.o0(bundle2, tag);
        return G0.f406611a;
    }
}
