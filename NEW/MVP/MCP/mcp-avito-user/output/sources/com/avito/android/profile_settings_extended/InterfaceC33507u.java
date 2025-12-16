package com.avito.android.profile_settings_extended;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/u;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_extended.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33507u {

    /* compiled from: ExtendedProfileSettingsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_extended.u$a */
    public static final class a {
        public static InterfaceC43160i a(InterfaceC33507u interfaceC33507u, boolean z12, String str, int i12) {
            if ((i12 & 2) != 0) {
                str = null;
            }
            return interfaceC33507u.b(str, C42784z0.f406748b, z12);
        }
    }

    @Y61.l
    Object a(@Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    InterfaceC43160i b(@Y61.l String str, @Y61.k List list, boolean z12);
}
