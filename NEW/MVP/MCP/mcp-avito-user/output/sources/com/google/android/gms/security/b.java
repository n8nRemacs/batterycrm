package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import ru.cyberity.cbr.core.CBRMobileSDK$SDK$1$1;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f355596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CBRMobileSDK$SDK$1$1 f355597b;

    public b(Context context, CBRMobileSDK$SDK$1$1 cBRMobileSDK$SDK$1$1) {
        this.f355596a = context;
        this.f355597b = cBRMobileSDK$SDK$1$1;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            a.a(this.f355596a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e12) {
            return Integer.valueOf(e12.f348869b);
        } catch (GooglePlayServicesRepairableException e13) {
            return Integer.valueOf(e13.f348870b);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        CBRMobileSDK$SDK$1$1 cBRMobileSDK$SDK$1$1 = this.f355597b;
        if (iIntValue == 0) {
            cBRMobileSDK$SDK$1$1.onProviderInstalled();
            return;
        }
        cBRMobileSDK$SDK$1$1.onProviderInstallFailed(num.intValue(), a.f355592a.b(this.f355596a, num.intValue(), "pi"));
    }
}
