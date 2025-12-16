package com.geetest.gtc4;

import android.content.Context;
import com.geetest.gtc4.c;

/* loaded from: classes4.dex */
public class GeeGuard {

    public interface CallbackHandler {
        void onCompletion(Integer num, GeeGuardReceipt geeGuardReceipt);
    }

    public static GeeGuardReceipt fetchReceipt(Context context, String str) {
        c cVar = c.a.f342849a;
        String str2 = cVar.f342848a;
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return b.a(context, cVar.f342848a, str);
    }

    @Deprecated
    public static String getData(Context context, GeeGuardConfiguration geeGuardConfiguration) {
        return Core.getData(context.getApplicationContext(), geeGuardConfiguration);
    }

    public static boolean getLogEnabled() {
        return a.f342847a;
    }

    public static String getVersion() {
        return "2.3.0.3";
    }

    public static void register(Context context, String str) {
        c.a.f342849a.a(context, str);
    }

    public static void setLogEnabled(boolean z12) {
        a.f342847a = z12;
    }

    public static void submitReceipt(Context context, String str, int i12, CallbackHandler callbackHandler) {
        c cVar = c.a.f342849a;
        String str2 = cVar.f342848a;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        b.a(context, cVar.f342848a, str, i12, callbackHandler);
    }

    @Deprecated
    public static GeeGuardReceipt fetchReceipt(Context context, String str, String str2) {
        return b.a(context, str, str2);
    }

    public static void submitReceipt(Context context, String str, CallbackHandler callbackHandler) {
        c cVar = c.a.f342849a;
        String str2 = cVar.f342848a;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        b.a(context, cVar.f342848a, str, 5000, callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, int i12, CallbackHandler callbackHandler) {
        b.a(context, str, str2, i12, callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, CallbackHandler callbackHandler) {
        b.a(context, str, str2, 5000, callbackHandler);
    }
}
