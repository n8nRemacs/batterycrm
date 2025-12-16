package com.avito.android.crm_candidates.view.ui.counter_view;

import Qs.C14929b;
import Qs.InterfaceC14928a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.widget.TextView;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: JobCrmCandidatesCounterView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.view.ui.counter_view.JobCrmCandidatesCounterView$refresh$1", f = "JobCrmCandidatesCounterView.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f130269q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f130270r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f130270r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f130270r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f130269q;
        b bVar = this.f130270r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14928a interfaceC14928a = bVar.f130271a;
            this.f130269q = 1;
            obj = interfaceC14928a.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C14929b c14929b = (C14929b) ((TypedResult.Success) typedResult).getResult();
            TextView textView = bVar.f130273c;
            if (textView == null) {
                textView = null;
            }
            int i13 = c14929b.f14020a;
            I5.a(textView, i13 < 1000 ? String.valueOf(i13) : "999+", false);
            TextView textView2 = bVar.f130272b;
            if (textView2 == null) {
                textView2 = null;
            }
            int i14 = c14929b.f14020a;
            I5.a(textView2, i14 < 1000 ? String.valueOf(i14) : "999+", false);
            TextView textView3 = bVar.f130273c;
            if (textView3 == null) {
                textView3 = null;
            }
            boolean z12 = c14929b.f14021b;
            D6.G(textView3, !z12);
            TextView textView4 = bVar.f130272b;
            D6.G(textView4 != null ? textView4 : null, z12);
        } else if (typedResult instanceof TypedResult.Error) {
            V2.f318762a.d("JobCrmCandidatesCounterView", z.k(((TypedResult.Error) typedResult).getError()));
        }
        return G0.f406611a;
    }
}
