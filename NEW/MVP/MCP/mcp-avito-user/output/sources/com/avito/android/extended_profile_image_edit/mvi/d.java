package com.avito.android.extended_profile_image_edit.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA.InterfaceC49183a;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$4", f = "BannerImageEditActor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC49184b.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151049q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f151050r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f151051s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49183a f151052t;

    /* compiled from: BannerImageEditActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$4$1", f = "BannerImageEditActor.kt", i = {}, l = {86, 86}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151053q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151054r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f151055s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC49184b.a> f151056t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49183a f151057u;

        /* compiled from: BannerImageEditActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$4$1$isInvalidDeferred$1", f = "BannerImageEditActor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_image_edit.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C4415a extends SuspendLambda implements Y41.p<T, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f151058q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC49183a f151059r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ g f151060s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4415a(g gVar, Continuation continuation, InterfaceC49183a interfaceC49183a) {
                super(2, continuation);
                this.f151059r = interfaceC49183a;
                this.f151060s = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C4415a(this.f151060s, continuation, this.f151059r);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
                return ((C4415a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            /* JADX WARN: Type inference failed for: r6v4, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f151058q
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.C42729a0.b(r6)
                    goto L25
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    kotlin.C42729a0.b(r6)
                    r5.f151058q = r2
                    r3 = 300(0x12c, double:1.48E-321)
                    java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r3, r5)
                    if (r6 != r0) goto L25
                    return r0
                L25:
                    vA.a r6 = r5.f151059r
                    vA.a$c r6 = (vA.InterfaceC49183a.c) r6
                    kotlin.jvm.internal.N r6 = r6.f440491a
                    java.lang.Object r6 = r6.invoke()
                    android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
                    r0 = 0
                    if (r6 == 0) goto L4f
                    int r1 = r6.getWidth()
                    com.avito.android.extended_profile_image_edit.mvi.g r3 = r5.f151060s
                    com.avito.android.extended_profile_image_edit.x r4 = r3.f151065a
                    com.avito.android.extended_profile_image_edit.y r4 = r4.f151133b
                    int r4 = r4.f151137a
                    if (r1 < r4) goto L50
                    int r6 = r6.getHeight()
                    com.avito.android.extended_profile_image_edit.x r1 = r3.f151065a
                    com.avito.android.extended_profile_image_edit.y r1 = r1.f151133b
                    int r1 = r1.f151138b
                    if (r6 >= r1) goto L4f
                    goto L50
                L4f:
                    r2 = r0
                L50:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_image_edit.mvi.d.a.C4415a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, InterfaceC43172j<? super InterfaceC49184b.a> interfaceC43172j, InterfaceC49183a interfaceC49183a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151055s = gVar;
            this.f151056t = interfaceC43172j;
            this.f151057u = interfaceC49183a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f151055s, this.f151056t, this.f151057u, continuation);
            aVar.f151054r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j<InterfaceC49184b.a> interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151053q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f151054r;
                g gVar = this.f151055s;
                InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, gVar.f151068d.c(), new C4415a(gVar, null, this.f151057u), 2);
                gVar.f151069e = interfaceC43076a0B;
                interfaceC43172j = this.f151056t;
                this.f151054r = interfaceC43172j;
                this.f151053q = 1;
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
                interfaceC43172j = (InterfaceC43172j) this.f151054r;
                C42729a0.b(obj);
            }
            InterfaceC49184b.a aVar = new InterfaceC49184b.a(((Boolean) obj).booleanValue());
            this.f151054r = null;
            this.f151053q = 2;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation, InterfaceC49183a interfaceC49183a) {
        super(2, continuation);
        this.f151051s = gVar;
        this.f151052t = interfaceC49183a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f151051s, continuation, this.f151052t);
        dVar.f151050r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC49184b.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151049q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f151051s, (InterfaceC43172j) this.f151050r, this.f151052t, null);
            this.f151049q = 1;
            if (U.c(aVar, this) == coroutine_suspended) {
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
