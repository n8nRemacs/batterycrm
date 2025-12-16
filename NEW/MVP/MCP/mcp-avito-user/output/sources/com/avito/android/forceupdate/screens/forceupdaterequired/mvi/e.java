package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import ME.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import com.avito.android.permissions.u;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ForceUpdateRequiredActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LME/a;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.a<ME.a, ForceUpdateRequiredInternalAction, ForceUpdateRequiredState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f158501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bw0.i f158502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f158503c;

    @Inject
    public e(@Y61.k u uVar, @Y61.k Bw0.i iVar, @Y61.k C c12) {
        this.f158501a = uVar;
        this.f158502b = iVar;
        this.f158503c = c12;
    }

    public static final void c(e eVar) {
        eVar.getClass();
        eVar.f158502b.a(new DownloadUpdateConfig.OneTimeDownloadRequest(ShortTask.NetworkState.f274024c, false, false, false, false, 0L, false, null, null, 0L, 928, null), "force_update", null);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ForceUpdateRequiredInternalAction> b(ME.a aVar, ForceUpdateRequiredState forceUpdateRequiredState) {
        ME.a aVar2 = aVar;
        ForceUpdateRequiredState forceUpdateRequiredState2 = forceUpdateRequiredState;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(forceUpdateRequiredState2, this, null));
        }
        if (aVar2.equals(a.C0665a.f10482a)) {
            return C43175k.G(new b(2, null));
        }
        if (aVar2.equals(a.d.f10485a)) {
            return C43175k.G(new c(this, null));
        }
        if (aVar2.equals(a.c.f10484a)) {
            return C43175k.G(new d(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
