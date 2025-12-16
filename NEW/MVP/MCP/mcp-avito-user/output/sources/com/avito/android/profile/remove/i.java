package com.avito.android.profile.remove;

import K90.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;

/* compiled from: ProfileRemoveMviViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/remove/i;", "Lcom/avito/android/arch/mvi/android/j;", "LK90/a;", "LK90/c;", "LK90/b;", "Lcom/avito/android/profile/remove/screen/e;", "Lcom/avito/android/profile/remove/screen/f;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.android.arch.mvi.android.j<K90.a, K90.c, K90.b> implements com.avito.android.profile.remove.screen.e, com.avito.android.profile.remove.screen.f {
    @Override // com.avito.android.profile.remove.screen.f
    public final void R1() {
        accept(a.b.f9283a);
    }

    @Override // com.avito.android.profile.remove.screen.f
    public final void Y1(@Y61.k DeepLink deepLink) {
        accept(new a.C0556a(deepLink));
    }

    @Override // com.avito.android.profile.remove.screen.f
    public final void fe(@Y61.k ProfileRemovalScreen profileRemovalScreen) {
        accept(new a.c(profileRemovalScreen));
    }

    @Override // com.avito.android.profile.remove.screen.e
    @Y61.k
    public final ProfileRemovalScreen j3(@Y61.k String str) {
        ProfileRemovalScreen profileRemovalScreen = getState().getValue().f9296d.get(str);
        if (profileRemovalScreen != null) {
            return profileRemovalScreen;
        }
        throw new IllegalStateException(AK.c.k("ProfileRemoveViewModel: Screen for key ", str, " not found"));
    }
}
