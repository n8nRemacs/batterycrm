package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.R;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import com.facebook.imageutils.JfifUtil;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processCameraUnavailableError$1", f = "CameraActor.kt", i = {}, l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219128q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219129r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f219130s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f219130s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f219130s, continuation);
        bVar.f219129r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f219128q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219129r;
            int i13 = this.f219130s;
            Q q12 = i13 != 1 ? i13 != 2 ? i13 != 4 ? i13 != 5 ? i13 != 6 ? new Q(Boxing.boxInt(R.string.camera_error_unknown_title), Boxing.boxInt(R.string.camera_error_unknown_details)) : new Q(Boxing.boxInt(R.string.camera_error_do_not_disturb_title), Boxing.boxInt(R.string.camera_error_do_not_disturb_details)) : new Q(Boxing.boxInt(R.string.camera_error_max_in_use_title), Boxing.boxInt(R.string.camera_error_max_in_use_details)) : new Q(Boxing.boxInt(R.string.camera_error_in_use_title), Boxing.boxInt(R.string.camera_error_in_use_details)) : new Q(Boxing.boxInt(R.string.camera_error_disabled_title), Boxing.boxInt(R.string.camera_error_disconnected_details)) : new Q(Boxing.boxInt(R.string.camera_error_disabled_title), Boxing.boxInt(R.string.camera_error_disabled_details));
            a.n nVar = new a.n(com.avito.android.printable_text.b.c(((Number) q12.f406619b).intValue(), new Serializable[0]), com.avito.android.printable_text.b.c(((Number) q12.f406620c).intValue(), new Serializable[0]));
            this.f219128q = 1;
            if (interfaceC43172j.emit(nVar, this) == coroutine_suspended) {
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
