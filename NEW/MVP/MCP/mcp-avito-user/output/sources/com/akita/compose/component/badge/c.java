package com.akita.compose.component.badge;

import Y41.p;
import Y61.l;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.animation.core.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2", f = "Badge.kt", i = {0, 0, 1, 2}, l = {137, 147, 148}, m = "invokeSuspend", n = {"collapseAnimationDuration", "count", "collapseAnimationDuration", "collapseAnimationDuration"}, s = {"I$0", "I$3", "I$0", "I$0"})
/* loaded from: classes10.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f60347A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f60348B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f60349C;

    /* renamed from: q, reason: collision with root package name */
    public int f60350q;

    /* renamed from: r, reason: collision with root package name */
    public int f60351r;

    /* renamed from: s, reason: collision with root package name */
    public int f60352s;

    /* renamed from: t, reason: collision with root package name */
    public int f60353t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f60354u;

    /* renamed from: v, reason: collision with root package name */
    public i f60355v;

    /* renamed from: w, reason: collision with root package name */
    public C20268c f60356w;

    /* renamed from: x, reason: collision with root package name */
    public C20268c f60357x;

    /* renamed from: y, reason: collision with root package name */
    public int f60358y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ i f60359z;

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$1", f = "Badge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super N0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f60360q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20268c<Float, C20318t> f60361r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ i f60362s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C20268c<Float, C20318t> f60363t;

        /* compiled from: Badge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$1$1", f = "Badge.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.akita.compose.component.badge.c$a$a, reason: collision with other inner class name */
        public static final class C2081a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f60364q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C20268c<Float, C20318t> f60365r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ i f60366s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2081a(C20268c<Float, C20318t> c20268c, i iVar, Continuation<? super C2081a> continuation) {
                super(2, continuation);
                this.f60365r = c20268c;
                this.f60366s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2081a(this.f60365r, this.f60366s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2081a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f60364q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f60366s.f60415p.getClass();
                    Float fBoxFloat = Boxing.boxFloat(2.0f);
                    R0 r0D = C20310q.d(200.0f, 4, null);
                    this.f60364q = 1;
                    if (C20268c.c(this.f60365r, fBoxFloat, r0D, null, null, this, 12) == coroutine_suspended) {
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

        /* compiled from: Badge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$1$2", f = "Badge.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f60367q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C20268c<Float, C20318t> f60368r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ i f60369s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C20268c<Float, C20318t> c20268c, i iVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f60368r = c20268c;
                this.f60369s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f60368r, this.f60369s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f60367q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f60369s.f60415p.getClass();
                    Float fBoxFloat = Boxing.boxFloat(0.25f);
                    this.f60367q = 1;
                    if (C20268c.c(this.f60368r, fBoxFloat, null, null, null, this, 14) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20268c<Float, C20318t> c20268c, i iVar, C20268c<Float, C20318t> c20268c2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60361r = c20268c;
            this.f60362s = iVar;
            this.f60363t = c20268c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f60361r, this.f60362s, this.f60363t, continuation);
            aVar.f60360q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super N0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f60360q;
            C20268c<Float, C20318t> c20268c = this.f60361r;
            i iVar = this.f60362s;
            C43259k.d(t12, null, null, new C2081a(c20268c, iVar, null), 3);
            return C43259k.d(t12, null, null, new b(this.f60363t, iVar, null), 3);
        }
    }

    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$2", f = "Badge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f60370q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20268c<Float, C20318t> f60371r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f60372s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ i f60373t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f60374u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C20268c<Float, C20318t> f60375v;

        /* compiled from: Badge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$2$1", f = "Badge.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f60376q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C20268c<Float, C20318t> f60377r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f60378s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ i f60379t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f60380u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20268c<Float, C20318t> c20268c, boolean z12, i iVar, int i12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f60377r = c20268c;
                this.f60378s = z12;
                this.f60379t = iVar;
                this.f60380u = i12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f60377r, this.f60378s, this.f60379t, this.f60380u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                float f12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f60376q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    if (this.f60378s) {
                        this.f60379t.f60415p.getClass();
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    Float fBoxFloat = Boxing.boxFloat(f12);
                    G1 g1E = C20310q.e(this.f60380u, 0, Q.f26124d, 2);
                    this.f60376q = 1;
                    if (C20268c.c(this.f60377r, fBoxFloat, g1E, null, null, this, 12) == coroutine_suspended) {
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

        /* compiled from: Badge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$2$1$2$2", f = "Badge.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.akita.compose.component.badge.c$b$b, reason: collision with other inner class name */
        public static final class C2082b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f60381q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C20268c<Float, C20318t> f60382r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ i f60383s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2082b(C20268c<Float, C20318t> c20268c, i iVar, Continuation<? super C2082b> continuation) {
                super(2, continuation);
                this.f60382r = c20268c;
                this.f60383s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2082b(this.f60382r, this.f60383s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2082b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f60381q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f60383s.f60415p.getClass();
                    Float fBoxFloat = Boxing.boxFloat(0.1f);
                    this.f60381q = 1;
                    if (C20268c.c(this.f60382r, fBoxFloat, null, null, null, this, 14) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20268c<Float, C20318t> c20268c, boolean z12, i iVar, int i12, C20268c<Float, C20318t> c20268c2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f60371r = c20268c;
            this.f60372s = z12;
            this.f60373t = iVar;
            this.f60374u = i12;
            this.f60375v = c20268c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f60371r, this.f60372s, this.f60373t, this.f60374u, this.f60375v, continuation);
            bVar.f60370q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f60370q;
            C43259k.d(t12, null, null, new a(this.f60371r, this.f60372s, this.f60373t, this.f60374u, null), 3);
            C43259k.d(t12, null, null, new C2082b(this.f60375v, this.f60373t, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, boolean z12, C20268c<Float, C20318t> c20268c, C20268c<Float, C20318t> c20268c2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f60359z = iVar;
        this.f60347A = z12;
        this.f60348B = c20268c;
        this.f60349C = c20268c2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f60359z, this.f60347A, this.f60348B, this.f60349C, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x012a -> B:36:0x0132). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.badge.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
