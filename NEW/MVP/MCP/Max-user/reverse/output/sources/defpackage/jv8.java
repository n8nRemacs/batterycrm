package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jv8 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public jv8(lv8 lv8Var) {
        this.b = new WeakReference(lv8Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                lv8 lv8Var = (lv8) ((WeakReference) this.b).get();
                if (messenger == null || lv8Var == null) {
                    return;
                }
                Bundle data = message.getData();
                h79.w(data);
                try {
                    if (message.what != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    h79.w(data.getBundle("data_options"));
                    h79.w(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    n28.b(data.getParcelableArrayList("data_media_item_list"), mv8.CREATOR);
                    if (lv8Var.g != messenger) {
                        return;
                    }
                    if (string != null && lv8Var.e.get(string) != null) {
                        throw new ClassCastException();
                    }
                    if (nv8.b) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                        return;
                    }
                    return;
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv8(o79 o79Var, Looper looper) {
        super(looper);
        this.c = o79Var;
    }
}
