package com.avito.android.bxcontent;

import cU0.InterfaceC27108f;
import com.avito.android.bxcontent.C28969d;
import com.avito.android.bxcontent.InterfaceC28963b;
import gj.InterfaceC40691b;
import iT.C41343c;
import iT.InterfaceC41341a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;

/* compiled from: BxContentCombinationViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/n;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/bxcontent/o;", "LiT/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29235n extends androidx.view.M0 implements InterfaceC29238o, InterfaceC41341a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f112641E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<FV0.h> f112642J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f112643K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C41343c f112644L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C28969d f112645M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final n2<C29099l> f112646N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f112647O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.beduin.H f112648P;

    @Inject
    public C29235n(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k Set<FV0.h> set, @Y61.k aU0.b bVar, @Y61.k C41343c c41343c, @Y61.k C28969d.a aVar, @Y61.k com.avito.android.advertising.loaders.beduin.H h12) {
        this.f112641E = interfaceC40691b;
        this.f112642J = set;
        this.f112643K = bVar;
        this.f112644L = c41343c;
        C28969d c28969dA = aVar.a(androidx.view.N0.a(this), h12);
        this.f112645M = c28969dA;
        this.f112646N = c28969dA.f109659h;
        this.f112647O = c28969dA.f109660i;
        this.f112648P = c28969dA.f109655d;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f112644L.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z H4() {
        return this.f112644L.f398526b;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(@Y61.k Object obj) {
        this.f112645M.accept(obj);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC28963b.InterfaceC3268b> getEvents() {
        return this.f112647O;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C29099l> getState() {
        return this.f112646N;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f112648P.b(true);
        this.f112641E.onCleared();
    }
}
