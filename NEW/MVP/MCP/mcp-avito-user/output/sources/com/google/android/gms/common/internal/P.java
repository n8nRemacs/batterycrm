package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC36656m;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class P implements DialogInterface.OnClickListener {
    public static P b(@j.P Intent intent, GoogleApiActivity googleApiActivity) {
        return new M(intent, googleApiActivity);
    }

    public static P c(@j.P Intent intent, @j.N InterfaceC36656m interfaceC36656m) {
        return new O(intent, interfaceC36656m);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
