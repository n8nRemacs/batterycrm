package androidx.compose.ui.platform;

import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/s1;", "methodSession", "", "<anonymous>", "(Landroidx/compose/ui/platform/s1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {184}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
/* renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22455b0 extends SuspendLambda implements Y41.p<C22523s1, Continuation<?>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f41411q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f41412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22459c0 f41413s;

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.b0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22523s1 f41414l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C22459c0 f41415m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22523s1 c22523s1, C22459c0 c22459c0) {
            super(1);
            this.f41414l = c22523s1;
            this.f41415m = c22459c0;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            C22523s1 c22523s1 = this.f41414l;
            synchronized (c22523s1.f41595c) {
                try {
                    c22523s1.f41597e = true;
                    androidx.compose.runtime.collection.e<androidx.compose.ui.node.e1<androidx.compose.ui.text.input.F>> eVar = c22523s1.f41596d;
                    androidx.compose.ui.node.e1<androidx.compose.ui.text.input.F>[] e1VarArr = eVar.f38260b;
                    int i12 = eVar.f38262d;
                    for (int i13 = 0; i13 < i12; i13++) {
                        androidx.compose.ui.text.input.F f12 = e1VarArr[i13].get();
                        if (f12 != null) {
                            f12.a();
                        }
                    }
                    c22523s1.f41596d.g();
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            androidx.compose.ui.text.input.Y y12 = this.f41415m.f41419c;
            y12.f42389b.set(null);
            y12.f42388a.a();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22455b0(C22459c0 c22459c0, Continuation<? super C22455b0> continuation) {
        super(2, continuation);
        this.f41413s = c22459c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C22455b0 c22455b0 = new C22455b0(this.f41413s, continuation);
        c22455b0.f41412r = obj;
        return c22455b0;
    }

    @Override // Y41.p
    public final Object invoke(C22523s1 c22523s1, Continuation<?> continuation) {
        return ((C22455b0) create(c22523s1, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f41411q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C22523s1 c22523s1 = (C22523s1) this.f41412r;
            this.f41412r = c22523s1;
            C22459c0 c22459c0 = this.f41413s;
            this.f41411q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            androidx.compose.ui.text.input.Y y12 = c22459c0.f41419c;
            androidx.compose.ui.text.input.P p12 = y12.f42388a;
            p12.d();
            y12.f42389b.set(new androidx.compose.ui.text.input.i0(y12, p12));
            rVar.r(new a(c22523s1, c22459c0));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (objO == coroutine_suspended) {
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
