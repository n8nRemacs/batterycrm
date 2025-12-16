package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import Y41.p;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ub0.C49016d;
import ub0.InterfaceC49014b;

/* compiled from: DeleteDeviceBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lub0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.DeleteDeviceBottomSheetActor$deleteDevice$1", f = "DeleteDeviceBottomSheetActor.kt", i = {0, 1}, l = {37, 38, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC49014b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f227596q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f227597r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f227598s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C49016d f227599t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, C49016d c49016d, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f227598s = cVar;
        this.f227599t = c49016d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f227598s, this.f227599t, continuation);
        aVar.f227597r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC49014b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f227596q
            r2 = 0
            com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.c r3 = r9.f227598s
            r4 = 3
            r5 = 2
            r6 = 1
            ub0.d r7 = r9.f227599t
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlin.C42729a0.b(r10)
            goto L82
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.f227597r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L60
        L2a:
            java.lang.Object r1 = r9.f227597r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L47
        L32:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f227597r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            ub0.b$e r1 = ub0.InterfaceC49014b.e.f440113a
            r9.f227597r = r10
            r9.f227596q = r6
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r10
        L47:
            ML.a r10 = r3.f227603a
            com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem r6 = r7.f440117a
            java.lang.String r6 = r6.f227645b
            com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem r8 = r7.f440121e
            if (r8 == 0) goto L54
            java.lang.String r8 = r8.f227645b
            goto L55
        L54:
            r8 = r2
        L55:
            r9.f227597r = r1
            r9.f227596q = r5
            java.lang.Object r10 = r10.a(r6, r8, r9)
            if (r10 != r0) goto L60
            return r0
        L60:
            com.avito.android.analytics.a r10 = r3.f227604b
            ob0.b r3 = new ob0.b
            java.util.List<com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem> r5 = r7.f440118b
            int r5 = r5.size()
            r3.<init>(r5)
            r10.c(r3)
            ub0.b$b r10 = new ub0.b$b
            com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem r3 = r7.f440117a
            r10.<init>(r3)
            r9.f227597r = r2
            r9.f227596q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L82
            return r0
        L82:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
