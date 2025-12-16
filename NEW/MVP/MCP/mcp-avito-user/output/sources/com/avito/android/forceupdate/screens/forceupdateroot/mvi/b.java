package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import cN0.C27074c;
import com.avito.android.arch.mvi.a;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction;
import com.avito.android.permissions.u;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.silent_update.DownloadUpdateConfig;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ForceUpdateRootActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LOE/a;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "LOE/c;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.arch.mvi.a<OE.a, ForceUpdateRootInternalAction, OE.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f158569a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bw0.i f158570b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f158571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C27074c f158572d;

    @Inject
    public b(@Y61.k u uVar, @Y61.k Bw0.i iVar, @Y61.k C c12, @Y61.k C27074c c27074c) {
        this.f158569a = uVar;
        this.f158570b = iVar;
        this.f158571c = c12;
        this.f158572d = c27074c;
    }

    public static final void c(b bVar) {
        bVar.getClass();
        bVar.f158570b.a(new DownloadUpdateConfig.OneTimeDownloadRequest(ShortTask.NetworkState.f274024c, false, false, false, false, 0L, false, null, null, 0L, 928, null), "force_update", null);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ForceUpdateRootInternalAction> b(OE.a aVar, OE.c cVar) {
        return C43175k.G(new a(aVar, this, cVar, null));
    }
}
