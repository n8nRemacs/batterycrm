package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ll3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ b h;

    public ll3(b bVar) {
        this.h = bVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        k8 k8Var = (k8) this.e.get(str);
        if ((k8Var != null ? k8Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                k8Var.a.e(k8Var.b.d(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new g8(intent, i2));
        return true;
    }

    public final void b(int i, j8 j8Var, Object obj) throws IntentSender.SendIntentException {
        i8 i8Var;
        Intent intentPutExtra;
        Bundle bundleExtra;
        int i2;
        Bundle bundleExtra2;
        int i3 = j8Var.a;
        b bVar = this.h;
        switch (i3) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    i8Var = new i8(id5.a);
                    break;
                } else {
                    for (String str : strArr) {
                        if (z7.b(bVar, str) == 0) {
                        }
                    }
                    int i4 = to8.i(strArr.length);
                    if (i4 < 16) {
                        i4 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    i8Var = new i8(linkedHashMap);
                    break;
                }
            default:
                i8Var = null;
                break;
        }
        if (i8Var != null) {
            new Handler(Looper.getMainLooper()).post(new mn1(this, i, i8Var, 5));
            return;
        }
        switch (j8Var.a) {
            case 0:
                intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
                break;
            case 1:
                intentPutExtra = (Intent) obj;
                break;
            default:
                zo7 zo7Var = (zo7) obj;
                intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = zo7Var.b;
                if (intent != null && (bundleExtra2 = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intentPutExtra.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra2);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        zo7Var = new zo7(zo7Var.a, null, zo7Var.c, zo7Var.d);
                    }
                }
                intentPutExtra.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", zo7Var);
                if (c.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intentPutExtra);
                    break;
                }
                break;
        }
        if (intentPutExtra.getExtras() != null && intentPutExtra.getExtras().getClassLoader() == null) {
            intentPutExtra.setExtrasClassLoader(bVar.getClassLoader());
        }
        if (intentPutExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentPutExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentPutExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentPutExtra.getAction())) {
            String[] stringArrayExtra = intentPutExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            z7.i(bVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentPutExtra.getAction())) {
            bVar.startActivityForResult(intentPutExtra, i, bundle);
            return;
        }
        zo7 zo7Var2 = (zo7) intentPutExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
        } catch (IntentSender.SendIntentException e) {
            e = e;
            i2 = i;
        }
        try {
            bVar.startIntentSenderForResult(zo7Var2.a, i2, zo7Var2.b, zo7Var2.c, zo7Var2.d, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            new Handler(Looper.getMainLooper()).post(new mn1(this, i2, e, 6));
        }
    }

    public final u5i c(String str, j8 j8Var, h8 h8Var) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new et3(new az4(l8.b, new zx0(1, 25))).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                Integer numValueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(numValueOf)) {
                    int iIntValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new k8(h8Var, j8Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            h8Var.e(obj);
        }
        Bundle bundle = this.g;
        g8 g8Var = (g8) yvi.a(bundle, str, g8.class);
        if (g8Var != null) {
            bundle.remove(str);
            h8Var.e(j8Var.d(g8Var.b, g8Var.a));
        }
        return new u5i(this, str, j8Var);
    }
}
