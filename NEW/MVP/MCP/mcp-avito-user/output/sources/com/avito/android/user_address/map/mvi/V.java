package com.avito.android.user_address.map.mvi;

import com.avito.android.R;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import com.avito.android.util.NetworkException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processSaveButtonClicked$3", f = "UserAddressMapMviActor.kt", i = {0, 0}, l = {312, 319}, m = "invokeSuspend", n = {"$this$catch", "it"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class V extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f307798q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f307799r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f307800s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f307801t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(B b12, Continuation<? super V> continuation) {
        super(3, continuation);
        this.f307801t = b12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        V v12 = new V(this.f307801t, continuation);
        v12.f307799r = interfaceC43172j;
        v12.f307800s = th2;
        return v12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Throwable th2;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f307798q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = this.f307799r;
            th2 = this.f307800s;
            UserAddressMapMviInternalAction.ShowLoaderOnSaveButton showLoaderOnSaveButton = new UserAddressMapMviInternalAction.ShowLoaderOnSaveButton(false);
            this.f307799r = interfaceC43172j2;
            this.f307800s = th2;
            this.f307798q = 1;
            if (interfaceC43172j2.emit(showLoaderOnSaveButton, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            th2 = this.f307800s;
            interfaceC43172j = this.f307799r;
            C42729a0.b(obj);
        }
        UserAddressMapMviInternalAction.ShowToastBar showToastBar = new UserAddressMapMviInternalAction.ShowToastBar(this.f307801t.f307645d.getResources().getString(th2 instanceof NetworkException ? R.string.network_unavailable_message : R.string.add_new_address_error), false, null, 6, null);
        this.f307799r = null;
        this.f307800s = null;
        this.f307798q = 2;
        if (interfaceC43172j.emit(showToastBar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
