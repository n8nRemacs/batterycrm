package com.avito.android.photo_picker.camera_mvi.mvi;

import androidx.camera.core.InterfaceC20120j0;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$k;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processImageSaved$1", f = "CameraActor.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super a.k>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219135q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219136r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f219137s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20120j0 f219138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, InterfaceC20120j0 interfaceC20120j0, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f219137s = aVar;
        this.f219138t = interfaceC20120j0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f219137s, this.f219138t, continuation);
        dVar.f219136r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.k> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.camera_mvi.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
