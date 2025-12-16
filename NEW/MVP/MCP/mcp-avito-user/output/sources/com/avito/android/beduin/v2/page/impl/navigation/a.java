package com.avito.android.beduin.v2.page.impl.navigation;

import Ni.C14578a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.beduin_v2.feature.di.V0;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinNavigationFragmentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/navigation/a;", "Lcom/avito/beduin/v2/utils/navigate/a;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@V0
/* loaded from: classes11.dex */
public final class a implements com.avito.beduin.v2.utils.navigate.a {
    @Inject
    public a() {
    }

    @Override // com.avito.beduin.v2.utils.navigate.a
    public final BeduinV2InnerScreenFragment a(u uVar, LinkedHashMap linkedHashMap) {
        BeduinV2InnerScreenFragment.f105127r0.getClass();
        BeduinV2InnerScreenFragment beduinV2InnerScreenFragment = new BeduinV2InnerScreenFragment();
        Bundle arguments = beduinV2InnerScreenFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("beduin_navigate_screen_key", uVar.f337550a);
        String str = linkedHashMap != null ? (String) linkedHashMap.get("contentType") : null;
        if (str != null) {
            arguments.putString("beduin_perf_content_type", str);
        }
        arguments.putString("beduin_perf_tracker_result", C14578a.a(linkedHashMap != null ? (String) linkedHashMap.get("trackerResult") : null).a());
        beduinV2InnerScreenFragment.setArguments(arguments);
        return beduinV2InnerScreenFragment;
    }
}
