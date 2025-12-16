package com.avito.android.phone_confirmation;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.phone_confirmation.state.PhoneConfirmationResolution;
import com.avito.android.util.InterfaceC35745a5;
import com.google.android.gms.internal.p001authapiphone.zzab;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: PhoneConfirmationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/phone_confirmation/PhoneConfirmationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneConfirmationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f215875t = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public U f215876m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public Z f215877n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f215878o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.util.C f215879p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f215880q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final IntentFilter f215881r = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.disposables.c f215882s;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // com.avito.android.ui.activity.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(@Y61.l android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "phone"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 != 0) goto L12
            java.lang.String r2 = ""
        L12:
            r4 = r2
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "is_company"
            r5 = 0
            boolean r2 = r2.getBooleanExtra(r3, r5)
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r6 = "consultation_form"
            boolean r15 = r3.getBooleanExtra(r6, r5)
            if (r1 == 0) goto L44
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r3 < r5) goto L37
            java.lang.Object r1 = com.avito.android.passport.profile_add.merge.profiles_list.c.d(r18)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L3d
        L37:
            java.lang.String r3 = "EX_SAVED_STATE"
            android.os.Parcelable r1 = r1.getParcelable(r3)
        L3d:
            com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState r1 = (com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState) r1
            if (r1 != 0) goto L42
            goto L44
        L42:
            r2 = r15
            goto L5a
        L44:
            com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState r1 = new com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState
            r12 = 0
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 1020(0x3fc, float:1.43E-42)
            r16 = 0
            r3 = r1
            r5 = r2
            r2 = r15
            r15 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L5a:
            com.avito.android.phone_confirmation.di.b$a r3 = com.avito.android.phone_confirmation.di.a.a()
            com.avito.android.K r4 = com.avito.android.di.C29972i.b(r17)
            java.lang.Class<com.avito.android.phone_confirmation.di.c> r5 = com.avito.android.phone_confirmation.di.c.class
            com.avito.android.di.h r4 = com.avito.android.di.C29972i.a(r4, r5)
            com.avito.android.phone_confirmation.di.c r4 = (com.avito.android.phone_confirmation.di.c) r4
            r3.b(r4)
            r3.a(r0)
            r3.d(r1)
            r3.c(r2)
            com.avito.android.phone_confirmation.di.b r1 = r3.build()
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phone_confirmation.PhoneConfirmationActivity.Y1(android.os.Bundle):void");
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        setContentView(R.layout.phone_confirmation_activity);
        super.onCreate(bundle);
        new zzab((Activity) this).startSmsRetriever().c(new C31685o(9)).e(new C31685o(10));
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        U u12 = this.f215876m;
        if (u12 == null) {
            u12 = null;
        }
        bundle.putParcelable("EX_SAVED_STATE", u12.f0());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        int i12 = 0;
        super.onStart();
        com.avito.android.phone_confirmation.view.h hVar = new com.avito.android.phone_confirmation.view.h(findViewById(R.id.phone_confirmation_screen_root));
        c0 c0Var = new c0(hVar.f215994r);
        this.f215880q = c0Var;
        androidx.core.content.d.registerReceiver(this, c0Var, this.f215881r, 2);
        U u12 = this.f215876m;
        if (u12 == null) {
            u12 = null;
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f215878o;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        Z z12 = this.f215877n;
        if (z12 == null) {
            z12 = null;
        }
        com.avito.android.util.C c12 = this.f215879p;
        C33153i c33153i = new C33153i(i12, c12 != null ? c12 : null, hVar);
        I0 i0J0 = O.a(u12, interfaceC35745a5, PhoneConfirmationResolution.f215949f).d0(M.f215873b).j0(interfaceC35745a5.e());
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(hVar.f215992p, c33153i, interfaceC43543a);
        io.reactivex.rxjava3.disposables.d dVarX = u12.getF215892b().d0(L.f215872b).P("").s(interfaceC35745a5.e()).x(hVar.f215986j, c33153i);
        I0 i0B = O.b(u12, interfaceC35745a5, (PhoneConfirmationResolution[]) Arrays.copyOf(new PhoneConfirmationResolution[]{PhoneConfirmationResolution.f215952i}, 1));
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.disposables.d dVarV02 = i0B.D(oVar).v0(hVar.f215997u, c33153i, interfaceC43543a);
        PhoneConfirmationResolution phoneConfirmationResolution = PhoneConfirmationResolution.f215950g;
        PhoneConfirmationResolution phoneConfirmationResolution2 = PhoneConfirmationResolution.f215951h;
        io.reactivex.rxjava3.disposables.d dVarV03 = O.b(u12, interfaceC35745a5, (PhoneConfirmationResolution[]) Arrays.copyOf(new PhoneConfirmationResolution[]{phoneConfirmationResolution, phoneConfirmationResolution2}, 2)).D(oVar).I0(u12.getF215892b(), N.f215874b).v0(hVar.f215998v, c33153i, interfaceC43543a);
        PhoneConfirmationResolution phoneConfirmationResolution3 = PhoneConfirmationResolution.f215945b;
        io.reactivex.rxjava3.disposables.d dVarV04 = O.b(u12, interfaceC35745a5, phoneConfirmationResolution2, phoneConfirmationResolution3).N(C33157m.f215938b).d0(C33158n.f215939b).v0(hVar.f215993q, c33153i, interfaceC43543a);
        PhoneConfirmationResolution phoneConfirmationResolution4 = PhoneConfirmationResolution.f215946c;
        io.reactivex.rxjava3.disposables.d dVarV05 = O.b(u12, interfaceC35745a5, (PhoneConfirmationResolution[]) Arrays.copyOf(new PhoneConfirmationResolution[]{phoneConfirmationResolution3, phoneConfirmationResolution4}, 2)).D(oVar).v0(hVar.f215989m, c33153i, interfaceC43543a);
        io.reactivex.rxjava3.disposables.d dVarV06 = hVar.f215990n.d0(C33167x.f216006b).v0(z12.getF215896b(), c33153i, interfaceC43543a);
        PhoneConfirmationResolution phoneConfirmationResolution5 = PhoneConfirmationResolution.f215948e;
        this.f215882s = new io.reactivex.rxjava3.disposables.c(O.b(u12, interfaceC35745a5, phoneConfirmationResolution3, phoneConfirmationResolution5).N(r.f215943b).I0(u12.getF215892b(), C33162s.f215944b).y0(new C33166w(u12, interfaceC35745a5)).j0(interfaceC35745a5.e()).v0(hVar.f215988l, c33153i, interfaceC43543a), dVarV0, dVarX, dVarV02, dVarV03, dVarV04, dVarV05, O.a(u12, interfaceC35745a5, phoneConfirmationResolution5).d0(B.f215861b).j0(interfaceC35745a5.e()).v0(z12.getF215896b(), c33153i, interfaceC43543a), dVarV06, O.a(u12, interfaceC35745a5, phoneConfirmationResolution3).y0(new K(u12, interfaceC35745a5)).j0(interfaceC35745a5.c()).v0(u12.getF215892b(), c33153i, interfaceC43543a), O.a(u12, interfaceC35745a5, phoneConfirmationResolution4).y0(new C33156l(u12, interfaceC35745a5)).j0(interfaceC35745a5.c()).v0(u12.getF215892b(), c33153i, interfaceC43543a), hVar.f215996t.I0(u12.getF215892b(), C.f215862b).d0(D.f215863b).j0(interfaceC35745a5.c()).v0(u12.getF215892b(), c33153i, interfaceC43543a), hVar.f215995s.x0(interfaceC35745a5.c()).y(300L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).I0(u12.getF215892b(), C33159o.f215940b).N(C33160p.f215941b).d0(C33161q.f215942b).v0(u12.getF215892b(), c33153i, interfaceC43543a), hVar.f215987k.I0(u12.getF215893c(), E.f215864b).N(F.f215865b).I0(u12.getF215892b(), G.f215866b).d0(H.f215867b).v0(u12.getF215892b(), c33153i, interfaceC43543a));
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.f215882s;
        if (cVar != null) {
            cVar.dispose();
        }
        c0 c0Var = this.f215880q;
        if (c0Var == null) {
            c0Var = null;
        }
        unregisterReceiver(c0Var);
        super.onStop();
    }
}
