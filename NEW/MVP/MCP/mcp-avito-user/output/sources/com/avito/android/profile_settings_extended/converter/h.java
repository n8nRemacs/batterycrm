package com.avito.android.profile_settings_extended.converter;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.action_select_link.ActionSelectLink;
import com.avito.android.deep_linking.action_select_link.ActionSelectMenu;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationOption;
import com.avito.android.remote.model.VerificationOptionsListResult;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationOptionsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/converter/h;", "Lcom/avito/android/profile_settings_extended/converter/g;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.profile_settings_extended.converter.g
    @k
    public final ActionSelectLink a(@k VerificationOptionsListResult verificationOptionsListResult) {
        ArrayList arrayList = new ArrayList();
        for (VerificationOption verificationOption : verificationOptionsListResult.getOptionsList()) {
            DeepLink deepLink = verificationOption.getDeepLink();
            if (deepLink != null) {
                arrayList.add(new ActionSelectMenu.Action(verificationOption.getTitle(), deepLink));
            }
        }
        String title = verificationOptionsListResult.getTitle();
        if (title == null) {
            title = "";
        }
        return new ActionSelectLink(new ActionSelectMenu(title, arrayList, null));
    }
}
