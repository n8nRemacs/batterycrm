package com.avito.android.calltracking;

import Yl.C18274a;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import cm.InterfaceC27217c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.calltracking.I;
import com.avito.android.calltracking.remote.model.Call;
import com.avito.android.calltracking.remote.model.CalltrackingAllocationResponse;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.C35748b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calltracking/S;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/calltracking/M;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class S extends M0 implements M {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29293v f113604E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking_core.f f113605J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f113606K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f113607L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f113608M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f113609N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final CalltrackingScreenType f113610O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f113611P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f113612Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f113613R = 20;

    /* renamed from: S, reason: collision with root package name */
    public int f113614S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f113615T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public CalltrackingResponse f113616U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final ArrayList<Call> f113617V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f113618W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.s f113619X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<CalltrackingResponse>> f113620Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f113621Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f113622a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f113623b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<CalltrackingAllocationResponse>> f113624c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f113625d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C35748b<?>> f113626e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f113627f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public InterfaceC27217c f113628g0;

    /* compiled from: CalltrackingViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f113630b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe screen events stream", (Throwable) obj);
        }
    }

    /* compiled from: CalltrackingViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingResponse;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2<CalltrackingResponse> p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            S s5 = S.this;
            if (z12) {
                s5.f113620Y.setValue(p22);
                return;
            }
            if (p22 instanceof P2.b) {
                s5.getClass();
                CalltrackingResponse calltrackingResponse = (CalltrackingResponse) ((P2.b) p22).f318720a;
                s5.f113616U = calltrackingResponse;
                List<Call> listF = calltrackingResponse.f();
                s5.f113614S = listF.size() + s5.f113614S;
                InterfaceC27217c interfaceC27217c = s5.f113628g0;
                if (interfaceC27217c != null) {
                    interfaceC27217c.a(calltrackingResponse.getAll(), calltrackingResponse.getMissed());
                }
                ArrayList<Call> arrayList = s5.f113617V;
                arrayList.addAll(listF);
                s5.f113620Y.setValue(new P2.b(CalltrackingResponse.a(calltrackingResponse, arrayList)));
                return;
            }
            if (p22 instanceof P2.a) {
                P2.a aVar = (P2.a) p22;
                s5.getClass();
                S.ke(aVar);
                CalltrackingResponse calltrackingResponse2 = s5.f113616U;
                C23038g0<P2<CalltrackingResponse>> c23038g0 = s5.f113620Y;
                if (calltrackingResponse2 != null) {
                    ArrayList<Call> arrayList2 = s5.f113617V;
                    if (!arrayList2.isEmpty()) {
                        c23038g0.setValue(new P2.b(CalltrackingResponse.a(s5.f113616U, arrayList2)));
                        s5.f113622a0.setValue(com.avito.android.error.z.k(aVar.f318719a));
                        return;
                    }
                }
                c23038g0.setValue(aVar);
            }
        }
    }

    public S(@Y61.k com.avito.android.account.E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC29293v interfaceC29293v, @Y61.k CalltrackingScreenType calltrackingScreenType, @Y61.k com.avito.android.calltracking_core.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f113604E = interfaceC29293v;
        this.f113605J = fVar;
        this.f113606K = interfaceC35745a5;
        this.f113607L = aVar;
        this.f113608M = interfaceC28373a;
        this.f113609N = e12;
        this.f113610O = calltrackingScreenType;
        this.f113615T = calltrackingScreenType == CalltrackingScreenType.f113563c;
        this.f113617V = new ArrayList<>();
        C23038g0<P2<CalltrackingResponse>> c23038g0 = new C23038g0<>();
        this.f113620Y = c23038g0;
        this.f113621Z = c23038g0;
        C23038g0<String> c23038g02 = new C23038g0<>();
        this.f113622a0 = c23038g02;
        this.f113623b0 = c23038g02;
        C23038g0<P2<CalltrackingAllocationResponse>> c23038g03 = new C23038g0<>();
        this.f113624c0 = c23038g03;
        this.f113625d0 = c23038g03;
        C23038g0<C35748b<?>> c23038g04 = new C23038g0<>();
        this.f113626e0 = c23038g04;
        this.f113627f0 = c23038g04;
        n7();
    }

    public static void ke(P2.a aVar) {
        ApiError apiError = aVar.f318719a;
        if (apiError instanceof ApiError.UnknownError) {
            V2.f318762a.e(((ApiError.UnknownError) apiError).getF244063c(), ((ApiError.UnknownError) aVar.f318719a).f253395c);
        } else {
            V2.f318762a.e(apiError.toString(), null);
        }
    }

    @Override // com.avito.android.calltracking.M
    public final void a4(@Y61.k com.jakewharton.rxrelay3.c<I> cVar) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f113618W;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f113618W = (io.reactivex.rxjava3.internal.observers.y) cVar.x0(this.f113606K.e()).v0(new l41.g() { // from class: com.avito.android.calltracking.S.a
            @Override // l41.g
            public final void accept(Object obj) {
                String userPhone;
                I i12 = (I) obj;
                S s5 = S.this;
                s5.getClass();
                boolean z12 = i12 instanceof I.d;
                com.avito.android.deeplink_handler.handler.composite.a aVar = s5.f113607L;
                if (z12) {
                    CalltrackingResponse calltrackingResponse = s5.f113616U;
                    if (calltrackingResponse != null) {
                        com.avito.android.calltracking.item.e eVar = ((I.d) i12).f113578a;
                        boolean isHidden = eVar.f113719b.getIsHidden();
                        Call call = eVar.f113719b;
                        InterfaceC28373a interfaceC28373a = s5.f113608M;
                        com.avito.android.account.E e12 = s5.f113609N;
                        if (isHidden || (userPhone = call.getUserPhone()) == null || userPhone.length() == 0) {
                            s5.f113626e0.postValue(new U(calltrackingResponse, eVar));
                            String callId = call.getCallId();
                            String strA = e12.a();
                            if (strA != null) {
                                interfaceC28373a.c(new C18274a(strA, callId));
                            }
                        } else {
                            b.a.a(aVar, new GsmCallStartLink(call.getUserPhone(), null, null, null, null, null, 62, null), null, null, 6);
                            String strA2 = e12.a();
                            if (strA2 != null) {
                                interfaceC28373a.c(new Yl.b(strA2));
                            }
                        }
                        G0 g02 = G0.f406611a;
                        return;
                    }
                    return;
                }
                if (i12 instanceof I.a) {
                    b.a.a(aVar, ((I.a) i12).f113576a, null, null, 6);
                    G0 g03 = G0.f406611a;
                    return;
                }
                if (i12 instanceof I.b) {
                    I.b bVar = (I.b) i12;
                    io.reactivex.rxjava3.internal.observers.y yVar2 = s5.f113612Q;
                    if (yVar2 == null || yVar2.getF318621e()) {
                        io.reactivex.rxjava3.internal.observers.y yVar3 = s5.f113612Q;
                        if (yVar3 != null) {
                            DisposableHelper.a(yVar3);
                        }
                        I0 i0J0 = s5.f113604E.a(bVar.f113577a).j0(s5.f113606K.e());
                        P p12 = new P(s5);
                        final V2 v22 = V2.f318762a;
                        s5.f113612Q = (io.reactivex.rxjava3.internal.observers.y) i0J0.v0(p12, new l41.g() { // from class: com.avito.android.calltracking.Q
                            @Override // l41.g
                            public final void accept(Object obj2) {
                                v22.f((Throwable) obj2);
                            }
                        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
                    }
                    G0 g04 = G0.f406611a;
                    return;
                }
                if (i12 instanceof I.c) {
                    io.reactivex.rxjava3.internal.observers.y yVar4 = s5.f113612Q;
                    if (yVar4 != null) {
                        DisposableHelper.a(yVar4);
                        G0 g05 = G0.f406611a;
                        return;
                    }
                    return;
                }
                if (i12 instanceof I.f) {
                    io.reactivex.rxjava3.internal.observers.y yVar5 = s5.f113612Q;
                    if (yVar5 != null) {
                        DisposableHelper.a(yVar5);
                        G0 g06 = G0.f406611a;
                        return;
                    }
                    return;
                }
                if (!(i12 instanceof I.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (s5.f113610O == CalltrackingScreenType.f113563c && s5.f113619X == null) {
                    s5.f113619X = (io.reactivex.rxjava3.internal.observers.s) new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(s5, 12)).u();
                }
                G0 g07 = G0.f406611a;
            }
        }, b.f113630b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.calltracking.M
    public final void ba() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f113618W;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f113618W = null;
    }

    @Override // com.avito.android.calltracking.M
    public final void c4() {
        CalltrackingResponse calltrackingResponse = this.f113616U;
        if (calltrackingResponse != null ? calltrackingResponse.getHasMore() : true) {
            io.reactivex.rxjava3.internal.observers.y yVar = this.f113611P;
            if ((yVar == null || yVar.getF318621e()) ? false : true) {
                return;
            }
            io.reactivex.rxjava3.internal.observers.y yVar2 = this.f113611P;
            if (yVar2 != null) {
                DisposableHelper.a(yVar2);
            }
            I0 i0J0 = this.f113604E.b(this.f113613R, this.f113614S, this.f113615T).j0(this.f113606K.e());
            c cVar = new c();
            final V2 v22 = V2.f318762a;
            this.f113611P = (io.reactivex.rxjava3.internal.observers.y) i0J0.v0(cVar, new l41.g() { // from class: com.avito.android.calltracking.S.d
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.calltracking.InterfaceC29278f
    @Y61.k
    /* renamed from: h8, reason: from getter */
    public final C23038g0 getF113625d0() {
        return this.f113625d0;
    }

    @Override // com.avito.android.calltracking.M
    @Y61.k
    /* renamed from: jd, reason: from getter */
    public final C23038g0 getF113623b0() {
        return this.f113623b0;
    }

    @Override // com.avito.android.calltracking.M
    @Y61.k
    public final AbstractC22991Y<C35748b<?>> k0() {
        return this.f113627f0;
    }

    @Override // com.avito.android.calltracking.M
    public final void n7() {
        this.f113614S = 0;
        this.f113616U = null;
        this.f113617V.clear();
        c4();
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        ba();
        io.reactivex.rxjava3.internal.observers.y yVar = this.f113611P;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f113612Q;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        io.reactivex.rxjava3.internal.observers.s sVar = this.f113619X;
        if (sVar != null) {
            DisposableHelper.a(sVar);
        }
    }

    @Override // com.avito.android.calltracking.M
    @Y61.k
    public final AbstractC22991Y<P2<CalltrackingResponse>> p8() {
        return this.f113621Z;
    }
}
