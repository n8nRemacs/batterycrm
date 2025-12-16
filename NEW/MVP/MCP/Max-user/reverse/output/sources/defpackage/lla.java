package defpackage;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lla extends bma {
    public final /* synthetic */ int e;
    public Object f;

    public /* synthetic */ lla(int i) {
        this.e = i;
    }

    @Override // defpackage.bma
    public final void b(ggg gggVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) gggVar.o).setBigContentTitle((CharSequence) this.c).bigText((CharSequence) this.f);
                if (this.a) {
                    bigTextStyleBigText.setSummaryText((CharSequence) this.d);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) gggVar.o).setBigContentTitle((CharSequence) this.c);
                if (this.a) {
                    bigContentTitle.setSummaryText((CharSequence) this.d);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // defpackage.bma
    public final String c() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
