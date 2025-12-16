package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.AbstractC36612a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.C37030m;
import com.google.firebase.messaging.C37616j;
import com.google.firebase.messaging.t;
import j.N;
import j.l0;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC36612a {
    @Override // com.google.android.gms.cloudmessaging.AbstractC36612a
    @l0
    public final int a(@N Context context, @N CloudMessage cloudMessage) {
        try {
            return ((Integer) C37030m.a(new C37616j(context).c(cloudMessage.f348804b))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.AbstractC36612a
    @l0
    public final void b(@N Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (t.b(intentPutExtras)) {
            t.a(intentPutExtras.getExtras(), "_nd");
        }
    }
}
