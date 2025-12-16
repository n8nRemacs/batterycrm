package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import j.P;

/* compiled from: com.google.android.play:core-common@@2.0.3 */
/* loaded from: classes6.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    @P
    public ResultReceiver f358562b;

    @Override // android.app.Activity
    public final void onActivityResult(int i12, int i13, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 0 && (resultReceiver = this.f358562b) != null) {
            if (i13 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i13 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f358562b = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f358562b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            ResultReceiver resultReceiver = this.f358562b;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
            return;
        }
        try {
            startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ResultReceiver resultReceiver2 = this.f358562b;
            if (resultReceiver2 != null) {
                resultReceiver2.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f358562b);
    }
}
