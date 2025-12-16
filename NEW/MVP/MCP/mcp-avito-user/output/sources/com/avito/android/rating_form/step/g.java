package com.avito.android.rating_form.step;

import com.avito.android.R;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: RatingFormFileInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$deleteFileInternal$1", f = "RatingFormFileInteractor.kt", i = {}, l = {233, 235, 238}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249499q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f249500r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249502t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f249503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, LinkedHashMap linkedHashMap, FieldIdentifier fieldIdentifier, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f249500r = fVar;
        this.f249501s = linkedHashMap;
        this.f249502t = fieldIdentifier;
        this.f249503u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = this.f249503u;
        return new g(this.f249500r, this.f249501s, this.f249502t, eVar, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f249499q;
        f fVar = this.f249500r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Vg0.d dVar = fVar.f249475c;
            this.f249499q = 1;
            obj = dVar.c(this.f249501s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        e eVar = this.f249503u;
        FieldIdentifier fieldIdentifier = this.f249502t;
        if (z12) {
            this.f249499q = 2;
            int i13 = f.f249472j;
            Object objG = C43259k.g(fVar.f249477e.b(), new h(fVar, fieldIdentifier, eVar, null), this);
            if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objG = G0.f406611a;
            }
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            String message = C35936s.a(error.getError(), error.getCause()).getMessage();
            z.a aVar = new z.a(message != null ? com.avito.android.printable_text.b.f(message) : com.avito.android.printable_text.b.c(R.string.rating_form_error, new Serializable[0]));
            this.f249499q = 3;
            int i14 = f.f249472j;
            if (fVar.e(fieldIdentifier, eVar, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
