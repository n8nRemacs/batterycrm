package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* loaded from: classes.dex */
public final class uv8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wv8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ResultReceiver d;
    public final /* synthetic */ t9f o;

    public uv8(t9f t9fVar, wv8 wv8Var, String str, ResultReceiver resultReceiver) {
        this.o = t9fVar;
        this.b = wv8Var;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ResultReceiver resultReceiver = this.d;
        t9f t9fVar = this.o;
        wv8 wv8Var = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                pv8 pv8Var = (pv8) ((k89) t9fVar.b).o.get(wv8Var.a.getBinder());
                if (pv8Var != null) {
                    k89 k89Var = (k89) t9fVar.b;
                    k89Var.X = pv8Var;
                    if ((2 & 2) != 0) {
                        resultReceiver.send(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i2 = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", null);
                        resultReceiver.send(0, bundle);
                    }
                    k89Var.X = null;
                    break;
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                    break;
                }
            default:
                pv8 pv8Var2 = (pv8) ((k89) t9fVar.b).o.get(wv8Var.a.getBinder());
                if (pv8Var2 != null) {
                    k89 k89Var2 = (k89) t9fVar.b;
                    k89Var2.X = pv8Var2;
                    resultReceiver.send(-1, null);
                    k89Var2.X = null;
                    break;
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                    break;
                }
        }
    }

    public uv8(t9f t9fVar, wv8 wv8Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.o = t9fVar;
        this.b = wv8Var;
        this.c = str;
        this.d = resultReceiver;
    }
}
