package defpackage;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class ejd {
    public final /* synthetic */ fjd a;

    public ejd(fjd fjdVar) {
        this.a = fjdVar;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        fjd fjdVar = this.a;
        fjdVar.g = string;
        fjdVar.h = bundle.getString("transferableTitle");
    }
}
