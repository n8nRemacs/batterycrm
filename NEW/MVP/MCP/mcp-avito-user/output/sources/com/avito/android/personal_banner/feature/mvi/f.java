package com.avito.android.personal_banner.feature.mvi;

import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.personal_banner.feature.mvi.a;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BannerActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/i;", "LZ60/a;", "Lcom/avito/android/personal_banner/feature/mvi/a$a;", "contextHolder", "LZ60/c;", "invoke", "(Lkotlinx/coroutines/flow/i;Lcom/avito/android/personal_banner/feature/mvi/a$a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.p<InterfaceC43160i<? extends Z60.a>, a.C6453a, InterfaceC43160i<? extends Z60.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f215651l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<BannerState> f215652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Y41.a<BannerState> aVar2) {
        super(2);
        this.f215651l = aVar;
        this.f215652m = aVar2;
    }

    @Override // Y41.p
    public final InterfaceC43160i<? extends Z60.c> invoke(InterfaceC43160i<? extends Z60.a> interfaceC43160i, a.C6453a c6453a) {
        InterfaceC43160i<? extends Z60.a> interfaceC43160i2 = interfaceC43160i;
        a.C6453a c6453a2 = c6453a;
        a aVar = this.f215651l;
        b bVar = new b(new d(interfaceC43160i2, aVar));
        InterfaceC43160i<BannerContext> interfaceC43160iA7 = aVar.f215611c.A7();
        Y41.a<BannerState> aVar2 = this.f215652m;
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.N(bVar, new j(new C43197r1(new k(2, c6453a2, a.C6453a.class, "write", "write(Lcom/avito/android/personal_banner/feature/domain/model/BannerContext;)V", 4), new i(interfaceC43160iA7, c6453a2, aVar2)))), new l(null, aVar, aVar2, c6453a2));
        InterfaceC43160i interfaceC43160iC = C43175k.C(new h(aVar, aVar2, null), new c(new e(interfaceC43160i2, aVar)));
        c6453a2.getClass();
        return C43175k.N(lVarY, interfaceC43160iC, new g(c6453a2.f215612b.f92113b));
    }
}
