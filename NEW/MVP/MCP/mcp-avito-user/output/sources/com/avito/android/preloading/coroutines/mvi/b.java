package com.avito.android.preloading.coroutines.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.util.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BootstrapPreloadable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "InternalAction", "Lcom/avito/android/preloading/coroutines/a;", "Lkotlin/G0;", "invoke", "()Lcom/avito/android/preloading/coroutines/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<AbstractC33302a<G0, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f221828l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43238h f221829m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f221830n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f221831o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f221832p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f221833q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Y41.a aVar, C43238h c43238h, C c12, boolean z12, InterfaceC28373a interfaceC28373a, String str) {
        super(0);
        this.f221828l = (H) aVar;
        this.f221829m = c43238h;
        this.f221830n = c12;
        this.f221831o = z12;
        this.f221832p = interfaceC28373a;
        this.f221833q = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.H] */
    @Override // Y41.a
    public final AbstractC33302a<G0, Object> invoke() {
        a aVar = new a((com.avito.android.arch.mvi.b) this.f221828l.invoke());
        AbstractC33302a.f221798g.getClass();
        return AbstractC33302a.C6710a.a(G0.f406611a, aVar, this.f221829m, this.f221830n, this.f221831o, 20, this.f221832p, this.f221833q);
    }
}
