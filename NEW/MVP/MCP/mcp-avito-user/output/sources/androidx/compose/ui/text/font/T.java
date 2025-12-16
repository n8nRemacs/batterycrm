package androidx.compose.ui.text.font;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/T;", "Landroidx/compose/ui/text/font/P;", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T implements P {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Y f42192c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final c f42193d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22625t f42194a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f42195b;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/T$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f42196q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C22624s f42197r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22624s c22624s, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f42197r = c22624s;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f42197r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f42196q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f42196q = 1;
                if (this.f42197r.a(this) == coroutine_suspended) {
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

    static {
        new a(null);
        f42192c = new Y();
        f42193d = new c(kotlinx.coroutines.N.f410714t2);
    }

    public T() {
        this(null, null, 3, null);
    }

    public T(C22625t c22625t, CoroutineContext coroutineContext, int i12, C42822w c42822w) {
        c22625t = (i12 & 1) != 0 ? new C22625t() : c22625t;
        coroutineContext = (i12 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext;
        this.f42194a = c22625t;
        this.f42195b = kotlinx.coroutines.U.a(f42193d.plus(androidx.compose.ui.text.platform.u.f42610a).plus(coroutineContext).plus(t1.a((N0) coroutineContext.get(N0.f410716u2))));
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AbstractCoroutineContextElement implements kotlinx.coroutines.N {
        @Override // kotlinx.coroutines.N
        public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
        }
    }
}
