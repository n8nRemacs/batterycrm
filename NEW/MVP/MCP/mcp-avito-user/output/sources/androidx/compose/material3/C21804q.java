package androidx.compose.material3;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.runtime.C22040c3;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/n;", "Landroidx/compose/material3/N6;", AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS, "latestTarget", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {696}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21804q extends SuspendLambda implements Y41.r<InterfaceC21735n, N6<Object>, Object, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37121q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC21735n f37122r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ N6 f37123s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f37124t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21916v<Object> f37125u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f37126v;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.q$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21735n f37127l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.e f37128m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21735n interfaceC21735n, l0.e eVar) {
            super(2);
            this.f37127l = interfaceC21735n;
            this.f37128m = eVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Float f12, Float f13) {
            float fFloatValue = f12.floatValue();
            this.f37127l.a(fFloatValue, f13.floatValue());
            this.f37128m.f406839b = fFloatValue;
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21804q(C21916v<Object> c21916v, float f12, Continuation<? super C21804q> continuation) {
        super(4, continuation);
        this.f37125u = c21916v;
        this.f37126v = f12;
    }

    @Override // Y41.r
    public final Object invoke(InterfaceC21735n interfaceC21735n, N6<Object> n62, Object obj, Continuation<? super kotlin.G0> continuation) {
        C21804q c21804q = new C21804q(this.f37125u, this.f37126v, continuation);
        c21804q.f37122r = interfaceC21735n;
        c21804q.f37123s = n62;
        c21804q.f37124t = obj;
        return c21804q.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37121q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC21735n interfaceC21735n = this.f37122r;
            float fC2 = this.f37123s.c(this.f37124t);
            if (!Float.isNaN(fC2)) {
                l0.e eVar = new l0.e();
                C21916v<Object> c21916v = this.f37125u;
                float f12 = Float.isNaN(((C22040c3) c21916v.f37498j).f()) ? 0.0f : ((C22040c3) c21916v.f37498j).f();
                eVar.f406839b = f12;
                a aVar = new a(interfaceC21735n, eVar);
                this.f37122r = null;
                this.f37123s = null;
                this.f37121q = 1;
                if (C20273d1.a(f12, fC2, this.f37126v, c21916v.f37491c, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
