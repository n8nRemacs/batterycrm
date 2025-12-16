package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.zx.sdk.api.PermissionCallback;
import com.zx.sdk.api.ZXManager;
import kotlin.Metadata;
import kotlin.text.C43066x;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/geetest/captcha/utils/ZxIdUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/G0;", "get", "(Landroid/content/Context;)V", "", "getZxID", "(Landroid/content/Context;)Ljava/lang/String;", "", "isZxIDAvailable", "()Z", "start", "TAG", "Ljava/lang/String;", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k0 f342746a = new k0();

    public static final class a implements PermissionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f342747a;

        public a(Context context) {
            this.f342747a = context;
        }

        public void onAuthorized() {
            h0.f342732d.a("ZxIdUtils", "ZxID checkPermission: onAuthorized");
            ZXManager.getZXID(new j0(this.f342747a));
        }

        public void onUnauthorized() {
            h0.f342732d.a("ZxIdUtils", "ZxID checkPermission: onUnauthorized");
        }
    }

    @Y61.k
    public final String a(@Y61.k Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.zx.sdk.api.ZXManager");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("gt_zid_sp", 0);
                String string = sharedPreferences.getString("gt_zid", null);
                long j12 = sharedPreferences.getLong("gt_zid_et", 0L);
                if (string == null || !(!C43066x.K(string)) || j12 <= 0) {
                    b(context);
                    return "unknown";
                }
                if (j12 - System.currentTimeMillis() < 86400000) {
                    b(context);
                }
                return string;
            } catch (Exception e12) {
                e12.printStackTrace();
                return "unknown";
            }
        } catch (Exception unused) {
        }
    }

    public final void b(Context context) {
        ZXManager.init(context);
        ZXManager.setDebug(false);
        ZXManager.setEnable(true);
        ZXManager.allowPermissionDialog(false);
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        ZXManager.checkPermission((Activity) context, new a(context));
    }
}
