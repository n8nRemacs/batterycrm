package com.avito.beduin.v2.client.permission;

import Y61.k;
import Y61.l;
import androidx.core.app.C22744b;
import androidx.view.n;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionClientExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"permissions_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    @k
    public static final void a(@l a aVar, @k Y41.a aVar2, @k Y41.a aVar3, @k Y41.l lVar, @k Y41.l lVar2) {
        l0.h hVar = new l0.h();
        if (aVar == null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(RU0.b.f14470d + ":PermissionsClient", "Attempting to invoke permission checks when permissionsClient is unset");
            }
            lVar.invoke(new IllegalStateException("permissionsClient is null"));
            return;
        }
        n nVar = aVar.f335470c;
        String[] strArr = nVar.getPackageManager().getPackageInfo(nVar.getPackageName(), 4096).requestedPermissions;
        if (strArr == null || C42756l.H("android.permission.CAMERA", strArr) < 0 || androidx.core.content.d.checkSelfPermission(nVar, "android.permission.CAMERA") == 0) {
            aVar2.invoke();
            hVar.f406842b = null;
            return;
        }
        d dVar = new d(aVar, lVar2, hVar, aVar2, lVar);
        if (!C22744b.b(aVar.f335470c, "android.permission.CAMERA")) {
            dVar.invoke();
        } else if (((Boolean) aVar3.invoke()).booleanValue()) {
            dVar.invoke();
        }
    }
}
