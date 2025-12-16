package com.avito.android.verification.verification_input_inn;

import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.inn.VerificationInnValidationResult;
import com.avito.android.remote.model.inn.VerificationInputInnResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.n;
import com.avito.android.verification.verification_input_inn.l;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationInputInnViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/w;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/verification/verification_input_inn/v;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w extends M0 implements v {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_input_inn.e f325645E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final VerificationInputInnArgs f325646J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f325647K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325648L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.p f325649M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.n f325650N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f325651O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_input_inn.a f325652P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.b f325653Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f325654R = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<l> f325655S = new C23038g0<>();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f325656T = new C23038g0<>();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<String> f325657U = new D<>();

    /* compiled from: VerificationInputInnViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ScreenPerformanceTracker.a.b(w.this.f325647K, null, 3);
        }
    }

    /* compiled from: VerificationInputInnViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            w.this.f325656T.setValue(Boolean.TRUE);
        }
    }

    /* compiled from: VerificationInputInnViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/inn/VerificationInnValidationResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeepLink f325662c;

        public d(DeepLink deepLink) {
            this.f325662c = deepLink;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            G0 g02;
            VerificationInnValidationResult verificationInnValidationResult = (VerificationInnValidationResult) obj;
            Map<String, AttributedText> errors = verificationInnValidationResult.getErrors();
            w wVar = w.this;
            if (errors != null) {
                wVar.f325653Q.e(errors);
                g02 = G0.f406611a;
            } else {
                DeepLink uri = verificationInnValidationResult.getUri();
                if (uri != null) {
                    b.a.a(wVar.f325648L, uri, null, null, 6);
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
            }
            if (g02 == null) {
                b.a.a(wVar.f325648L, this.f325662c, null, null, 6);
            }
        }
    }

    /* compiled from: VerificationInputInnViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            w.this.f325657U.setValue(z.l((Throwable) obj));
        }
    }

    @Inject
    public w(@Y61.k com.avito.android.verification.verification_input_inn.e eVar, @Y61.k VerificationInputInnArgs verificationInputInnArgs, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.inn.p pVar, @Y61.k com.avito.android.verification.inn.n nVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.verification.verification_input_inn.a aVar2, @Y61.k com.avito.android.verification.inn.b bVar) {
        this.f325645E = eVar;
        this.f325646J = verificationInputInnArgs;
        this.f325647K = screenPerformanceTracker;
        this.f325648L = aVar;
        this.f325649M = pVar;
        this.f325650N = nVar;
        this.f325651O = interfaceC35745a5;
        this.f325652P = aVar2;
        this.f325653Q = bVar;
        ke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.verification.verification_input_inn.v
    public final void A3(@Y61.k DeepLink deepLink) {
        if (L.f(this.f325656T.getValue(), Boolean.TRUE)) {
            return;
        }
        com.avito.android.verification.inn.b bVar = this.f325653Q;
        ?? r12 = bVar.f323880g;
        this.f325650N.getClass();
        n.a aVarA = com.avito.android.verification.inn.n.a(r12);
        if (aVarA instanceof n.a.C10034a) {
            bVar.e(((n.a.C10034a) aVarA).f324116a);
        } else if (aVarA instanceof n.a.b) {
            this.f325654R.b(new C42017o(this.f325645E.a(this.f325646J.f325593b, ((n.a.b) aVarA).f324117a).s(this.f325651O.e()).j(new c()), new com.avito.android.verification.links.tinkoff_finish.g(this, 2)).x(new d(deepLink), new e()));
        }
    }

    @Override // com.avito.android.verification.verification_input_inn.v
    /* renamed from: C8, reason: from getter */
    public final C23038g0 getF325656T() {
        return this.f325656T;
    }

    @Override // com.avito.android.verification.inn.list.button.c
    public final void E7(@Y61.k ButtonItem buttonItem) {
        i7(buttonItem.f323903d);
    }

    @Override // com.avito.android.verification.verification_input_inn.v
    public final void W1() {
        ke();
    }

    @Override // com.avito.android.verification.common.list.button_default.d
    public final void db(@Y61.k com.avito.android.verification.common.list.button_default.a aVar) {
        i7(aVar.f323401d);
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        b.a.a(this.f325648L, deepLink, null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void ke() {
        this.f325654R.b(io.reactivex.rxjava3.core.z.p(io.reactivex.rxjava3.core.z.J0(io.reactivex.rxjava3.core.z.c0(P2.c.f318721a)), this.f325645E.c(this.f325646J.f325593b).j(new a()).F()).j0(this.f325651O.e()).t0(new l41.g() { // from class: com.avito.android.verification.verification_input_inn.w.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                DeepLink noMatchLink;
                P2 p22 = (P2) obj;
                w wVar = w.this;
                wVar.getClass();
                boolean z12 = p22 instanceof P2.c;
                C23038g0<l> c23038g0 = wVar.f325655S;
                if (z12) {
                    c23038g0.setValue(l.c.f325629a);
                    return;
                }
                boolean z13 = p22 instanceof P2.b;
                ScreenPerformanceTracker screenPerformanceTracker = wVar.f325647K;
                ScreenPerformanceTracker screenPerformanceTracker2 = wVar.f325647K;
                if (!z13) {
                    if (p22 instanceof P2.a) {
                        ApiError apiError = ((P2.a) p22).f318719a;
                        ScreenPerformanceTracker.a.d(wVar.f325647K, null, null, new J.a(apiError), null, 11);
                        screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                        c23038g0.setValue(new l.a(z.k(apiError)));
                        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, J.b.f90385a, null, 5);
                        return;
                    }
                    return;
                }
                J.b bVar = J.b.f90385a;
                ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, bVar, null, 11);
                screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                VerificationInputInnResult verificationInputInnResult = (VerificationInputInnResult) ((P2.b) p22).f318720a;
                wVar.f325652P.getClass();
                VerificationAction action = verificationInputInnResult.getAction();
                String title = action != null ? action.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                VerificationAction action2 = verificationInputInnResult.getAction();
                if (action2 == null || (noMatchLink = action2.getUri()) == null) {
                    noMatchLink = new NoMatchLink();
                }
                Boolean boolIsClosable = verificationInputInnResult.isClosable();
                k kVar = new k(title, noMatchLink, boolIsClosable != null ? boolIsClosable.booleanValue() : false);
                List listB = com.avito.android.verification.inn.p.b(wVar.f325649M, verificationInputInnResult.getFields(), verificationInputInnResult.getTitle(), verificationInputInnResult.getSubtitle(), 24);
                c23038g0.setValue(new l.b(kVar));
                wVar.f325653Q.f(null, listB);
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, bVar, null, 5);
            }
        }));
    }

    @Override // com.avito.android.verification.verification_input_inn.v
    public final AbstractC22991Y o0() {
        return this.f325655S;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f325654R.e();
    }

    @Override // com.avito.android.verification.verification_input_inn.v
    /* renamed from: s8, reason: from getter */
    public final D getF325657U() {
        return this.f325657U;
    }
}
