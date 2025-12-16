package com.avito.android.blueprints.district;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiStateDistrictItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/district/f;", "Lcom/avito/android/blueprints/district/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f105890b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Q1 f105891c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C29379g> f105892d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C29379g> f105893e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f105894f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f105895g;

    @Inject
    public f(@k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f105890b = interfaceC35807h4;
        this.f105891c = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.C29379g> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105892d = cVar;
        com.jakewharton.rxrelay3.c<ParameterElement.C29379g> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105893e = cVar2;
        this.f105894f = cVar;
        this.f105895g = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        ParameterElement.C29379g c29379g = (ParameterElement.C29379g) aVar;
        boolean zBooleanValue = this.f105891c.w().invoke().booleanValue();
        String str = c29379g.f117424d;
        if (zBooleanValue) {
            hVar.setTitle(this.f105890b.a(str, c29379g.f117430j, c29379g.f117431k));
        } else {
            hVar.setTitle(str);
        }
        hVar.setEnabled(c29379g.f117428h);
        hVar.o(c29379g.f117427g);
        String str2 = c29379g.f117425e;
        hVar.m(str2);
        hVar.p2(!(str2 == null || str2.length() == 0));
        hVar.k0(c29379g.f117429i);
        hVar.K(new d(this, c29379g));
        hVar.a(new e(this, c29379g));
        ItemWithState.State state = c29379g.f117432l;
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

    @Override // com.avito.android.blueprints.district.c
    @k
    public final z<ParameterElement.C29379g> c() {
        return this.f105894f;
    }

    @Override // com.avito.android.blueprints.district.c
    @k
    public final z<ParameterElement.C29379g> z() {
        return this.f105895g;
    }
}
