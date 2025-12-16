package com.avito.android.silent_update_deeplinks.permissions;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.silent_update.permissions.SilentUpdatePermissions;
import com.avito.android.silent_update_deeplinks.permissions.d;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SilentUpdatePermissionLinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/a;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes3.dex */
public final class a implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* compiled from: SilentUpdatePermissionLinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/silent_update_deeplinks/permissions/a$a;", "", "<init>", "()V", "", "DOZE_MODE_KEY", "Ljava/lang/String;", "INSTALL_KEY", "STORAGE_KEY", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.silent_update_deeplinks.permissions.a$a, reason: collision with other inner class name */
    public static final class C8461a {
        public /* synthetic */ C8461a(C42822w c42822w) {
            this();
        }

        public C8461a() {
        }
    }

    static {
        new C8461a(null);
    }

    @Inject
    public a() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (!(bVar instanceof d)) {
            return new com.avito.beduin.v2.interaction.launch.flow.j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        }
        d dVar = (d) bVar;
        if (dVar instanceof d.b) {
            SilentUpdatePermissions silentUpdatePermissions = ((d.b) bVar).f283754b;
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("isStoragePermissionGranted", String.valueOf(silentUpdatePermissions.f283694b)), new com.avito.beduin.v2.interaction.launch.flow.k("isDozeModePermissionGranted", String.valueOf(silentUpdatePermissions.f283695c)), new com.avito.beduin.v2.interaction.launch.flow.k("isInstallPermissionGranted", String.valueOf(silentUpdatePermissions.f283696d))};
        } else {
            if (!(dVar instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVarArr = null;
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        if (!(bVar instanceof d)) {
            return ResultStatus.f337440d;
        }
        d dVar = (d) bVar;
        if (dVar instanceof d.b) {
            return ResultStatus.f337439c;
        }
        if (dVar.equals(d.a.f283753b)) {
            return ResultStatus.f337440d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
