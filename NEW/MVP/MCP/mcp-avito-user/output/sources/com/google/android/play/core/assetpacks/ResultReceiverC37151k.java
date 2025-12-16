package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ResultReceiverC37151k extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i12, Bundle bundle) {
        if (i12 == 1) {
            throw null;
        }
        if (i12 == 2) {
            throw null;
        }
        new AssetPackException(-100);
        throw null;
    }
}
