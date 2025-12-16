package com.avito.android.profile_management_core.images;

import Y41.p;
import com.avito.android.error.z;
import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.avito.android.util.ApiException;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: ProfileManagementImageInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_management_core/images/a$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImage$1", f = "ProfileManagementImageInteractor.kt", i = {0}, l = {347, 348}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super a.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226660q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226661r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226662s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f226663t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f226664u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f226665v;

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImage$1$1", f = "ProfileManagementImageInteractor.kt", i = {2, 4}, l = {356, 363, 371, 378, 380}, m = "invokeSuspend", n = {"error", "error"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226666q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226667r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f226668s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ N f226669t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ UploadImage.ImageFromPhotoPicker f226670u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f226671v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<a.d> f226672w;

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/extended/modification/ModificationResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImage$1$1$deferred$1", f = "ProfileManagementImageInteractor.kt", i = {}, l = {352}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_management_core.images.e$a$a, reason: collision with other inner class name */
        public static final class C6881a extends SuspendLambda implements p<T, Continuation<? super TypedResult<ModificationResult>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226673q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ d f226674r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f226675s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6881a(d dVar, String str, Continuation<? super C6881a> continuation) {
                super(2, continuation);
                this.f226674r = dVar;
                this.f226675s = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6881a(this.f226674r, this.f226675s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<ModificationResult>> continuation) {
                return ((C6881a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226673q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    D0 d02 = this.f226674r.f226640a.get();
                    this.f226673q = 1;
                    obj = d02.e(this.f226675s, this);
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
        public a(d dVar, p<? super UploadImage.ImageFromPhotoPicker, ? super Long, ModificationBody> pVar, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, long j12, InterfaceC43172j<? super a.d> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226668s = dVar;
            this.f226669t = (N) pVar;
            this.f226670u = imageFromPhotoPicker;
            this.f226671v = j12;
            this.f226672w = interfaceC43172j;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226668s, this.f226669t, this.f226670u, this.f226671v, this.f226672w, continuation);
            aVar.f226667r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r15v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            Object objF;
            d dVar = this.f226668s;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226666q;
            UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = this.f226670u;
            long j12 = this.f226671v;
            InterfaceC43172j<a.d> interfaceC43172j = this.f226672w;
            try {
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof CancellationException) {
                    a.d.b bVar = new a.d.b(UploadImage.ImageFromPhotoPicker.g(imageFromPhotoPicker, new UploadImageState.Uploaded(j12)));
                    this.f226667r = th;
                    this.f226666q = 5;
                    if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw th;
                }
                a.d.b bVar2 = new a.d.b(UploadImage.ImageFromPhotoPicker.g(imageFromPhotoPicker, new UploadImageState.SettingError(z.l(th), j12)));
                this.f226667r = th;
                this.f226666q = 3;
                if (interfaceC43172j.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43076a0 interfaceC43076a0B = C43259k.b((T) this.f226667r, dVar.f226644e.a(), new C6881a(dVar, dVar.f226646g.get().l(this.f226669t.invoke(imageFromPhotoPicker, Boxing.boxLong(j12))), null), 2);
                dVar.f226648i.put(imageFromPhotoPicker.f226685f, interfaceC43076a0B);
                this.f226666q = 1;
                objF = interfaceC43076a0B.F(this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 == 2) {
                        C42729a0.b(obj);
                    } else if (i12 == 3) {
                        th = (Throwable) this.f226667r;
                        C42729a0.b(obj);
                        a.d.C6880a c6880a = new a.d.C6880a(th);
                        this.f226667r = null;
                        this.f226666q = 4;
                        if (interfaceC43172j.emit(c6880a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th3 = (Throwable) this.f226667r;
                            C42729a0.b(obj);
                            throw th3;
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
                C42729a0.b(obj);
                objF = obj;
            }
            TypedResult typedResult = (TypedResult) objF;
            if (typedResult instanceof TypedResult.Success) {
                ModificationResult modificationResult = (ModificationResult) ((TypedResult.Success) typedResult).getResult();
                if (!(modificationResult instanceof ModificationResult.Ok)) {
                    throw new ApiException(com.avito.android.remote.error.j.d(3, null), null, 2, null);
                }
                ModerationStatus moderationStatusB = com.avito.android.profile_management_core.moderation.a.b((ModificationResult.Ok) modificationResult, imageFromPhotoPicker.f226687h, imageFromPhotoPicker.f226685f);
                a.d.b bVar3 = new a.d.b(UploadImage.ImageFromPhotoPicker.g(imageFromPhotoPicker, moderationStatusB != null ? com.avito.android.profile_management_core.images.entity.c.a(moderationStatusB) : UploadImageState.Set.f226707b));
                this.f226666q = 2;
                if (interfaceC43172j.emit(bVar3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (typedResult instanceof TypedResult.Error) {
                throw new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, d dVar, p<? super UploadImage.ImageFromPhotoPicker, ? super Long, ModificationBody> pVar, long j12, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f226662s = imageFromPhotoPicker;
        this.f226663t = dVar;
        this.f226664u = (N) pVar;
        this.f226665v = j12;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f226662s, this.f226663t, this.f226664u, this.f226665v, continuation);
        eVar.f226661r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226660q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f226661r;
            a.d.b bVar = new a.d.b(UploadImage.ImageFromPhotoPicker.g(this.f226662s, UploadImageState.Setting.f226708b));
            this.f226661r = interfaceC43172j;
            this.f226660q = 1;
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
            interfaceC43172j = (InterfaceC43172j) this.f226661r;
            C42729a0.b(obj);
        }
        InterfaceC43172j interfaceC43172j2 = interfaceC43172j;
        a aVar = new a(this.f226663t, this.f226664u, this.f226662s, this.f226665v, interfaceC43172j2, null);
        this.f226661r = null;
        this.f226660q = 2;
        if (t1.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
