package com.hcaptcha.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.j;
import j.P;
import lombok.NonNull;

/* loaded from: classes7.dex */
public final class b extends com.hcaptcha.sdk.tasks.e<o> implements q {

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ActivityC22955m f363092g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public t f363093h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public HCaptchaConfig f363094i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final j f363095j;

    public b(@NonNull Context context, @NonNull j jVar) {
        this.f363092g = (ActivityC22955m) context;
        this.f363095j = jVar;
    }

    public static b c(@NonNull Context context) {
        new j.a();
        i iVar = new i();
        j jVar = new j();
        jVar.f363105b = iVar;
        return new b(context, jVar);
    }

    public final void d() {
        t tVar = this.f363093h;
        if (tVar != null) {
            tVar.w0();
            this.f363093h = null;
        }
    }

    public final void e() {
        try {
            int i12 = Build.VERSION.SDK_INT;
            ActivityC22955m activityC22955m = this.f363092g;
            String string = (i12 >= 33 ? activityC22955m.getPackageManager().getApplicationInfo(activityC22955m.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : activityC22955m.getPackageManager().getApplicationInfo(activityC22955m.getPackageName(), 128)).metaData.getString("com.hcaptcha.sdk.site-key");
            if (string == null) {
                throw new IllegalStateException("Add missing com.hcaptcha.sdk.site-key meta-data to AndroidManifest.xml or call getClient(context, siteKey) method");
            }
            HCaptchaConfig.a aVarBuilder = HCaptchaConfig.builder();
            aVarBuilder.f363045a = string;
            HCaptchaConfig hCaptchaConfigA = aVarBuilder.a();
            n.f363114a = hCaptchaConfigA.getDiagnosticLog().booleanValue();
            HCaptcha$1 hCaptcha$1 = new HCaptcha$1(this);
            boolean zBooleanValue = hCaptchaConfigA.getHideDialog().booleanValue();
            j jVar = this.f363095j;
            if (zBooleanValue) {
                HCaptchaConfig.a builder = hCaptchaConfigA.toBuilder();
                builder.f363062r = HCaptchaSize.INVISIBLE;
                builder.f363061q = true;
                builder.f363049e = Boolean.FALSE;
                builder.f363048d = true;
                HCaptchaConfig hCaptchaConfigA2 = builder.a();
                this.f363094i = hCaptchaConfigA2;
                this.f363093h = new h(activityC22955m, hCaptchaConfigA2, jVar, hCaptcha$1);
                return;
            }
            if (jVar == null) {
                throw new NullPointerException("internalConfig is marked non-null but is null");
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("hCaptchaConfig", hCaptchaConfigA);
            bundle.putSerializable("hCaptchaInternalConfig", jVar);
            bundle.putParcelable("hCaptchaDialogListener", hCaptcha$1);
            HCaptchaDialogFragment hCaptchaDialogFragment = new HCaptchaDialogFragment();
            hCaptchaDialogFragment.setArguments(bundle);
            this.f363093h = hCaptchaDialogFragment;
            this.f363094i = hCaptchaConfigA;
        } catch (PackageManager.NameNotFoundException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public final void f() {
        if (this.f363093h == null) {
            e();
        }
        this.f363127f.removeCallbacksAndMessages(null);
        this.f363093h.H4(this.f363092g);
    }
}
