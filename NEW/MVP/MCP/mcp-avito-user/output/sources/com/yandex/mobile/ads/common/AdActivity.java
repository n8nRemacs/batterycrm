package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.C39311c1;
import com.yandex.mobile.ads.impl.C39354p0;
import com.yandex.mobile.ads.impl.C39362s0;
import com.yandex.mobile.ads.impl.InterfaceC39348n0;
import com.yandex.mobile.ads.impl.qj1;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final qj1 f382641a = new qj1();

    /* renamed from: b, reason: collision with root package name */
    @P
    private RelativeLayout f382642b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private InterfaceC39348n0 f382643c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private C39362s0 f382644d;

    @Override // android.app.Activity
    public final void onBackPressed() {
        InterfaceC39348n0 interfaceC39348n0 = this.f382643c;
        if (interfaceC39348n0 == null || interfaceC39348n0.f()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C39362s0 c39362s0 = this.f382644d;
        if (c39362s0 != null) {
            c39362s0.a(configuration);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ResultReceiver resultReceiver;
        super.onCreate(bundle);
        this.f382642b = new RelativeLayout(this);
        C39362s0 c39362s0 = new C39362s0(this);
        this.f382644d = c39362s0;
        RelativeLayout relativeLayout = this.f382642b;
        Intent intent = getIntent();
        InterfaceC39348n0 interfaceC39348n0A = null;
        if (intent != null) {
            Window window = getWindow();
            try {
                resultReceiver = (ResultReceiver) intent.getParcelableExtra("extra_receiver");
            } catch (Exception unused) {
                resultReceiver = null;
            }
            interfaceC39348n0A = C39354p0.a().a(this, relativeLayout, resultReceiver, new C39311c1(this, resultReceiver), c39362s0, intent, window);
        }
        this.f382643c = interfaceC39348n0A;
        if (interfaceC39348n0A == null) {
            finish();
            return;
        }
        interfaceC39348n0A.g();
        this.f382643c.c();
        RelativeLayout relativeLayout2 = this.f382642b;
        this.f382641a.getClass();
        relativeLayout2.setTag(qj1.a("root_layout"));
        setContentView(this.f382642b);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        InterfaceC39348n0 interfaceC39348n0 = this.f382643c;
        if (interfaceC39348n0 != null) {
            interfaceC39348n0.onAdClosed();
            this.f382643c.d();
        }
        RelativeLayout relativeLayout = this.f382642b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        InterfaceC39348n0 interfaceC39348n0 = this.f382643c;
        if (interfaceC39348n0 != null) {
            interfaceC39348n0.b();
        }
        C39362s0 c39362s0 = this.f382644d;
        if (c39362s0 != null) {
            c39362s0.a();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        InterfaceC39348n0 interfaceC39348n0 = this.f382643c;
        if (interfaceC39348n0 != null) {
            interfaceC39348n0.a();
        }
        C39362s0 c39362s0 = this.f382644d;
        if (c39362s0 != null) {
            c39362s0.b();
        }
    }
}
