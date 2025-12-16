package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21072y0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32269q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f32270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f32271s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.Y f32272t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32273u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C22655v f32274v;

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.y0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f32275l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f32275l = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final Boolean invoke() {
            Boolean bool = (Boolean) this.f32275l.getF42167b();
            bool.booleanValue();
            return bool;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "writeable", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.y0$b */
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C20985q1 f32276b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.Y f32277c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f32278d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C22655v f32279e;

        public b(C20985q1 c20985q1, androidx.compose.ui.text.input.Y y12, C21011f1 c21011f1, C22655v c22655v) {
            this.f32276b = c20985q1;
            this.f32277c = y12;
            this.f32278d = c21011f1;
            this.f32279e = c22655v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.i0, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C20985q1 c20985q1 = this.f32276b;
            if (zBooleanValue && c20985q1.b()) {
                C21011f1 c21011f1 = this.f32278d;
                androidx.compose.ui.text.input.W wM2 = c21011f1.m();
                androidx.compose.ui.text.input.L l12 = c21011f1.f31984b;
                C20862e2.a aVar = C20862e2.f30700a;
                Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
                Y41.l<C22654u, kotlin.G0> lVar2 = c20985q1.f31800w;
                aVar.getClass();
                l0.h hVar = new l0.h();
                C20854c2 c20854c2 = new C20854c2(c20985q1.f31781d, lVar, hVar);
                androidx.compose.ui.text.input.Y y12 = this.f32277c;
                androidx.compose.ui.text.input.P p12 = y12.f42388a;
                p12.c(wM2, this.f32279e, c20854c2, lVar2);
                ?? r32 = (T) new androidx.compose.ui.text.input.i0(y12, p12);
                y12.f42389b.set(r32);
                hVar.f406842b = r32;
                c20985q1.f31782e = r32;
                V0.f(c20985q1, wM2, l12);
            } else {
                V0.e(c20985q1);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21072y0(C20985q1 c20985q1, InterfaceC22204y1 interfaceC22204y1, androidx.compose.ui.text.input.Y y12, C21011f1 c21011f1, C22655v c22655v, Continuation continuation) {
        super(2, continuation);
        this.f32270r = c20985q1;
        this.f32271s = interfaceC22204y1;
        this.f32272t = y12;
        this.f32273u = c21011f1;
        this.f32274v = c22655v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21072y0(this.f32270r, this.f32271s, this.f32272t, this.f32273u, this.f32274v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21072y0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32269q;
        C20985q1 c20985q1 = this.f32270r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f32271s));
                b bVar = new b(c20985q1, this.f32272t, this.f32273u, this.f32274v);
                this.f32269q = 1;
                if (interfaceC43160iN.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            V0.e(c20985q1);
            return kotlin.G0.f406611a;
        } catch (Throwable th2) {
            V0.e(c20985q1);
            throw th2;
        }
    }
}
