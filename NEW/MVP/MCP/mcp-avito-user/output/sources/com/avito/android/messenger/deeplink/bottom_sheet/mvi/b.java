package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import Y41.p;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import com.avito.android.util.ApiException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BottomSheetInputActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.deeplink.bottom_sheet.mvi.BottomSheetInputActor$process$2", f = "BottomSheetInputActor.kt", i = {0, 1, 3, 3}, l = {37, 40, 45, 48, 49}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "throwable"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super BottomSheetInputInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ApiException f195473q;

    /* renamed from: r, reason: collision with root package name */
    public int f195474r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f195475s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f195476t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ VY.a f195477u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, VY.a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f195476t = dVar;
        this.f195477u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f195476t, this.f195477u, continuation);
        bVar.f195475s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BottomSheetInputInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.deeplink.bottom_sheet.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
