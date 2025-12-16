package com.avito.android.bxcontent;

import android.location.Location;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroid/location/Location;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$findLocation$2", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class C extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Location>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f109313q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109314r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(BxContentFragment bxContentFragment, Continuation<? super C> continuation) {
        super(3, continuation);
        this.f109314r = bxContentFragment;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Location> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        C c12 = new C(this.f109314r, continuation);
        c12.f109313q = th2;
        return c12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f109313q;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f109314r.Z5().accept(new MapInternalAction.Error(th2, MapErrorType.f185057f));
        return kotlin.G0.f406611a;
    }
}
