package com.avito.android.arch.mvi.android;

import Y41.p;
import android.os.Parcelable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MviSaveStateViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u008a@"}, d2 = {"", "Action", "Landroid/os/Parcelable;", "State", "OneTimeEvent", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.android.MviSaveStateViewModel$state$2$1", f = "MviSaveStateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class i extends SuspendLambda implements p<Parcelable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f91899q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h<Object, Parcelable, Object> f91900r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h<Object, Parcelable, Object> hVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f91900r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f91900r, continuation);
        iVar.f91899q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(Parcelable parcelable, Continuation<? super G0> continuation) {
        return ((i) create(parcelable, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Parcelable parcelable = (Parcelable) this.f91899q;
        h<Object, Parcelable, Object> hVar = this.f91900r;
        hVar.f91884J.e(parcelable, hVar.f91886L);
        return G0.f406611a;
    }
}
