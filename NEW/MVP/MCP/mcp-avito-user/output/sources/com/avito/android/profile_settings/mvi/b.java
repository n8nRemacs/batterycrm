package com.avito.android.profile_settings.mvi;

import Db0.InterfaceC13382a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import com.avito.android.profile_settings.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileSettingsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LDb0/a;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC13382a, com.avito.android.profile_settings.mvi.entity.a, ProfileSettingsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_settings.f f228457a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f228458b;

    @Inject
    public b(@Y61.k com.avito.android.profile_settings.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f228457a = fVar;
        this.f228458b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<com.avito.android.profile_settings.mvi.entity.a> b(InterfaceC13382a interfaceC13382a, ProfileSettingsState profileSettingsState) {
        InterfaceC13382a interfaceC13382a2 = interfaceC13382a;
        if (interfaceC13382a2 instanceof InterfaceC13382a.d) {
            return new C43210w(new a.e(((InterfaceC13382a.d) interfaceC13382a2).f3256a));
        }
        if (interfaceC13382a2 instanceof InterfaceC13382a.c) {
            return this.f228457a.a();
        }
        if (interfaceC13382a2 instanceof InterfaceC13382a.C0171a) {
            return new C43210w(a.c.f228477a);
        }
        if (interfaceC13382a2 instanceof InterfaceC13382a.b) {
            return C43175k.G(new a(this, interfaceC13382a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
