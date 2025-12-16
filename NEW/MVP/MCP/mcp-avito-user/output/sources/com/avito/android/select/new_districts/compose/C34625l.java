package com.avito.android.select.new_districts.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectDistrictScreenContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.new_districts.compose.SelectDistrictScreenContentKt$SelectDistrictScreenContent$2", f = "SelectDistrictScreenContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.select.new_districts.compose.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34625l extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SelectDistrictViewState f265757q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<String> f265758r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34625l(SelectDistrictViewState selectDistrictViewState, InterfaceC22204y1<String> interfaceC22204y1, Continuation<? super C34625l> continuation) {
        super(2, continuation);
        this.f265757q = selectDistrictViewState;
        this.f265758r = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C34625l(this.f265757q, this.f265758r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C34625l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!this.f265757q.f265831h) {
            this.f265758r.setValue("");
        }
        return G0.f406611a;
    }
}
