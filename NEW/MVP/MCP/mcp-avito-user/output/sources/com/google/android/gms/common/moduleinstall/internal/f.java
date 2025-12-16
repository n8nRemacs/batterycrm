package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class f extends zab implements g {
    public f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR);
            zac.zab(parcel);
            Q3(status, moduleAvailabilityResponse);
        } else if (i12 == 2) {
            Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) zac.zaa(parcel, ModuleInstallResponse.CREATOR);
            zac.zab(parcel);
            y0(status2, moduleInstallResponse);
        } else if (i12 == 3) {
            Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) zac.zaa(parcel, ModuleInstallIntentResponse.CREATOR);
            zac.zab(parcel);
            B(status3, moduleInstallIntentResponse);
        } else {
            if (i12 != 4) {
                return false;
            }
            Status status4 = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            H0(status4);
        }
        return true;
    }
}
