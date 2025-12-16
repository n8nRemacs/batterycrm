package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;

/* loaded from: classes10.dex */
public interface IPurchaseVerificationHandler {
    void init(IActivityHandler iActivityHandler, boolean z12, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendPurchaseVerificationPackage(ActivityPackage activityPackage);

    void teardown();
}
