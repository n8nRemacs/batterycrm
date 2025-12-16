package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class t7c {
    public final SharedPreferences a;

    public t7c(Context context) {
        this.a = context.getSharedPreferences("webrtc-android-sdk-pref", 0);
    }
}
