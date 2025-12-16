package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.v;

/* loaded from: classes10.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f343174a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i12 = intent.getExtras().getInt("attemptNumber");
        v.b(context);
        r.a aVarA = r.a();
        aVarA.b(queryParameter);
        aVarA.d(HX0.a.b(iIntValue));
        if (queryParameter2 != null) {
            aVarA.c(Base64.decode(queryParameter2, 0));
        }
        i iVar = v.a().f343296d;
        r rVarA = aVarA.a();
        b bVar = new b(0);
        iVar.getClass();
        iVar.f343208e.execute(new com.avito.android.checkable_image.d(i12, iVar, 2, rVarA, bVar));
    }
}
