package com.avito.android.profile.user_profile.di;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.util.C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserProfileModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/preloading/coroutines/a;", "Lcom/avito/android/profile/user_profile/preloading/e;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "invoke", "()Lcom/avito/android/preloading/coroutines/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.profile.user_profile.preloading.d f226088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f226089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PreloadingPromiseTestGroup f226090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I1 f226091o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f226092p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C28478k f226093q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.profile.user_profile.preloading.d dVar, C c12, PreloadingPromiseTestGroup preloadingPromiseTestGroup, I1 i12, InterfaceC28373a interfaceC28373a, C28478k c28478k) {
        super(0);
        this.f226088l = dVar;
        this.f226089m = c12;
        this.f226090n = preloadingPromiseTestGroup;
        this.f226091o = i12;
        this.f226092p = interfaceC28373a;
        this.f226093q = c28478k;
    }

    @Override // Y41.a
    public final AbstractC33302a<com.avito.android.profile.user_profile.preloading.e, UserProfileInternalAction> invoke() {
        AbstractC33302a.C6710a c6710a = AbstractC33302a.f221798g;
        boolean z12 = false;
        com.avito.android.profile.user_profile.preloading.e eVar = new com.avito.android.profile.user_profile.preloading.e(false);
        com.avito.android.preloading.coroutines.l lVar = (com.avito.android.preloading.coroutines.l) this.f226088l.get();
        if (this.f226090n.a()) {
            I1 i12 = this.f226091o;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[46];
            if (((Boolean) i12.f67299U.a().invoke()).booleanValue()) {
                z12 = true;
            }
        }
        boolean z13 = z12;
        String str = this.f226093q.f90636a.f90471b;
        return AbstractC33302a.C6710a.b(c6710a, eVar, lVar, this.f226089m, z13, this.f226092p, str);
    }
}
