package d31;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.h;
import com.adjust.sdk.Constants;
import ic1.C41382a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import shark.AndroidResourceIdNames;

/* renamed from: d31.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39501g {
    public static final String a(Context context, Uri uri) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfo = (ResolveInfo) C42745f0.G(b(context, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR, uri));
        if (resolveInfo != null) {
            return resolveInfo.activityInfo.packageName;
        }
        ArrayList arrayListB = b(context, 131072, uri);
        if (!arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                String str = ((ResolveInfo) it.next()).resolvePackageName;
                if (str == null) {
                    str = "";
                }
                if (str.equals("com.android.chrome")) {
                    return "com.android.chrome";
                }
            }
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) C42745f0.G(arrayListB);
        if (resolveInfo2 == null || (activityInfo = resolveInfo2.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public static final ArrayList b(Context context, int i12, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts(Constants.SCHEME, "", null)), i12);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (context.getPackageManager().resolveService(intent, 131072) != null) {
                if ((uri != null ? uri.getQueryParameter("authApp") : null) == null || !L.f(resolveInfo.activityInfo.packageName, "com.yandex.browser")) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(Context context, Uri uri, Integer num) {
        String strA = a(context, uri);
        if (strA == null) {
            return false;
        }
        int iA2 = C41382a.a(context, num);
        try {
            b.a aVar = new b.a();
            Integer numValueOf = Integer.valueOf(iA2 | (-16777216));
            aVar.f22826a = numValueOf;
            androidx.browser.customtabs.b bVar = new androidx.browser.customtabs.b(numValueOf);
            h.i iVar = new h.i();
            iVar.f22869d = bVar.a();
            iVar.b(true);
            androidx.browser.customtabs.h hVarA = iVar.a();
            Intent intent = hVarA.f22864a;
            intent.setPackage(strA);
            uri.toString();
            intent.setData(uri);
            androidx.core.content.d.startActivity(context, intent, hVarA.f22865b);
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }
}
