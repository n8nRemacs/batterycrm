package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class lyd implements dgh {
    public final Application a;
    public final cgh b;
    public final Bundle c;
    public final l48 d;
    public final pn e;

    public lyd(Application application, kyd kydVar, Bundle bundle) {
        cgh cghVar;
        this.e = kydVar.l();
        this.d = kydVar.p();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (cgh.c == null) {
                cgh.c = new cgh(application);
            }
            cghVar = cgh.c;
        } else {
            cghVar = new cgh(null);
        }
        this.b = cghVar;
    }

    @Override // defpackage.dgh
    public final yfh a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.dgh
    public final yfh b(Class cls, d8a d8aVar) {
        r8j r8jVar = r8j.B0;
        LinkedHashMap linkedHashMap = d8aVar.a;
        String str = (String) linkedHashMap.get(r8jVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(zfi.a) == null || linkedHashMap.get(zfi.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(cgh.d);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? myd.a(cls, myd.b) : myd.a(cls, myd.a);
        return constructorA == null ? this.b.b(cls, d8aVar) : (!zIsAssignableFrom || application == null) ? myd.b(cls, constructorA, zfi.d(d8aVar)) : myd.b(cls, constructorA, application, zfi.d(d8aVar));
    }

    public final yfh d(Class cls, String str) throws NoSuchMethodException, SecurityException {
        l48 l48Var = this.d;
        if (l48Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? myd.a(cls, myd.b) : myd.a(cls, myd.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (egh.a == null) {
                egh.a = new egh();
            }
            egh.a.getClass();
            return woi.d(cls);
        }
        pn pnVar = this.e;
        Bundle bundleC = pnVar.c(str);
        Class[] clsArr = eyd.f;
        eyd eydVarA = c9j.a(bundleC, this.c);
        fyd fydVar = new fyd(str, eydVarA);
        if (fydVar.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        fydVar.c = true;
        l48Var.a(fydVar);
        pnVar.f(str, eydVarA.e);
        l38 l38Var = l48Var.d;
        if (l38Var == l38.b || l38Var.a(l38.d)) {
            pnVar.g();
        } else {
            l48Var.a(new xn4(l48Var, 3, pnVar));
        }
        yfh yfhVarB = (!zIsAssignableFrom || application == null) ? myd.b(cls, constructorA, eydVarA) : myd.b(cls, constructorA, application, eydVarA);
        yfhVarB.a("androidx.lifecycle.savedstate.vm.tag", fydVar);
        return yfhVarB;
    }
}
