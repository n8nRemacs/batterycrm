package com.avito.android.photo_picker.camera_mvi.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processRotation$1", f = "CameraActor.kt", i = {0, 2}, l = {134, 135, 137, 138}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes14.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219228q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219229r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.device_orientation.c f219230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f219231t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.avito.android.device_orientation.c cVar, boolean z12, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f219230s = cVar;
        this.f219231t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f219230s, this.f219231t, continuation);
        hVar.f219229r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.photo_picker.camera_mvi.mvi.entity.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f219228q
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 == r7) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            goto L27
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f219229r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L7e
        L27:
            kotlin.C42729a0.b(r10)
            goto L90
        L2b:
            java.lang.Object r1 = r9.f219229r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L58
        L33:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f219229r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.device_orientation.c r10 = r9.f219230s
            boolean r10 = r10 instanceof com.avito.android.device_orientation.c.d
            boolean r8 = r9.f219231t
            if (r10 == r8) goto L90
            r8 = 0
            if (r10 == 0) goto L6c
            com.avito.android.photo_picker.camera_mvi.mvi.entity.a$l r10 = new com.avito.android.photo_picker.camera_mvi.mvi.entity.a$l
            r2 = 1119092736(0x42b40000, float:90.0)
            r10.<init>(r2, r8, r7)
            r9.f219229r = r1
            r9.f219228q = r7
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L58
            return r0
        L58:
            com.avito.android.photo_picker.camera_mvi.mvi.entity.a$d r10 = new com.avito.android.photo_picker.camera_mvi.mvi.entity.a$d
            com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState$Ratio r2 = com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState.Ratio.f219168e
            com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState$Ratio r4 = com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState.Ratio.f219167d
            r10.<init>(r2, r4, r7)
            r9.f219229r = r3
            r9.f219228q = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L90
            return r0
        L6c:
            com.avito.android.photo_picker.camera_mvi.mvi.entity.a$l r10 = new com.avito.android.photo_picker.camera_mvi.mvi.entity.a$l
            r6 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r8, r6, r2)
            r9.f219229r = r1
            r9.f219228q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7e
            return r0
        L7e:
            com.avito.android.photo_picker.camera_mvi.mvi.entity.a$d r10 = new com.avito.android.photo_picker.camera_mvi.mvi.entity.a$d
            com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState$Ratio r5 = com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState.Ratio.f219166c
            r10.<init>(r5, r5, r2)
            r9.f219229r = r3
            r9.f219228q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L90
            return r0
        L90:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_picker.camera_mvi.mvi.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
