package com.avito.android.tariff.cpx.info.advance.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tB0.C48533d;
import tB0.InterfaceC48530a;
import tB0.InterfaceC48531b;

/* compiled from: TariffCpxInfoAdvanceActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LtB0/a;", "action", "Lkotlinx/coroutines/flow/i;", "LtB0/b;", "invoke", "(LtB0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<InterfaceC48530a, InterfaceC43160i<? extends InterfaceC48531b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f296338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C48533d> f296339m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<C48533d> aVar) {
        super(1);
        this.f296338l = dVar;
        this.f296339m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends InterfaceC48531b> invoke(InterfaceC48530a interfaceC48530a) {
        C48533d c48533dInvoke = this.f296339m.invoke();
        this.f296338l.getClass();
        return d.c(interfaceC48530a, c48533dInvoke);
    }
}
