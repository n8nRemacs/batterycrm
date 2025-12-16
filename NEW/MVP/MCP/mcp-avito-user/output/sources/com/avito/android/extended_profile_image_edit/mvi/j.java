package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.extended_profile_image_edit.x;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.util.R0;
import com.avito.android.util.Y;
import io.reactivex.rxjava3.core.z;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "LvA/b;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements com.avito.android.arch.mvi.b<InterfaceC49184b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f151074a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f151075b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f151076c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f151077d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f151078e;

    /* compiled from: BannerImageEditBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditBootstrap$produce$1", f = "BannerImageEditBootstrap.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC49184b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151079q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151080r;

        /* compiled from: BannerImageEditBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditBootstrap$produce$1$1", f = "BannerImageEditBootstrap.kt", i = {}, l = {38, 39}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_image_edit.mvi.j$a$a, reason: collision with other inner class name */
        public static final class C4416a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151082q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f151083r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j f151084s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC49184b> f151085t;

            /* compiled from: BannerImageEditBootstrap.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/photo_cache/PhotoUpload;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/photo_cache/PhotoUpload;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditBootstrap$produce$1$1$imageDeferred$1", f = "BannerImageEditBootstrap.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_image_edit.mvi.j$a$a$a, reason: collision with other inner class name */
            public static final class C4417a extends SuspendLambda implements Y41.p<T, Continuation<? super PhotoUpload>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f151086q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ j f151087r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4417a(j jVar, Continuation<? super C4417a> continuation) {
                    super(2, continuation);
                    this.f151087r = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4417a(this.f151087r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super PhotoUpload> continuation) {
                    return ((C4417a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f151086q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        j jVar = this.f151087r;
                        z<CloseableDataSource<? extends PhotoUpload>> zVarA = jVar.f151075b.a(jVar.f151074a.f151132a);
                        this.f151086q = 1;
                        obj = C43292o.c(zVarA, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    Object objG = C42745f0.G(Y.a((CloseableDataSource) obj));
                    if (objG != null) {
                        return objG;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4416a(j jVar, InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, Continuation<? super C4416a> continuation) {
                super(2, continuation);
                this.f151084s = jVar;
                this.f151085t = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4416a c4416a = new C4416a(this.f151084s, this.f151085t, continuation);
                c4416a.f151083r = obj;
                return c4416a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4416a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f151082q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t12 = (T) this.f151083r;
                    j jVar = this.f151084s;
                    InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, jVar.f151077d.a(), new C4417a(jVar, null), 2);
                    this.f151082q = 1;
                    obj = interfaceC43076a0B.F(this);
                    if (obj == coroutine_suspended) {
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
                InterfaceC49184b.e eVar = new InterfaceC49184b.e((PhotoUpload) obj);
                this.f151082q = 2;
                if (this.f151085t.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(continuation);
            aVar.f151080r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151079q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f151080r;
                if (!j.this.f151078e) {
                    j jVar = j.this;
                    if (!jVar.f151076c) {
                        jVar.f151078e = true;
                        C4416a c4416a = new C4416a(j.this, interfaceC43172j, null);
                        this.f151079q = 1;
                        if (U.c(c4416a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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

    /* compiled from: BannerImageEditBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditBootstrap$produce$2", f = "BannerImageEditBootstrap.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC49184b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151088q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f151089r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f151090s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f151089r = interfaceC43172j;
            bVar.f151090s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151088q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f151089r;
                if (!(this.f151090s instanceof CancellationException)) {
                    InterfaceC49184b.d dVar = InterfaceC49184b.d.f440496a;
                    this.f151089r = null;
                    this.f151088q = 1;
                    if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Inject
    public j(@Y61.k x xVar, @Y61.k com.avito.android.photo_cache.b bVar, boolean z12, @Y61.k R0 r02) {
        this.f151074a = xVar;
        this.f151075b = bVar;
        this.f151076c = z12;
        this.f151077d = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC49184b> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
