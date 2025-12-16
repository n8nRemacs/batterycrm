package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", i = {}, l = {689, 691}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Wk extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35793q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Sk f35794r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f35795s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f35796t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wk(Sk sk2, float f12, boolean z12, Continuation<? super Wk> continuation) {
        super(1, continuation);
        this.f35794r = sk2;
        this.f35795s = f12;
        this.f35796t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
        return new Wk(this.f35794r, this.f35795s, this.f35796t, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((Wk) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35793q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Sk sk2 = this.f35794r;
            int iB2 = sk2.b();
            Ee.f34679b.getClass();
            boolean zB2 = Ee.b(iB2, 0);
            InterfaceC22192v1 interfaceC22192v1 = sk2.f35430h;
            boolean z12 = this.f35796t;
            float f12 = this.f35795s;
            if (zB2) {
                ((C22040c3) sk2.f35429g).S6(((((int) ((f12 + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12) % 12) * 0.5235988f);
            } else if (z12) {
                ((C22040c3) interfaceC22192v1).S6((Sk.d(f12) - (Sk.d(f12) % 5)) * 0.10471976f);
            } else {
                ((C22040c3) interfaceC22192v1).S6(Sk.d(f12) * 0.10471976f);
            }
            C20268c<Float, C20318t> c20268c = sk2.f35433k;
            if (z12) {
                Float fBoxFloat = Boxing.boxFloat(((C22040c3) interfaceC22192v1).f());
                this.f35793q = 1;
                if (c20268c.h(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                float f13 = f12 + 1.5707964f;
                if (f13 < 0.0f) {
                    f13 += 6.2831855f;
                }
                Float fBoxFloat2 = Boxing.boxFloat(f13);
                this.f35793q = 2;
                if (c20268c.h(fBoxFloat2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
