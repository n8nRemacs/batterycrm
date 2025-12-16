package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class fl3 implements jyd {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ fl3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.jyd
    public final Bundle a() {
        b bVar;
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ll3 ll3Var = this.b.Z;
                ll3Var.getClass();
                LinkedHashMap linkedHashMap = ll3Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ll3Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(ll3Var.g));
                return bundle;
        }
        do {
            bVar = this.b;
        } while (b.A(bVar.z()));
        bVar.E0.d(k38.ON_STOP);
        return new Bundle();
    }
}
