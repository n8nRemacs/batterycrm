package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import ug0.C49055a;

/* compiled from: RatingAddAnswerPhotoBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.b<RatingAddAnswerPhotoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f246741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f246743c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f246744d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f246745e;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<RatingAddAnswerPhotoInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f246746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f246747c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.rating.details.answer.photo.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C7406a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f246748b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f246749c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.rating.details.answer.photo.mvi.RatingAddAnswerPhotoBootstrap$produce$$inlined$map$1$2", f = "RatingAddAnswerPhotoBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.rating.details.answer.photo.mvi.f$a$a$a, reason: collision with other inner class name */
            public static final class C7407a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f246750q;

                /* renamed from: r, reason: collision with root package name */
                public int f246751r;

                public C7407a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f246750q = obj;
                    this.f246751r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7406a.this.emit(null, this);
                }
            }

            public C7406a(InterfaceC43172j interfaceC43172j, f fVar) {
                this.f246748b = interfaceC43172j;
                this.f246749c = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.rating.details.answer.photo.mvi.f.a.C7406a.C7407a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.rating.details.answer.photo.mvi.f$a$a$a r0 = (com.avito.android.rating.details.answer.photo.mvi.f.a.C7406a.C7407a) r0
                    int r1 = r0.f246751r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f246751r = r1
                    goto L18
                L13:
                    com.avito.android.rating.details.answer.photo.mvi.f$a$a$a r0 = new com.avito.android.rating.details.answer.photo.mvi.f$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f246750q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f246751r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r8)
                    goto La4
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    kotlin.C42729a0.b(r8)
                    com.avito.android.photo_cache.q r7 = (com.avito.android.photo_cache.q) r7
                    boolean r8 = r7 instanceof com.avito.android.photo_cache.q.c
                    if (r8 == 0) goto L8c
                    com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$ImagesLoaded r8 = new com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$ImagesLoaded
                    com.avito.android.photo_cache.q$b r7 = (com.avito.android.photo_cache.q.b) r7
                    com.avito.android.rating.details.answer.photo.mvi.f r2 = r6.f246749c
                    r2.getClass()
                    java.util.List r7 = r7.getData()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L53:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L65
                    java.lang.Object r4 = r7.next()
                    boolean r5 = r4 instanceof com.avito.android.remote.model.ImageUploadResult
                    if (r5 == 0) goto L53
                    r2.add(r4)
                    goto L53
                L65:
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L6e:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L88
                    java.lang.Object r4 = r2.next()
                    com.avito.android.remote.model.ImageUploadResult r4 = (com.avito.android.remote.model.ImageUploadResult) r4
                    java.lang.String r4 = r4.getUploadId()
                    java.lang.Long r4 = kotlin.text.C43066x.z0(r4)
                    if (r4 == 0) goto L6e
                    r7.add(r4)
                    goto L6e
                L88:
                    r8.<init>(r7)
                    goto L99
                L8c:
                    boolean r8 = r7 instanceof com.avito.android.photo_cache.q.d
                    if (r8 == 0) goto L93
                    com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$LoadingImages r8 = com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction.LoadingImages.f246728b
                    goto L99
                L93:
                    boolean r7 = r7 instanceof com.avito.android.photo_cache.q.a
                    if (r7 == 0) goto La7
                    com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction$HideLoading r8 = com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction.HideLoading.f246725b
                L99:
                    r0.f246751r = r3
                    kotlinx.coroutines.flow.j r7 = r6.f246748b
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto La4
                    return r1
                La4:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                La7:
                    kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                    r7.<init>()
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.answer.photo.mvi.f.a.C7406a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, f fVar) {
            this.f246746b = interfaceC43160i;
            this.f246747c = fVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super RatingAddAnswerPhotoInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f246746b).collect(new C7406a(interfaceC43172j, this.f246747c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l Long l12, boolean z12) {
        this.f246741a = jVar;
        this.f246742b = interfaceC28373a;
        this.f246743c = l12;
        this.f246744d = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingAddAnswerPhotoInternalAction> a() {
        if (!this.f246745e && !this.f246744d) {
            this.f246742b.c(new C49055a(this.f246743c));
        }
        this.f246745e = true;
        return new a(y.a(this.f246741a.b()), this);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
