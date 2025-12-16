package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.android.MainActivity;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public abstract class d6 extends ln implements i7g {
    public wib J0;
    public f8 K0;
    public lk6 L0;
    public q1g M0;
    public int N0;
    public boolean O0;
    public final HashSet P0 = new HashSet();
    public long Q0 = 0;
    public HashMap R0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void E(q1g q1gVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof FrgBase) {
                FrgBase frgBase = (FrgBase) aVar;
                frgBase.n1 = q1gVar;
                View view = frgBase.S0;
                if (frgBase instanceof u1g) {
                    ((u1g) frgBase).k(q1gVar);
                } else if (view != null) {
                    frgBase.v0();
                }
            } else if (aVar instanceof u1g) {
                ((u1g) aVar).k(q1gVar);
            }
            E(q1gVar, aVar.u().c.f());
        }
    }

    @Override // androidx.fragment.app.b
    public final void B() {
        super.B();
        wqi.c("d6", "onResumeFragments: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        this.O0 = true;
        if (((fxa) ((t1b) ((qm3) this.J0.b)).getAccessor().c(31)).b()) {
            en8 en8VarL = ((t1b) ((qm3) this.J0.b)).l();
            HashSet hashSet = this.P0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                en8VarL.c((sj0) it.next());
            }
            hashSet.clear();
        } else {
            I();
        }
        if (this.L0 != null) {
            this.L0 = null;
        }
        f8 f8Var = this.K0;
        if (f8Var != null) {
            H(f8Var.a, f8Var.b, f8Var.c);
            this.K0 = null;
        }
    }

    public final void F() {
        super.finish();
        if (((t1b) ((qm3) this.J0.b)).j().c.g.getBoolean("app.messages.enable.animations", true)) {
            overridePendingTransition(0, R.anim.fade_out);
        }
    }

    public abstract String G();

    public void H(int i, int i2, Intent intent) {
    }

    public void I() {
        wqi.c("d6", "onLogout " + getLocalClassName(), new Object[0]);
        setResult(0);
        finishAffinity();
    }

    public final void J() {
        pai.d(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(w0d.view_tree_view_model_store_owner, this);
        wqi.l(getWindow().getDecorView(), this);
    }

    public final void K(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    public final void L(ActLocalMedias actLocalMedias) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(actLocalMedias);
        decorView.setSystemUiVisibility(f().c ? 1792 : 1808);
    }

    public boolean M() {
        return this instanceof MainActivity;
    }

    public final void N() {
        if (((t1b) ((qm3) this.J0.b)).j().c.g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            getWindow().clearFlags(8192);
        } else {
            getWindow().addFlags(8192);
        }
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        super.addContentView(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            String strO = ((t1b) zm.a()).j().a.o();
            if (!TextUtils.isEmpty(strO)) {
                configuration.setTo(getBaseContext().getResources().getConfiguration());
                Locale locale = new Locale(strO);
                Locale.setDefault(locale);
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
            }
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.ln, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String strO = ((t1b) zm.a()).j().a.o();
        if (TextUtils.isEmpty(strO)) {
            super.attachBaseContext(context);
            return;
        }
        if (!l8g.c(strO)) {
            Locale locale = new Locale(strO);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
    }

    @Override // defpackage.i7g
    public q1g f() {
        return this.M0;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (((t1b) ((qm3) this.J0.b)).j().c.g.getBoolean("app.messages.enable.animations", true)) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        int i;
        Resources.Theme theme = super.getTheme();
        q1g q1gVarF = f();
        if (q1gVarF != null && q1gVarF.c && (i = this.N0) != nvd.c && i != nvd.d && i != nvd.e && i != nvd.f && i != nvd.b) {
            theme.applyStyle(nvd.a, true);
        }
        return theme;
    }

    @Override // androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.O0) {
            H(i, i2, intent);
        } else {
            this.K0 = new f8(i, i2, intent);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        this.N0 = i;
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onBackPressed() {
        View view;
        if (this.O0) {
            for (a aVar : z().c.f()) {
                if (aVar != null && aVar.F() && !aVar.G() && (view = aVar.S0) != null && view.getWindowToken() != null && aVar.S0.getVisibility() == 0 && (aVar instanceof FrgBase)) {
                    ((FrgBase) aVar).y0();
                }
            }
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public void onCreate(Bundle bundle) {
        a5i a5iVar = (a5i) ((t1b) zm.a()).getAccessor().c(636);
        a5iVar.getClass();
        wqi.c("a5i", "enableWorkManager", new Object[0]);
        a5iVar.b.d();
        jl3 jl3Var = (jl3) getLastNonConfigurationInstance();
        Object obj = jl3Var != null ? jl3Var.a : null;
        if (obj == null || !(obj instanceof Map)) {
            this.R0 = new HashMap();
        } else {
            this.R0 = (HashMap) obj;
        }
        this.J0 = new wib(zm.a());
        this.M0 = ((r1g) ((t1b) zm.a()).getAccessor().c(647)).c();
        z().p.add(new vi6() { // from class: c6
            @Override // defpackage.vi6
            public final void a(a aVar) {
                d6 d6Var = this.a;
                try {
                    aVar.getClass();
                    ((vxf) ((t1b) ((qm3) d6Var.J0.b)).getAccessor().c(74)).d().getClass();
                } catch (Throwable unused) {
                }
            }
        });
        N();
        super.onCreate(bundle);
        wqi.c("d6", "onCreate: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!((t1b) ((qm3) this.J0.b)).j().c.g.getBoolean("app.messages.enable.animations", true)) {
            overridePendingTransition(0, 0);
        }
        if (bundle != null) {
            k5j.a(bundle, this.P0);
        }
        ((t1b) ((qm3) this.J0.b)).l().d(this);
        svi.e(zpi.a(p()), null, null, new e6(this, null), 3);
    }

    @Override // defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ((t1b) ((qm3) this.J0.b)).l().f(this);
        } catch (Exception unused) {
        }
        wqi.c("d6", "onDestroy: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (isChangingConfigurations()) {
            return;
        }
        for (Object obj : this.R0.values()) {
            if (obj instanceof wz4) {
                ((wz4) obj).c = 0;
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (a aVar : z().c.f()) {
            if (aVar instanceof FrgBase) {
                ((FrgBase) aVar).z0(i, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onNewIntent(Intent intent) {
        wqi.c("d6", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onPause() {
        super.onPause();
        wqi.c("d6", "onPause: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        this.O0 = false;
        if (TextUtils.isEmpty(G())) {
            return;
        }
        ((t1b) ((qm3) this.J0.b)).a().i(SystemClock.elapsedRealtime() - this.Q0, G());
    }

    @Override // androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!this.O0) {
            this.L0 = new lk6(i, strArr, iArr);
        }
        if (Arrays.asList(strArr).contains("android.permission.READ_CONTACTS") && lfi.b(this, lfi.a)) {
            ((kzf) ((t1b) ((qm3) this.J0.b)).getAccessor().c(624)).getClass();
            ((kub) ((y4e) kzf.a()).getAccessor().c(318)).b();
        }
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onResume() {
        super.onResume();
        this.Q0 = SystemClock.elapsedRealtime();
        wqi.c("d6", "onResume: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (TextUtils.isEmpty(G())) {
            return;
        }
        wqi.c("d6", "sendScreen: onResume " + G(), new Object[0]);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        wqi.c("k5j", "onSaveInstanceState", new Object[0]);
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(this.P0));
    }

    @Override // defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public void onStart() {
        super.onStart();
        wqi.c("d6", "onStart: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
    }

    @Override // defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public void onStop() {
        super.onStop();
        wqi.c("d6", "onStop: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onUserLeaveHint() {
        for (a aVar : z().c.f()) {
            if (aVar instanceof FrgBase) {
                ((FrgBase) aVar).getClass();
            }
        }
        super.onUserLeaveHint();
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity
    public final void setContentView(int i) {
        J();
        super.setContentView(i);
    }

    @Override // defpackage.nl3
    public final Object x() {
        return this.R0;
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity
    public void setContentView(View view) {
        J();
        super.setContentView(view);
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        super.setContentView(view, layoutParams);
    }
}
