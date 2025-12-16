package com.avito.android.sx_address.address_video_verification.domain;

import BA0.b;
import Y41.q;
import com.avito.android.sx_address.address_video_verification.domain.FileUploadState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LBA0/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl$uploadVideo$3", f = "SxAddressVideoVerificationInteractor.kt", i = {0}, l = {153, 154}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class i extends SuspendLambda implements q<InterfaceC43172j<? super BA0.b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292641q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f292642r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ File f292643s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f292644t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(File file, e eVar, Continuation<? super i> continuation) {
        super(3, continuation);
        this.f292643s = file;
        this.f292644t = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BA0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        i iVar = new i(this.f292643s, this.f292644t, continuation);
        iVar.f292642r = interfaceC43172j;
        return iVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292641q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f292642r;
            b.j jVar = new b.j(File.a(this.f292643s, new FileUploadState.Error(this.f292644t.f292615i.getF292734c())));
            this.f292642r = interfaceC43172j;
            this.f292641q = 1;
            if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
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
            interfaceC43172j = this.f292642r;
            C42729a0.b(obj);
        }
        b.d dVar = b.d.f1216a;
        this.f292642r = null;
        this.f292641q = 2;
        if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
