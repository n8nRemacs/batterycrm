package com.avito.android.mall.viewmodel;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.x;
import com.avito.android.mall.m;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.search.p;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import com.google.gson.Gson;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MallViewModelImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mall/viewmodel/g;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/mall/viewmodel/a;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends M0 implements a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final MX.a f184377E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f184378J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final com.avito.android.search.h f184379K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final KX.b f184380L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final x f184381M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final KX.b f184382N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final Gson f184383O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final com.avito.android.mall.webview.b f184384P;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public p f184385Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final C23038g0<m> f184386R = new C23038g0<>(new m.a());

    /* renamed from: S, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f184387S = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f184388T;

    /* renamed from: U, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<String> f184389U;

    public g(@k MX.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.search.h hVar, @k KX.b bVar, @k z<LX.b> zVar, @k x xVar, @k KX.b bVar2, @k Gson gson, @k com.avito.android.mall.webview.b bVar3) {
        this.f184377E = aVar;
        this.f184378J = interfaceC35745a5;
        this.f184379K = hVar;
        this.f184380L = bVar;
        this.f184381M = xVar;
        this.f184382N = bVar2;
        this.f184383O = gson;
        this.f184384P = bVar3;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f184388T = cVar;
        this.f184389U = new io.reactivex.rxjava3.subjects.e<>();
        cVar.b(zVar.t0(new f(this)));
    }

    @Override // com.avito.android.mall.viewmodel.a
    public final void D2() {
        this.f184377E.b();
    }

    @Override // com.avito.android.mall.viewmodel.a
    @k
    public final Bundle F5() {
        return this.f184384P.getF184392a();
    }

    @Override // com.avito.android.mall.viewmodel.a
    @k
    public final AbstractC22991Y<m> W() {
        return this.f184386R;
    }

    @Override // com.avito.android.mall.viewmodel.a
    @k
    /* renamed from: Z7, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF184389U() {
        return this.f184389U;
    }

    @Override // com.avito.android.mall.viewmodel.a
    public final void a8(@k String str) {
        this.f184386R.setValue(new m.b());
        this.f184387S.e();
        String str2 = C43066x.K(str) ? "" : str;
        SearchParams searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        p pVar = this.f184385Q;
        z zVarC = this.f184379K.c(str2, searchParams, null, pVar != null ? pVar.f263833a : null, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f184378J;
        this.f184387S.b(C35896f0.b(zVarC, timeUnit, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(new d(this, str2), e.f184375b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.mall.viewmodel.a
    public final void ad() {
        this.f184377E.c(new CartLink(null, null, 2, null));
        this.f184380L.b();
    }

    @Override // com.avito.android.mall.viewmodel.a
    public final void m2(@k p pVar) {
        this.f184385Q = pVar;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f184387S.e();
        this.f184388T.e();
    }

    @Override // com.avito.android.mall.viewmodel.a
    public final void u4(@k SuggestAction suggestAction) {
        if (suggestAction instanceof SuggestDeeplink) {
            this.f184387S.e();
            this.f184377E.c(((SuggestDeeplink) suggestAction).getDeepLink());
        } else if (suggestAction instanceof SuggestAnalyticsEvent) {
            this.f184380L.a((SuggestAnalyticsEvent) suggestAction);
        }
    }
}
