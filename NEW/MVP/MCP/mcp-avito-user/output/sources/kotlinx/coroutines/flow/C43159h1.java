package kotlinx.coroutines.flow;

import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbstractC43163a;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, JfifUtil.MARKER_RST7, 221}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: kotlinx.coroutines.flow.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43159h1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411415q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i2 f411416r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f411417s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC43163a f411418t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f411419u;

    /* compiled from: Share.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.h1$a */
    public static final class a extends SuspendLambda implements Y41.p<Integer, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ int f411420q;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f411420q = ((Number) obj).intValue();
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return ((a) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(this.f411420q > 0);
        }
    }

    /* compiled from: Share.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/flow/SharingCommand;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.h1$b */
    public static final class b extends SuspendLambda implements Y41.p<SharingCommand, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411421q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411422r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f411423s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AbstractC43163a f411424t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Object f411425u;

        /* compiled from: Share.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.h1$b$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    SharingCommand sharingCommand = SharingCommand.f411255b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    SharingCommand sharingCommand2 = SharingCommand.f411255b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<Object> interfaceC43160i, Y1<Object> y12, Object obj, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f411423s = interfaceC43160i;
            this.f411424t = (AbstractC43163a) y12;
            this.f411425u = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.internal.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f411423s, this.f411424t, this.f411425u, continuation);
            bVar.f411422r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(SharingCommand sharingCommand, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(sharingCommand, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.internal.a, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411421q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int iOrdinal = ((SharingCommand) this.f411422r).ordinal();
                ?? r12 = this.f411424t;
                if (iOrdinal == 0) {
                    this.f411421q = 1;
                    if (this.f411423s.collect(r12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (iOrdinal == 2) {
                    kotlinx.coroutines.internal.a0 a0Var = f2.f411393a;
                    Object obj2 = this.f411425u;
                    if (obj2 == a0Var) {
                        r12.h4();
                    } else {
                        r12.K5(obj2);
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43159h1(i2 i2Var, InterfaceC43160i<Object> interfaceC43160i, Y1<Object> y12, Object obj, Continuation<? super C43159h1> continuation) {
        super(2, continuation);
        this.f411416r = i2Var;
        this.f411417s = interfaceC43160i;
        this.f411418t = (AbstractC43163a) y12;
        this.f411419u = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.internal.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C43159h1(this.f411416r, this.f411417s, this.f411418t, this.f411419u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C43159h1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.internal.a, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f411415q
            kotlinx.coroutines.flow.internal.a r2 = r8.f411418t
            r3 = 4
            r4 = 3
            r5 = 1
            kotlinx.coroutines.flow.i<java.lang.Object> r6 = r8.f411417s
            r7 = 2
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r7) goto L21
            if (r1 == r4) goto L25
            if (r1 != r3) goto L19
            goto L25
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.C42729a0.b(r9)
            goto L57
        L25:
            kotlin.C42729a0.b(r9)
            goto L7c
        L29:
            kotlin.C42729a0.b(r9)
            kotlinx.coroutines.flow.i2$a r9 = kotlinx.coroutines.flow.i2.f411430a
            r9.getClass()
            kotlinx.coroutines.flow.i2 r9 = kotlinx.coroutines.flow.i2.a.f411432b
            kotlinx.coroutines.flow.i2 r1 = r8.f411416r
            if (r1 != r9) goto L40
            r8.f411415q = r5
            java.lang.Object r9 = r6.collect(r2, r8)
            if (r9 != r0) goto L7c
            return r0
        L40:
            kotlinx.coroutines.flow.i2 r9 = kotlinx.coroutines.flow.i2.a.f411433c
            r5 = 0
            if (r1 != r9) goto L60
            kotlinx.coroutines.flow.n2 r9 = r2.ac()
            kotlinx.coroutines.flow.h1$a r1 = new kotlinx.coroutines.flow.h1$a
            r1.<init>(r7, r5)
            r8.f411415q = r7
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.x(r9, r1, r8)
            if (r9 != r0) goto L57
            return r0
        L57:
            r8.f411415q = r4
            java.lang.Object r9 = r6.collect(r2, r8)
            if (r9 != r0) goto L7c
            return r0
        L60:
            kotlinx.coroutines.flow.n2 r9 = r2.ac()
            kotlinx.coroutines.flow.i r9 = r1.a(r9)
            kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.C43175k.r(r9)
            kotlinx.coroutines.flow.h1$b r1 = new kotlinx.coroutines.flow.h1$b
            java.lang.Object r4 = r8.f411419u
            r1.<init>(r6, r2, r4, r5)
            r8.f411415q = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.j(r9, r1, r8)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43159h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
