package defpackage;

import android.app.PendingIntent;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class z49 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ z49(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws PendingIntent.CanceledException {
        PendingIntent sessionActivity;
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                d dVar = this.b;
                MediaControllerCompat mediaControllerCompat = dVar.b1;
                if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                d dVar2 = this.b;
                boolean z = dVar2.n1;
                dVar2.n1 = !z;
                if (!z) {
                    dVar2.N0.setVisibility(0);
                }
                dVar2.t1 = dVar2.n1 ? dVar2.u1 : dVar2.v1;
                dVar2.u(true);
                break;
        }
    }
}
