package B31;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f859a;

    public b(Context context) {
        this.f859a = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }
}
