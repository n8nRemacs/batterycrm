package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.permissions.u;
import com.avito.android.photo_permission.PhotoPermission;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processCheckPermission$1", f = "CameraActor.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219131q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219132r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f219133s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f219134t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, boolean z12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f219133s = aVar;
        this.f219134t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f219133s, this.f219134t, continuation);
        cVar.f219132r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f219131q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219132r;
            u uVar = this.f219133s.f219126f;
            PhotoPermission.Camera.f218689b.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new e(uVar.b(PhotoPermission.Camera.f218690c), this.f219134t, null));
            this.f219131q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
