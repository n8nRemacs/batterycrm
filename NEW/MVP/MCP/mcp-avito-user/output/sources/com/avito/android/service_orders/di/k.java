package com.avito.android.service_orders.di;

import Nu0.C14614b;
import Su0.C15227c;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersListModule.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/preloading/coroutines/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LSu0/c;", "LX41/o;", "invoke", "()Lcom/avito/android/preloading/coroutines/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<AbstractC33302a<String, TypedResult<C15227c>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C14614b f279139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f279140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PreloadingPromiseTestGroup f279141n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f279142o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C28478k f279143p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C14614b c14614b, C c12, PreloadingPromiseTestGroup preloadingPromiseTestGroup, InterfaceC28373a interfaceC28373a, C28478k c28478k) {
        super(0);
        this.f279139l = c14614b;
        this.f279140m = c12;
        this.f279141n = preloadingPromiseTestGroup;
        this.f279142o = interfaceC28373a;
        this.f279143p = c28478k;
    }

    @Override // Y41.a
    public final AbstractC33302a<String, TypedResult<C15227c>> invoke() {
        return AbstractC33302a.C6710a.b(AbstractC33302a.f221798g, "", (com.avito.android.preloading.coroutines.l) this.f279139l.get(), this.f279140m, this.f279141n.a(), this.f279142o, this.f279143p.f90636a.f90471b);
    }
}
