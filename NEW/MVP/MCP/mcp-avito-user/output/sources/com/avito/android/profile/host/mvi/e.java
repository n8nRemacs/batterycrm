package com.avito.android.profile.host.mvi;

import hz.InterfaceC41196a;
import iz.C42140a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import q90.InterfaceC47262a;

/* compiled from: UserProfileHostActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/host/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lq90/a;", "Lq90/b;", "Lq90/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC47262a, q90.b, q90.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.host.mvi.domain.e f222402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f222403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f222404c;

    @Inject
    public e(@Y61.k com.avito.android.profile.host.mvi.domain.e eVar, @Y61.k com.avito.android.account.plugin.rx.a aVar, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f222402a = eVar;
        this.f222403b = aVar;
        this.f222404c = interfaceC41196a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.Y(C43175k.N(new d(y.a(this.f222403b.getF68171a())), new c(this.f222404c.g(new C42140a(false, false, 3, null))), new a(c43197r1)), new b(null, this, aVar));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<q90.b> b(InterfaceC47262a interfaceC47262a, q90.d dVar) {
        if (interfaceC47262a instanceof InterfaceC47262a.C12306a) {
            return this.f222402a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
