package com.avito.android.app.task;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.app_state.C30367f;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ApkSignatureCheckBackgroundTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/ApkSignatureCheckBackgroundTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/error_reporting/app_state/f;", "apkSignatureCollector", "<init>", "(Lcom/avito/android/error_reporting/app_state/f;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/error_reporting/app_state/f;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApkSignatureCheckBackgroundTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final C30367f apkSignatureCollector;

    @Inject
    public ApkSignatureCheckBackgroundTask(@Y61.k C30367f c30367f) {
        this.apkSignatureCollector = c30367f;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        Signature[] signatureArr;
        String str;
        String strA;
        C30367f c30367f = this.apkSignatureCollector;
        Context context = c30367f.f147808b;
        String strValueOf = String.valueOf((context.getApplicationInfo().flags & 2) > 0);
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = c30367f.f147807a;
        interfaceC4322a.b("app.debuggable", strValueOf);
        InterfaceC28373a interfaceC28373a = c30367f.f147810d;
        ArrayList arrayList = null;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Throwable th2) {
            interfaceC28373a.c(new NonFatalErrorEvent("Failed to get apk signatures", th2, null, null, 12, null));
            signatureArr = null;
        }
        if (signatureArr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : signatureArr) {
                if (signature != null) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        messageDigest.update(signature.toByteArray());
                        strA = com.avito.android.util.J.a(messageDigest.digest());
                    } catch (Throwable th3) {
                        interfaceC28373a.c(new NonFatalErrorEvent("Failed to get sha1 from apk signatures", th3, null, null, 12, null));
                        strA = "";
                    }
                } else {
                    strA = null;
                }
                if (strA != null) {
                    arrayList2.add(strA);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            str = "unavailable";
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!C43066x.K((String) it.next())) {
                    str = arrayList.contains(c30367f.f147809c.f()) ? "valid" : "invalid";
                }
            }
            str = "unavailable";
        }
        interfaceC4322a.b("app.signature", str);
    }
}
