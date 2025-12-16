package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsImageActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processCommonImageAction$3", f = "ExtendedProfileSettingsImageActor.kt", i = {0, 0, 1}, l = {113, 115, 120, 119}, m = "invokeSuspend", n = {"$this$flow", "image", "$this$flow"}, s = {"L$0", "L$2", "L$0"})
/* loaded from: classes16.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public B f230408q;

    /* renamed from: r, reason: collision with root package name */
    public UploadImage f230409r;

    /* renamed from: s, reason: collision with root package name */
    public int f230410s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f230411t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230412u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B f230413v;

    /* compiled from: ExtendedProfileSettingsImageActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/a0;", "Lcom/avito/android/profile_management_core/images/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/a0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processCommonImageAction$3$1$deferred$1", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super InterfaceC43076a0<? extends a.b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f230414q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ B f230415r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ UploadImage f230416s;

        /* compiled from: ExtendedProfileSettingsImageActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/profile_management_core/images/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/profile_management_core/images/a$b;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsImageActor$processCommonImageAction$3$1$deferred$1$1", f = "ExtendedProfileSettingsImageActor.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_settings_extended.mvi.E$a$a, reason: collision with other inner class name */
        public static final class C7008a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super a.b>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f230417q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ B f230418r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ UploadImage f230419s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7008a(B b12, UploadImage uploadImage, Continuation<? super C7008a> continuation) {
                super(2, continuation);
                this.f230418r = b12;
                this.f230419s = uploadImage;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7008a(this.f230418r, this.f230419s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super a.b> continuation) {
                return ((C7008a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f230417q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.profile_management_core.images.a aVar = this.f230418r.f230382a;
                    this.f230417q = 1;
                    obj = aVar.h(this.f230419s, this);
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
        public a(B b12, UploadImage uploadImage, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f230415r = b12;
            this.f230416s = uploadImage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f230415r, this.f230416s, continuation);
            aVar.f230414q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super InterfaceC43076a0<? extends a.b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C43259k.b((kotlinx.coroutines.T) this.f230414q, null, new C7008a(this.f230415r, this.f230416s, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar, B b12, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f230412u = aVar;
        this.f230413v = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f230412u, this.f230413v, continuation);
        e12.f230411t = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
