package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class k1c extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final Object c;

    public k1c(aqc aqcVar) {
        this.c = aqcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                n1c n1cVar = (n1c) this.b;
                String action = intent.getAction();
                if (action == null || !((IntentFilter) obj).hasAction(action)) {
                    return;
                }
                switch (action) {
                    case "ru.ok.video.ACTION_VIDEO_PLAY":
                        n1cVar.getClass();
                        return;
                    case "ru.ok.video.ACTION_VIDEO_STOP":
                        n1cVar.getClass();
                        return;
                    case "ru.ok.video.ACTION_VIDEO_PAUSE":
                        n1cVar.getClass();
                        return;
                    default:
                        return;
                }
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    Object obj2 = ((aqc) obj).c;
                    throw null;
                }
                return;
        }
    }

    public k1c(Context context, n1c n1cVar) {
        this.b = n1cVar;
        IntentFilter intentFilter = new IntentFilter();
        this.c = intentFilter;
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PLAY");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_PAUSE");
        intentFilter.addAction("ru.ok.video.ACTION_VIDEO_STOP");
    }
}
