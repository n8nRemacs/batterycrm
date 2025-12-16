package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C36646i;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;
import com.huawei.hms.adapter.internal.CommonCode;
import j.N;
import j.P;
import j.k0;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepName
/* loaded from: classes6.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f348896c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k0
    public int f348897b = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i12, int i13, @N Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f348897b = 0;
            setResult(i13, intent);
            if (booleanExtra) {
                C36646i c36646iH = C36646i.h(this);
                if (i13 == -1) {
                    zau zauVar = c36646iH.f349134o;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i13 == 0) {
                    c36646iH.j(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i12 == 2) {
            this.f348897b = 0;
            setResult(i13, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        this.f348897b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(@P Bundle bundle) throws IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f348897b = bundle.getInt(CommonCode.MapKey.HAS_RESOLUTION);
        }
        if (this.f348897b != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
                return;
            }
            if (pendingIntent == null) {
                C36729v.j(num);
                C36687f.f349287e.e(this, num.intValue(), this);
                this.f348897b = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f348897b = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    C36646i.h(this).j(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strK = AK.c.k("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strK.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f348897b = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@N Bundle bundle) {
        bundle.putInt(CommonCode.MapKey.HAS_RESOLUTION, this.f348897b);
        super.onSaveInstanceState(bundle);
    }
}
