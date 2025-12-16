package androidx.compose.material;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21370ua extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34244q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21398x<Boolean> f34245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f34246s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f34247t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f34248u;

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ua$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21398x<Boolean> f34249l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21398x<Boolean> c21398x) {
            super(0);
            this.f34249l = c21398x;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return (Boolean) ((C22082i3) this.f34249l.f34353g).getF42167b();
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.ua$b */
    public static final class b extends SuspendLambda implements Y41.p<Boolean, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ boolean f34250q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f34251r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f34252s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f34253t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13, Continuation continuation) {
            super(2, continuation);
            this.f34251r = interfaceC22204y1;
            this.f34252s = interfaceC22204y12;
            this.f34253t = interfaceC22204y13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f34251r, this.f34252s, this.f34253t, continuation);
            bVar.f34250q = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super kotlin.G0> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            boolean z12 = this.f34250q;
            float f12 = Fa.f32641a;
            if (((Boolean) this.f34251r.getF42167b()).booleanValue() != z12) {
                Y41.l lVar = (Y41.l) this.f34252s.getF42167b();
                if (lVar != null) {
                    lVar.invoke(Boxing.boxBoolean(z12));
                }
                this.f34253t.setValue(Boolean.valueOf(!r2.getF42167b().booleanValue()));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21370ua(C21398x c21398x, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, InterfaceC22204y1 interfaceC22204y13, Continuation continuation) {
        super(2, continuation);
        this.f34245r = c21398x;
        this.f34246s = interfaceC22204y1;
        this.f34247t = interfaceC22204y12;
        this.f34248u = interfaceC22204y13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f34247t;
        return new C21370ua(this.f34245r, this.f34246s, interfaceC22204y1, this.f34248u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21370ua) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34244q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f34245r));
            b bVar = new b(this.f34246s, this.f34247t, this.f34248u, null);
            this.f34244q = 1;
            if (C43175k.j(interfaceC43160iN, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
