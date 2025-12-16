package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CameraActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_picker.camera_mvi.mvi.CameraActor$processRatioClick$1", f = "CameraActor.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super a.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f219219q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f219220r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CameraState.Ratio f219221s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f219222t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CameraState.Ratio f219223u;

    /* compiled from: CameraActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CameraState.Ratio.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CameraState.Ratio ratio = CameraState.Ratio.f219166c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CameraState.Ratio ratio2 = CameraState.Ratio.f219166c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CameraState.Ratio ratio, boolean z12, CameraState.Ratio ratio2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f219221s = ratio;
        this.f219222t = z12;
        this.f219223u = ratio2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f219221s, this.f219222t, this.f219223u, continuation);
        fVar.f219220r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CameraState.Ratio ratio;
        CameraState.Ratio ratio2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f219219q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f219220r;
            int iOrdinal = this.f219221s.ordinal();
            boolean z12 = this.f219222t;
            if (iOrdinal == 0) {
                ratio = z12 ? CameraState.Ratio.f219168e : CameraState.Ratio.f219167d;
            } else if (iOrdinal == 1) {
                ratio = CameraState.Ratio.f219168e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ratio = CameraState.Ratio.f219166c;
            }
            int iOrdinal2 = this.f219223u.ordinal();
            if (iOrdinal2 == 0) {
                ratio2 = CameraState.Ratio.f219167d;
            } else if (iOrdinal2 == 1) {
                ratio2 = z12 ? CameraState.Ratio.f219166c : CameraState.Ratio.f219168e;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ratio2 = CameraState.Ratio.f219166c;
            }
            a.d dVar = new a.d(ratio, ratio2, z12);
            this.f219219q = 1;
            if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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
