package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class goh {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public goh(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.a = str;
        this.d = str2;
        this.e = kze.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public void b(go0 go0Var, String str, String str2) {
        ?? r0 = this.f;
        String string = ((b) this.b).getString(mvd.p);
        boolean zB = sti.b(15);
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (TextUtils.isEmpty(string) && !zB) {
            throw new IllegalArgumentException("Negative text must be set and non-empty.");
        }
        if (!TextUtils.isEmpty(string) && zB) {
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        jkc jkcVar = new jkc(str, str2, string);
        if (go0Var == null) {
            ((ho0) r0.getValue()).a(jkcVar, null);
            return;
        }
        ho0 ho0Var = (ho0) r0.getValue();
        ho0Var.getClass();
        if (Build.VERSION.SDK_INT < 30 && zB) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        ho0Var.a(jkcVar, go0Var);
    }

    public ba0 c() {
        String strI = ((String) this.a) == null ? " transportName" : "";
        if (((ee5) this.c) == null) {
            strI = strI.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strI = az1.i(strI, " eventMillis");
        }
        if (((Long) this.e) == null) {
            strI = az1.i(strI, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strI = az1.i(strI, " autoMetadata");
        }
        if (strI.isEmpty()) {
            return new ba0((String) this.a, (Integer) this.b, (ee5) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public goh(ln lnVar, em6 em6Var, cm6 cm6Var) {
        this.b = lnVar;
        this.c = em6Var;
        this.d = (hn6) cm6Var;
        this.a = goh.class.getName();
        final int i = 0;
        this.e = ipi.b(3, new cm6(this) { // from class: eoh
            public final /* synthetic */ goh b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new foh(this.b);
                    default:
                        goh gohVar = this.b;
                        b bVar = (b) gohVar.b;
                        foh fohVar = (foh) gohVar.e.getValue();
                        ho0 ho0Var = new ho0();
                        if (bVar == null) {
                            throw new IllegalArgumentException("FragmentActivity must not be null.");
                        }
                        if (fohVar == null) {
                            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                        }
                        ti6 ti6VarZ = bVar.z();
                        BiometricViewModel biometricViewModel = (BiometricViewModel) new zid((ggh) bVar).i(vid.a(BiometricViewModel.class));
                        ho0Var.a = ti6VarZ;
                        if (biometricViewModel != null) {
                            biometricViewModel.b = fohVar;
                        }
                        return ho0Var;
                }
            }
        });
        final int i2 = 1;
        this.f = ipi.b(3, new cm6(this) { // from class: eoh
            public final /* synthetic */ goh b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new foh(this.b);
                    default:
                        goh gohVar = this.b;
                        b bVar = (b) gohVar.b;
                        foh fohVar = (foh) gohVar.e.getValue();
                        ho0 ho0Var = new ho0();
                        if (bVar == null) {
                            throw new IllegalArgumentException("FragmentActivity must not be null.");
                        }
                        if (fohVar == null) {
                            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                        }
                        ti6 ti6VarZ = bVar.z();
                        BiometricViewModel biometricViewModel = (BiometricViewModel) new zid((ggh) bVar).i(vid.a(BiometricViewModel.class));
                        ho0Var.a = ti6VarZ;
                        if (biometricViewModel != null) {
                            biometricViewModel.b = fohVar;
                        }
                        return ho0Var;
                }
            }
        });
    }

    public goh(q4c q4cVar, bie bieVar, o3c o3cVar, wg7 wg7Var, Bundle bundle, mie mieVar) {
        this.b = q4cVar;
        this.c = bieVar;
        this.d = o3cVar;
        this.a = wg7Var;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = mieVar;
    }
}
