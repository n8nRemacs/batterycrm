package d31;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: d31.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39500f {
    public static final boolean a(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("sberbankidlogin").authority("sberbankid").build()), 0).isEmpty();
    }
}
