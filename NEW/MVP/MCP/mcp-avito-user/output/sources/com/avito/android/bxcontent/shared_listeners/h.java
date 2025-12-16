package com.avito.android.bxcontent.shared_listeners;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.C29235n;
import com.avito.android.bxcontent.InterfaceC29238o;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.location.InterfaceC31506h;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: BxSharedLocationListenerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/shared_listeners/h;", "Lcom/avito/android/bxcontent/shared_listeners/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC31506h f112924a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC31062w f112925b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C29235n f112926c;

    @Inject
    public h(@k InterfaceC31506h interfaceC31506h, @k InterfaceC31062w interfaceC31062w) {
        this.f112924a = interfaceC31506h;
        this.f112925b = interfaceC31062w;
    }

    @Override // com.avito.android.bxcontent.shared_listeners.a
    public final void a() {
        this.f112926c = null;
    }

    @Override // com.avito.android.bxcontent.shared_listeners.a
    @k
    public final C43152f0 b() {
        PresentationType presentationType = ((C29235n) e()).f112645M.a().f112306I;
        return new C43152f0(new C43197r1(new c(this, presentationType, null), y.a(C35896f0.e(this.f112924a.o(presentationType.isMain()), new b(this)))), new d(this, null));
    }

    @Override // com.avito.android.bxcontent.shared_listeners.a
    @k
    public final C43152f0 c() {
        return new C43152f0(new C43197r1(new f(this, null), y.a(C35896f0.e(this.f112924a.j(), new e(this)))), new g(this, null));
    }

    @Override // com.avito.android.bxcontent.shared_listeners.a
    public final void d(@k C29235n c29235n) {
        this.f112926c = c29235n;
    }

    public final InterfaceC29238o e() {
        C29235n c29235n = this.f112926c;
        if (c29235n != null) {
            return c29235n;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
