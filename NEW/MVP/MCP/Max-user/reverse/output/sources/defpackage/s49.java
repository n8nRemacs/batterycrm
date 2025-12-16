package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s49 extends BroadcastReceiver {
    public final Context a;
    public boolean b = true;
    public final ArrayList c = new ArrayList();

    public s49(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.b == (!intent.getBooleanExtra("noConnectivity", false))) {
            return;
        }
        this.b = z;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((v49) it.next()).c();
        }
    }
}
