package com.avito.android.cv_upload.screens.cv_upload.mvi;

import Y41.p;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadParams;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import okhttp3.MultipartBody;

/* compiled from: CvUploadActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_upload.screens.cv_upload.mvi.CvUploadActor$uploadCv$1", f = "CvUploadActor.kt", i = {0, 2, 2, 3}, l = {53, 56, 65, 70, 73, 73, 77}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "multipartFile", "$this$channelFlow"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements p<I0<? super CvUploadInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public MultipartBody.Part f131745q;

    /* renamed from: r, reason: collision with root package name */
    public int f131746r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f131747s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.cv_upload.screens.cv_upload.mvi.a f131748t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CvUploadParams f131749u;

    /* compiled from: CvUploadActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_upload.screens.cv_upload.mvi.CvUploadActor$uploadCv$1$1", f = "CvUploadActor.kt", i = {}, l = {67, 68}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131750q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ I0<CvUploadInternalAction> f131751r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super CvUploadInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f131751r = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f131751r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131750q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f131750q = 1;
                if (C43131e0.b(5000L, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            CvUploadInternalAction.FileLoading fileLoading = new CvUploadInternalAction.FileLoading(true);
            this.f131750q = 2;
            if (this.f131751r.send(fileLoading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.cv_upload.screens.cv_upload.mvi.a aVar, CvUploadParams cvUploadParams, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f131748t = aVar;
        this.f131749u = cvUploadParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f131748t, this.f131749u, continuation);
        eVar.f131747s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super CvUploadInternalAction> i02, Continuation<? super G0> continuation) {
        return ((e) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_upload.screens.cv_upload.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
