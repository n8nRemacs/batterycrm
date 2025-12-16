package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ln extends b implements nn {
    public ho I0;

    public ln() {
        ((pn) this.d.d).f("androidx:appcompat", new jn(this));
        t(new kn(this));
    }

    public final un C() {
        if (this.I0 == null) {
            tn tnVar = un.a;
            this.I0 = new ho(this, null, this, this);
        }
        return this.I0;
    }

    public final void D() {
        pai.d(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(w0d.view_tree_view_model_store_owner, this);
        wqi.l(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(y0d.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ho hoVar = (ho) C();
        hoVar.w();
        ((ViewGroup) hoVar.K0.findViewById(R.id.content)).addView(view, layoutParams);
        hoVar.w0.a(hoVar.v0.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ho hoVar = (ho) C();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (getWindow().hasFeature(0)) {
            if (kpiVar == null || !kpiVar.c()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.nl3, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int keyCode = keyEvent.getKeyCode();
        ho hoVar = (ho) C();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (keyCode == 82 && kpiVar != null && kpiVar.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        ho hoVar = (ho) C();
        hoVar.w();
        return hoVar.v0.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ho hoVar = (ho) C();
        if (hoVar.z0 == null) {
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            hoVar.z0 = new mrf(kpiVar != null ? kpiVar.g() : hoVar.u0);
        }
        return hoVar.z0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = lzg.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        C().c();
    }

    @Override // defpackage.nl3, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ho hoVar = (ho) C();
        if (hoVar.P0 && hoVar.J0) {
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            if (kpiVar != null) {
                kpiVar.i();
            }
        }
        ko koVarA = ko.a();
        Context context = hoVar.u0;
        synchronized (koVarA) {
            eod eodVar = koVarA.a;
            synchronized (eodVar) {
                ek8 ek8Var = (ek8) eodVar.b.get(context);
                if (ek8Var != null) {
                    ek8Var.a();
                }
            }
        }
        hoVar.b1 = new Configuration(hoVar.u0.getResources().getConfiguration());
        hoVar.n(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C().g();
    }

    @Override // androidx.fragment.app.b, defpackage.nl3, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentB;
        if (!super.onMenuItemSelected(i, menuItem)) {
            ho hoVar = (ho) C();
            hoVar.A();
            kpi kpiVar = hoVar.y0;
            if (menuItem.getItemId() != 16908332 || kpiVar == null || (kpiVar.f() & 4) == 0 || (intentB = uxi.b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentB2 = uxi.b(this);
            if (intentB2 == null) {
                intentB2 = uxi.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentC = uxi.c(this, component);
                    while (intentC != null) {
                        arrayList.add(size, intentC);
                        intentC = uxi.c(this, intentC.getComponent());
                    }
                    arrayList.add(intentB2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((ho) C()).w();
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        ho hoVar = (ho) C();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (kpiVar != null) {
            kpiVar.o(true);
        }
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((ho) C()).n(true, false);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        ho hoVar = (ho) C();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (kpiVar != null) {
            kpiVar.o(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        C().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ho hoVar = (ho) C();
        hoVar.A();
        kpi kpiVar = hoVar.y0;
        if (getWindow().hasFeature(0)) {
            if (kpiVar == null || !kpiVar.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.nl3, android.app.Activity
    public void setContentView(int i) {
        D();
        C().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((ho) C()).d1 = i;
    }

    @Override // defpackage.nl3, android.app.Activity
    public void setContentView(View view) {
        D();
        C().k(view);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        C().l(view, layoutParams);
    }
}
