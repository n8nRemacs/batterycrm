package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processPermissionResult$1", f = "CameraActor.kt", i = {}, l = {175, 177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219139q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219140r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f219141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f219142t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, boolean z13, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f219141s = z12;
        this.f219142t = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f219141s, this.f219142t, continuation);
        eVar.f219140r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f219139q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219140r;
            if (this.f219141s) {
                a.g gVar = a.g.f219188a;
                this.f219139q = 1;
                if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                a.j jVar = new a.j(true ^ this.f219142t);
                this.f219139q = 2;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
