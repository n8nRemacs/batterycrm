package com.avito.android.phone_confirmation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.util.V2;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PhoneConfirmationSmsReceiver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/c0;", "Landroid/content/BroadcastReceiver;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.phone_confirmation.view.g f215903a;

    public c0(@Y61.k com.avito.android.phone_confirmation.view.g gVar) {
        this.f215903a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Y61.l Context context, @Y61.l Intent intent) {
        Object obj = null;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle(0);
            }
            Status status = (Status) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) : extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS"));
            Integer numValueOf = status != null ? Integer.valueOf(status.f348905b) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                if (numValueOf != null && numValueOf.intValue() == 15) {
                    V2.f318762a.j("PhoneConfirmationSmsReceiver", "Timed out waiting while waiting verification code", null);
                    return;
                }
                V2.f318762a.d("PhoneConfirmationSmsReceiver", "Unknown status " + status + " while waiting verification code");
                return;
            }
            String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            Iterator it = C43066x.f0(string, new String[]{" "}, 0, 6).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Character.isDigit(C43066x.D((String) next))) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                this.f215903a.accept(str);
            } else {
                V2.f318762a.d("PhoneConfirmationSmsReceiver", "Unable to get verification code from ".concat(string));
            }
        }
    }
}
