package com.avito.android.beduin.v2.page.impl;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2FragmentParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinV2FragmentArgumentsCreatorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/f;", "Lcom/avito/android/beduin/v2/page/j;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.v2.page.impl.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28869f implements com.avito.android.beduin.v2.page.j {
    @Inject
    public C28869f() {
    }

    @Y61.k
    public final Bundle a(@Y61.k BeduinV2FragmentParams beduinV2FragmentParams) {
        Bundle bundle = new Bundle();
        bundle.putString("pagePath", beduinV2FragmentParams.f104775b);
        bundle.putString("screenName", beduinV2FragmentParams.f104776c);
        bundle.putBoolean("scrollOnKeyboardShown", beduinV2FragmentParams.f104777d);
        bundle.putBoolean("ignoreSafeArea", beduinV2FragmentParams.f104778e);
        bundle.putString("scenarioParentId", beduinV2FragmentParams.f104779f);
        bundle.putString("scenarioId", beduinV2FragmentParams.f104780g);
        bundle.putBoolean("composeRenderer", beduinV2FragmentParams.f104781h);
        return bundle;
    }
}
