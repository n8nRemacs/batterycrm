package com.avito.android.auto_contacts.presentation.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesUiState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze.InterfaceC50551a;
import ze.InterfaceC50552b;

/* compiled from: AutoContactsPackagesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lze/a;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "Lze/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<q<InterfaceC50551a, AutoContactsPackagesInternalAction, AutoContactsPackagesUiState, InterfaceC50552b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f94958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f94959m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f94960n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f94961o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f94962p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f94958l = dVar;
        this.f94959m = bVar;
        this.f94960n = screenPerformanceTracker;
        this.f94961o = kVar;
        this.f94962p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50551a, AutoContactsPackagesInternalAction, AutoContactsPackagesUiState, InterfaceC50552b> qVar) {
        q<InterfaceC50551a, AutoContactsPackagesInternalAction, AutoContactsPackagesUiState, InterfaceC50552b> qVar2 = qVar;
        qVar2.f92008d = this.f94958l;
        qVar2.f92009e = this.f94959m;
        qVar2.f92011g = new o(this.f94960n, this.f94961o);
        qVar2.f92010f = this.f94962p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
