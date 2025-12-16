package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.input.internal.C20893h;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.O1;
import androidx.compose.ui.platform.U1;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AndroidTextInputSession.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.input.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20893h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<?>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f31090A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22544x2 f31091B;

    /* renamed from: q, reason: collision with root package name */
    public int f31092q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31093r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y1<kotlin.G0> f31094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1 f31095t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p1 f31096u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20941t f31097v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ U1 f31098w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C22655v f31099x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.content.internal.c f31100y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C22654u, kotlin.G0> f31101z;

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.h$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31102q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ t1 f31103r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20941t f31104s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t1 t1Var, InterfaceC20941t interfaceC20941t, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31103r = t1Var;
            this.f31104s = interfaceC20941t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f31103r, this.f31104s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31102q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20891g c20891g = new C20891g(this.f31104s);
                this.f31102q = 1;
                if (this.f31103r.a(c20891g, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {111, 112}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.h$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31105q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y1<kotlin.G0> f31106r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20941t f31107s;

        /* compiled from: AndroidTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.input.internal.h$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f31108l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Long l12) {
                l12.longValue();
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: AndroidTextInputSession.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.input.internal.h$b$b, reason: collision with other inner class name */
        public static final class C1617b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC20941t f31109b;

            public C1617b(InterfaceC20941t interfaceC20941t) {
                this.f31109b = interfaceC20941t;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f31109b.d();
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y1<kotlin.G0> y12, InterfaceC20941t interfaceC20941t, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f31106r = y12;
            this.f31107s = interfaceC20941t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f31106r, this.f31107s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31105q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = a.f31108l;
                this.f31105q = 1;
                if (androidx.compose.runtime.X0.a(getF411447c()).N(new androidx.compose.runtime.W0(aVar), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    throw new KotlinNothingValueException();
                }
                C42729a0.b(obj);
            }
            C1617b c1617b = new C1617b(this.f31107s);
            this.f31105q = 2;
            if (this.f31106r.collect(c1617b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.h$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ t1 f31110l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t1 t1Var) {
            super(0);
            this.f31110l = t1Var;
        }

        @Override // Y41.a
        public final String invoke() {
            return "createInputConnection(value=\"" + ((Object) this.f31110l.d()) + "\")";
        }
    }

    /* compiled from: AndroidTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/text/input/internal/h$d", "Landroidx/compose/foundation/text/input/internal/n1;", "Landroidx/compose/foundation/text/input/internal/Y;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.h$d */
    public static final class d implements n1, Y {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f31111a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t1 f31112b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20941t f31113c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C22654u, kotlin.G0> f31114d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.content.internal.c f31115e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ G f31116f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1 f31117g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f31118h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22544x2 f31119i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(J j12, t1 t1Var, InterfaceC20941t interfaceC20941t, Y41.l<? super C22654u, kotlin.G0> lVar, androidx.compose.foundation.content.internal.c cVar, G g12, p1 p1Var, Y41.a<kotlin.G0> aVar, InterfaceC22544x2 interfaceC22544x2) {
            this.f31112b = t1Var;
            this.f31113c = interfaceC20941t;
            this.f31114d = lVar;
            this.f31115e = cVar;
            this.f31116f = g12;
            this.f31117g = p1Var;
            this.f31118h = aVar;
            this.f31119i = interfaceC22544x2;
            this.f31111a = j12;
        }

        public final void a(Y41.l<? super androidx.compose.foundation.text.input.i, kotlin.G0> lVar) {
            J j12 = this.f31111a;
            j12.a();
            j12.f30849c.b(lVar);
            j12.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20893h(Y1<kotlin.G0> y12, t1 t1Var, p1 p1Var, InterfaceC20941t interfaceC20941t, U1 u12, C22655v c22655v, androidx.compose.foundation.content.internal.c cVar, Y41.l<? super C22654u, kotlin.G0> lVar, Y41.a<kotlin.G0> aVar, InterfaceC22544x2 interfaceC22544x2, Continuation<? super C20893h> continuation) {
        super(2, continuation);
        this.f31094s = y12;
        this.f31095t = t1Var;
        this.f31096u = p1Var;
        this.f31097v = interfaceC20941t;
        this.f31098w = u12;
        this.f31099x = c22655v;
        this.f31100y = cVar;
        this.f31101z = lVar;
        this.f31090A = aVar;
        this.f31091B = interfaceC22544x2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20893h c20893h = new C20893h(this.f31094s, this.f31095t, this.f31096u, this.f31097v, this.f31098w, this.f31099x, this.f31100y, this.f31101z, this.f31090A, this.f31091B, continuation);
        c20893h.f31093r = obj;
        return c20893h;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<?> continuation) {
        return ((C20893h) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31092q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31093r;
            CoroutineStart coroutineStart = CoroutineStart.f410683e;
            t1 t1Var = this.f31095t;
            InterfaceC20941t interfaceC20941t = this.f31097v;
            C43259k.d(t12, null, coroutineStart, new a(t1Var, interfaceC20941t, null), 1);
            Y1<kotlin.G0> y12 = this.f31094s;
            if (y12 != null) {
                C43259k.d(t12, null, null, new b(y12, interfaceC20941t, null), 3);
            }
            final G g12 = new G(t1Var, this.f31096u, interfaceC20941t, t12);
            final Y41.l<C22654u, kotlin.G0> lVar = this.f31101z;
            final Y41.a<kotlin.G0> aVar = this.f31090A;
            final InterfaceC22544x2 interfaceC22544x2 = this.f31091B;
            final t1 t1Var2 = this.f31095t;
            final C22655v c22655v = this.f31099x;
            final androidx.compose.foundation.content.internal.c cVar = this.f31100y;
            final InterfaceC20941t interfaceC20941t2 = this.f31097v;
            final p1 p1Var = this.f31096u;
            O1 o12 = new O1() { // from class: androidx.compose.foundation.text.input.internal.f
                @Override // androidx.compose.ui.platform.O1
                public final InputConnection a(EditorInfo editorInfo) {
                    t1 t1Var3 = t1Var2;
                    new C20893h.c(t1Var3);
                    J j12 = new J(t1Var3);
                    Y41.l lVar2 = lVar;
                    G g13 = g12;
                    Y41.a aVar2 = aVar;
                    InterfaceC22544x2 interfaceC22544x22 = interfaceC22544x2;
                    InterfaceC20941t interfaceC20941t3 = interfaceC20941t2;
                    androidx.compose.foundation.content.internal.c cVar2 = cVar;
                    C20893h.d dVar = new C20893h.d(j12, t1Var3, interfaceC20941t3, lVar2, cVar2, g13, p1Var, aVar2, interfaceC22544x22);
                    O.a(editorInfo, t1Var3.d(), t1Var3.d().f31512d, c22655v, cVar2 != null ? C20895i.f31121a : null);
                    return new J0(dVar, editorInfo);
                }
            };
            this.f31092q = 1;
            if (this.f31098w.b(o12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
