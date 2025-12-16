package com.avito.android.mortgage.document_upload;

import android.content.Context;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import f00.InterfaceC40195b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.DocumentUploadScreenKt$DocumentsUploadScreen$1$1$1", f = "DocumentUploadScreen.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class Y extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f199107q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f199108r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f199109s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40195b f199110t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f199111u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, InterfaceC40195b interfaceC40195b, Context context, Continuation<? super Y> continuation) {
        super(2, continuation);
        this.f199108r = uVar;
        this.f199109s = j12;
        this.f199110t = interfaceC40195b;
        this.f199111u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Y(this.f199108r, this.f199109s, this.f199110t, this.f199111u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((Y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f199107q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String strK0 = ((InterfaceC40195b.g) this.f199110t).f395540a.k0(this.f199111u);
            this.f199107q = 1;
            if (this.f199108r.a(this.f199109s, strK0, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
