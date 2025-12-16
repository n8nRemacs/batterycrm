package com.avito.android.calltracking.di;

import androidx.view.P0;
import cm.InterfaceC27217c;
import com.avito.android.calltracking.InterfaceC29287o;
import com.avito.android.calltracking.M;
import com.avito.android.calltracking.N;
import com.avito.android.calltracking.O;
import com.avito.android.calltracking.S;
import com.avito.android.calltracking.di.q;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CalltrackingFragmentModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<M> {

    /* renamed from: a, reason: collision with root package name */
    public final O f113671a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f113672b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27217c> f113673c;

    public l(O o12, dagger.internal.l lVar, Provider provider) {
        this.f113671a = o12;
        this.f113672b = lVar;
        this.f113673c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        N n12 = (N) this.f113671a.get();
        InterfaceC29287o interfaceC29287o = (InterfaceC29287o) this.f113672b.f393949a;
        InterfaceC27217c interfaceC27217c = (InterfaceC27217c) ((q.b.f) this.f113673c).get();
        g.f113665a.getClass();
        Object objA = new P0(interfaceC29287o.getF113760a(), n12).a(S.class);
        S s5 = (S) objA;
        s5.f113628g0 = interfaceC27217c;
        CalltrackingResponse calltrackingResponse = s5.f113616U;
        if (calltrackingResponse != null) {
            interfaceC27217c.a(calltrackingResponse.getAll(), calltrackingResponse.getMissed());
        }
        return (M) objA;
    }
}
