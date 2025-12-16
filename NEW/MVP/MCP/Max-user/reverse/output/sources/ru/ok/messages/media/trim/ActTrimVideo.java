package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.cn8;
import defpackage.d6;
import defpackage.de;
import defpackage.fa9;
import defpackage.fl5;
import defpackage.n1d;
import defpackage.o3;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.qm3;
import defpackage.t1b;
import defpackage.u39;
import defpackage.v39;
import defpackage.w39;
import defpackage.xd8;
import defpackage.zpi;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ActTrimVideo extends d6 implements u39 {
    public fa9 S0;
    public xd8 T0;

    @Override // defpackage.d6
    public final String G() {
        return null;
    }

    @Override // defpackage.u39
    public final xd8 a() {
        if (this.T0 == null) {
            v39 v39VarI = ((t1b) ((qm3) this.J0.b)).i();
            HashMap map = v39VarI.b;
            w39 w39Var = w39.c;
            xd8 xd8Var = (xd8) map.get(w39Var);
            if (xd8Var != null) {
                xd8Var.c();
                xd8Var.g = null;
            }
            HashMap map2 = v39VarI.a;
            fl5 fl5Var = (fl5) map2.get(w39Var);
            if (fl5Var == null) {
                fl5 fl5Var2 = new fl5(v39VarI.d, v39VarI.e, v39VarI.k, v39VarI.i, v39VarI.f.a);
                map2.put(w39Var, fl5Var2);
                fl5Var = fl5Var2;
            }
            xd8 xd8Var2 = new xd8(w39Var, fl5Var, v39VarI, v39VarI.d, 1.0f, false, false);
            map.put(w39Var, xd8Var2);
            this.T0 = xd8Var2;
        }
        return this.T0;
    }

    @Override // defpackage.d6, defpackage.i7g
    public final q1g f() {
        if (this.S0 == null) {
            this.S0 = fa9.e0;
        }
        return this.S0;
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        de.a().c(new o3(3, this), 300L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.T0 = a();
        setContentView(n1d.act_trim_video);
        K(f().L);
        if (bundle != null) {
            xd8 xd8Var = this.T0;
            xd8Var.h = bundle.getFloat(xd8Var.b("MediaPlayerController.Volume"));
            xd8Var.i = bundle.getBoolean(xd8Var.b("MediaPlayerController.Looping"));
            xd8Var.j = bundle.getBoolean(xd8Var.b("MediaPlayerController.PlayWhenReady"));
            return;
        }
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.VIDEO_URI");
        long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0L);
        long longExtra2 = getIntent().getLongExtra("ru.ok.tamtam.extra.END_POSITION", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.MUTE", false);
        if (longExtra2 == -1) {
            longExtra2 = zpi.c(this, uri);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("ru.ok.tamtam.extra.VIDEO_URI", uri);
        bundle2.putLong("ru.ok.tamtam.extra.START_POSITION", longExtra);
        bundle2.putLong("ru.ok.tamtam.extra.END_POSITION", longExtra2);
        bundle2.putBoolean("ru.ok.tamtam.extra.MUTE", booleanExtra);
        FrgTrimVideo frgTrimVideo = new FrgTrimVideo();
        frgTrimVideo.n0(bundle2);
        cn8.a(z(), q0d.act_trim_video__container, frgTrimVideo, "ru.ok.messages.media.trim.FrgTrimVideo");
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.T0 != null) {
            ((t1b) ((qm3) this.J0.b)).i().p(this.T0);
        }
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.T0 != null) {
            ((t1b) ((qm3) this.J0.b)).i().l(this.T0);
        }
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.T0 != null) {
            ((t1b) ((qm3) this.J0.b)).i().k(this.T0);
        }
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        xd8 xd8Var = this.T0;
        if (xd8Var != null) {
            bundle.putFloat(xd8Var.b("MediaPlayerController.Volume"), xd8Var.h);
            bundle.putBoolean(xd8Var.b("MediaPlayerController.Looping"), xd8Var.i);
            bundle.putBoolean(xd8Var.b("MediaPlayerController.PlayWhenReady"), xd8Var.j);
        }
    }
}
