package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class gl3 implements mva {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ gl3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.mva
    public final void a() {
        switch (this.a) {
            case 0:
                b bVar = this.b;
                Bundle bundleC = ((pn) bVar.d.d).c("android:support:activity-result");
                if (bundleC != null) {
                    ll3 ll3Var = bVar.Z;
                    LinkedHashMap linkedHashMap = ll3Var.b;
                    LinkedHashMap linkedHashMap2 = ll3Var.a;
                    Bundle bundle = ll3Var.g;
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            ll3Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    uog.c(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            ll3Var.b.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                ei6 ei6Var = (ei6) this.b.D0.b;
                ei6Var.X.b(ei6Var, ei6Var, null);
                break;
        }
    }
}
