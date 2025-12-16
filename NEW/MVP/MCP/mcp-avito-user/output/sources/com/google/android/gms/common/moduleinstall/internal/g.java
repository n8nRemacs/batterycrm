package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public interface g extends IInterface {
    void B(Status status, @P ModuleInstallIntentResponse moduleInstallIntentResponse);

    void H0(Status status);

    void Q3(Status status, @P ModuleAvailabilityResponse moduleAvailabilityResponse);

    void y0(Status status, @P ModuleInstallResponse moduleInstallResponse);
}
