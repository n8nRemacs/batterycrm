package com.avito.android.profile_settings_extended;

import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DisableExtendedProfileInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/g;", "Lcom/avito/android/profile_settings_extended/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33473g implements InterfaceC33472f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f230370a;

    @Inject
    public C33473g(@Y61.k h31.e<D0> eVar) {
        this.f230370a = eVar;
    }

    @Override // com.avito.android.profile_settings_extended.InterfaceC33472f
    @Y61.l
    public final Object a(@Y61.k Continuation<? super TypedResult<G0>> continuation) {
        return this.f230370a.get().a(continuation);
    }
}
