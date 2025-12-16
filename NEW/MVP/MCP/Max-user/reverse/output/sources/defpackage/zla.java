package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zla {
    public final CharSequence a;
    public final long b;
    public final ltb c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public zla(CharSequence charSequence, long j, ltb ltbVar) {
        this.a = charSequence;
        this.b = j;
        this.c = ltbVar;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zla zlaVar = (zla) arrayList.get(i);
            ltb ltbVar = zlaVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zlaVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zlaVar.b);
            if (ltbVar != null) {
                bundle.putCharSequence("sender", ltbVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", yla.a(ktb.b(ltbVar)));
                } else {
                    bundle.putBundle("person", ltbVar.b());
                }
            }
            String str = zlaVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zlaVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = zlaVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        CharSequence charSequence = this.a;
        ltb ltbVar = this.c;
        if (i >= 28) {
            messageA = yla.b(charSequence, j, ltbVar != null ? ktb.b(ltbVar) : null);
        } else {
            messageA = xla.a(charSequence, j, ltbVar != null ? ltbVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            xla.b(messageA, str, this.f);
        }
        return messageA;
    }
}
