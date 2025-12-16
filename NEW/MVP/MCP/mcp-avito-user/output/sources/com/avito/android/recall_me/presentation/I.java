package com.avito.android.recall_me.presentation;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.remote.ContactInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import zi0.InterfaceC50571a;
import zi0.InterfaceC50572b;
import zi0.InterfaceC50573c;

/* compiled from: RecallMeViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/I;", "Lcom/avito/android/recall_me/presentation/q;", "Landroidx/lifecycle/M0;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class I extends M0 implements q {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final RecallMeParams f251878E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.domain.g f251879J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34231a f251880K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f251881L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C34240j f251882M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f251883N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC50571a> f251884O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<InterfaceC50573c> f251885P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC50572b> f251886Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f251887R;

    /* renamed from: S, reason: collision with root package name */
    public RecallMeFormState f251888S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public ContactInfo f251889T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f251890U;

    @Inject
    public I(@Y61.k RecallMeParams recallMeParams, @Y61.k com.avito.android.recall_me.domain.g gVar, @Y61.k InterfaceC34231a interfaceC34231a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C34240j c34240j, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f251878E = recallMeParams;
        this.f251879J = gVar;
        this.f251880K = interfaceC34231a;
        this.f251881L = interfaceC35745a5;
        this.f251882M = c34240j;
        this.f251883N = aVar;
        com.jakewharton.rxrelay3.c<InterfaceC50571a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f251884O = cVar;
        final C23038g0<InterfaceC50573c> c23038g0 = new C23038g0<>();
        this.f251885P = c23038g0;
        this.f251886Q = new com.jakewharton.rxrelay3.c<>();
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        this.f251887R = cVar2;
        io.reactivex.rxjava3.core.z<R> zVarY0 = cVar.k0(InterfaceC50571a.C12967a.class).y0(new A(this));
        O oK2 = cVar.k0(InterfaceC50571a.e.class).K(new v(this));
        O oK3 = cVar.k0(InterfaceC50571a.c.class).K(new H(this));
        O oK4 = cVar.k0(InterfaceC50571a.d.class).K(new G(this));
        List listU = C42745f0.U(zVarY0, cVar.k0(InterfaceC50571a.b.class).K(new B(this)).y0(new F(this)));
        List listU2 = C42745f0.U(oK2, oK3, oK4);
        io.reactivex.rxjava3.core.z zVarH0 = io.reactivex.rxjava3.core.z.h0(listU);
        C41998x0 c41998x0C0 = io.reactivex.rxjava3.core.z.c0(InterfaceC50573c.d.f444193a);
        zVarH0.getClass();
        O oK5 = io.reactivex.rxjava3.core.z.q(c41998x0C0, zVarH0).N(r.f252028b).K(s.f252029b);
        l41.g gVar2 = new l41.g() { // from class: com.avito.android.recall_me.presentation.t
            @Override // l41.g
            public final void accept(Object obj) {
                c23038g0.postValue((InterfaceC50573c) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        cVar2.b(oK5.v0(gVar2, new l41.g() { // from class: com.avito.android.recall_me.presentation.u
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
        io.reactivex.rxjava3.core.z zVarH02 = io.reactivex.rxjava3.core.z.h0(listU2);
        zVarH02.getClass();
        cVar2.b(new C41986s0(zVarH02).r().u());
    }

    @Override // com.avito.android.recall_me.presentation.q
    @Y61.k
    public final RecallMeFormState H() {
        RecallMeFormState recallMeFormState = this.f251888S;
        if (recallMeFormState == null) {
            return null;
        }
        return recallMeFormState;
    }

    @Override // com.avito.android.recall_me.presentation.q
    /* renamed from: N9, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF251886Q() {
        return this.f251886Q;
    }

    @Override // com.avito.android.recall_me.presentation.q
    public final AbstractC22991Y getState() {
        return this.f251885P;
    }

    @Override // com.avito.android.recall_me.presentation.q
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC50571a> m1() {
        return this.f251884O;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f251887R.e();
    }
}
