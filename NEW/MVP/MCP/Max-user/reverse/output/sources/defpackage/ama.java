package defpackage;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ama extends bma {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ltb g;
    public String h;
    public Boolean i;

    public ama(ltb ltbVar) {
        if (TextUtils.isEmpty(ltbVar.a)) {
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        this.g = ltbVar;
    }

    @Override // defpackage.bma
    public final void a(Bundle bundle) {
        super.a(bundle);
        ltb ltbVar = this.g;
        bundle.putCharSequence("android.selfDisplayName", ltbVar.a);
        bundle.putBundle("android.messagingStyleUser", ltbVar.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", zla.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", zla.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // defpackage.bma
    public final void b(ggg gggVar) {
        Notification.MessagingStyle messagingStyleB;
        nla nlaVar = (nla) this.b;
        boolean zBooleanValue = false;
        if (nlaVar == null || nlaVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        }
        this.i = Boolean.valueOf(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        ltb ltbVar = this.g;
        if (i >= 28) {
            ltbVar.getClass();
            messagingStyleB = wla.a(ktb.b(ltbVar));
        } else {
            messagingStyleB = ula.b(ltbVar.a);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ula.a(messagingStyleB, ((zla) it.next()).b());
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            vla.a(messagingStyleB, ((zla) it2.next()).b());
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            ula.c(messagingStyleB, this.h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            wla.b(messagingStyleB, this.i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) gggVar.o);
    }

    @Override // defpackage.bma
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
}
