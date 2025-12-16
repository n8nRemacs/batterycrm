package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class n8j {
    public static final Object a(hk3 hk3Var, Continuation continuation) {
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        hk3Var.f(new ulc(2, l42Var));
        Object objN = l42Var.n();
        return objN == g84.a ? objN : qqg.a;
    }

    public static final Object b(e2f e2fVar, q44 q44Var) {
        l42 l42Var = new l42(1, hni.f(q44Var));
        l42Var.o();
        e2fVar.k(new uvd(l42Var));
        return l42Var.n();
    }

    public static final Object c(vqa vqaVar, q44 q44Var) {
        l42 l42Var = new l42(1, hni.f(q44Var));
        l42Var.o();
        dl6 dl6Var = new dl6();
        dl6Var.d = l42Var;
        vqaVar.a(dl6Var);
        return l42Var.n();
    }

    public static de6 d(Context context) {
        ProviderInfo providerInfo;
        qt6 qt6Var;
        ApplicationInfo applicationInfo;
        kk4 xl4Var = Build.VERSION.SDK_INT >= 28 ? new xl4(18) : new kk4(18);
        PackageManager packageManager = context.getPackageManager();
        z5j.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            qt6Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrX = xl4Var.x(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrX) {
                    arrayList.add(signature.toByteArray());
                }
                qt6Var = new qt6(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
        }
        if (qt6Var == null) {
            return null;
        }
        return new de6(new ce6(context, qt6Var));
    }
}
