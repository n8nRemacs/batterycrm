package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import com.avito.android.remote.model.PretendResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ObjectValidateUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.objects.domain.usecase.ObjectValidateUseCase$invoke$1", f = "ObjectValidateUseCase.kt", i = {0, 1, 2, 2}, l = {37, 50, 51, 56}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "pretendResult"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ObjectFillFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public PretendResult f240110q;

    /* renamed from: r, reason: collision with root package name */
    public int f240111r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f240112s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f240113t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f240114u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, AtomicBoolean atomicBoolean, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f240113t = mVar;
        this.f240114u = atomicBoolean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f240113t, this.f240114u, continuation);
        iVar.f240112s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.usecase.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
