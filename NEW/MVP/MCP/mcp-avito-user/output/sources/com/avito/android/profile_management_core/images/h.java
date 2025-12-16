package com.avito.android.profile_management_core.images;

import Y41.p;
import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.extended.ExtendedProfileSettingsUploadResult;
import java.io.File;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;
import okhttp3.MultipartBody;

/* compiled from: ProfileManagementImageInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_management_core/images/a$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$uploadImage$1", f = "ProfileManagementImageInteractor.kt", i = {0}, l = {190, 192}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<InterfaceC43172j<? super a.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226744q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226745r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226746s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f226747t;

    /* compiled from: ProfileManagementImageInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$uploadImage$1$1", f = "ProfileManagementImageInteractor.kt", i = {0, 3, 5}, l = {194, 199, 201, 209, 210, 212}, m = "invokeSuspend", n = {"$this$supervisorScope", "error", "error"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226748q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226749r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f226750s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226751t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<a.d> f226752u;

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/extended/ExtendedProfileSettingsUploadResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$uploadImage$1$1$deferred$1", f = "ProfileManagementImageInteractor.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_management_core.images.h$a$a, reason: collision with other inner class name */
        public static final class C6883a extends SuspendLambda implements p<T, Continuation<? super TypedResult<ExtendedProfileSettingsUploadResult>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226753q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f226754r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226755s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ File f226756t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6883a(d dVar, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, File file, Continuation<? super C6883a> continuation) {
                super(2, continuation);
                this.f226754r = dVar;
                this.f226755s = imageFromPhotoPicker;
                this.f226756t = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6883a(this.f226754r, this.f226755s, this.f226756t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<ExtendedProfileSettingsUploadResult>> continuation) {
                return ((C6883a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226753q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    D0 d02 = this.f226754r.f226640a.get();
                    String str = this.f226755s.f226687h;
                    MultipartBody.Part partA = com.avito.http.b.a(this.f226756t, 3);
                    this.f226753q = 1;
                    obj = d02.i(str, partA, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, InterfaceC43172j<? super a.d> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226750s = dVar;
            this.f226751t = imageFromPhotoPicker;
            this.f226752u = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226750s, this.f226751t, this.f226752u, continuation);
            aVar.f226749r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:9:0x002f, B:12:0x0037, B:24:0x0083, B:26:0x0089, B:29:0x00ad, B:31:0x00b1, B:32:0x00c2, B:33:0x00c3, B:34:0x00c8, B:15:0x003f, B:21:0x005f, B:18:0x004b), top: B:51:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:9:0x002f, B:12:0x0037, B:24:0x0083, B:26:0x0089, B:29:0x00ad, B:31:0x00b1, B:32:0x00c2, B:33:0x00c3, B:34:0x00c8, B:15:0x003f, B:21:0x005f, B:18:0x004b), top: B:51:0x000d }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_management_core.images.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, Continuation continuation) {
        super(2, continuation);
        this.f226746s = imageFromPhotoPicker;
        this.f226747t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f226747t, this.f226746s, continuation);
        hVar.f226745r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226744q;
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = this.f226746s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f226745r;
            a.d.b bVar = new a.d.b(UploadImage.ImageFromPhotoPicker.g(imageFromPhotoPicker, UploadImageState.Uploading.f226712b));
            this.f226745r = interfaceC43172j;
            this.f226744q = 1;
            if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f226745r;
            C42729a0.b(obj);
        }
        a aVar = new a(this.f226747t, imageFromPhotoPicker, interfaceC43172j, null);
        this.f226745r = null;
        this.f226744q = 2;
        if (t1.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
