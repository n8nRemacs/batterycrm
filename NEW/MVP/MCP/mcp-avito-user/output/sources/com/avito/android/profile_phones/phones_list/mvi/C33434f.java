package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.deep_linking.DeviceDeletingSheetShowLink;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ob0.C44749b;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$deleteDeviceOrShowDialog$1", f = "PhonesListMviActor.kt", i = {0}, l = {290, 292}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33434f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228034q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228035r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33433e f228036s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DeviceDeletingSheetShowLink f228037t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33434f(C33433e c33433e, DeviceDeletingSheetShowLink deviceDeletingSheetShowLink, Continuation<? super C33434f> continuation) {
        super(2, continuation);
        this.f228036s = c33433e;
        this.f228037t = deviceDeletingSheetShowLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33434f c33434f = new C33434f(this.f228036s, this.f228037t, continuation);
        c33434f.f228035r = obj;
        return c33434f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33434f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228034q;
        C33433e c33433e = this.f228036s;
        DeviceDeletingSheetShowLink deviceDeletingSheetShowLink = this.f228037t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f228035r;
            ML.a aVar = c33433e.f227972j;
            String str = deviceDeletingSheetShowLink.f227100b.f227645b;
            this.f228035r = interfaceC43172j;
            this.f228034q = 1;
            if (aVar.a(str, null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f228035r;
            C42729a0.b(obj);
        }
        c33433e.f227971i.c(new C44749b(deviceDeletingSheetShowLink.f227101c.size()));
        PhonesListMviInternalAction.HideDeletedDevice hideDeletedDevice = new PhonesListMviInternalAction.HideDeletedDevice(deviceDeletingSheetShowLink.f227100b);
        this.f228035r = null;
        this.f228034q = 2;
        if (interfaceC43172j.emit(hideDeletedDevice, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
