package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$loadPhonesAndIac$2", f = "PhonesListMviActor.kt", i = {}, l = {JfifUtil.MARKER_SOS}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33437i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super PhonesListMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228045q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f228046r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f228047s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33433e f228048t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33437i(C33433e c33433e, Continuation<? super C33437i> continuation) {
        super(3, continuation);
        this.f228048t = c33433e;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C33437i c33437i = new C33437i(this.f228048t, continuation);
        c33437i.f228046r = interfaceC43172j;
        c33437i.f228047s = th2;
        return c33437i.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228045q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f228046r;
            PhonesListMviInternalAction.ContentWithPhonesError contentWithPhonesError = new PhonesListMviInternalAction.ContentWithPhonesError(this.f228047s, this.f228048t.f227964b.a());
            this.f228046r = null;
            this.f228045q = 1;
            if (interfaceC43172j.emit(contentWithPhonesError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
