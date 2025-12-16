package com.avito.android.user_address.suggest.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAddressSuggestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/user_address/suggest/mvi/f;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "Lcom/avito/android/user_address/suggest/mvi/q;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<com.avito.android.arch.mvi.q<f, UserAddressSuggestMviInternalAction, UserAddressSuggestMviState, q>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f308096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f308097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f308098n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f308099o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a f308100p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ScreenPerformanceTracker screenPerformanceTracker, r rVar, t tVar, a aVar) {
        super(1);
        this.f308096l = gVar;
        this.f308097m = screenPerformanceTracker;
        this.f308098n = rVar;
        this.f308099o = tVar;
        this.f308100p = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<f, UserAddressSuggestMviInternalAction, UserAddressSuggestMviState, q> qVar) {
        com.avito.android.arch.mvi.q<f, UserAddressSuggestMviInternalAction, UserAddressSuggestMviState, q> qVar2 = qVar;
        qVar2.f92009e = this.f308096l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f308097m, this.f308098n);
        qVar2.f92010f = this.f308099o;
        qVar2.f92008d = this.f308100p;
        return G0.f406611a;
    }
}
