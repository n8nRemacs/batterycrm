package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class pai {
    public final /* synthetic */ int a;

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
                if (cause instanceof UnknownHostException) {
                    strReplace = "UnknownHostException (no network)";
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strValueOf = String.valueOf(str);
        String strReplace2 = strReplace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(u45.f(strValueOf.length() + 4, strReplace2));
        sb.append(strValueOf);
        sb.append("\n  ");
        sb.append(strReplace2);
        sb.append('\n');
        return sb.toString();
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(str, a(str2, th));
    }

    public static final void d(View view, j48 j48Var) {
        view.setTag(n0d.view_tree_lifecycle_owner, j48Var);
    }

    public static void e(String str, String str2, Exception exc) {
        Log.w(str, a(str2, exc));
    }

    public fl b(Context context, Looper looper, goh gohVar, Object obj, vv6 vv6Var, wv6 wv6Var) {
        switch (this.a) {
            case 0:
                gohVar.getClass();
                Integer num = (Integer) gohVar.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new jze(context, looper, gohVar, bundle, vv6Var, wv6Var);
            case 1:
                throw az1.g(obj);
            case 2:
            case 3:
            case 5:
            default:
                wai waiVar = (wai) vv6Var;
                wai waiVar2 = (wai) wv6Var;
                switch (this.a) {
                    case 2:
                        return new cci(context, looper, gohVar, (l3g) obj, waiVar, waiVar2);
                    case 3:
                        return new hci(context, looper, 308, gohVar, waiVar, waiVar2, 0);
                    case 4:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 5:
                        return new yji(context, looper, gohVar, waiVar, waiVar2);
                }
            case 4:
                return new uri(context, looper, 126, gohVar, vv6Var, wv6Var, 0);
            case 6:
                return new n5j(context, looper, gohVar, (c70) obj, (wai) vv6Var, (wai) wv6Var);
            case 7:
                return new wli(context, looper, gohVar, (GoogleSignInOptions) obj, (wai) vv6Var, (wai) wv6Var);
        }
    }
}
