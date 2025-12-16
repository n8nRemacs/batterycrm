package com.google.android.gms.common.api.internal;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.ProgressBar;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class v1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final t1 f349230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f349231c;

    public v1(w1 w1Var, t1 t1Var) {
        this.f349231c = w1Var;
        this.f349230b = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.common.api.internal.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.common.api.internal.m, java.lang.Object] */
    @Override // java.lang.Runnable
    @j.K
    public final void run() {
        if (this.f349231c.f349245c) {
            ConnectionResult connectionResult = this.f349230b.f349215b;
            if (connectionResult.h()) {
                w1 w1Var = this.f349231c;
                ?? r42 = w1Var.f349033b;
                Activity activityB = w1Var.b();
                PendingIntent pendingIntent = connectionResult.f348861d;
                C36729v.j(pendingIntent);
                int i12 = this.f349230b.f349214a;
                int i13 = GoogleApiActivity.f348896c;
                Intent intent = new Intent(activityB, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i12);
                intent.putExtra("notify_manager", false);
                r42.startActivityForResult(intent, 1);
                return;
            }
            w1 w1Var2 = this.f349231c;
            if (w1Var2.f349248f.b(w1Var2.b(), connectionResult.f348860c, null) != null) {
                w1 w1Var3 = this.f349231c;
                w1Var3.f349248f.j(w1Var3.b(), w1Var3.f349033b, connectionResult.f348860c, this.f349231c);
                return;
            }
            if (connectionResult.f348860c != 18) {
                w1 w1Var4 = this.f349231c;
                int i14 = this.f349230b.f349214a;
                w1Var4.f349246d.set(null);
                w1Var4.k(connectionResult, i14);
                return;
            }
            w1 w1Var5 = this.f349231c;
            C36687f c36687f = w1Var5.f349248f;
            Activity activityB2 = w1Var5.b();
            c36687f.getClass();
            ProgressBar progressBar = new ProgressBar(activityB2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityB2);
            builder.setView(progressBar);
            builder.setMessage(com.google.android.gms.common.internal.L.c(18, activityB2));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            C36687f.h(activityB2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", w1Var5);
            w1 w1Var6 = this.f349231c;
            Context applicationContext = w1Var6.b().getApplicationContext();
            u1 u1Var = new u1(this, alertDialogCreate);
            w1Var6.f349248f.getClass();
            C36687f.g(applicationContext, u1Var);
        }
    }
}
