package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.r;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes10.dex */
public class a implements m {
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.m
    public final void a(r rVar, int i12, boolean z12) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", rVar.b());
        builder.appendQueryParameter("priority", String.valueOf(HX0.a.a(rVar.d())));
        if (rVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(rVar.c(), 0));
        }
        Intent intent = new Intent((Context) null, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i12);
        if (z12 || PendingIntent.getBroadcast(null, 0, intent, 603979776) == null) {
            throw null;
        }
        DX0.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.m
    public final void b(r rVar, int i12) {
        a(rVar, i12, false);
    }
}
