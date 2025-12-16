package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersInternalAction;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import com.huawei.hms.adapter.internal.AvailableCode;
import ft.InterfaceC40476a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_paid_cvs.features.filters.logics.FiltersActor$process$1", f = "FiltersActor.kt", i = {}, l = {21, 22, 23, AvailableCode.ERROR_ON_ACTIVITY_RESULT, 31, 38, 53, 62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FiltersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f130630q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f130631r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40476a f130632s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FiltersState f130633t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40476a interfaceC40476a, FiltersState filtersState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f130632s = interfaceC40476a;
        this.f130633t = filtersState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f130632s, this.f130633t, continuation);
        aVar.f130631r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.features.filters.logics.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
