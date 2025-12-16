package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.o1;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.C37028k;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
final class f extends zzf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f348817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Looper looper) {
        super(looper);
        this.f348817a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d dVar = this.f348817a;
        int i12 = d.f348806h;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        dVar.f348816g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f348815f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        if (strValueOf.length() != 0) {
                            "Unexpected response action: ".concat(strValueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = d.f348809k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (!Log.isLoggable("Rpc", 3) || stringExtra.length() == 0) {
                            return;
                        }
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        dVar.c(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                    return;
                }
                if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
                    synchronized (dVar.f348810a) {
                        int i13 = 0;
                        while (true) {
                            try {
                                o1<String, C37028k<Bundle>> o1Var = dVar.f348810a;
                                if (i13 < o1Var.f25790d) {
                                    dVar.c(intent2.getExtras(), o1Var.f(i13));
                                    i13++;
                                }
                            } finally {
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    if (stringExtra2.length() != 0) {
                        "Unexpected structured response ".concat(stringExtra2);
                    }
                } else {
                    String str = strArrSplit[2];
                    String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(":")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    dVar.c(intent2.putExtra("error", strSubstring).getExtras(), str);
                }
            }
        }
    }
}
