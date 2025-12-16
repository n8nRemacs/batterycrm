package com.avito.android.blueprints.metro;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiStateMetroItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/metro/f;", "Lcom/avito/android/blueprints/metro/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106060b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f106061c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.t> f106062d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.t> f106063e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106064f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106065g;

    @Inject
    public f(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106060b = interfaceC35807h4;
        this.f106061c = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.t> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106062d = cVar;
        com.jakewharton.rxrelay3.c<ParameterElement.t> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106063e = cVar2;
        this.f106064f = cVar;
        this.f106065g = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ParameterElement.t tVar = (ParameterElement.t) aVar;
        boolean zBooleanValue = this.f106061c.w().invoke().booleanValue();
        String str = tVar.f117533d;
        if (zBooleanValue) {
            hVar.setTitle(this.f106060b.a(str, tVar.f117539j, tVar.f117540k));
        } else {
            hVar.setTitle(str);
        }
        hVar.setEnabled(tVar.f117537h);
        hVar.o(tVar.f117536g);
        String str2 = tVar.f117534e;
        hVar.m(str2);
        hVar.p2(!(str2 == null || str2.length() == 0));
        hVar.k0(tVar.f117538i);
        hVar.K(new d(this, tVar));
        hVar.a(new e(this, tVar));
        ItemWithState.State state = tVar.f117541l;
        if (state instanceof ItemWithState.State.Normal) {
            hVar.u(((ItemWithState.State.Normal) state).f173899b);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            hVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            hVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            hVar.Pa();
        }
    }

    @Override // com.avito.android.blueprints.metro.c
    @k
    public final z<ParameterElement.t> c() {
        return this.f106064f;
    }

    @Override // com.avito.android.blueprints.metro.c
    @k
    public final z<ParameterElement.t> z() {
        return this.f106065g;
    }
}
