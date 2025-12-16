package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.ac0;
import defpackage.awg;
import defpackage.ka5;
import defpackage.mc;
import defpackage.mig;
import defpackage.o9c;
import defpackage.qe5;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(LogFactory.PRIORITY_KEY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        mig.b(context);
        ka5 ka5VarA = ac0.a();
        ka5VarA.p(queryParameter);
        ka5VarA.c = o9c.b(iIntValue);
        if (queryParameter2 != null) {
            ka5VarA.b = Base64.decode(queryParameter2, 0);
        }
        awg awgVar = mig.a().d;
        awgVar.e.execute(new qe5(awgVar, ka5VarA.e(), i, new mc(0)));
    }
}
