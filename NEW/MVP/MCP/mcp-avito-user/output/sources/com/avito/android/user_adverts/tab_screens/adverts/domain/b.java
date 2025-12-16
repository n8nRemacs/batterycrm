package com.avito.android.user_adverts.tab_screens.adverts.domain;

import Wl0.InterfaceC15774a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import eJ0.C40014a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: UserAdvertsListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.user_adverts.tab_screens.adverts.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC15774a> f314963a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f314964b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f314965c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f314966d = C42727D.b(LazyThreadSafetyMode.f406614b, a.f314967l);

    /* compiled from: UserAdvertsListInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f314967l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC15774a> eVar, @k R0 r02, @k InterfaceC28373a interfaceC28373a) {
        this.f314963a = eVar;
        this.f314964b = r02;
        this.f314965c = interfaceC28373a;
    }

    @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.a
    @l
    public final Object a(@k C40014a c40014a, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f314964b.a(), new d(this, c40014a, null), suspendLambda);
    }
}
