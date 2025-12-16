package one.me.android.calls;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import defpackage.o01;
import defpackage.t1b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/calls/CallNotifierFixActivity;", "Landroid/app/Activity;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallNotifierFixActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 27) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
        } else {
            getWindow().addFlags(2621440);
        }
        ((o01) t1b.a.getAccessor().c(613)).b(this, getIntent(), "CallNotifierFixActivity");
        finish();
    }
}
