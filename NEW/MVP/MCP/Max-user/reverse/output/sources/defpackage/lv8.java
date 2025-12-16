package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* loaded from: classes.dex */
public final class lv8 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final jv8 d = new jv8(this);
    public final us e = new us(0);
    public s7c f;
    public Messenger g;
    public g79 h;

    public lv8(Context context, ComponentName componentName, jkc jkcVar, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        jkcVar.b = this;
        kv8 kv8Var = (kv8) jkcVar.a;
        kv8Var.getClass();
        this.b = new MediaBrowser(context, componentName, kv8Var, bundle2);
    }
}
