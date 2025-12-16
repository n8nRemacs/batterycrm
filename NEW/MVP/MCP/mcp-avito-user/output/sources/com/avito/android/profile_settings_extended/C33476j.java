package com.avito.android.profile_settings_extended;

import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ExtendedProfilePromoblockInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/j;", "Lcom/avito/android/profile_settings_extended/i;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33476j implements InterfaceC33475i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f230372a;

    @Inject
    public C33476j(@Y61.k h31.e<InterfaceC34401z0> eVar) {
        this.f230372a = eVar;
    }

    @Override // com.avito.android.profile_settings_extended.InterfaceC33475i
    @Y61.l
    public final Object c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Continuation<? super String> continuation) {
        return this.f230372a.get().c(str, str2, str3, continuation);
    }
}
