package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.runtime.H0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: AndroidDragAndDropSource.android.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/draganddrop/d;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: AndroidDragAndDropSource.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/k;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/k;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<k, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27097q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27098r;

        /* compiled from: AndroidDragAndDropSource.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "offset", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.draganddrop.d$a$a, reason: collision with other inner class name */
        public static final class C1564a extends N implements Y41.l<l0.g, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ k f27099l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1564a(k kVar) {
                super(1);
                this.f27099l = kVar;
            }

            @Override // Y41.l
            public final G0 invoke(l0.g gVar) {
                this.f27099l.F(gVar.f413387a);
                return G0.f406611a;
            }
        }

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f27098r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(k kVar, Continuation<? super G0> continuation) {
            return ((a) create(kVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27097q;
            if (i12 == 0) {
                C42729a0.b(obj);
                k kVar = (k) this.f27098r;
                C1564a c1564a = new C1564a(kVar);
                this.f27097q = 1;
                if (C20445d2.g(kVar, c1564a, null, null, this, 13) == coroutine_suspended) {
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
        new d();
        new a(2, null);
    }
}
