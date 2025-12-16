package com.avito.android.realty_agency.inline_filters.location_suggest;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.realty_agency.inline_filters.location_suggest.a;
import ji0.InterfaceC42386a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LocationSuggestViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/CharSequence;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.location_suggest.LocationSuggestViewHolder$1", f = "LocationSuggestViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<CharSequence, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f251657q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f251658r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f251658r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f251658r, continuation);
        dVar.f251657q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(CharSequence charSequence, Continuation<? super G0> continuation) {
        return ((d) create(charSequence, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CharSequence charSequence = (CharSequence) this.f251657q;
        ((a.C7548a) this.f251658r.f251673a).invoke(new InterfaceC42386a.b(charSequence.toString()));
        return G0.f406611a;
    }
}
