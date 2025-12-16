package com.avito.android.code_confirmation.code_confirmation;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter;
import com.avito.android.code_confirmation.code_confirmation.m0;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import zz.InterfaceC50647a;

/* compiled from: CodeConfirmationPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/T;", "Lcom/avito/android/code_confirmation/code_confirmation/CodeConfirmationPresenter;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class T implements CodeConfirmationPresenter {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29394g f119440a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.recall_me_core.b> f119441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f119442c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f119443d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final W f119444e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<Long> f119445f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.timer.a f119446g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g0 f119447h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f119448i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f119449j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f119450k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f119451l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public f0 f119452m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public CodeConfirmationActivity f119453n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f119454o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f119455p = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f119456q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    public boolean f119457r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public String f119458s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public String f119459t;

    /* renamed from: u, reason: collision with root package name */
    public int f119460u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Long f119461v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public Map<String, String> f119462w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final String f119463x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public CodeConfirmationPresenter.Mode f119464y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public CodeConfirmationPresenter.TfaFlow f119465z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T(@Y61.k com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g r1, @Y61.k h31.e<com.avito.android.recall_me_core.b> r2, @Y61.k com.avito.android.util.InterfaceC35745a5 r3, @Y61.k com.avito.android.util.InterfaceC35741a1 r4, @Y61.k com.avito.android.code_confirmation.code_confirmation.W r5, @Y61.k com.avito.android.util.InterfaceC35945t1<java.lang.Long> r6, @Y61.k com.avito.android.code_confirmation.code_confirmation.timer.a r7, @Y61.k com.avito.android.code_confirmation.code_confirmation.g0 r8, @Y61.k hD.C40806a r9, @Y61.k zz.InterfaceC50647a r10, @Y61.k com.avito.android.dialog.InterfaceC30274a r11, @Y61.k com.avito.android.deeplink_handler.handler.composite.a r12, @com.avito.android.code_confirmation.code_confirmation.di.i @Y61.k com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r13, @Y61.l com.avito.android.util.Kundle r14) {
        /*
            r0 = this;
            r0.<init>()
            r0.f119440a = r1
            r0.f119441b = r2
            r0.f119442c = r3
            r0.f119443d = r4
            r0.f119444e = r5
            r0.f119445f = r6
            r0.f119446g = r7
            r0.f119447h = r8
            r0.f119448i = r10
            r0.f119449j = r11
            r0.f119450k = r12
            r0.f119451l = r13
            io.reactivex.rxjava3.disposables.c r1 = new io.reactivex.rxjava3.disposables.c
            r1.<init>()
            r0.f119454o = r1
            io.reactivex.rxjava3.disposables.c r1 = new io.reactivex.rxjava3.disposables.c
            r1.<init>()
            r0.f119455p = r1
            io.reactivex.rxjava3.disposables.c r1 = new io.reactivex.rxjava3.disposables.c
            r1.<init>()
            r0.f119456q = r1
            if (r14 == 0) goto L3f
            java.lang.String r1 = "autoSend"
            java.lang.Boolean r1 = r14.a(r1)
            if (r1 == 0) goto L3f
        L3a:
            boolean r1 = r1.booleanValue()
            goto L54
        L3f:
            r9.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = hD.C40806a.f397105l
            r2 = 1
            r1 = r1[r2]
            com.avito.android.A0$a r1 = r9.f397107c
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L3a
        L54:
            r0.f119457r = r1
            java.lang.String r1 = ""
            if (r14 == 0) goto L62
            java.lang.String r2 = "login"
            java.lang.String r2 = r14.g(r2)
            if (r2 != 0) goto L63
        L62:
            r2 = r1
        L63:
            r0.f119458s = r2
            if (r14 == 0) goto L71
            java.lang.String r2 = "text"
            java.lang.String r2 = r14.g(r2)
            if (r2 != 0) goto L70
            goto L71
        L70:
            r1 = r2
        L71:
            r0.f119459t = r1
            if (r14 == 0) goto L82
            java.lang.String r1 = "length"
            java.lang.Integer r1 = r14.b(r1)
            if (r1 == 0) goto L82
            int r1 = r1.intValue()
            goto L83
        L82:
            r1 = 5
        L83:
            r0.f119460u = r1
            r1 = 0
            if (r14 == 0) goto L99
            android.os.Bundle r2 = r14.f318647b
            java.lang.String r3 = "nextRequestDate"
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L99
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.ClassCastException -> L99
            goto L9a
        L99:
            r2 = r1
        L9a:
            r0.f119461v = r2
            if (r14 == 0) goto La6
            java.lang.String r2 = "messages"
            java.util.HashMap r2 = r14.c(r2)
            if (r2 != 0) goto Laa
        La6:
            java.util.Map r2 = kotlin.collections.P0.c()
        Laa:
            r0.f119462w = r2
            if (r14 == 0) goto Lb4
            java.lang.String r1 = "challengeId"
            java.lang.String r1 = r14.g(r1)
        Lb4:
            r0.f119463x = r1
            if (r14 == 0) goto Lc2
            java.lang.String r1 = "mode"
            android.os.Parcelable r1 = r14.d(r1)
            com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter$Mode r1 = (com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter.Mode) r1
            if (r1 != 0) goto Lc4
        Lc2:
            com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter$Mode$Default r1 = com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter.Mode.Default.f119406b
        Lc4:
            r0.f119464y = r1
            if (r14 == 0) goto Ld2
            java.lang.String r1 = "flow"
            android.os.Parcelable r1 = r14.d(r1)
            com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter$TfaFlow r1 = (com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter.TfaFlow) r1
            if (r1 != 0) goto Ld4
        Ld2:
            com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter$TfaFlow$Sms r1 = com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter.TfaFlow.Sms.f119409b
        Ld4:
            r0.f119465z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_confirmation.code_confirmation.T.<init>(com.avito.android.code_confirmation.code_confirmation.g, h31.e, com.avito.android.util.a5, com.avito.android.util.a1, com.avito.android.code_confirmation.code_confirmation.W, com.avito.android.util.t1, com.avito.android.code_confirmation.code_confirmation.timer.a, com.avito.android.code_confirmation.code_confirmation.g0, hD.a, zz.a, com.avito.android.dialog.a, com.avito.android.deeplink_handler.handler.composite.a, com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker, com.avito.android.util.Kundle):void");
    }

    public static final void g(T t12, Throwable th2) {
        t12.getClass();
        t12.f119462w = P0.c();
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            if (apiException.f318522b instanceof com.avito.android.remote.error.s) {
                return;
            }
            com.avito.android.error.z.h(apiException, new G(t12), new H(1, t12, T.class, "highlightErrors", "highlightErrors(Ljava/util/Map;)V", 0), null, 60);
            return;
        }
        if (th2 instanceof CodeAlreadyConfirmedException) {
            CodeConfirmationActivity codeConfirmationActivity = t12.f119453n;
            if (codeConfirmationActivity != null) {
                codeConfirmationActivity.a2(new m0.a(((CodeAlreadyConfirmedException) th2).f119395b));
                return;
            }
            return;
        }
        if (th2 instanceof FollowDeeplinkException) {
            b.a.a(t12.f119450k, ((FollowDeeplinkException) th2).f119415b, null, null, 6);
        } else if (th2 instanceof ShowUserDialogException) {
            t12.f119455p.b(t12.f119449j.f(((ShowUserDialogException) th2).f119432b).m(new F(t12)));
        } else {
            f0 f0Var = t12.f119452m;
            if (f0Var != null) {
                f0Var.f(InterfaceC35741a1.a.a(t12.f119443d, th2, null, null, 6));
            }
        }
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void a() {
        f0 f0Var = this.f119452m;
        if (f0Var != null) {
            f0Var.d("");
        }
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void b(boolean z12) {
        if (z12) {
            f0 f0Var = this.f119452m;
            if (f0Var != null) {
                f0Var.h();
                return;
            }
            return;
        }
        f0 f0Var2 = this.f119452m;
        if (f0Var2 != null) {
            f0Var2.c();
        }
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void c(@Y61.k CodeConfirmationActivity codeConfirmationActivity) {
        this.f119454o.b(this.f119447h.connect().t0(new C29408v(this)));
        this.f119453n = codeConfirmationActivity;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void c0() {
        this.f119454o.e();
        this.f119453n = null;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void d(@Y61.k String str, @Y61.k String str2, long j12, int i12, @Y61.k CodeConfirmationPresenter.TfaFlow tfaFlow, @Y61.k CodeConfirmationPresenter.Mode mode) {
        this.f119458s = str;
        this.f119459t = str2;
        this.f119461v = Long.valueOf(TimeUnit.SECONDS.toMillis(j12) + Calendar.getInstance().getTimeInMillis());
        this.f119460u = i12;
        this.f119465z = tfaFlow;
        this.f119464y = mode;
        h();
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.h(Boolean.valueOf(this.f119457r), "autoSend");
        Long l12 = this.f119461v;
        Bundle bundle = kundle.f318647b;
        if (l12 == null) {
            bundle.remove("nextRequestDate");
        } else {
            bundle.putLong("nextRequestDate", l12.longValue());
        }
        kundle.m("login", this.f119458s);
        kundle.m("text", this.f119459t);
        kundle.i(Integer.valueOf(this.f119460u), "length");
        kundle.n("messages", this.f119462w);
        kundle.m("challengeId", this.f119463x);
        kundle.j(this.f119464y, "mode");
        kundle.j(this.f119465z, MessageBody.SystemMessageBody.Platform.FLOW);
        return kundle;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void e() {
        CodeConfirmationActivity codeConfirmationActivity = this.f119453n;
        if (codeConfirmationActivity != null) {
            codeConfirmationActivity.a2(m0.b.f119573a);
        }
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void e0() {
        this.f119455p.e();
        this.f119452m = null;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.CodeConfirmationPresenter
    public final void f(@Y61.k f0 f0Var) {
        this.f119452m = f0Var;
        io.reactivex.rxjava3.core.z<G0> zVarA = C37722i.a(f0Var.f119542h);
        Input input = f0Var.f119545k;
        io.reactivex.rxjava3.disposables.d dVarT0 = io.reactivex.rxjava3.core.z.g0(zVarA, com.avito.android.lib.design.input.n.d(input)).t0(new C29409w(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f119455p;
        cVar.b(dVarT0);
        cVar.b(C37722i.a(f0Var.f119543i).N(new c0(f0Var)).t0(new C29410x(this)));
        com.jakewharton.rxrelay3.b<G0> bVar = f0Var.f119546l;
        bVar.getClass();
        cVar.b(new C41981q0(bVar).t0(new C29411y(f0Var, this)));
        cVar.b(com.avito.android.lib.design.input.n.e(input).N0().d0(new l41.o() { // from class: com.avito.android.code_confirmation.code_confirmation.b0
            @Override // l41.o
            public final Object apply(Object obj) {
                return ((CharSequence) obj).toString();
            }
        }).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(new C29412z(this)));
        h();
    }

    public final void h() {
        f0 f0Var;
        if (this.f119457r) {
            i(true);
        }
        CodeConfirmationPresenter.TfaFlow tfaFlow = this.f119465z;
        if (kotlin.jvm.internal.L.f(tfaFlow, CodeConfirmationPresenter.TfaFlow.Sms.f119409b) ? true : kotlin.jvm.internal.L.f(tfaFlow, CodeConfirmationPresenter.TfaFlow.SmsFromPhoneList.f119410b)) {
            f0 f0Var2 = this.f119452m;
            if (f0Var2 != null) {
                String str = this.f119459t;
                AttributedText attributedTextA = f0Var2.f119535a.a(str, this.f119458s);
                TextView textView = f0Var2.f119540f;
                if (attributedTextA != null) {
                    com.avito.android.util.text.j.c(textView, attributedTextA, null);
                } else {
                    textView.setText(str);
                }
                f0Var2.f119545k.setHint(R.string.sms_input_hint);
            }
            if (this.f119461v != null) {
                io.reactivex.rxjava3.disposables.c cVar = this.f119456q;
                cVar.e();
                Long l12 = this.f119461v;
                cVar.b(this.f119446g.a(l12 != null ? l12.longValue() : 0L).j0(this.f119442c.e()).v0(new N(this), new O(this), new C29407u(this, 1)));
                this.f119455p.b(cVar);
            } else {
                f0 f0Var3 = this.f119452m;
                if (f0Var3 != null) {
                    f0Var3.i();
                }
            }
            f0 f0Var4 = this.f119452m;
            if (f0Var4 != null) {
                e0 e0Var = new e0(f0Var4);
                NavBar navBar = f0Var4.f119541g;
                navBar.c(R.attr.ic_arrowBack24, e0Var);
                navBar.setActions(new View[0]);
            }
        }
        f0 f0Var5 = this.f119452m;
        if (f0Var5 != null) {
            I5.a(f0Var5.f119539e, f0Var5.f119536b.getString(R.string.code_confirmation_title), false);
        }
        f0 f0Var6 = this.f119452m;
        if (f0Var6 != null) {
            f0Var6.f119545k.setMaxLength(this.f119460u);
        }
        Map<String, String> map = this.f119462w;
        this.f119462w = map;
        String str2 = (String) C42745f0.F(map.values());
        if (str2 == null || (f0Var = this.f119452m) == null) {
            return;
        }
        f0Var.e(str2);
    }

    public final void i(boolean z12) {
        f0 f0Var = this.f119452m;
        if (f0Var != null) {
            String strValueOf = String.valueOf(f0Var.f119545k.m53getText());
            if (!z12 || strValueOf.length() >= this.f119460u) {
                int length = strValueOf.length();
                W w12 = this.f119444e;
                if (length == 0) {
                    f0 f0Var2 = this.f119452m;
                    if (f0Var2 != null) {
                        f0Var2.e(w12.getString(R.string.empty_input_error));
                        return;
                    }
                    return;
                }
                if (strValueOf.length() < this.f119460u) {
                    f0 f0Var3 = this.f119452m;
                    if (f0Var3 != null) {
                        f0Var3.e(w12.getString(R.string.wrong_code_error));
                        return;
                    }
                    return;
                }
                CodeConfirmationPresenter.Mode mode = this.f119464y;
                boolean z13 = mode instanceof CodeConfirmationPresenter.Mode.ModeForLogin;
                io.reactivex.rxjava3.disposables.c cVar = this.f119454o;
                InterfaceC35745a5 interfaceC35745a5 = this.f119442c;
                if (!z13) {
                    if (mode instanceof CodeConfirmationPresenter.Mode.RecallMe) {
                        String str = ((CodeConfirmationPresenter.Mode.RecallMe) mode).f119408b;
                        cVar.b(new C42016n(this.f119441b.get().a(str, strValueOf).s(interfaceC35745a5.e()).j(new A(this)), new C29407u(this, 0)).x(new B(this, str), new l41.g() { // from class: com.avito.android.code_confirmation.code_confirmation.C
                            @Override // l41.g
                            public final void accept(Object obj) {
                                Throwable th2 = (Throwable) obj;
                                T t12 = this.f119394b;
                                t12.getClass();
                                if (th2 instanceof ApiException) {
                                    com.avito.android.error.z.h(th2, new D(t12, th2), null, new E(t12), 58);
                                    return;
                                }
                                f0 f0Var4 = t12.f119452m;
                                if (f0Var4 != null) {
                                    f0Var4.f(InterfaceC35741a1.a.a(t12.f119443d, th2, null, null, 6));
                                }
                            }
                        }));
                        return;
                    }
                    return;
                }
                CodeConfirmationPresenter.Mode.ModeForLogin modeForLogin = (CodeConfirmationPresenter.Mode.ModeForLogin) mode;
                boolean zF2 = kotlin.jvm.internal.L.f(modeForLogin, CodeConfirmationPresenter.Mode.Default.f119406b);
                InterfaceC29394g interfaceC29394g = this.f119440a;
                if (!zF2 && !kotlin.jvm.internal.L.f(modeForLogin, CodeConfirmationPresenter.Mode.PhoneVerification.f119407b)) {
                    throw new NoWhenBranchMatchedException();
                }
                C42007e c42007eA = interfaceC29394g.a(this.f119458s, strValueOf, false);
                cVar.b(com.avito.android.analytics.screens.utils.D.a(new C42016n(c42007eA.s(interfaceC35745a5.e()).j(new P(this)), new C29407u(this, 2)), this.f119451l, "checkcode", new Q(this), new S(this), 16));
            }
        }
    }
}
