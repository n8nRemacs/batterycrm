package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class tx8 {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final g79 e;

    public tx8(Context context, g79 g79Var) {
        this.e = g79Var;
        MediaController mediaController = new MediaController(context, g79Var.b);
        this.a = mediaController;
        if (g79Var.a() == null) {
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new rx8(this));
        }
    }

    public final void a() {
        db7 db7VarA = this.e.a();
        if (db7VarA == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            py8 py8Var = (py8) it.next();
            sx8 sx8Var = new sx8(py8Var);
            this.d.put(py8Var, sx8Var);
            py8Var.c = sx8Var;
            try {
                db7VarA.I(sx8Var);
                py8Var.i(13, null, null);
            } catch (RemoteException | SecurityException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(py8 py8Var) {
        MediaController mediaController = this.a;
        qx8 qx8Var = py8Var.a;
        qx8Var.getClass();
        mediaController.unregisterCallback(qx8Var);
        synchronized (this.b) {
            db7 db7VarA = this.e.a();
            if (db7VarA != null) {
                try {
                    sx8 sx8Var = (sx8) this.d.remove(py8Var);
                    if (sx8Var != null) {
                        py8Var.c = null;
                        db7VarA.C(sx8Var);
                    }
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(py8Var);
            }
        }
    }
}
