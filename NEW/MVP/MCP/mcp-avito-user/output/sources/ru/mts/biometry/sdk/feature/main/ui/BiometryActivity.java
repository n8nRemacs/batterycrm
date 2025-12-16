package ru.mts.biometry.sdk.feature.main.ui;

import Aa1.a;
import Ba1.C13125c;
import Ba1.l;
import W91.h;
import X91.b;
import X91.c;
import X91.d;
import X91.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.H;
import androidx.view.C22981N;
import com.avito.android.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import ru.mts.biometry.api.SDKEnvironment;
import ru.mts.biometry.sdk.OnboardingSettings;
import ru.mts.biometry.sdk.PassportValidationScreenDesign;
import ru.mts.biometry.sdk.feature.document.camera.ui.n;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;
import ru.mts.biometry.sdk.feature.selfie.ui.camera.i;
import ru.mts.biometry.sdk.view.modalcard.f;
import z91.e;
import z91.s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/main/ui/BiometryActivity;", "Landroidx/appcompat/app/m;", "LAa1/a;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BiometryActivity extends androidx.appcompat.app.m implements a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f436466i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C13125c f436467b;

    /* renamed from: c, reason: collision with root package name */
    public h f436468c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f436469d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC42726C f436470e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC42726C f436471f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC42726C f436472g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC42726C f436473h;

    public BiometryActivity() {
        super(R.layout.sdk_bio_activity_biometry);
        this.f436467b = new C13125c();
        this.f436469d = C42727D.c(new c(this));
        this.f436470e = C42727D.c(new b(this));
        this.f436471f = C42727D.c(new d(this));
        this.f436472g = C42727D.c(new X91.h(this));
        this.f436473h = C42727D.c(new g(this));
    }

    public final void a() {
        Da1.d dVar = Da1.d.f3247l;
        Drawable drawableC = H91.b.c(R.attr.sdkBioIcWarning, this);
        String string = getString(R.string.sdk_bio_quit_modal_title);
        String string2 = getString(R.string.sdk_bio_quit_modal_no);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: X91.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BiometryActivity f18727c;

            {
                this.f18727c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiometryActivity biometryActivity = this.f18727c;
                switch (i12) {
                    case 0:
                        int i13 = BiometryActivity.f436466i;
                        ru.mts.biometry.sdk.view.modalcard.b bVar = (ru.mts.biometry.sdk.view.modalcard.b) biometryActivity.getSupportFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar != null) {
                            bVar.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    default:
                        int i14 = BiometryActivity.f436466i;
                        ru.mts.biometry.sdk.view.modalcard.b bVar2 = (ru.mts.biometry.sdk.view.modalcard.b) biometryActivity.getSupportFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar2 != null) {
                            bVar2.dismissAllowingStateLoss();
                        }
                        biometryActivity.setResult(11);
                        biometryActivity.finish();
                        break;
                }
            }
        };
        final int i13 = 1;
        new f(null, drawableC, string, "", string2, getString(R.string.sdk_bio_quit_modal_yes), onClickListener, new View.OnClickListener(this) { // from class: X91.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BiometryActivity f18727c;

            {
                this.f18727c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BiometryActivity biometryActivity = this.f18727c;
                switch (i13) {
                    case 0:
                        int i132 = BiometryActivity.f436466i;
                        ru.mts.biometry.sdk.view.modalcard.b bVar = (ru.mts.biometry.sdk.view.modalcard.b) biometryActivity.getSupportFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar != null) {
                            bVar.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    default:
                        int i14 = BiometryActivity.f436466i;
                        ru.mts.biometry.sdk.view.modalcard.b bVar2 = (ru.mts.biometry.sdk.view.modalcard.b) biometryActivity.getSupportFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar2 != null) {
                            bVar2.dismissAllowingStateLoss();
                        }
                        biometryActivity.setResult(11);
                        biometryActivity.finish();
                        break;
                }
            }
        }, dVar).show(getSupportFragmentManager(), "ru.mts.biometry.sdk.view.modalcard.d");
    }

    @Override // androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        h hVar = this.f436468c;
        if (hVar == null) {
            hVar = null;
        }
        if (hVar.f17823e) {
            return;
        }
        Fragment fragmentG = getSupportFragmentManager().G(R.id.sdk_root_container);
        if (!(fragmentG instanceof i ? true : fragmentG instanceof ru.mts.biometry.sdk.feature.passport.ui.camera.m ? true : fragmentG instanceof n ? true : fragmentG instanceof ru.mts.biometry.sdk.feature.registration.ui.camera.h)) {
            a();
        } else {
            h hVar2 = this.f436468c;
            (hVar2 != null ? hVar2 : null).a();
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l.a(this);
        C91.a aVar = C91.a.f2014a;
        C91.a.f2019f = (OnboardingSettings) getIntent().getParcelableExtra("ONBOARDING");
        InterfaceC42726C interfaceC42726C = this.f436473h;
        if (((Number) interfaceC42726C.getValue()).intValue() != 0) {
            setTheme(((Number) interfaceC42726C.getValue()).intValue());
        }
        InterfaceC42726C interfaceC42726C2 = this.f436471f;
        InterfaceC42726C interfaceC42726C3 = this.f436470e;
        InterfaceC42726C interfaceC42726C4 = this.f436472g;
        InterfaceC42726C interfaceC42726C5 = this.f436469d;
        if (bundle != null && bundle.getInt("my_pid_key") != Process.myPid()) {
            C91.a.f2017d = (ru.mts.biometry.sdk.feature.main.entity.b) bundle.getParcelable("flow_config");
            C91.a.f2019f = (OnboardingSettings) bundle.getParcelable("onboarding");
            Context applicationContext = getApplicationContext();
            String str = (String) interfaceC42726C5.getValue();
            if (str == null) {
                str = "";
            }
            s sVar = new s(applicationContext, new z91.d(str, ((Boolean) interfaceC42726C4.getValue()).booleanValue(), (SDKEnvironment) interfaceC42726C3.getValue(), (PassportValidationScreenDesign) interfaceC42726C2.getValue()));
            e.f443908b = sVar;
            h hVarB = sVar.b();
            hVarB.getClass();
            hVarB.f17820b = bundle.getInt("flow_position", 0);
        }
        super.onCreate(bundle);
        l.a(this);
        if (((String) interfaceC42726C5.getValue()) == null) {
            Toast.makeText(this, getString(R.string.sdk_bio_error_wrong_short_req_id), 0).show();
            finish();
            return;
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.sdk_bio_activity_biometry, (ViewGroup) null, false);
        if (((FragmentContainerView) g2.d.a(viewInflate, R.id.sdk_root_container)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.sdk_root_container)));
        }
        setContentView((ConstraintLayout) viewInflate);
        if (bundle == null) {
            Context applicationContext2 = getApplicationContext();
            String str2 = (String) interfaceC42726C5.getValue();
            e.f443908b = new s(applicationContext2, new z91.d(str2 != null ? str2 : "", ((Boolean) interfaceC42726C4.getValue()).booleanValue(), (SDKEnvironment) interfaceC42726C3.getValue(), (PassportValidationScreenDesign) interfaceC42726C2.getValue()));
            r rVar = new r();
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.sdk_root_container, rVar, null);
            hE2.f46457p = true;
            hE2.f();
        }
        s sVar2 = e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        this.f436468c = sVar2.b();
        s sVar3 = e.f443908b;
        if (sVar3 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        ((ru.mts.biometry.api.repo.c) sVar3.f443932l.getValue()).c(this);
        C43259k.d(C22981N.a(getLifecycle()), C43262l0.f411947c, null, new X91.f(this, null), 2);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (((String) this.f436469d.getValue()) == null || !isFinishing()) {
            return;
        }
        h hVar = this.f436468c;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f17820b = 0;
        hVar.f17819a = null;
        hVar.f17822d.clear();
        s sVar = e.f443908b;
        if (sVar != null) {
            ((ru.mts.biometry.api.repo.c) sVar.f443932l.getValue()).a(this);
        }
        e.f443908b = null;
        C91.a.f2015b = null;
        C42784z0 c42784z0 = C42784z0.f406748b;
        C91.a.f2016c = null;
        C91.a.f2017d = null;
        C91.a.f2018e = new E91.b();
        C91.a.f2019f = null;
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        h hVar = this.f436468c;
        if (hVar == null) {
            hVar = null;
        }
        hVar.getClass();
        bundle.putInt("flow_position", hVar.f17820b);
        C91.a aVar = C91.a.f2014a;
        bundle.putInt("my_pid_key", Process.myPid());
        bundle.putParcelable("flow_config", C91.a.f2017d);
        bundle.putParcelable("onboarding", C91.a.f2019f);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        C13125c c13125c = this.f436467b;
        c13125c.getClass();
        c13125c.f1498a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(c13125c);
        h hVar = this.f436468c;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f17821c = this;
        CopyOnWriteArrayList copyOnWriteArrayList = hVar.f17822d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            W91.f fVar = (W91.f) it.next();
            copyOnWriteArrayList.remove(fVar);
            if (fVar instanceof W91.d) {
                Aa1.b.b(hVar);
            } else if (fVar instanceof W91.e) {
                W91.e eVar = (W91.e) fVar;
                hVar.c(new W91.e(eVar.f17817a, eVar.f17818b));
            } else if (fVar instanceof W91.b) {
                hVar.a();
            } else if (fVar instanceof W91.c) {
                hVar.d(((W91.c) fVar).f17815a);
            }
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Thread.setDefaultUncaughtExceptionHandler(this.f436467b.f1498a);
        h hVar = this.f436468c;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f17821c = null;
    }
}
