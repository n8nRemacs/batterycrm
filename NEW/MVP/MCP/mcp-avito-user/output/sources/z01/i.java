package z01;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* compiled from: SelfShowType.java */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f443708c = {ContextActionHandler.Link.URL, "app", "cosa", "rp"};

    /* renamed from: a, reason: collision with root package name */
    public Context f443709a;

    /* renamed from: b, reason: collision with root package name */
    public j f443710b;

    public static String a(String str) {
        try {
            int iIndexOf = str.indexOf(63);
            if (iIndexOf == -1) {
                return str;
            }
            int i12 = iIndexOf + 1;
            String[] strArrSplit = str.substring(i12).split(ContainerUtils.FIELD_DELIMITER);
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArrSplit) {
                if (!str2.startsWith("h_w_hiapp_referrer") && !str2.startsWith("h_w_gp_referrer")) {
                    arrayList.add(str2);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                sb2.append((String) arrayList.get(i13));
                if (i13 < arrayList.size() - 1) {
                    sb2.append(ContainerUtils.FIELD_DELIMITER);
                }
            }
            if (arrayList.size() == 0) {
                return str.substring(0, iIndexOf);
            }
            return str.substring(0, i12) + sb2.toString();
        } catch (Exception e12) {
            HMSLog.e("PushSelfShowLog", "delete referrer exception." + e12.toString());
            return str;
        }
    }

    public final void b() throws URISyntaxException {
        Context context = this.f443709a;
        j jVar = this.f443710b;
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            StringBuilder sb2 = new StringBuilder("enter launchExistApp cosa, appPackageName =");
            sb2.append(jVar.f443725l);
            sb2.append(",and msg.intentUri is ");
            sb2.append(jVar.f443716c);
            HMSLog.i("PushSelfShowLog", sb2.toString());
            Intent intentB = o.b(context, jVar.f443725l);
            String str = jVar.f443716c;
            boolean zBooleanValue = false;
            if (str != null) {
                try {
                    Intent uri = Intent.parseUri(str, 0);
                    uri.setSelector(null);
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + uri.getAction());
                    zBooleanValue = o.a(context, jVar.f443725l, uri).booleanValue();
                    if (zBooleanValue) {
                        intentB = uri;
                    }
                } catch (Exception e12) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e12.toString());
                }
            } else if (jVar.f443726m != null) {
                Intent intent = new Intent(jVar.f443726m);
                if (o.a(context, jVar.f443725l, intent).booleanValue()) {
                    intentB = intent;
                }
            }
            if (intentB == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            intentB.setPackage(jVar.f443725l);
            if (zBooleanValue) {
                intentB.addFlags(268435456);
            } else {
                intentB.setFlags(805437440);
            }
            context.startActivity(intentB);
        } catch (Exception e13) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e13.toString());
        }
    }

    public final void c() {
        j jVar = this.f443710b;
        Context context = this.f443709a;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(jVar.f443716c)) {
                sb2.append("&referrer=");
                sb2.append(Uri.encode(a(jVar.f443716c)));
            }
            String str = "market://details?id=" + jVar.f443725l + ((Object) sb2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(str));
            intent2.setPackage("com.android.vending");
            if (o.a(context, "com.android.vending", intent2).booleanValue()) {
                intent2.setFlags(402653184);
                HMSLog.i("PushSelfShowLog", "open google play store's app.");
                context.startActivity(intent2);
            } else if (!o.a(context, PackageConstants.SERVICES_PACKAGE_APPMARKET, intent).booleanValue()) {
                HMSLog.i("PushSelfShowLog", "open app detail by browser.");
                d();
            } else {
                intent.setFlags(402653184);
                HMSLog.i("PushSelfShowLog", "open HiApp's app.");
                context.startActivity(intent);
            }
        } catch (Exception e12) {
            HMSLog.e("PushSelfShowLog", "open market app detail failed,exception:" + e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z01.i.d():void");
    }
}
