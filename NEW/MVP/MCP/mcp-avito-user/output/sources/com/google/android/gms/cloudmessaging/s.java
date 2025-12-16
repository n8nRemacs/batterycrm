package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
final class s extends t<Void> {
    @Override // com.google.android.gms.cloudmessaging.t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.t
    public final boolean b() {
        return true;
    }
}
