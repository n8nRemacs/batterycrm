package com.avito.android.profile.user_profile.preloading;

import Y61.k;
import com.avito.android.account.G;
import com.avito.android.preloading.coroutines.l;
import com.avito.android.profile.user_profile.j;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserProfileDataPreloadable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/preloading/b;", "Lcom/avito/android/preloading/coroutines/l;", "Lcom/avito/android/profile/user_profile/preloading/e;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements l<e, UserProfileInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f226574a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f226575b;

    @Inject
    public b(@k j jVar, @k G g12) {
        this.f226574a = jVar;
        this.f226575b = g12;
    }

    @Override // com.avito.android.preloading.coroutines.l
    public final InterfaceC43160i<UserProfileInternalAction> a(e eVar) {
        return C43175k.G(new a(this, eVar, null));
    }
}
