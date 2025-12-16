package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class ul8 extends i3 {
    public static final ul8 c = new ul8(11);

    public static ei4 L0(long j, Long l, Long l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        if (l != null) {
            sb.append("&load_mark=" + l);
        }
        return new ei4(sb.toString());
    }

    public static ei4 M0(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        if (str != null) {
            sb.append("&folder_id=".concat(str));
        }
        return new ei4(sb.toString());
    }

    public static Intent P0(ei4 ei4Var, Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        c.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + ei4Var.b));
        return intent;
    }

    public static Uri Q0(long j, ukh ukhVar, Long l, String str) {
        hi4 hi4Var = new hi4();
        hi4Var.a = ":webapp:root";
        hi4Var.c(Long.valueOf(j), "bot_id");
        hi4Var.c(ukhVar.a, "entry_point");
        if (str != null) {
            hi4Var.c(str, "start_param");
        }
        if (l != null) {
            hi4Var.c(l, "source_id");
        }
        return hi4Var.a();
    }

    public final void N0(String str, Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("DIGITAL_ID")) != null) {
            long j = bundle.getLong("USER_ID");
            try {
                byte[] byteArray = bundle.getByteArray("PHOTO_DATA");
                if (byteArray != null) {
                    String strEncodeToString = Base64.encodeToString(byteArray, 2);
                    if (strEncodeToString != null) {
                        str = az1.i(str, ho7.l(xrf.q("&digitalId=", j, string, "&oid="), "&photo=", strEncodeToString));
                    }
                }
            } catch (Throwable th) {
                wqi.e(io5.class.getName(), wy1.i("Couldn't extract photo for uri ", str, ", due to ", th.getLocalizedMessage()), th);
            }
        }
        p0().b(":external_callback", gwi.b(new imb("params", str)));
    }

    public final void O0(long j, String str, String str2, boolean z) {
        ii4 ii4VarP0 = p0();
        StringBuilder sbN = ho7.n(":call-incoming?chat_id=", j, "&call_name=", str);
        sbN.append("&call_avatar=");
        sbN.append(str2);
        sbN.append("&video_enabled=");
        sbN.append(z);
        ii4VarP0.b(sbN.toString(), null);
    }

    public final ei4 R0(long j, ukh ukhVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(a9h.e(":webapp:root?bot_id=", j, "&entry_point=", ukhVar.a));
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new ei4(sb.toString());
    }
}
