package y01;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import j01.C42172a;

/* compiled from: AutoInitRunnable.java */
/* loaded from: classes7.dex */
public class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Context f442824b;

    @Override // java.lang.Runnable
    public final void run() {
        String strB;
        int statusCode;
        Bundle bundle;
        Context context = this.f442824b;
        try {
            ErrorEnum errorEnum = ErrorEnum.SUCCESS;
            ApiException e12 = null;
            try {
                C42172a c42172aA = C42172a.a(context);
                Util.getAppId(context);
                strB = c42172aA.b(null);
                try {
                    HMSLog.i("AutoInit", "Push init succeed");
                } catch (ApiException e13) {
                    e12 = e13;
                    statusCode = e12.getStatusCode();
                    HMSLog.e("AutoInit", "new Push init failed");
                    try {
                        bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                        }
                        HMSLog.i("AutoInit", "push kit sdk not exists");
                        return;
                    } catch (PackageManager.NameNotFoundException unused) {
                        HMSLog.i("AutoInit", "push kit sdk not exists");
                        return;
                    }
                }
            } catch (ApiException e14) {
                strB = null;
                e12 = e14;
            }
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            statusCode = 0;
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null || bundle.getString("com.huawei.hms.client.service.name:push") == null) {
                HMSLog.i("AutoInit", "push kit sdk not exists");
                return;
            }
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(context.getPackageName());
            Bundle bundle2 = new Bundle();
            bundle2.putString("message_type", "new_token");
            bundle2.putString("device_token", strB);
            bundle2.putInt("error", statusCode);
            if (e12 != null) {
                bundle2.putSerializable("exception_key", e12);
            }
            if (new m().a(context, intent, bundle2)) {
                return;
            }
            HMSLog.e("AutoInit", "start service failed");
        } catch (Exception e15) {
            HMSLog.e("AutoInit", "Push init failed", e15);
        }
    }
}
