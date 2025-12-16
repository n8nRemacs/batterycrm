package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfilesListBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<ProfilesListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f213288a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MergeFlow f213289b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f213290c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r60.d f213291d;

    @Inject
    public f(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar, @Y61.k MergeFlow mergeFlow, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k r60.d dVar) {
        this.f213288a = aVar;
        this.f213289b = mergeFlow;
        this.f213290c = interfaceC28373a;
        this.f213291d = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ProfilesListInternalAction> a() {
        return C43175k.N(this.f213288a.a(this.f213289b), C43175k.G(new e(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
